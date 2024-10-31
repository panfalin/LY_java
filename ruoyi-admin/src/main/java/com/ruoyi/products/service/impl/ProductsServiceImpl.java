package com.ruoyi.products.service.impl;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.math.RoundingMode;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
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

            // // 3. 获取价格评分数据
            // List<PriceRatings> priceRatingsList = new ArrayList<>();
            // for (OnlineData data : onlineDataList) {
            //     String listingId = data.getListingId();
            //     if (!"".equals(listingId)) {
            //         String[] listingIds = listingId.split(",");
            //         for (String s : listingIds) {
            //             PriceRatings priceRatings = priceRatingsService.selectPriceRatingsById(Long.valueOf(s));
            //             // 将价格评级列表中的所有元素添加到 priceRatingsList
            //             priceRatingsList.add(priceRatings);
            //         }
            //     }
            // }

            // 3.1 创建返回的数据结构
            Map<String, Object> productInfo = new HashMap<>();

            // 4. 添加 online_data 信息
            List<Map<String, Object>> onlineDataInfo = new ArrayList<>();
            StringBuilder is_big_sale_product = new StringBuilder();
            for (OnlineData data : onlineDataList) {
                Map<String, Object> onlineItem = new HashMap<>();
                onlineItem.put("store", data.getStoreEmail());
                /*
                  此处是新增加的代码
                  将刊登的价格信息放入这
                 */
                List<Map<String, Object>> onlineDataDetail = new ArrayList<>();
                String listingId = data.getListingId();
                int salesCount = 0;
                // 建议下架刊登
                if (!"".equals(listingId)) {
                    String[] listingIds = listingId.split(",");
                    for (String s : listingIds) {
                        Map<String, Object> onlineItemDetail = new HashMap<>();
                        PriceRatings priceRatings = priceRatingsService.selectPriceRatingsById(Long.valueOf(s));
                        if (priceRatings != null) {
                            // 将价格评级列表中的所有元素添加到 priceRatingsList
                            onlineItemDetail.put("online_id", priceRatings.getId());
                            onlineItemDetail.put("price", priceRatings.getPromotionPrice());
                            onlineItemDetail.put("rating", priceRatings.getAverageStar());
                            onlineItemDetail.put("feedbacks", priceRatings.getFeedbacks());
                            String sales = priceRatings.getSales().replace("+", "").replace(",","");
                            salesCount += Integer.parseInt(sales);
                            onlineItemDetail.put("sales", priceRatings.getSales());

                            // 获取上架时间
                            Date listingTime = priceRatings.getListingTime();
                            // 如果上架时间超过60天，且销量为0
                            if (listingTime != null && listingTime.before(new Date(System.currentTimeMillis() - 60L * 24 * 60 * 60 * 1000)) && Integer.parseInt(sales) == 0) {
                                is_big_sale_product.append(priceRatings.getId().toString()).append('\n');
                            }

                            onlineDataDetail.add(onlineItemDetail);
                        }
                    }
                }
                onlineItem.put("online_detail", onlineDataDetail);

                onlineItem.put("online_count", data.getListingCount());
                onlineItem.put("store_count", data.getStore_count());
                onlineItem.put("all_online", data.getTotalListingCount());
                onlineItem.put("sales", salesCount);
                onlineDataInfo.add(onlineItem);
            }
            productInfo.put("online_data", onlineDataInfo);

            // 添加在线价格和评分
            Map<String, Object> online_price_rating = new HashMap<>();
            // for (PriceRatings priceRatings : priceRatingsList) {
            //     Map<String, Object> online_data_info = new HashMap<>();
            //     online_data_info.put("price", priceRatings.getPromotionPrice());
            //     online_data_info.put("rating", priceRatings.getAverageStar());
            //     online_price_rating.put((priceRatings.getId()).toString(), online_data_info);
            // }
            productInfo.put("online_price_rating", online_price_rating);
            productInfo.put("productCode", product.getProductCode());

            // 添加Mabang信息
            Map<String, Object> mabangInfo = new HashMap<>();
            mabangInfo.put("productName", product.getProductName());
            mabangInfo.put("category", product.getCategory());
            mabangInfo.put("imageUrl", product.getImageUrl());
            mabangInfo.put("totalInventory", product.getTotalInventory());
            mabangInfo.put("status", product.getStatus());
            mabangInfo.put("latestPurchasePrice", product.getLatestPurchasePrice());
            mabangInfo.put("salesDays7", product.getSales7Days());
            mabangInfo.put("salesDays28", product.getSales28Days());
            mabangInfo.put("salesDays42", product.getSales42Days());
            mabangInfo.put("totalListingCount", product.getTotalListingCount());
            mabangInfo.put("store_count", product.getStore_count());
            // mabangInfo.put("target", product.getTarget());

            String bestSellingCountriesStr = product.getBestSellingCountries();

            String operator = "";
            if (!"".equals(bestSellingCountriesStr) && bestSellingCountriesStr != null) {
                // 将字符串解析成 Map
                Map<String, Integer> countrySales = parseCountrySales(bestSellingCountriesStr);

                // 计算并格式化前五个国家的热销百分比
                Map<String, String> topCountriesWithPercentage = getTopCountriesWithPercentage(countrySales, 5);
                //
                // 前五的热销国家
                mabangInfo.put("bestSellingCountries", topCountriesWithPercentage);
                operator += "最畅销国家：";
            }




            Long competitorOneSalesDays180 = 0L;
            Long competitorTwoSalesDays180 = 0L;
            Long competitorThreeSalesDays180 = 0L;

            BigDecimal minSumPrices = BigDecimal.ZERO;
            BigDecimal maxSumPrices = BigDecimal.ZERO;
            int totalCompetitor = 0;
            // 假设我们按顺序分配竞品信息
            if (!competitorProductsList.isEmpty()) {
                mabangInfo.put("竞品一", competitorProductsList.get(0));
                competitorOneSalesDays180 = competitorProductsList.get(0).getSales180Days();
                minSumPrices = minSumPrices.add(competitorProductsList.get(0).getMinPrice());
                maxSumPrices = maxSumPrices.add(competitorProductsList.get(0).getMaxPrice());
                totalCompetitor += 1;
            }
            if (competitorProductsList.size() > 1) {
                mabangInfo.put("竞品二", competitorProductsList.get(1));
                competitorTwoSalesDays180 = competitorProductsList.get(1).getSales180Days();
                minSumPrices = minSumPrices.add(competitorProductsList.get(1).getMaxPrice());
                maxSumPrices = maxSumPrices.add(competitorProductsList.get(1).getMaxPrice());
                totalCompetitor += 1;
            }
            if (competitorProductsList.size() > 2) {
                mabangInfo.put("竞品三", competitorProductsList.get(2));
                competitorThreeSalesDays180 = competitorProductsList.get(2).getSales180Days();
                minSumPrices = minSumPrices.add(competitorProductsList.get(2).getMinPrice());
                maxSumPrices = maxSumPrices.add(competitorProductsList.get(2).getMaxPrice());
                totalCompetitor += 1;
            }

            Double marketCapacity = (competitorOneSalesDays180 + competitorTwoSalesDays180 + competitorThreeSalesDays180) /0.5;
            mabangInfo.put("marketCapacity", marketCapacity);
            /**
             * 制定操作
             *
             */
            String toDoList = "";
            if (totalCompetitor != 0) {
                BigDecimal suggestedMinPrice = minSumPrices.divide(BigDecimal.valueOf(totalCompetitor), 2, RoundingMode.HALF_UP);
                BigDecimal suggestedMaxPrice = maxSumPrices.divide(BigDecimal.valueOf(totalCompetitor), 2, RoundingMode.HALF_UP);
                // 低于市场容量的5%
                toDoList += "竟对平均最低售价：" + suggestedMinPrice + "\n";
                toDoList += "竟对平均最高售价：" + suggestedMaxPrice + "\n";
            }

            toDoList += "建议下架以下60天未出单刊登：" + is_big_sale_product + "\n";


            /**
             * 制定目标
             *
             */
            String target = "";

            // 是否滞销
            if (product.getSales42Days() == 0) {
                target += "滞销商品" + "\n";
            }

            // 销售情况 - 市场容量
            if ((marketCapacity * 0.05) > product.getSales42Days()) {
                // 低于市场容量的5%
                target = "低于市场容量的5%" + "\n";
                target += "目标销量：" + (long) (marketCapacity * 0.10) + "\n";
            } else if ((marketCapacity * 0.20) > product.getSales42Days()) {
                // 低于市场容量的10%
                target = "低于市场容量的20%" + "\n";
                target += "目标销量：" + (long) (marketCapacity * 0.20) + "\n";
            } else if (marketCapacity * 0.30 > product.getSales42Days()) {
                // 低于市场容量的30%
                target = "低于市场容量的30%" + "\n";
                target += "目标销量：" + (long) (marketCapacity * 0.30) + "\n";
            } else if (marketCapacity * 0.40 > product.getSales42Days()) {
                target = "低于市场容量的40%" + "\n";
                target += "目标销量：" + (long) (marketCapacity * 0.40) + "\n";
            } else if (marketCapacity * 0.50 > product.getSales42Days()) {
                target = "低于市场容量的50%" + "\n";
                target += "目标销量：" + (long) (marketCapacity * 0.50) + "\n";
            } else {
                target += "目标销量：" + marketCapacity + "\n";
            }

            // 上架店铺数与刊登数
            Long totalListingsCount = product.getTotalListingCount();
            Long storeCount = product.getStore_count();
            if (storeCount < 5) {
                target += "店铺数不足5" + "\n";
                target += "还需发布店铺数：" + (5 - storeCount) + "\n";
            }
            if (totalListingsCount < 15) {
                target += "刊登数不足15" + "\n";
                target += "还需刊登数：" + (15 - totalListingsCount) + "\n";
            }
            mabangInfo.put("toDoList", toDoList);
            mabangInfo.put("target", target);

            productInfo.put("mabang_info", mabangInfo);
            productInfo.put("id", product.getId()   );

            // 将每个产品信息添加到结果列表
            result.add(productInfo);
        }

        return result;
    }

    // 解析 JSON 字符串为 Map
    public Map<String, Integer> parseCountrySales(String jsonString) {
        jsonString = jsonString.replaceAll("[{}]", ""); // 去掉大括号
        Map<String, Integer> map = new HashMap<>();

        // 分割并填充 map
        for (String entry : jsonString.split(", ")) {
            String[] parts = entry.split(": ");
            String country = parts[0].replaceAll("\"", ""); // 去掉引号
            Integer sales = Integer.parseInt(parts[1]);
            map.put(country, sales);
        }
        return map;
    }

    /**
     * 获取前五个热销国家及其销售百分比，以及剩余国家的销售百分比
     *
     * @param countrySales
     * @return
     */
     // 获取前N个热销国家的百分比，其他归为"其他"
    public Map<String, String> getTopCountriesWithPercentage(Map<String, Integer> countrySales, int topN) {
        int totalSales = countrySales.values().stream().mapToInt(Integer::intValue).sum();

        // 获取按销量排序的前 N 个国家
        List<Map.Entry<String, Integer>> sortedEntries = countrySales.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .collect(Collectors.toList());

        Map<String, String> result = new LinkedHashMap<>();
        int count = 0;
        int otherSales = 0;

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (count < topN) {
                double percentage = (double) entry.getValue() / totalSales * 100;
                result.put(entry.getKey(), String.format("%.2f%%", percentage));
            } else {
                otherSales += entry.getValue();
            }
            count++;
        }

        // 添加“其他”类别
        if (otherSales > 0) {
            double otherPercentage = (double) otherSales / totalSales * 100;
            result.put("其他", String.format("%.2f%%", otherPercentage));
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
