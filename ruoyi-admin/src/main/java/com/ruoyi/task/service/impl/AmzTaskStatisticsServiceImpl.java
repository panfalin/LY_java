package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskStatistics;
import com.ruoyi.task.mapper.AmzTaskStatisticsMapper;
import com.ruoyi.task.service.IAmzTaskStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务统计Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskStatisticsServiceImpl implements IAmzTaskStatisticsService {
    @Autowired
    private AmzTaskStatisticsMapper amzTaskStatisticsMapper;

    /**
     * 查询亚马逊任务统计
     *
     * @param statsId 亚马逊任务统计主键
     * @return 亚马逊任务统计
     */
    @Override
    public AmzTaskStatistics selectAmzTaskStatisticsByStatsId(Long statsId) {
        return amzTaskStatisticsMapper.selectAmzTaskStatisticsByStatsId(statsId);
    }

    /**
     * 查询亚马逊任务统计列表
     *
     * @param amzTaskStatistics 亚马逊任务统计
     * @return 亚马逊任务统计
     */
    @Override
    public List<AmzTaskStatistics> selectAmzTaskStatisticsList(AmzTaskStatistics amzTaskStatistics) {
        return amzTaskStatisticsMapper.selectAmzTaskStatisticsList(amzTaskStatistics);
    }

    /**
     * 新增亚马逊任务统计
     *
     * @param amzTaskStatistics 亚马逊任务统计
     * @return 结果
     */
    @Override
    public int insertAmzTaskStatistics(AmzTaskStatistics amzTaskStatistics) {
        amzTaskStatistics.setCreateTime(DateUtils.getNowDate());
        return amzTaskStatisticsMapper.insertAmzTaskStatistics(amzTaskStatistics);
    }

    /**
     * 修改亚马逊任务统计
     *
     * @param amzTaskStatistics 亚马逊任务统计
     * @return 结果
     */
    @Override
    public int updateAmzTaskStatistics(AmzTaskStatistics amzTaskStatistics) {
        amzTaskStatistics.setUpdateTime(DateUtils.getNowDate());
        return amzTaskStatisticsMapper.updateAmzTaskStatistics(amzTaskStatistics);
    }

    /**
     * 批量删除亚马逊任务统计
     *
     * @param statsIds 需要删除的亚马逊任务统计主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskStatisticsByStatsIds(Long[] statsIds) {
        return amzTaskStatisticsMapper.deleteAmzTaskStatisticsByStatsIds(statsIds);
    }

    /**
     * 删除亚马逊任务统计信息
     *
     * @param statsId 亚马逊任务统计主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskStatisticsByStatsId(Long statsId) {
        return amzTaskStatisticsMapper.deleteAmzTaskStatisticsByStatsId(statsId);
    }
}
