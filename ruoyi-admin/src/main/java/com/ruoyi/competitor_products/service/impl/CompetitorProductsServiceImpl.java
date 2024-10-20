package com.ruoyi.competitor_products.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.competitor_products.mapper.CompetitorProductsMapper;
import com.ruoyi.competitor_products.domain.CompetitorProducts;
import com.ruoyi.competitor_products.service.ICompetitorProductsService;

/**
 * competitor_productsService业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@Service
public class CompetitorProductsServiceImpl implements ICompetitorProductsService 
{
    @Autowired
    private CompetitorProductsMapper competitorProductsMapper;

    /**
     * 查询competitor_products
     * 
     * @param id competitor_products主键
     * @return competitor_products
     */
    @Override
    public CompetitorProducts selectCompetitorProductsById(Long id)
    {
        return competitorProductsMapper.selectCompetitorProductsById(id);
    }

    /**
     * 查询competitor_products列表
     * 
     * @param competitorProducts competitor_products
     * @return competitor_products
     */
    @Override
    public List<CompetitorProducts> selectCompetitorProductsList(CompetitorProducts competitorProducts)
    {
        return competitorProductsMapper.selectCompetitorProductsList(competitorProducts);
    }

    /**
     * 新增competitor_products
     * 
     * @param competitorProducts competitor_products
     * @return 结果
     */
    @Override
    public int insertCompetitorProducts(CompetitorProducts competitorProducts)
    {
        return competitorProductsMapper.insertCompetitorProducts(competitorProducts);
    }

    /**
     * 修改competitor_products
     * 
     * @param competitorProducts competitor_products
     * @return 结果
     */
    @Override
    public int updateCompetitorProducts(CompetitorProducts competitorProducts)
    {
        return competitorProductsMapper.updateCompetitorProducts(competitorProducts);
    }

    /**
     * 批量删除competitor_products
     * 
     * @param ids 需要删除的competitor_products主键
     * @return 结果
     */
    @Override
    public int deleteCompetitorProductsByIds(Long[] ids)
    {
        return competitorProductsMapper.deleteCompetitorProductsByIds(ids);
    }

    /**
     * 删除competitor_products信息
     * 
     * @param id competitor_products主键
     * @return 结果
     */
    @Override
    public int deleteCompetitorProductsById(Long id)
    {
        return competitorProductsMapper.deleteCompetitorProductsById(id);
    }
}
