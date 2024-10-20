package com.ruoyi.products.mapper;

import java.util.List;
import com.ruoyi.products.domain.Products;

/**
 * productsMapper接口
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public interface ProductsMapper 
{
    /**
     * 查询products
     * 
     * @param id products主键
     * @return products
     */
    public Products selectProductsById(Long id);

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
     * 删除products
     * 
     * @param id products主键
     * @return 结果
     */
    public int deleteProductsById(Long id);

    /**
     * 批量删除products
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductsByIds(Long[] ids);
}
