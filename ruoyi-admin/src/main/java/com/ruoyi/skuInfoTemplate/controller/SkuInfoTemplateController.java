package com.ruoyi.skuInfoTemplate.controller;

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
import com.ruoyi.skuInfoTemplate.domain.SkuInfoTemplate;
import com.ruoyi.skuInfoTemplate.service.ISkuInfoTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * skuInfoTemplateController
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@RestController
@RequestMapping("/skuInfoTemplate/skuInfoTemplate")
public class SkuInfoTemplateController extends BaseController
{
    @Autowired
    private ISkuInfoTemplateService skuInfoTemplateService;

    /**
     * 查询skuInfoTemplate列表
     */
    @PreAuthorize("@ss.hasPermi('skuInfoTemplate:skuInfoTemplate:list')")
    @GetMapping("/list")
    public TableDataInfo list(SkuInfoTemplate skuInfoTemplate)
    {
        startPage();
        List<SkuInfoTemplate> list = skuInfoTemplateService.selectSkuInfoTemplateList(skuInfoTemplate);
        return getDataTable(list);
    }

    /**
     * 导出skuInfoTemplate列表
     */
    @PreAuthorize("@ss.hasPermi('skuInfoTemplate:skuInfoTemplate:export')")
    @Log(title = "skuInfoTemplate", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SkuInfoTemplate skuInfoTemplate)
    {
        List<SkuInfoTemplate> list = skuInfoTemplateService.selectSkuInfoTemplateList(skuInfoTemplate);
        ExcelUtil<SkuInfoTemplate> util = new ExcelUtil<SkuInfoTemplate>(SkuInfoTemplate.class);
        util.exportExcel(response, list, "skuInfoTemplate数据");
    }

    /**
     * 获取skuInfoTemplate详细信息
     */
    @PreAuthorize("@ss.hasPermi('skuInfoTemplate:skuInfoTemplate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(skuInfoTemplateService.selectSkuInfoTemplateById(id));
    }

    /**
     * 新增skuInfoTemplate
     */
    @PreAuthorize("@ss.hasPermi('skuInfoTemplate:skuInfoTemplate:add')")
    @Log(title = "skuInfoTemplate", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SkuInfoTemplate skuInfoTemplate)
    {
        return toAjax(skuInfoTemplateService.insertSkuInfoTemplate(skuInfoTemplate));
    }

    /**
     * 修改skuInfoTemplate
     */
    @PreAuthorize("@ss.hasPermi('skuInfoTemplate:skuInfoTemplate:edit')")
    @Log(title = "skuInfoTemplate", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SkuInfoTemplate skuInfoTemplate)
    {
        return toAjax(skuInfoTemplateService.updateSkuInfoTemplate(skuInfoTemplate));
    }

    /**
     * 删除skuInfoTemplate
     */
    @PreAuthorize("@ss.hasPermi('skuInfoTemplate:skuInfoTemplate:remove')")
    @Log(title = "skuInfoTemplate", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(skuInfoTemplateService.deleteSkuInfoTemplateByIds(ids));
    }
}
