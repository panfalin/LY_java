package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressToolIndicators;

/**
 * 工具指标Service接口
 * 
 * @author ruoyi
 * @date 2025-02-17
 */
public interface IAliexpressToolIndicatorsService 
{
    /**
     * 查询工具指标
     * 
     * @param sId 工具指标主键
     * @return 工具指标
     */
    public AliexpressToolIndicators selectAliexpressToolIndicatorsBySId(Long sId);

    /**
     * 查询工具指标列表
     * 
     * @param aliexpressToolIndicators 工具指标
     * @return 工具指标集合
     */
    public List<AliexpressToolIndicators> selectAliexpressToolIndicatorsList(AliexpressToolIndicators aliexpressToolIndicators);

    /**
     * 查询工具指标列表
     *
     * @param aliexpressToolIndicators 工具指标
     * @return 工具指标集合
     */
    public List<AliexpressToolIndicators> selectAliexpressToolIndicatorsListShop(AliexpressToolIndicators aliexpressToolIndicators);

    /**
     * 查询工具指标列表
     *
     * @param aliexpressToolIndicators 工具指标
     * @return 工具指标集合
     */
    public List<AliexpressToolIndicators> selectAliexpressToolIndicatorsListShopName(AliexpressToolIndicators aliexpressToolIndicators);



    /**
     * 新增工具指标
     * 
     * @param aliexpressToolIndicators 工具指标
     * @return 结果
     */
    public int insertAliexpressToolIndicators(AliexpressToolIndicators aliexpressToolIndicators);

    /**
     * 修改工具指标
     * 
     * @param aliexpressToolIndicators 工具指标
     * @return 结果
     */
    public int updateAliexpressToolIndicators(AliexpressToolIndicators aliexpressToolIndicators);

    /**
     * 批量删除工具指标
     * 
     * @param sIds 需要删除的工具指标主键集合
     * @return 结果
     */
    public int deleteAliexpressToolIndicatorsBySIds(Long[] sIds);

    /**
     * 删除工具指标信息
     * 
     * @param sId 工具指标主键
     * @return 结果
     */
    public int deleteAliexpressToolIndicatorsBySId(Long sId);
}
