package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskNotification;
import com.ruoyi.task.service.IAmzTaskNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务通知Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/notification")
public class AmzTaskNotificationController extends BaseController {
    @Autowired
    private IAmzTaskNotificationService amzTaskNotificationService;

    /**
     * 查询亚马逊任务通知列表
     */
    @PreAuthorize("@ss.hasPermi('task:notification:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskNotification amzTaskNotification) {
        startPage();
        List<AmzTaskNotification> list = amzTaskNotificationService.selectAmzTaskNotificationList(amzTaskNotification);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务通知列表
     */
    @PreAuthorize("@ss.hasPermi('task:notification:export')")
    @Log(title = "亚马逊任务通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskNotification amzTaskNotification) {
        List<AmzTaskNotification> list = amzTaskNotificationService.selectAmzTaskNotificationList(amzTaskNotification);
        ExcelUtil<AmzTaskNotification> util = new ExcelUtil<AmzTaskNotification>(AmzTaskNotification.class);
        util.exportExcel(response, list, "亚马逊任务通知数据");
    }

    /**
     * 获取亚马逊任务通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:notification:query')")
    @GetMapping(value = "/{notifyId}")
    public AjaxResult getInfo(@PathVariable("notifyId") Long notifyId) {
        return success(amzTaskNotificationService.selectAmzTaskNotificationByNotifyId(notifyId));
    }

    /**
     * 新增亚马逊任务通知
     */
    @PreAuthorize("@ss.hasPermi('task:notification:add')")
    @Log(title = "亚马逊任务通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskNotification amzTaskNotification) {
        return toAjax(amzTaskNotificationService.insertAmzTaskNotification(amzTaskNotification));
    }

    /**
     * 修改亚马逊任务通知
     */
    @PreAuthorize("@ss.hasPermi('task:notification:edit')")
    @Log(title = "亚马逊任务通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskNotification amzTaskNotification) {
        return toAjax(amzTaskNotificationService.updateAmzTaskNotification(amzTaskNotification));
    }

    /**
     * 删除亚马逊任务通知
     */
    @PreAuthorize("@ss.hasPermi('task:notification:remove')")
    @Log(title = "亚马逊任务通知", businessType = BusinessType.DELETE)
    @DeleteMapping("/{notifyIds}")
    public AjaxResult remove(@PathVariable Long[] notifyIds) {
        return toAjax(amzTaskNotificationService.deleteAmzTaskNotificationByNotifyIds(notifyIds));
    }
}
