package com.ruoyi.categories.mapper;

import java.util.List;
import com.ruoyi.categories.domain.Categories;

/**
 * 速卖通分析-分类Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-26
 */
public interface CategoriesMapper 
{
    /**
     * 查询速卖通分析-分类
     * 
     * @param categoryId 速卖通分析-分类主键
     * @return 速卖通分析-分类
     */
    public Categories selectCategoriesByCategoryId(Long categoryId);

    /**
     * 查询速卖通分析-分类列表
     * 
     * @param categories 速卖通分析-分类
     * @return 速卖通分析-分类集合
     */
    public List<Categories> selectCategoriesList(Categories categories);

    /**
     * 新增速卖通分析-分类
     * 
     * @param categories 速卖通分析-分类
     * @return 结果
     */
    public int insertCategories(Categories categories);

    /**
     * 修改速卖通分析-分类
     * 
     * @param categories 速卖通分析-分类
     * @return 结果
     */
    public int updateCategories(Categories categories);

    /**
     * 删除速卖通分析-分类
     * 
     * @param categoryId 速卖通分析-分类主键
     * @return 结果
     */
    public int deleteCategoriesByCategoryId(Long categoryId);

    /**
     * 批量删除速卖通分析-分类
     * 
     * @param categoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCategoriesByCategoryIds(Long[] categoryIds);
}