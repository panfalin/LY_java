package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressPublishedDataMapper;
import com.ruoyi.aliexpress.domain.AliexpressPublishedData;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataService;

/**
 * 速卖通刊登数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
@Service
public class AliexpressPublishedDataServiceImpl implements IAliexpressPublishedDataService 
{
    @Autowired
    private AliexpressPublishedDataMapper aliexpressPublishedDataMapper;

    /**
     * 查询速卖通刊登数据
     * 
     * @param commodityId 速卖通刊登数据主键
     * @return 速卖通刊登数据
     */
    @Override
    public AliexpressPublishedData selectAliexpressPublishedDataByCommodityId(String commodityId)
    {
        return aliexpressPublishedDataMapper.selectAliexpressPublishedDataByCommodityId(commodityId);
    }

    /**
     * 查询速卖通刊登数据列表
     * 
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 速卖通刊登数据
     */
    @Override
    public List<AliexpressPublishedData> selectAliexpressPublishedDataList(AliexpressPublishedData aliexpressPublishedData)
    {
        return aliexpressPublishedDataMapper.selectAliexpressPublishedDataList(aliexpressPublishedData);
    }

    /**
     * 新增速卖通刊登数据
     * 
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 结果
     */
    @Override
    public int insertAliexpressPublishedData(AliexpressPublishedData aliexpressPublishedData)
    {
        return aliexpressPublishedDataMapper.insertAliexpressPublishedData(aliexpressPublishedData);
    }

    /**
     * 修改速卖通刊登数据
     * 
     * @param aliexpressPublishedData 速卖通刊登数据
     * @return 结果
     */
    @Override
    public int updateAliexpressPublishedData(AliexpressPublishedData aliexpressPublishedData)
    {
        return aliexpressPublishedDataMapper.updateAliexpressPublishedData(aliexpressPublishedData);
    }

    /**
     * 批量删除速卖通刊登数据
     * 
     * @param commodityIds 需要删除的速卖通刊登数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataByCommodityIds(String[] commodityIds)
    {
        return aliexpressPublishedDataMapper.deleteAliexpressPublishedDataByCommodityIds(commodityIds);
    }

    /**
     * 删除速卖通刊登数据信息
     * 
     * @param commodityId 速卖通刊登数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataByCommodityId(String commodityId)
    {
        return aliexpressPublishedDataMapper.deleteAliexpressPublishedDataByCommodityId(commodityId);
    }
}
