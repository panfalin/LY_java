package com.ruoyi.categories.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.categories.mapper.CategoriesMapper;
import com.ruoyi.categories.domain.Categories;
import com.ruoyi.categories.service.ICategoriesService;

/**
 * 速卖通分析-分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-26
 */
@Service
public class CategoriesServiceImpl implements ICategoriesService 
{
    @Autowired
    private CategoriesMapper categoriesMapper;

    /**
     * 查询速卖通分析-分类
     * 
     * @param categoryId 速卖通分析-分类主键
     * @return 速卖通分析-分类
     */
    @Override
    public Categories selectCategoriesByCategoryId(Long categoryId)
    {
        return categoriesMapper.selectCategoriesByCategoryId(categoryId);
    }

    /**
     * 查询速卖通分析-分类列表
     * 
     * @param categories 速卖通分析-分类
     * @return 速卖通分析-分类
     */
    @Override
    public List<Categories> selectCategoriesList(Categories categories)
    {
        return categoriesMapper.selectCategoriesList(categories);
    }

    /**
     * 新增速卖通分析-分类
     * 
     * @param categories 速卖通分析-分类
     * @return 结果
     */
    @Override
    public int insertCategories(Categories categories)
    {
        return categoriesMapper.insertCategories(categories);
    }

    /**
     * 修改速卖通分析-分类
     * 
     * @param categories 速卖通分析-分类
     * @return 结果
     */
    @Override
    public int updateCategories(Categories categories)
    {
        return categoriesMapper.updateCategories(categories);
    }

    /**
     * 批量删除速卖通分析-分类
     * 
     * @param categoryIds 需要删除的速卖通分析-分类主键
     * @return 结果
     */
    @Override
    public int deleteCategoriesByCategoryIds(Long[] categoryIds)
    {
        return categoriesMapper.deleteCategoriesByCategoryIds(categoryIds);
    }

    /**
     * 删除速卖通分析-分类信息
     * 
     * @param categoryId 速卖通分析-分类主键
     * @return 结果
     */
    @Override
    public int deleteCategoriesByCategoryId(Long categoryId)
    {
        return categoriesMapper.deleteCategoriesByCategoryId(categoryId);
    }
}
