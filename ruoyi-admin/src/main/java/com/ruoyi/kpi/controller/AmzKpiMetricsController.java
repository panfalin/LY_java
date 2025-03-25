package com.ruoyi.kpi.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.kpi.domain.AmzKpiMetrics;
import com.ruoyi.kpi.service.IAmzKpiMetricsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * KPI指标定义Controller
 * 
 * @author panfalin
 * @date 2025-03-25
 */
@RestController
@RequestMapping("/kpi/metrics")
public class AmzKpiMetricsController extends BaseController
{
    @Autowired
    private IAmzKpiMetricsService amzKpiMetricsService;

    /**
     * 查询KPI指标定义列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:metrics:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzKpiMetrics amzKpiMetrics)
    {
        // startPage();
        List<AmzKpiMetrics> list = amzKpiMetricsService.selectAmzKpiMetricsList(amzKpiMetrics);
        return getDataTable(list);
    }

    /**
     * 导出KPI指标定义列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:metrics:export')")
    @Log(title = "KPI指标定义", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzKpiMetrics amzKpiMetrics)
    {
        List<AmzKpiMetrics> list = amzKpiMetricsService.selectAmzKpiMetricsList(amzKpiMetrics);
        ExcelUtil<AmzKpiMetrics> util = new ExcelUtil<AmzKpiMetrics>(AmzKpiMetrics.class);
        util.exportExcel(response, list, "KPI指标定义数据");
    }

    /**
     * 获取KPI指标定义详细信息
     */
    @PreAuthorize("@ss.hasPermi('kpi:metrics:query')")
    @GetMapping(value = "/{metricId}")
    public AjaxResult getInfo(@PathVariable("metricId") Long metricId)
    {
        return success(amzKpiMetricsService.selectAmzKpiMetricsByMetricId(metricId));
    }

    /**
     * 新增KPI指标定义
     */
    @PreAuthorize("@ss.hasPermi('kpi:metrics:add')")
    @Log(title = "KPI指标定义", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzKpiMetrics amzKpiMetrics)
    {
        return toAjax(amzKpiMetricsService.insertAmzKpiMetrics(amzKpiMetrics));
    }

    /**
     * 修改KPI指标定义
     */
    @PreAuthorize("@ss.hasPermi('kpi:metrics:edit')")
    @Log(title = "KPI指标定义", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzKpiMetrics amzKpiMetrics)
    {
        return toAjax(amzKpiMetricsService.updateAmzKpiMetrics(amzKpiMetrics));
    }

    /**
     * 删除KPI指标定义
     */
    @PreAuthorize("@ss.hasPermi('kpi:metrics:remove')")
    @Log(title = "KPI指标定义", businessType = BusinessType.DELETE)
	@DeleteMapping("/{metricIds}")
    public AjaxResult remove(@PathVariable Long[] metricIds)
    {
        return toAjax(amzKpiMetricsService.deleteAmzKpiMetricsByMetricIds(metricIds));
    }
}
