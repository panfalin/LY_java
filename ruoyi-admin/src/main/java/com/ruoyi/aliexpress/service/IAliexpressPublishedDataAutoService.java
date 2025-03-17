package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataAuto;

/**
 * 刊登数据-全托管Service接口
 * 
 * @author ruoyi
 * @date 2025-03-17
 */
public interface IAliexpressPublishedDataAutoService 
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
     * 查询刊登数据-全托管列表统计数据
     *
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 刊登数据-全托管集合
     */
    public List<AliexpressPublishedDataAuto> selectAliexpressPublishedDataAutoStatisticsList(AliexpressPublishedDataAuto aliexpressPublishedDataAuto);


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
     * 批量删除刊登数据-全托管
     * 
     * @param sIds 需要删除的刊登数据-全托管主键集合
     * @return 结果
     */
    public int deleteAliexpressPublishedDataAutoBySIds(Long[] sIds);

    /**
     * 删除刊登数据-全托管信息
     * 
     * @param sId 刊登数据-全托管主键
     * @return 结果
     */
    public int deleteAliexpressPublishedDataAutoBySId(Long sId);
}
