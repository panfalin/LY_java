package com.ruoyi.aliexpress.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildren;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildrenStatistics;
import com.ruoyi.aliexpress.domain.SubSkuDTO;

/**
 * 速卖通刊登子数据Mapper接口
 *
 * @author ruoyi
 * @date 2025-03-14
 */
public interface AliexpressPublishedDataChildrenMapper {
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
    public List<SubSkuDTO> selectAliexpressPublishedDataChildrenListChilds(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

    /**
     * 查询速卖通刊登子数据列表
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据集合
     */
    public List<AliexpressPublishedDataChildrenStatistics> selectAliexpressPublishedDataListStatistics(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

    /**
     * 查询速卖通刊登子数据列表
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据集合
     */
    public List<Map<String, Object>> selectCommodityIdBySku(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);


    /**
     * 查询速卖通刊登子数据列表
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据集合
     */
    public List<AliexpressPublishedDataChildrenStatistics> selectAliexpressPublishedDataListChildrenStatistics(AliexpressPublishedDataChildren aliexpressPublishedDataChildren);

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
     * 删除速卖通刊登子数据
     *
     * @param commodityId 速卖通刊登子数据主键
     * @return 结果
     */
    public int deleteAliexpressPublishedDataChildrenByCommodityId(String commodityId);

    /**
     * 批量删除速卖通刊登子数据
     *
     * @param commodityIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressPublishedDataChildrenByCommodityIds(String[] commodityIds);
}
