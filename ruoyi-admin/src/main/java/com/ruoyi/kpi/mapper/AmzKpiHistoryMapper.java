package com.ruoyi.kpi.mapper;

import com.ruoyi.kpi.domain.AmzKpiHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * KPI历史得分Mapper接口
 *
 * @author panfalin
 * @date 2025-03-24
 */
@Mapper
public interface AmzKpiHistoryMapper {
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
     * 删除KPI历史得分
     *
     * @param historyId KPI历史得分主键
     * @return 结果
     */
    public int deleteAmzKpiHistoryByHistoryId(Long historyId);

    /**
     * 批量删除KPI历史得分
     *
     * @param historyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzKpiHistoryByHistoryIds(Long[] historyIds);

    /**
     * 查询最近的历史记录
     *
     * @param amzKpiHistory 查询条件
     * @return 历史记录列表
     */
    public List<AmzKpiHistory> selectRecentHistory(AmzKpiHistory amzKpiHistory);

    /**
     * 查询当月历史记录
     *
     * @param amzKpiHistory 查询条件
     * @return 历史记录
     */
    public AmzKpiHistory selectCurrentMonthHistory(AmzKpiHistory amzKpiHistory);
}
