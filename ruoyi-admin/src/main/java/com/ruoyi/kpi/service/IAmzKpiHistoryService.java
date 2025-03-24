package com.ruoyi.kpi.service;

import com.ruoyi.kpi.domain.AmzKpiHistory;

import java.util.List;

/**
 * KPI历史得分Service接口
 *
 * @author panfalin
 * @date 2025-03-24
 */
public interface IAmzKpiHistoryService {
    /**
     * 查询KPI历史得分
     *
     * @param historyId KPI历史得分主键
     * @return KPI历史得分
     */
    public AmzKpiHistory selectAmzKpiHistoryByHistoryId(Long historyId);

    /**
     * 查询KPI历史得分列表
     *
     * @param amzKpiHistory KPI历史得分
     * @return KPI历史得分集合
     */
    public List<AmzKpiHistory> selectAmzKpiHistoryList(AmzKpiHistory amzKpiHistory);

    /**
     * 新增KPI历史得分
     *
     * @param amzKpiHistory KPI历史得分
     * @return 结果
     */
    public int insertAmzKpiHistory(AmzKpiHistory amzKpiHistory);

    /**
     * 修改KPI历史得分
     *
     * @param amzKpiHistory KPI历史得分
     * @return 结果
     */
    public int updateAmzKpiHistory(AmzKpiHistory amzKpiHistory);

    /**
     * 批量删除KPI历史得分
     *
     * @param historyIds 需要删除的KPI历史得分主键集合
     * @return 结果
     */
    public int deleteAmzKpiHistoryByHistoryIds(Long[] historyIds);

    /**
     * 删除KPI历史得分信息
     *
     * @param historyId KPI历史得分主键
     * @return 结果
     */
    public int deleteAmzKpiHistoryByHistoryId(Long historyId);
}
