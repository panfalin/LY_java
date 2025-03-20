package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskMain;
import com.ruoyi.task.domain.vo.SkuTaskVO;
import com.ruoyi.task.service.IAmzTaskMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务主表Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/taskMain")
public class AmzTaskMainController extends BaseController {
    @Autowired
    private IAmzTaskMainService amzTaskMainService;

    /**
     * 查询亚马逊任务主表列表
     */
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskMain amzTaskMain) {
        startPage();
        List<SkuTaskVO> list = amzTaskMainService.selectTaskGroupBySku(amzTaskMain);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务主表列表
     */
    @PreAuthorize("@ss.hasPermi('task:taskMain:export')")
    @Log(title = "亚马逊任务主表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskMain amzTaskMain) {
        List<AmzTaskMain> list = amzTaskMainService.selectAmzTaskMainList(amzTaskMain);
        ExcelUtil<AmzTaskMain> util = new ExcelUtil<AmzTaskMain>(AmzTaskMain.class);
        util.exportExcel(response, list, "亚马逊任务主表数据");
    }

    /**
     * 获取亚马逊任务主表详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:taskMain:query')")
    @GetMapping(value = "/{taskId}")
    public AjaxResult getInfo(@PathVariable("taskId") Long taskId) {
        return success(amzTaskMainService.selectAmzTaskMainByTaskId(taskId));
    }

    /**
     * 新增亚马逊任务主表
     */
    @PreAuthorize("@ss.hasPermi('task:taskMain:add')")
    @Log(title = "亚马逊任务主表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskMain amzTaskMain) {
        return toAjax(amzTaskMainService.insertAmzTaskMain(amzTaskMain));
    }

    /**
     * 修改亚马逊任务主表
     */
    @PreAuthorize("@ss.hasPermi('task:taskMain:edit')")
    @Log(title = "亚马逊任务主表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskMain amzTaskMain) {
        return toAjax(amzTaskMainService.updateAmzTaskMain(amzTaskMain));
    }

    /**
     * 删除亚马逊任务主表
     */
    @PreAuthorize("@ss.hasPermi('task:taskMain:remove')")
    @Log(title = "亚马逊任务主表", businessType = BusinessType.DELETE)
    @DeleteMapping("/{taskIds}")
    public AjaxResult remove(@PathVariable Long[] taskIds) {
        return toAjax(amzTaskMainService.deleteAmzTaskMainByTaskIds(taskIds));
    }
}
