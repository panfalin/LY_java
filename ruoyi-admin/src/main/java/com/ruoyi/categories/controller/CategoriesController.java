package com.ruoyi.categories.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.categories.domain.Categories;
import com.ruoyi.categories.service.ICategoriesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通分析-分类Controller
 * 
 * @author ruoyi
 * @date 2024-10-26
 */
@RestController
@RequestMapping("/categories/categories")
public class CategoriesController extends BaseController
{
    @Autowired
    private ICategoriesService categoriesService;

    /**
     * 查询速卖通分析-分类列表
     */
    @PreAuthorize("@ss.hasPermi('categories:categories:list')")
    @GetMapping("/list")
    public TableDataInfo list(Categories categories)
    {
        // startPage();
        List<Categories> list = categoriesService.selectCategoriesList(categories);
        return getDataTable(list);
    }

    /**
     * 导出速卖通分析-分类列表
     */
    @PreAuthorize("@ss.hasPermi('categories:categories:export')")
    @Log(title = "速卖通分析-分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Categories categories)
    {
        List<Categories> list = categoriesService.selectCategoriesList(categories);
        ExcelUtil<Categories> util = new ExcelUtil<Categories>(Categories.class);
        util.exportExcel(response, list, "速卖通分析-分类数据");
    }

    /**
     * 获取速卖通分析-分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('categories:categories:query')")
    @GetMapping(value = "/{categoryId}")
    public AjaxResult getInfo(@PathVariable("categoryId") Long categoryId)
    {
        return success(categoriesService.selectCategoriesByCategoryId(categoryId));
    }

    /**
     * 新增速卖通分析-分类
     */
    @PreAuthorize("@ss.hasPermi('categories:categories:add')")
    @Log(title = "速卖通分析-分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Categories categories)
    {
        return toAjax(categoriesService.insertCategories(categories));
    }

    /**
     * 修改速卖通分析-分类
     */
    @PreAuthorize("@ss.hasPermi('categories:categories:edit')")
    @Log(title = "速卖通分析-分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Categories categories)
    {
        return toAjax(categoriesService.updateCategories(categories));
    }

    /**
     * 删除速卖通分析-分类
     */
    @PreAuthorize("@ss.hasPermi('categories:categories:remove')")
    @Log(title = "速卖通分析-分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{categoryIds}")
    public AjaxResult remove(@PathVariable Long[] categoryIds)
    {
        return toAjax(categoriesService.deleteCategoriesByCategoryIds(categoryIds));
    }
}
