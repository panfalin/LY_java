package com.ruoyi.competitor_products.service;

import java.util.List;
import com.ruoyi.competitor_products.domain.CompetitorProducts;

/**
 * competitor_productsService接口
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public interface ICompetitorProductsService 
{
    /**
     * 查询competitor_products
     * 
     * @param id competitor_products主键
     * @return competitor_products
     */
    public CompetitorProducts selectCompetitorProductsById(Long id);

    /**
     * 查询competitor_products列表
     * 
     * @param competitorProducts competitor_products
     * @return competitor_products集合
     */
    public List<CompetitorProducts> selectCompetitorProductsList(CompetitorProducts competitorProducts);

    /**
     * 新增competitor_products
     * 
     * @param competitorProducts competitor_products
     * @return 结果
     */
    public int insertCompetitorProducts(CompetitorProducts competitorProducts);

    /**
     * 修改competitor_products
     * 
     * @param competitorProducts competitor_products
     * @return 结果
     */
    public int updateCompetitorProducts(CompetitorProducts competitorProducts);

    /**
     * 批量删除competitor_products
     * 
     * @param ids 需要删除的competitor_products主键集合
     * @return 结果
     */
    public int deleteCompetitorProductsByIds(Long[] ids);

    /**
     * 删除competitor_products信息
     * 
     * @param id competitor_products主键
     * @return 结果
     */
    public int deleteCompetitorProductsById(Long id);
}
