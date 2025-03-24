package com.ruoyi.kpi.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.kpi.domain.AmzKpiMetrics;
import com.ruoyi.kpi.mapper.AmzKpiMetricsMapper;
import com.ruoyi.kpi.service.IAmzKpiMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * KPI指标定义Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-24
 */
@Service
public class AmzKpiMetricsServiceImpl implements IAmzKpiMetricsService {
    @Autowired
    private AmzKpiMetricsMapper amzKpiMetricsMapper;

    /**
     * 查询KPI指标定义
     *
     * @param metricId KPI指标定义主键
     * @return KPI指标定义
     */
    @Override
    public AmzKpiMetrics selectAmzKpiMetricsByMetricId(Long metricId) {
        return amzKpiMetricsMapper.selectAmzKpiMetricsByMetricId(metricId);
    }

    /**
     * 查询KPI指标定义列表
     *
     * @param amzKpiMetrics KPI指标定义
     * @return KPI指标定义
     */
    @Override
    public List<AmzKpiMetrics> selectAmzKpiMetricsList(AmzKpiMetrics amzKpiMetrics) {
        return amzKpiMetricsMapper.selectAmzKpiMetricsList(amzKpiMetrics);
    }

    /**
     * 新增KPI指标定义
     *
     * @param amzKpiMetrics KPI指标定义
     * @return 结果
     */
    @Override
    public int insertAmzKpiMetrics(AmzKpiMetrics amzKpiMetrics) {
        amzKpiMetrics.setCreateTime(DateUtils.getNowDate());
        return amzKpiMetricsMapper.insertAmzKpiMetrics(amzKpiMetrics);
    }

    /**
     * 修改KPI指标定义
     *
     * @param amzKpiMetrics KPI指标定义
     * @return 结果
     */
    @Override
    public int updateAmzKpiMetrics(AmzKpiMetrics amzKpiMetrics) {
        return amzKpiMetricsMapper.updateAmzKpiMetrics(amzKpiMetrics);
    }

    /**
     * 批量删除KPI指标定义
     *
     * @param metricIds 需要删除的KPI指标定义主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiMetricsByMetricIds(Long[] metricIds) {
        return amzKpiMetricsMapper.deleteAmzKpiMetricsByMetricIds(metricIds);
    }

    /**
     * 删除KPI指标定义信息
     *
     * @param metricId KPI指标定义主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiMetricsByMetricId(Long metricId) {
        return amzKpiMetricsMapper.deleteAmzKpiMetricsByMetricId(metricId);
    }
}
