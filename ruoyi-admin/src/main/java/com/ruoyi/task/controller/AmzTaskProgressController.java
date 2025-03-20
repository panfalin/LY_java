package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskProgress;
import com.ruoyi.task.service.IAmzTaskProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务进度记录Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/progress")
public class AmzTaskProgressController extends BaseController {
    @Autowired
    private IAmzTaskProgressService amzTaskProgressService;

    /**
     * 查询亚马逊任务进度记录列表
     */
    @PreAuthorize("@ss.hasPermi('task:progress:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskProgress amzTaskProgress) {
        startPage();
        List<AmzTaskProgress> list = amzTaskProgressService.selectAmzTaskProgressList(amzTaskProgress);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务进度记录列表
     */
    @PreAuthorize("@ss.hasPermi('task:progress:export')")
    @Log(title = "亚马逊任务进度记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskProgress amzTaskProgress) {
        List<AmzTaskProgress> list = amzTaskProgressService.selectAmzTaskProgressList(amzTaskProgress);
        ExcelUtil<AmzTaskProgress> util = new ExcelUtil<AmzTaskProgress>(AmzTaskProgress.class);
        util.exportExcel(response, list, "亚马逊任务进度记录数据");
    }

    /**
     * 获取亚马逊任务进度记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:progress:query')")
    @GetMapping(value = "/{progressId}")
    public AjaxResult getInfo(@PathVariable("progressId") Long progressId) {
        return success(amzTaskProgressService.selectAmzTaskProgressByProgressId(progressId));
    }

    /**
     * 新增亚马逊任务进度记录
     */
    @PreAuthorize("@ss.hasPermi('task:progress:add')")
    @Log(title = "亚马逊任务进度记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskProgress amzTaskProgress) {
        return toAjax(amzTaskProgressService.insertAmzTaskProgress(amzTaskProgress));
    }

    /**
     * 修改亚马逊任务进度记录
     */
    @PreAuthorize("@ss.hasPermi('task:progress:edit')")
    @Log(title = "亚马逊任务进度记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskProgress amzTaskProgress) {
        return toAjax(amzTaskProgressService.updateAmzTaskProgress(amzTaskProgress));
    }

    /**
     * 删除亚马逊任务进度记录
     */
    @PreAuthorize("@ss.hasPermi('task:progress:remove')")
    @Log(title = "亚马逊任务进度记录", businessType = BusinessType.DELETE)
    @DeleteMapping("/{progressIds}")
    public AjaxResult remove(@PathVariable Long[] progressIds) {
        return toAjax(amzTaskProgressService.deleteAmzTaskProgressByProgressIds(progressIds));
    }
}
