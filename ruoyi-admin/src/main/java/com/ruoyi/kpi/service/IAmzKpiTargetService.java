package com.ruoyi.kpi.service;

import com.ruoyi.kpi.domain.AmzKpiTarget;

import java.util.List;

/**
 * KPI考核项目Service接口
 *
 * @author panfalin
 * @date 2025-03-24
 */
public interface IAmzKpiTargetService {
    /**
     * 查询KPI考核项目
     *
     * @param targetId KPI考核项目主键
     * @return KPI考核项目
     */
    public AmzKpiTarget selectAmzKpiTargetByTargetId(Long targetId);

    /**
     * 查询KPI考核项目列表
     *
     * @param amzKpiTarget KPI考核项目
     * @return KPI考核项目集合
     */
    public List<AmzKpiTarget> selectAmzKpiTargetList(AmzKpiTarget amzKpiTarget);

    /**
     * 新增KPI考核项目
     *
     * @param amzKpiTarget KPI考核项目
     * @return 结果
     */
    public int insertAmzKpiTarget(AmzKpiTarget amzKpiTarget);

    /**
     * 修改KPI考核项目
     *
     * @param amzKpiTarget KPI考核项目
     * @return 结果
     */
    public int updateAmzKpiTarget(AmzKpiTarget amzKpiTarget);

    /**
     * 批量删除KPI考核项目
     *
     * @param targetIds 需要删除的KPI考核项目主键集合
     * @return 结果
     */
    public int deleteAmzKpiTargetByTargetIds(Long[] targetIds);

    /**
     * 删除KPI考核项目信息
     *
     * @param targetId KPI考核项目主键
     * @return 结果
     */
    public int deleteAmzKpiTargetByTargetId(Long targetId);
}
