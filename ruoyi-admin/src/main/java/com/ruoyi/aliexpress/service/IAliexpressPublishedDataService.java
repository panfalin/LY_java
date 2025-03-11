package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressPublishedData;

/**
 * 速卖通刊登数据Service接口
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
public interface IAliexpressPublishedDataService 
{
    /**
     * 查询速卖通刊登数据
     * 
     * @param commodityId 速卖通刊登数据主键
     * @return 速卖通刊登数据
     */
    public AliexpressPublishedData selectAliexpressPublishedDataByCommodityId(String commodityId);

    /**
     * 查询速卖通刊登数据列表
     * 
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 速卖通刊登数据集合
     */
    public List<AliexpressPublishedData> selectAliexpressPublishedDataList(AliexpressPublishedData aliexpressPublishedData);

    /**
     * 新增速卖通刊登数据
     * 
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 结果
     */
    public int insertAliexpressPublishedData(AliexpressPublishedData aliexpressPublishedData);

    /**
     * 修改速卖通刊登数据
     * 
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 结果
     */
    public int updateAliexpressPublishedData(AliexpressPublishedData aliexpressPublishedData);

    /**
     * 批量删除速卖通刊登数据
     * 
     * @param commodityIds 需要删除的速卖通刊登数据主键集合
     * @return 结果
     */
    public int deleteAliexpressPublishedDataByCommodityIds(String[] commodityIds);

    /**
     * 删除速卖通刊登数据信息
     * 
     * @param commodityId 速卖通刊登数据主键
     * @return 结果
     */
    public int deleteAliexpressPublishedDataByCommodityId(String commodityId);
}
