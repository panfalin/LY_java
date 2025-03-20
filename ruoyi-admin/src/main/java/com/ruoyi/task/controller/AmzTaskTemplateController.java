package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskTemplate;
import com.ruoyi.task.service.IAmzTaskTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务模板Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/template")
public class AmzTaskTemplateController extends BaseController {
    @Autowired
    private IAmzTaskTemplateService amzTaskTemplateService;

    /**
     * 查询亚马逊任务模板列表
     */
    @PreAuthorize("@ss.hasPermi('task:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskTemplate amzTaskTemplate) {
        startPage();
        List<AmzTaskTemplate> list = amzTaskTemplateService.selectAmzTaskTemplateList(amzTaskTemplate);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务模板列表
     */
    @PreAuthorize("@ss.hasPermi('task:template:export')")
    @Log(title = "亚马逊任务模板", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskTemplate amzTaskTemplate) {
        List<AmzTaskTemplate> list = amzTaskTemplateService.selectAmzTaskTemplateList(amzTaskTemplate);
        ExcelUtil<AmzTaskTemplate> util = new ExcelUtil<AmzTaskTemplate>(AmzTaskTemplate.class);
        util.exportExcel(response, list, "亚马逊任务模板数据");
    }

    /**
     * 获取亚马逊任务模板详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:template:query')")
    @GetMapping(value = "/{templateId}")
    public AjaxResult getInfo(@PathVariable("templateId") Long templateId) {
        return success(amzTaskTemplateService.selectAmzTaskTemplateByTemplateId(templateId));
    }

    /**
     * 新增亚马逊任务模板
     */
    @PreAuthorize("@ss.hasPermi('task:template:add')")
    @Log(title = "亚马逊任务模板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskTemplate amzTaskTemplate) {
        return toAjax(amzTaskTemplateService.insertAmzTaskTemplate(amzTaskTemplate));
    }

    /**
     * 修改亚马逊任务模板
     */
    @PreAuthorize("@ss.hasPermi('task:template:edit')")
    @Log(title = "亚马逊任务模板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskTemplate amzTaskTemplate) {
        return toAjax(amzTaskTemplateService.updateAmzTaskTemplate(amzTaskTemplate));
    }

    /**
     * 删除亚马逊任务模板
     */
    @PreAuthorize("@ss.hasPermi('task:template:remove')")
    @Log(title = "亚马逊任务模板", businessType = BusinessType.DELETE)
    @DeleteMapping("/{templateIds}")
    public AjaxResult remove(@PathVariable Long[] templateIds) {
        return toAjax(amzTaskTemplateService.deleteAmzTaskTemplateByTemplateIds(templateIds));
    }
}
