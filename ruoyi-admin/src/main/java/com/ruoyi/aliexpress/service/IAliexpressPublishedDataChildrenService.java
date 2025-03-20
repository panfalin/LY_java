package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildren;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildrenStatistics;

/**
 * 速卖通刊登子数据Service接口
 * 
 * @author ruoyi
 * @date 2025-03-14
 */
public interface IAliexpressPublishedDataChildrenService 
{
    /**
     * 查询速卖通刊登子数据
     * 
     * @param commodityId 速卖通刊登子数据主键
     * @return 速卖通刊登子数据
     */
    public AliexpressPublishedDataChildren selectAliexpressPublishedDataChildrenByCommodityId(String commodityId);

    /**
     * 查询速卖通刊登子数据列表
     * 
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据集合
     */
    public List<AliexpressPublishedDataChildren> selectAliexpressPublishedDataChildrenList(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

    /**
     * 查询速卖通刊登子数据列表
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据集合
     */
    public List<AliexpressPublishedDataChildrenStatistics> selectAliexpressPublishedDataChildrenTotalList(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

    /**
     * 新增速卖通刊登子数据
     * 
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 结果
     */
    public int insertAliexpressPublishedDataChildren(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

    /**
     * 修改速卖通刊登子数据
     * 
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 结果
     */
    public int updateAliexpressPublishedDataChildren(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

    /**
     * 批量删除速卖通刊登子数据
     * 
     * @param commodityIds 需要删除的速卖通刊登子数据主键集合
     * @return 结果
     */
    public int deleteAliexpressPublishedDataChildrenByCommodityIds(String[] commodityIds);

    /**
     * 删除速卖通刊登子数据信息
     * 
     * @param commodityId 速卖通刊登子数据主键
     * @return 结果
     */
    public int deleteAliexpressPublishedDataChildrenByCommodityId(String commodityId);
}
