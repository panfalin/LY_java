package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskStatistics;
import com.ruoyi.task.service.IAmzTaskStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务统计Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/statistics")
public class AmzTaskStatisticsController extends BaseController {
    @Autowired
    private IAmzTaskStatisticsService amzTaskStatisticsService;

    /**
     * 查询亚马逊任务统计列表
     */
    @PreAuthorize("@ss.hasPermi('task:statistics:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskStatistics amzTaskStatistics) {
        startPage();
        List<AmzTaskStatistics> list = amzTaskStatisticsService.selectAmzTaskStatisticsList(amzTaskStatistics);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务统计列表
     */
    @PreAuthorize("@ss.hasPermi('task:statistics:export')")
    @Log(title = "亚马逊任务统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskStatistics amzTaskStatistics) {
        List<AmzTaskStatistics> list = amzTaskStatisticsService.selectAmzTaskStatisticsList(amzTaskStatistics);
        ExcelUtil<AmzTaskStatistics> util = new ExcelUtil<AmzTaskStatistics>(AmzTaskStatistics.class);
        util.exportExcel(response, list, "亚马逊任务统计数据");
    }

    /**
     * 获取亚马逊任务统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:statistics:query')")
    @GetMapping(value = "/{statsId}")
    public AjaxResult getInfo(@PathVariable("statsId") Long statsId) {
        return success(amzTaskStatisticsService.selectAmzTaskStatisticsByStatsId(statsId));
    }

    /**
     * 新增亚马逊任务统计
     */
    @PreAuthorize("@ss.hasPermi('task:statistics:add')")
    @Log(title = "亚马逊任务统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskStatistics amzTaskStatistics) {
        return toAjax(amzTaskStatisticsService.insertAmzTaskStatistics(amzTaskStatistics));
    }

    /**
     * 修改亚马逊任务统计
     */
    @PreAuthorize("@ss.hasPermi('task:statistics:edit')")
    @Log(title = "亚马逊任务统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskStatistics amzTaskStatistics) {
        return toAjax(amzTaskStatisticsService.updateAmzTaskStatistics(amzTaskStatistics));
    }

    /**
     * 删除亚马逊任务统计
     */
    @PreAuthorize("@ss.hasPermi('task:statistics:remove')")
    @Log(title = "亚马逊任务统计", businessType = BusinessType.DELETE)
    @DeleteMapping("/{statsIds}")
    public AjaxResult remove(@PathVariable Long[] statsIds) {
        return toAjax(amzTaskStatisticsService.deleteAmzTaskStatisticsByStatsIds(statsIds));
    }
}
