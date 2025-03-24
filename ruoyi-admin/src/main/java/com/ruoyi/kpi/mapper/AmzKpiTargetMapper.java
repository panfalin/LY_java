package com.ruoyi.kpi.mapper;

import com.ruoyi.kpi.domain.AmzKpiTarget;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * KPI考核项目Mapper接口
 *
 * @author panfalin
 * @date 2025-03-24
 */
@Mapper
public interface AmzKpiTargetMapper {
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
     * 删除KPI考核项目
     *
     * @param targetId KPI考核项目主键
     * @return 结果
     */
    public int deleteAmzKpiTargetByTargetId(Long targetId);

    /**
     * 删除KPI考核项目
     *
     * @param kpiId kpi主表主键
     * @return 结果
     */
    public int deleteAmzKpiTargetByTargetKpiId(Long kpiId);

    /**
     * 批量删除KPI考核项目
     *
     * @param targetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzKpiTargetByTargetIds(Long[] targetIds);
}
