package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskAssignee;
import com.ruoyi.task.service.IAmzTaskAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务指派Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/assignee")
public class AmzTaskAssigneeController extends BaseController {
    @Autowired
    private IAmzTaskAssigneeService amzTaskAssigneeService;

    /**
     * 查询亚马逊任务指派列表
     */
    @PreAuthorize("@ss.hasPermi('task:assignee:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskAssignee amzTaskAssignee) {
        startPage();
        List<AmzTaskAssignee> list = amzTaskAssigneeService.selectAmzTaskAssigneeList(amzTaskAssignee);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务指派列表
     */
    @PreAuthorize("@ss.hasPermi('task:assignee:export')")
    @Log(title = "亚马逊任务指派", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskAssignee amzTaskAssignee) {
        List<AmzTaskAssignee> list = amzTaskAssigneeService.selectAmzTaskAssigneeList(amzTaskAssignee);
        ExcelUtil<AmzTaskAssignee> util = new ExcelUtil<AmzTaskAssignee>(AmzTaskAssignee.class);
        util.exportExcel(response, list, "亚马逊任务指派数据");
    }

    /**
     * 获取亚马逊任务指派详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:assignee:query')")
    @GetMapping(value = "/{assigneeId}")
    public AjaxResult getInfo(@PathVariable("assigneeId") Long assigneeId) {
        return success(amzTaskAssigneeService.selectAmzTaskAssigneeByAssigneeId(assigneeId));
    }

    /**
     * 新增亚马逊任务指派
     */
    @PreAuthorize("@ss.hasPermi('task:assignee:add')")
    @Log(title = "亚马逊任务指派", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskAssignee amzTaskAssignee) {
        return toAjax(amzTaskAssigneeService.insertAmzTaskAssignee(amzTaskAssignee));
    }

    /**
     * 修改亚马逊任务指派
     */
    @PreAuthorize("@ss.hasPermi('task:assignee:edit')")
    @Log(title = "亚马逊任务指派", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskAssignee amzTaskAssignee) {
        return toAjax(amzTaskAssigneeService.updateAmzTaskAssignee(amzTaskAssignee));
    }

    /**
     * 删除亚马逊任务指派
     */
    @PreAuthorize("@ss.hasPermi('task:assignee:remove')")
    @Log(title = "亚马逊任务指派", businessType = BusinessType.DELETE)
    @DeleteMapping("/{assigneeIds}")
    public AjaxResult remove(@PathVariable Long[] assigneeIds) {
        return toAjax(amzTaskAssigneeService.deleteAmzTaskAssigneeByAssigneeIds(assigneeIds));
    }
}
