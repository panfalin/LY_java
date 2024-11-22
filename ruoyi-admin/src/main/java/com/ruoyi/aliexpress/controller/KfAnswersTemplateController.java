package com.ruoyi.aliexpress.controller;

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
import com.ruoyi.aliexpress.domain.KfAnswersTemplate;
import com.ruoyi.aliexpress.service.IKfAnswersTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客服问答SKU收集模板Controller
 * 
 * @author ruoyi
 * @date 2024-11-22
 */
@RestController
@RequestMapping("/template/template")
public class KfAnswersTemplateController extends BaseController
{
    @Autowired
    private IKfAnswersTemplateService kfAnswersTemplateService;

    /**
     * 查询客服问答SKU收集模板列表
     */
    @PreAuthorize("@ss.hasPermi('template:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(KfAnswersTemplate kfAnswersTemplate)
    {
        startPage();
        List<KfAnswersTemplate> list = kfAnswersTemplateService.selectKfAnswersTemplateList(kfAnswersTemplate);
        return getDataTable(list);
    }

    /**
     * 导出客服问答SKU收集模板列表
     */
    @PreAuthorize("@ss.hasPermi('template:template:export')")
    @Log(title = "客服问答SKU收集模板", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KfAnswersTemplate kfAnswersTemplate)
    {
        List<KfAnswersTemplate> list = kfAnswersTemplateService.selectKfAnswersTemplateList(kfAnswersTemplate);
        ExcelUtil<KfAnswersTemplate> util = new ExcelUtil<KfAnswersTemplate>(KfAnswersTemplate.class);
        util.exportExcel(response, list, "客服问答SKU收集模板数据");
    }

    /**
     * 获取客服问答SKU收集模板详细信息
     */
    @PreAuthorize("@ss.hasPermi('template:template:query')")
    @GetMapping(value = "/{sku}")
    public AjaxResult getInfo(@PathVariable("sku") String sku)
    {
        return success(kfAnswersTemplateService.selectKfAnswersTemplateBySku(sku));
    }

    /**
     * 新增客服问答SKU收集模板
     */
    @PreAuthorize("@ss.hasPermi('template:template:add')")
    @Log(title = "客服问答SKU收集模板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KfAnswersTemplate kfAnswersTemplate)
    {
        return toAjax(kfAnswersTemplateService.insertKfAnswersTemplate(kfAnswersTemplate));
    }

    /**
     * 修改客服问答SKU收集模板
     */
    @PreAuthorize("@ss.hasPermi('template:template:edit')")
    @Log(title = "客服问答SKU收集模板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KfAnswersTemplate kfAnswersTemplate)
    {
        return toAjax(kfAnswersTemplateService.updateKfAnswersTemplate(kfAnswersTemplate));
    }

    /**
     * 删除客服问答SKU收集模板
     */
    @PreAuthorize("@ss.hasPermi('template:template:remove')")
    @Log(title = "客服问答SKU收集模板", businessType = BusinessType.DELETE)
	@DeleteMapping("/{skus}")
    public AjaxResult remove(@PathVariable String[] skus)
    {
        return toAjax(kfAnswersTemplateService.deleteKfAnswersTemplateBySkus(skus));
    }
}
