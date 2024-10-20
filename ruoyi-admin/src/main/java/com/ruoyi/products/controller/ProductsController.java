package com.ruoyi.products.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.common.constant.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.products.domain.Products;
import com.ruoyi.products.service.IProductsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * productsController
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@RestController
@RequestMapping("/products/products")
public class ProductsController extends BaseController
{
    @Autowired
    private IProductsService productsService;

    /**
     * 查询products列表
     */
    @PreAuthorize("@ss.hasPermi('products:products:list')")
    @GetMapping("/list")
    public TableDataInfo list(Products products)
    {
        startPage();
        List<Map<String, Object>> list = productsService.getProductsList(products);
        List<Products> productsList = productsService.selectProductsList(products);
        long total = getDataTable(productsList).getTotal();
        TableDataInfo tableDataInfo = new TableDataInfo();
        tableDataInfo.setTotal(total);
        tableDataInfo.setRows(list);
        tableDataInfo.setCode(HttpStatus.SUCCESS);
        tableDataInfo.setMsg("查询成功");
        return tableDataInfo;
    }

    /**
     * 导出products列表
     */
    @PreAuthorize("@ss.hasPermi('products:products:export')")
    @Log(title = "products", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Products products)
    {
        List<Map<String, Object>> list = productsService.getProductsList(products);
        ExcelUtil<Products> util = new ExcelUtil<Products>(Products.class);
//        util.exportExcel(response, list, "products数据");
    }

    /**
     * 获取products详细信息
     */
    @PreAuthorize("@ss.hasPermi('products:products:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(productsService.selectProductsById(id));
    }

    /**
     * 新增products
     */
    @PreAuthorize("@ss.hasPermi('products:products:add')")
    @Log(title = "products", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Products products)
    {
        return toAjax(productsService.insertProducts(products));
    }

    /**
     * 修改products
     */
    @PreAuthorize("@ss.hasPermi('products:products:edit')")
    @Log(title = "products", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Products products)
    {
        return toAjax(productsService.updateProducts(products));
    }

    /**
     * 删除products
     */
    @PreAuthorize("@ss.hasPermi('products:products:remove')")
    @Log(title = "products", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(productsService.deleteProductsByIds(ids));
    }
}
