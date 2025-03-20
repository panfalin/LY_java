package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskReportConfig;
import com.ruoyi.task.service.IAmzTaskReportConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务报配置Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/config")
public class AmzTaskReportConfigController extends BaseController {
    @Autowired
    private IAmzTaskReportConfigService amzTaskReportConfigService;

    /**
     * 查询亚马逊任务报配置列表
     */
    @PreAuthorize("@ss.hasPermi('task:config:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskReportConfig amzTaskReportConfig) {
        startPage();
        List<AmzTaskReportConfig> list = amzTaskReportConfigService.selectAmzTaskReportConfigList(amzTaskReportConfig);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务报配置列表
     */
    @PreAuthorize("@ss.hasPermi('task:config:export')")
    @Log(title = "亚马逊任务报配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskReportConfig amzTaskReportConfig) {
        List<AmzTaskReportConfig> list = amzTaskReportConfigService.selectAmzTaskReportConfigList(amzTaskReportConfig);
        ExcelUtil<AmzTaskReportConfig> util = new ExcelUtil<AmzTaskReportConfig>(AmzTaskReportConfig.class);
        util.exportExcel(response, list, "亚马逊任务报配置数据");
    }

    /**
     * 获取亚马逊任务报配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:config:query')")
    @GetMapping(value = "/{configId}")
    public AjaxResult getInfo(@PathVariable("configId") Long configId) {
        return success(amzTaskReportConfigService.selectAmzTaskReportConfigByConfigId(configId));
    }

    /**
     * 新增亚马逊任务报配置
     */
    @PreAuthorize("@ss.hasPermi('task:config:add')")
    @Log(title = "亚马逊任务报配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskReportConfig amzTaskReportConfig) {
        return toAjax(amzTaskReportConfigService.insertAmzTaskReportConfig(amzTaskReportConfig));
    }

    /**
     * 修改亚马逊任务报配置
     */
    @PreAuthorize("@ss.hasPermi('task:config:edit')")
    @Log(title = "亚马逊任务报配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskReportConfig amzTaskReportConfig) {
        return toAjax(amzTaskReportConfigService.updateAmzTaskReportConfig(amzTaskReportConfig));
    }

    /**
     * 删除亚马逊任务报配置
     */
    @PreAuthorize("@ss.hasPermi('task:config:remove')")
    @Log(title = "亚马逊任务报配置", businessType = BusinessType.DELETE)
    @DeleteMapping("/{configIds}")
    public AjaxResult remove(@PathVariable Long[] configIds) {
        return toAjax(amzTaskReportConfigService.deleteAmzTaskReportConfigByConfigIds(configIds));
    }
}
