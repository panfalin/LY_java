package com.ruoyi.kpi.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.kpi.domain.AmzKpiHistory;
import com.ruoyi.kpi.mapper.AmzKpiHistoryMapper;
import com.ruoyi.kpi.service.IAmzKpiHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * KPI历史得分Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-24
 */
@Service
public class AmzKpiHistoryServiceImpl implements IAmzKpiHistoryService {
    @Autowired
    private AmzKpiHistoryMapper amzKpiHistoryMapper;

    /**
     * 查询KPI历史得分
     *
     * @param historyId KPI历史得分主键
     * @return KPI历史得分
     */
    @Override
    public AmzKpiHistory selectAmzKpiHistoryByHistoryId(Long historyId) {
        return amzKpiHistoryMapper.selectAmzKpiHistoryByHistoryId(historyId);
    }

    /**
     * 查询KPI历史得分列表
     *
     * @param amzKpiHistory KPI历史得分
     * @return KPI历史得分
     */
    @Override
    public List<AmzKpiHistory> selectAmzKpiHistoryList(AmzKpiHistory amzKpiHistory) {
        return amzKpiHistoryMapper.selectAmzKpiHistoryList(amzKpiHistory);
    }

    /**
     * 新增KPI历史得分
     *
     * @param amzKpiHistory KPI历史得分
     * @return 结果
     */
    @Override
    public int insertAmzKpiHistory(AmzKpiHistory amzKpiHistory) {
        amzKpiHistory.setCreateTime(DateUtils.getNowDate());
        return amzKpiHistoryMapper.insertAmzKpiHistory(amzKpiHistory);
    }

    /**
     * 修改KPI历史得分
     *
     * @param amzKpiHistory KPI历史得分
     * @return 结果
     */
    @Override
    public int updateAmzKpiHistory(AmzKpiHistory amzKpiHistory) {
        return amzKpiHistoryMapper.updateAmzKpiHistory(amzKpiHistory);
    }

    /**
     * 批量删除KPI历史得分
     *
     * @param historyIds 需要删除的KPI历史得分主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiHistoryByHistoryIds(Long[] historyIds) {
        return amzKpiHistoryMapper.deleteAmzKpiHistoryByHistoryIds(historyIds);
    }

    /**
     * 删除KPI历史得分信息
     *
     * @param historyId KPI历史得分主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiHistoryByHistoryId(Long historyId) {
        return amzKpiHistoryMapper.deleteAmzKpiHistoryByHistoryId(historyId);
    }
}
