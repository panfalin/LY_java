package com.ruoyi.products.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.products.domain.Products;

/**
 * productsService接口
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public interface IProductsService 
{
    /**
     * 查询products
     * 
     * @param id products主键
     * @return products
     */
    public Products selectProductsById(Long id);

    /**
     * 获取products列表
     * 
     * @param products products
     * @return products集合
     */
    public List<Map<String, Object>> getProductsList(Products products);

    /**
     * 查询products列表
     *
     * @param products products
     * @return products集合
     */
    public List<Products> selectProductsList(Products products);

    /**
     * 新增products
     * 
     * @param products products
     * @return 结果
     */
    public int insertProducts(Products products);

    /**
     * 修改products
     * 
     * @param products products
     * @return 结果
     */
    public int updateProducts(Products products);

    /**
     * 批量删除products
     * 
     * @param ids 需要删除的products主键集合
     * @return 结果
     */
    public int deleteProductsByIds(Long[] ids);

    /**
     * 删除products信息
     * 
     * @param id products主键
     * @return 结果
     */
    public int deleteProductsById(Long id);
}
