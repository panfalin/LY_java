package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskStatistics;

import java.util.List;

/**
 * 亚马逊任务统计Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskStatisticsService {
    /**
     * 查询亚马逊任务统计
     *
     * @param statsId 亚马逊任务统计主键
     * @return 亚马逊任务统计
     */
    public AmzTaskStatistics selectAmzTaskStatisticsByStatsId(Long statsId);

    /**
     * 查询亚马逊任务统计列表
     *
     * @param amzTaskStatistics 亚马逊任务统计
     * @return 亚马逊任务统计集合
     */
    public List<AmzTaskStatistics> selectAmzTaskStatisticsList(AmzTaskStatistics amzTaskStatistics);

    /**
     * 新增亚马逊任务统计
     *
     * @param amzTaskStatistics 亚马逊任务统计
     * @return 结果
     */
    public int insertAmzTaskStatistics(AmzTaskStatistics amzTaskStatistics);

    /**
     * 修改亚马逊任务统计
     *
     * @param amzTaskStatistics 亚马逊任务统计
     * @return 结果
     */
    public int updateAmzTaskStatistics(AmzTaskStatistics amzTaskStatistics);

    /**
     * 批量删除亚马逊任务统计
     *
     * @param statsIds 需要删除的亚马逊任务统计主键集合
     * @return 结果
     */
    public int deleteAmzTaskStatisticsByStatsIds(Long[] statsIds);

    /**
     * 删除亚马逊任务统计信息
     *
     * @param statsId 亚马逊任务统计主键
     * @return 结果
     */
    public int deleteAmzTaskStatisticsByStatsId(Long statsId);
}
