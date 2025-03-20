package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskSettings;
import com.ruoyi.task.service.IAmzTaskSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务设置Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/settings")
public class AmzTaskSettingsController extends BaseController {
    @Autowired
    private IAmzTaskSettingsService amzTaskSettingsService;

    /**
     * 查询亚马逊任务设置列表
     */
    @PreAuthorize("@ss.hasPermi('task:settings:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskSettings amzTaskSettings) {
        startPage();
        List<AmzTaskSettings> list = amzTaskSettingsService.selectAmzTaskSettingsList(amzTaskSettings);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务设置列表
     */
    @PreAuthorize("@ss.hasPermi('task:settings:export')")
    @Log(title = "亚马逊任务设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskSettings amzTaskSettings) {
        List<AmzTaskSettings> list = amzTaskSettingsService.selectAmzTaskSettingsList(amzTaskSettings);
        ExcelUtil<AmzTaskSettings> util = new ExcelUtil<AmzTaskSettings>(AmzTaskSettings.class);
        util.exportExcel(response, list, "亚马逊任务设置数据");
    }

    /**
     * 获取亚马逊任务设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:settings:query')")
    @GetMapping(value = "/{settingId}")
    public AjaxResult getInfo(@PathVariable("settingId") Long settingId) {
        return success(amzTaskSettingsService.selectAmzTaskSettingsBySettingId(settingId));
    }

    /**
     * 新增亚马逊任务设置
     */
    @PreAuthorize("@ss.hasPermi('task:settings:add')")
    @Log(title = "亚马逊任务设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskSettings amzTaskSettings) {
        return toAjax(amzTaskSettingsService.insertAmzTaskSettings(amzTaskSettings));
    }

    /**
     * 修改亚马逊任务设置
     */
    @PreAuthorize("@ss.hasPermi('task:settings:edit')")
    @Log(title = "亚马逊任务设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskSettings amzTaskSettings) {
        return toAjax(amzTaskSettingsService.updateAmzTaskSettings(amzTaskSettings));
    }

    /**
     * 删除亚马逊任务设置
     */
    @PreAuthorize("@ss.hasPermi('task:settings:remove')")
    @Log(title = "亚马逊任务设置", businessType = BusinessType.DELETE)
    @DeleteMapping("/{settingIds}")
    public AjaxResult remove(@PathVariable Long[] settingIds) {
        return toAjax(amzTaskSettingsService.deleteAmzTaskSettingsBySettingIds(settingIds));
    }
}
