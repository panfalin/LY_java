package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskSubTarget;
import com.ruoyi.task.service.IAmzTaskSubTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务子目标Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/target")
public class AmzTaskSubTargetController extends BaseController {
    @Autowired
    private IAmzTaskSubTargetService amzTaskSubTargetService;

    /**
     * 查询亚马逊任务子目标列表
     */
    @PreAuthorize("@ss.hasPermi('task:target:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskSubTarget amzTaskSubTarget) {
        startPage();
        List<AmzTaskSubTarget> list = amzTaskSubTargetService.selectAmzTaskSubTargetList(amzTaskSubTarget);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务子目标列表
     */
    @PreAuthorize("@ss.hasPermi('task:target:export')")
    @Log(title = "亚马逊任务子目标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskSubTarget amzTaskSubTarget) {
        List<AmzTaskSubTarget> list = amzTaskSubTargetService.selectAmzTaskSubTargetList(amzTaskSubTarget);
        ExcelUtil<AmzTaskSubTarget> util = new ExcelUtil<AmzTaskSubTarget>(AmzTaskSubTarget.class);
        util.exportExcel(response, list, "亚马逊任务子目标数据");
    }

    /**
     * 获取亚马逊任务子目标详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:target:query')")
    @GetMapping(value = "/{targetId}")
    public AjaxResult getInfo(@PathVariable("targetId") Long targetId) {
        return success(amzTaskSubTargetService.selectAmzTaskSubTargetByTargetId(targetId));
    }

    /**
     * 新增亚马逊任务子目标
     */
    @PreAuthorize("@ss.hasPermi('task:target:add')")
    @Log(title = "亚马逊任务子目标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskSubTarget amzTaskSubTarget) {
        return toAjax(amzTaskSubTargetService.insertAmzTaskSubTarget(amzTaskSubTarget));
    }

    /**
     * 修改亚马逊任务子目标
     */
    @PreAuthorize("@ss.hasPermi('task:target:edit')")
    @Log(title = "亚马逊任务子目标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskSubTarget amzTaskSubTarget) {
        return toAjax(amzTaskSubTargetService.updateAmzTaskSubTarget(amzTaskSubTarget));
    }

    /**
     * 删除亚马逊任务子目标
     */
    @PreAuthorize("@ss.hasPermi('task:target:remove')")
    @Log(title = "亚马逊任务子目标", businessType = BusinessType.DELETE)
    @DeleteMapping("/{targetIds}")
    public AjaxResult remove(@PathVariable Long[] targetIds) {
        return toAjax(amzTaskSubTargetService.deleteAmzTaskSubTargetByTargetIds(targetIds));
    }
}
