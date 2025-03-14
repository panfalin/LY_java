package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressPublishedDataChildrenMapper;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildren;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataChildrenService;

/**
 * 速卖通刊登子数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-14
 */
@Service
public class AliexpressPublishedDataChildrenServiceImpl implements IAliexpressPublishedDataChildrenService 
{
    @Autowired
    private AliexpressPublishedDataChildrenMapper aliexpressPublishedDataChildrenMapper;

    /**
     * 查询速卖通刊登子数据
     * 
     * @param commodityId 速卖通刊登子数据主键
     * @return 速卖通刊登子数据
     */
    @Override
    public AliexpressPublishedDataChildren selectAliexpressPublishedDataChildrenByCommodityId(String commodityId)
    {
        return aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenByCommodityId(commodityId);
    }

    /**
     * 查询速卖通刊登子数据列表
     * 
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据
     */
    @Override
    public List<AliexpressPublishedDataChildren> selectAliexpressPublishedDataChildrenList(AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        return aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenList(aliexpressPublishedDataChildren);
    }

    /**
     * 新增速卖通刊登子数据
     * 
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 结果
     */
    @Override
    public int insertAliexpressPublishedDataChildren(AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        return aliexpressPublishedDataChildrenMapper.insertAliexpressPublishedDataChildren(aliexpressPublishedDataChildren);
    }

    /**
     * 修改速卖通刊登子数据
     * 
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 结果
     */
    @Override
    public int updateAliexpressPublishedDataChildren(AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        return aliexpressPublishedDataChildrenMapper.updateAliexpressPublishedDataChildren(aliexpressPublishedDataChildren);
    }

    /**
     * 批量删除速卖通刊登子数据
     * 
     * @param commodityIds 需要删除的速卖通刊登子数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataChildrenByCommodityIds(String[] commodityIds)
    {
        return aliexpressPublishedDataChildrenMapper.deleteAliexpressPublishedDataChildrenByCommodityIds(commodityIds);
    }

    /**
     * 删除速卖通刊登子数据信息
     * 
     * @param commodityId 速卖通刊登子数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataChildrenByCommodityId(String commodityId)
    {
        return aliexpressPublishedDataChildrenMapper.deleteAliexpressPublishedDataChildrenByCommodityId(commodityId);
    }
}
