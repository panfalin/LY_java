package com.ruoyi.kpi.mapper;

import com.ruoyi.kpi.domain.AmzKpiMetrics;

import java.util.List;

/**
 * KPI指标定义Mapper接口
 *
 * @author panfalin
 * @date 2025-03-24
 */
public interface AmzKpiMetricsMapper {
    /**
     * 查询KPI指标定义
     *
     * @param metricId KPI指标定义主键
     * @return KPI指标定义
     */
    public AmzKpiMetrics selectAmzKpiMetricsByMetricId(Long metricId);

    /**
     * 查询KPI指标定义列表
     *
     * @param amzKpiMetrics KPI指标定义
     * @return KPI指标定义集合
     */
    public List<AmzKpiMetrics> selectAmzKpiMetricsList(AmzKpiMetrics amzKpiMetrics);

    /**
     * 新增KPI指标定义
     *
     * @param amzKpiMetrics KPI指标定义
     * @return 结果
     */
    public int insertAmzKpiMetrics(AmzKpiMetrics amzKpiMetrics);

    /**
     * 修改KPI指标定义
     *
     * @param amzKpiMetrics KPI指标定义
     * @return 结果
     */
    public int updateAmzKpiMetrics(AmzKpiMetrics amzKpiMetrics);

    /**
     * 删除KPI指标定义
     *
     * @param metricId KPI指标定义主键
     * @return 结果
     */
    public int deleteAmzKpiMetricsByMetricId(Long metricId);

    /**
     * 批量删除KPI指标定义
     *
     * @param metricIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzKpiMetricsByMetricIds(Long[] metricIds);
}
