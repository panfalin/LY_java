package com.ruoyi.aliexpress.mapper;

import java.util.List;

import com.ruoyi.aliexpress.domain.AliexpressPublishedData;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataAuto;

/**
 * 刊登数据-全托管Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-17
 */
public interface AliexpressPublishedDataAutoMapper 
{
    /**
     * 查询刊登数据-全托管
     * 
     * @param sId 刊登数据-全托管主键
     * @return 刊登数据-全托管
     */
    public AliexpressPublishedDataAuto selectAliexpressPublishedDataAutoBySId(Long sId);

    /**
     * 查询刊登数据-全托管列表
     * 
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 刊登数据-全托管集合
     */
    public List<AliexpressPublishedDataAuto> selectAliexpressPublishedDataAutoList(AliexpressPublishedDataAuto aliexpressPublishedDataAuto);

    /**
     * 查询速卖通刊登数据统计列表
     *
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 速卖通刊登数据集合
     */
    public List<AliexpressPublishedDataAuto> selectAliexpressPublishedDataAutoStatisticsList(AliexpressPublishedDataAuto aliexpressPublishedData);




    /**
     * 新增刊登数据-全托管
     * 
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 结果
     */
    public int insertAliexpressPublishedDataAuto(AliexpressPublishedDataAuto aliexpressPublishedDataAuto);

    /**
     * 修改刊登数据-全托管
     * 
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 结果
     */
    public int updateAliexpressPublishedDataAuto(AliexpressPublishedDataAuto aliexpressPublishedDataAuto);

    /**
     * 删除刊登数据-全托管
     * 
     * @param sId 刊登数据-全托管主键
     * @return 结果
     */
    public int deleteAliexpressPublishedDataAutoBySId(Long sId);

    /**
     * 批量删除刊登数据-全托管
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressPublishedDataAutoBySIds(Long[] sIds);
}
