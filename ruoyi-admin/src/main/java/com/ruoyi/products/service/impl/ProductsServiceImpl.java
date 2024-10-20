package com.ruoyi.products.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.competitor_products.controller.CompetitorProductsController;
import com.ruoyi.competitor_products.domain.CompetitorProducts;
import com.ruoyi.competitor_products.service.ICompetitorProductsService;
import com.ruoyi.online_data.domain.OnlineData;
import com.ruoyi.online_data.service.IOnlineDataService;
import com.ruoyi.price_ratings.domain.PriceRatings;
import com.ruoyi.price_ratings.service.IPriceRatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.products.mapper.ProductsMapper;
import com.ruoyi.products.domain.Products;
import com.ruoyi.products.service.IProductsService;

import javax.annotation.Resource;

/**
 * productsService业务层处理
 *
 * @author ruoyi
 * @date 2024-10-16
 */
@Service
public class ProductsServiceImpl implements IProductsService {
    @Resource
    private ProductsMapper productsMapper;

    @Autowired
    private IOnlineDataService onlineDataService;

    @Autowired
    private ICompetitorProductsService competitorProductsService;

    @Autowired
    private IPriceRatingsService priceRatingsService;

    /**
     * 查询products
     *
     * @param id products主键
     * @return products
     */
    @Override
    public Products selectProductsById(Long id) {
        return productsMapper.selectProductsById(id);
    }

    /**
     * 查询products列表
     *
     * @param products products
     * @return products
     */
    @Override
    public List<Products> selectProductsList(Products products)
    {
        return productsMapper.selectProductsList(products);
    }

    /**
     * 查询products列表
     *
     * @param products products
     * @return products
     */
    @Override
    public List<Map<String, Object>> getProductsList(Products products) {
        List<Products> list = productsMapper.selectProductsList(products);
        List<Map<String, Object>> result = new ArrayList<>();
        for (Products product : list) {
            Long id = product.getId();

            // 1. 获取竞争对手产品信息
            CompetitorProducts competitorProducts = new CompetitorProducts();
            competitorProducts.setProductId(id);
            List<CompetitorProducts> competitorProductsList = competitorProductsService.selectCompetitorProductsList(competitorProducts);

            // 2. 获取在线数据
            OnlineData onlineData = new OnlineData();
            onlineData.setProductId(id);
            List<OnlineData> onlineDataList = onlineDataService.selectOnlineDataList(onlineData);

            // 3. 获取价格评分数据
            List<PriceRatings> priceRatingsList = new ArrayList<>();
            for (OnlineData data : onlineDataList) {
                Long onlineDataId = data.getId();
                PriceRatings priceRatings = new PriceRatings();
                priceRatings.setOnlineDataId(onlineDataId);
                // 获取价格评级列表
                List<PriceRatings> priceRatingList = priceRatingsService.selectPriceRatingsList(priceRatings);

                // 将价格评级列表中的所有元素添加到 priceRatingsList
                priceRatingsList.addAll(priceRatingList);
            }

            // 3.1 创建返回的数据结构
            Map<String, Object> productInfo = new HashMap<>();

            // 4. 添加 online_data 信息
            List<Map<String, Object>> onlineDataInfo = new ArrayList<>();
            for (OnlineData data : onlineDataList) {
                Map<String, Object> onlineItem = new HashMap<>();
                onlineItem.put("店铺", data.getStoreEmail());
                onlineItem.put("刊登ID", data.getListingId());
                onlineItem.put("刊登数", data.getListingCount());
                onlineItem.put("上架店铺数", data.getStore_count());
                onlineItem.put("总刊登数", data.getTotalListingCount());
                onlineDataInfo.add(onlineItem);
            }
            productInfo.put("online_data", onlineDataInfo);

            // 添加在线价格和评分
            Map<String, Object> online_price_rating = new HashMap<>();
            for (PriceRatings priceRatings : priceRatingsList) {
                Map<String, Object> online_data_info = new HashMap<>();
                online_data_info.put("price", priceRatings.getPrice());
                online_data_info.put("rating", priceRatings.getRating());
                online_price_rating.put(priceRatings.getListingId(), online_data_info);
            }
            productInfo.put("online_price_rating", online_price_rating);
            productInfo.put("productCode", product.getProductCode());

            // 添加Mabang信息
            Map<String, Object> mabangInfo = new HashMap<>();
            mabangInfo.put("商品名称", product.getProductName());
            mabangInfo.put("库存图片链接", product.getImageUrl());
            mabangInfo.put("可用库存总量", product.getTotalInventory());
            mabangInfo.put("状态", product.getStatus());
            mabangInfo.put("最新采购价", product.getLatestPurchasePrice());
            mabangInfo.put("7天销量", product.getSales7Days());
            mabangInfo.put("28天销量", product.getSales28Days());
            mabangInfo.put("42天销量", product.getSales42Days());
            mabangInfo.put("总刊登数", product.getTotalListingCount());
            mabangInfo.put("上架店铺数", product.getStore_count());
            mabangInfo.put("target", product.getTarget());
            // 假设我们按顺序分配竞品信息
            if (!competitorProductsList.isEmpty()) {
                mabangInfo.put("竞品一", competitorProductsList.get(0));
            }
            if (competitorProductsList.size() > 1) {
                mabangInfo.put("竞品二", competitorProductsList.get(1));
            }
            if (competitorProductsList.size() > 2) {
                mabangInfo.put("竞品三", competitorProductsList.get(2));
            }
            productInfo.put("mabang_info", mabangInfo);
            productInfo.put("id", product.getId()   );

            // 将每个产品信息添加到结果列表
            result.add(productInfo);
        }

        return result;
    }

    /**
     * 新增products
     *
     * @param products products
     * @return 结果
     */
    @Override
    public int insertProducts(Products products) {
        return productsMapper.insertProducts(products);
    }

    /**
     * 修改products
     *
     * @param products products
     * @return 结果
     */
    @Override
    public int updateProducts(Products products) {
        return productsMapper.updateProducts(products);
    }

    /**
     * 批量删除products
     *
     * @param ids 需要删除的products主键
     * @return 结果
     */
    @Override
    public int deleteProductsByIds(Long[] ids) {
        return productsMapper.deleteProductsByIds(ids);
    }

    /**
     * 删除products信息
     *
     * @param id products主键
     * @return 结果
     */
    @Override
    public int deleteProductsById(Long id) {
        return productsMapper.deleteProductsById(id);
    }
}
