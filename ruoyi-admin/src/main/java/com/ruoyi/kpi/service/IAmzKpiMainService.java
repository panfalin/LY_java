package com.ruoyi.kpi.service;

import com.ruoyi.kpi.domain.AmzKpiMain;
import com.ruoyi.kpi.domain.dto.KpiSettingDTO;

import java.util.List;

/**
 * KPI主表Service接口
 *
 * @author ruoyi
 * @date 2025-03-24
 */
public interface IAmzKpiMainService {
    /**
     * 查询KPI主表
     *
     * @param kpiId KPI主表主键
     * @return KPI主表
     */
    public AmzKpiMain selectAmzKpiMainByKpiId(Long kpiId);

    /**
     * 查询KPI主表列表
     *
     * @param amzKpiMain KPI主表
     * @return KPI主表集合
     */
    public List<AmzKpiMain> selectAmzKpiMainList(AmzKpiMain amzKpiMain);

    /**
     * 新增KPI主表
     *
     * @param amzKpiMain KPI主表
     * @return 结果
     */
    public int insertAmzKpiMain(AmzKpiMain amzKpiMain);

    /**
     * 修改KPI主表
     *
     * @param amzKpiMain KPI主表
     * @return 结果
     */
    public int updateAmzKpiMain(AmzKpiMain amzKpiMain);

    /**
     * 批量删除KPI主表
     *
     * @param kpiIds 需要删除的KPI主表主键集合
     * @return 结果
     */
    public int deleteAmzKpiMainByKpiIds(Long[] kpiIds);

    /**
     * 删除KPI主表信息
     *
     * @param kpiId KPI主表主键
     * @return 结果
     */
    public int deleteAmzKpiMainByKpiId(Long kpiId);

    /**
     * 查询KPI列表（包含考核项和历史记录）
     *
     * @param amzKpiMain 查询条件
     * @return KPI列表数据
     */
    List<AmzKpiMain> selectKpiListWithDetails(AmzKpiMain amzKpiMain);

    /**
     * 设置KPI考核项
     *
     * @param kpiSetting KPI设置信息
     * @return 结果
     */
    int setKpiTargets(KpiSettingDTO kpiSetting);

    /**
     * 修改员工 KPI考核项
     *
     * @param kpiSetting KPI设置信息
     * @return 结果
     */
    int editKpiTargets(KpiSettingDTO kpiSetting);
}
