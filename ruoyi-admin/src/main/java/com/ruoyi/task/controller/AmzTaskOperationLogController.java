package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskOperationLog;
import com.ruoyi.task.service.IAmzTaskOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务操作日志Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/log")
public class AmzTaskOperationLogController extends BaseController {
    @Autowired
    private IAmzTaskOperationLogService amzTaskOperationLogService;

    /**
     * 查询亚马逊任务操作日志列表
     */
    @PreAuthorize("@ss.hasPermi('task:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskOperationLog amzTaskOperationLog) {
        startPage();
        List<AmzTaskOperationLog> list = amzTaskOperationLogService.selectAmzTaskOperationLogList(amzTaskOperationLog);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务操作日志列表
     */
    @PreAuthorize("@ss.hasPermi('task:log:export')")
    @Log(title = "亚马逊任务操作日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskOperationLog amzTaskOperationLog) {
        List<AmzTaskOperationLog> list = amzTaskOperationLogService.selectAmzTaskOperationLogList(amzTaskOperationLog);
        ExcelUtil<AmzTaskOperationLog> util = new ExcelUtil<AmzTaskOperationLog>(AmzTaskOperationLog.class);
        util.exportExcel(response, list, "亚马逊任务操作日志数据");
    }

    /**
     * 获取亚马逊任务操作日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:log:query')")
    @GetMapping(value = "/{logId}")
    public AjaxResult getInfo(@PathVariable("logId") Long logId) {
        return success(amzTaskOperationLogService.selectAmzTaskOperationLogByLogId(logId));
    }

    /**
     * 新增亚马逊任务操作日志
     */
    @PreAuthorize("@ss.hasPermi('task:log:add')")
    @Log(title = "亚马逊任务操作日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskOperationLog amzTaskOperationLog) {
        return toAjax(amzTaskOperationLogService.insertAmzTaskOperationLog(amzTaskOperationLog));
    }

    /**
     * 修改亚马逊任务操作日志
     */
    @PreAuthorize("@ss.hasPermi('task:log:edit')")
    @Log(title = "亚马逊任务操作日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskOperationLog amzTaskOperationLog) {
        return toAjax(amzTaskOperationLogService.updateAmzTaskOperationLog(amzTaskOperationLog));
    }

    /**
     * 删除亚马逊任务操作日志
     */
    @PreAuthorize("@ss.hasPermi('task:log:remove')")
    @Log(title = "亚马逊任务操作日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/{logIds}")
    public AjaxResult remove(@PathVariable Long[] logIds) {
        return toAjax(amzTaskOperationLogService.deleteAmzTaskOperationLogByLogIds(logIds));
    }
}
