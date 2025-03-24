package com.ruoyi.kpi.mapper;

import com.ruoyi.kpi.domain.AmzKpiMain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * KPI主表Mapper接口
 *
 * @author ruoyi
 * @date 2025-03-24
 */
@Mapper
public interface AmzKpiMainMapper {
    /**
     * 查询KPI主表
     *
     * @param kpiId KPI主表主键
     * @return KPI主表
     */
    public AmzKpiMain selectAmzKpiMainByKpiId(Long kpiId);

    /**
     * 查询KPI主表
     *
     * @param nickName KPI主表主键
     * @return KPI主表
     */
    public AmzKpiMain selectAmzKpiMainByKpiUserName(String nickName);

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
     * 删除KPI主表
     *
     * @param kpiId KPI主表主键
     * @return 结果
     */
    public int deleteAmzKpiMainByKpiId(Long kpiId);

    /**
     * 批量删除KPI主表
     *
     * @param kpiIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzKpiMainByKpiIds(Long[] kpiIds);

    /**
     * 根据用户ID查询KPI主表
     * 
     * @param userId 用户ID
     * @return KPI主表
     */
    public AmzKpiMain selectAmzKpiMainByUserId(String userId);
}
