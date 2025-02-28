package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressToolIndicatorsAuto;

/**
 * 工具指标-全托管Mapper接口
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
public interface AliexpressToolIndicatorsAutoMapper 
{
    /**
     * 查询工具指标-全托管
     * 
     * @param sId 工具指标-全托管主键
     * @return 工具指标-全托管
     */
    public AliexpressToolIndicatorsAuto selectAliexpressToolIndicatorsAutoBySId(Long sId);

    /**
     * 查询工具指标-全托管列表
     * 
     * @param aliexpressToolIndicatorsAuto 工具指标-全托管
     * @return 工具指标-全托管集合
     */
    public List<AliexpressToolIndicatorsAuto> selectAliexpressToolIndicatorsAutoList(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto);

    /**
     * 新增工具指标-全托管
     * 
     * @param aliexpressToolIndicatorsAuto 工具指标-全托管
     * @return 结果
     */
    public int insertAliexpressToolIndicatorsAuto(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto);

    /**
     * 修改工具指标-全托管
     * 
     * @param aliexpressToolIndicatorsAuto 工具指标-全托管
     * @return 结果
     */
    public int updateAliexpressToolIndicatorsAuto(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto);

    /**
     * 删除工具指标-全托管
     * 
     * @param sId 工具指标-全托管主键
     * @return 结果
     */
    public int deleteAliexpressToolIndicatorsAutoBySId(Long sId);

    /**
     * 批量删除工具指标-全托管
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressToolIndicatorsAutoBySIds(Long[] sIds);
}
