package com.ruoyi.kpi.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.kpi.domain.AmzKpiTarget;
import com.ruoyi.kpi.mapper.AmzKpiTargetMapper;
import com.ruoyi.kpi.service.IAmzKpiTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * KPI考核项目Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-24
 */
@Service
public class AmzKpiTargetServiceImpl implements IAmzKpiTargetService {
    @Autowired
    private AmzKpiTargetMapper amzKpiTargetMapper;

    /**
     * 查询KPI考核项目
     *
     * @param targetId KPI考核项目主键
     * @return KPI考核项目
     */
    @Override
    public AmzKpiTarget selectAmzKpiTargetByTargetId(Long targetId) {
        return amzKpiTargetMapper.selectAmzKpiTargetByTargetId(targetId);
    }

    /**
     * 查询KPI考核项目列表
     *
     * @param amzKpiTarget KPI考核项目
     * @return KPI考核项目
     */
    @Override
    public List<AmzKpiTarget> selectAmzKpiTargetList(AmzKpiTarget amzKpiTarget) {
        return amzKpiTargetMapper.selectAmzKpiTargetList(amzKpiTarget);
    }

    /**
     * 新增KPI考核项目
     *
     * @param amzKpiTarget KPI考核项目
     * @return 结果
     */
    @Override
    public int insertAmzKpiTarget(AmzKpiTarget amzKpiTarget) {
        amzKpiTarget.setCreateTime(DateUtils.getNowDate());
        return amzKpiTargetMapper.insertAmzKpiTarget(amzKpiTarget);
    }

    /**
     * 修改KPI考核项目
     *
     * @param amzKpiTarget KPI考核项目
     * @return 结果
     */
    @Override
    public int updateAmzKpiTarget(AmzKpiTarget amzKpiTarget) {
        amzKpiTarget.setUpdateTime(DateUtils.getNowDate());
        return amzKpiTargetMapper.updateAmzKpiTarget(amzKpiTarget);
    }

    /**
     * 批量删除KPI考核项目
     *
     * @param targetIds 需要删除的KPI考核项目主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiTargetByTargetIds(Long[] targetIds) {
        return amzKpiTargetMapper.deleteAmzKpiTargetByTargetIds(targetIds);
    }

    /**
     * 删除KPI考核项目信息
     *
     * @param targetId KPI考核项目主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiTargetByTargetId(Long targetId) {
        return amzKpiTargetMapper.deleteAmzKpiTargetByTargetId(targetId);
    }
}
