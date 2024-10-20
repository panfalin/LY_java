package com.ruoyi.competitor_products.controller;

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
import com.ruoyi.competitor_products.domain.CompetitorProducts;
import com.ruoyi.competitor_products.service.ICompetitorProductsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * competitor_productsController
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@RestController
@RequestMapping("/competitor_products/competitor_products")
public class CompetitorProductsController extends BaseController
{
    @Autowired
    private ICompetitorProductsService competitorProductsService;

    /**
     * 查询competitor_products列表
     */
    @PreAuthorize("@ss.hasPermi('competitor_products:competitor_products:list')")
    @GetMapping("/list")
    public TableDataInfo list(CompetitorProducts competitorProducts)
    {
        startPage();
        List<CompetitorProducts> list = competitorProductsService.selectCompetitorProductsList(competitorProducts);
        return getDataTable(list);
    }

    /**
     * 导出competitor_products列表
     */
    @PreAuthorize("@ss.hasPermi('competitor_products:competitor_products:export')")
    @Log(title = "competitor_products", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CompetitorProducts competitorProducts)
    {
        List<CompetitorProducts> list = competitorProductsService.selectCompetitorProductsList(competitorProducts);
        ExcelUtil<CompetitorProducts> util = new ExcelUtil<CompetitorProducts>(CompetitorProducts.class);
        util.exportExcel(response, list, "competitor_products数据");
    }

    /**
     * 获取competitor_products详细信息
     */
    @PreAuthorize("@ss.hasPermi('competitor_products:competitor_products:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(competitorProductsService.selectCompetitorProductsById(id));
    }

    /**
     * 新增competitor_products
     */
    @PreAuthorize("@ss.hasPermi('competitor_products:competitor_products:add')")
    @Log(title = "competitor_products", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CompetitorProducts competitorProducts)
    {
        return toAjax(competitorProductsService.insertCompetitorProducts(competitorProducts));
    }

    /**
     * 修改competitor_products
     */
    @PreAuthorize("@ss.hasPermi('competitor_products:competitor_products:edit')")
    @Log(title = "competitor_products", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CompetitorProducts competitorProducts)
    {
        return toAjax(competitorProductsService.updateCompetitorProducts(competitorProducts));
    }

    /**
     * 删除competitor_products
     */
    @PreAuthorize("@ss.hasPermi('competitor_products:competitor_products:remove')")
    @Log(title = "competitor_products", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(competitorProductsService.deleteCompetitorProductsByIds(ids));
    }
}
