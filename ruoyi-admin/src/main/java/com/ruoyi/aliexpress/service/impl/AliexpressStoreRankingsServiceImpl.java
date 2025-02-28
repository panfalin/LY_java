package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressStoreRankingsMapper;
import com.ruoyi.aliexpress.domain.AliexpressStoreRankings;
import com.ruoyi.aliexpress.service.IAliexpressStoreRankingsService;

/**
 * 速卖通工具-店铺排名Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-27
 */
@Service
public class AliexpressStoreRankingsServiceImpl implements IAliexpressStoreRankingsService 
{
    @Autowired
    private AliexpressStoreRankingsMapper aliexpressStoreRankingsMapper;

    /**
     * 查询速卖通工具-店铺排名
     * 
     * @param shops 速卖通工具-店铺排名主键
     * @return 速卖通工具-店铺排名
     */
    @Override
    public AliexpressStoreRankings selectAliexpressStoreRankingsByShops(String shops)
    {
        return aliexpressStoreRankingsMapper.selectAliexpressStoreRankingsByShops(shops);
    }

    /**
     * 查询速卖通工具-店铺排名列表
     * 
     * @param aliexpressStoreRankings 速卖通工具-店铺排名
     * @return 速卖通工具-店铺排名
     */
    @Override
    public List<AliexpressStoreRankings> selectAliexpressStoreRankingsList(AliexpressStoreRankings aliexpressStoreRankings)
    {
        return aliexpressStoreRankingsMapper.selectAliexpressStoreRankingsList(aliexpressStoreRankings);
    }

    /**
     * 新增速卖通工具-店铺排名
     * 
     * @param aliexpressStoreRankings 速卖通工具-店铺排名
     * @return 结果
     */
    @Override
    public int insertAliexpressStoreRankings(AliexpressStoreRankings aliexpressStoreRankings)
    {
        return aliexpressStoreRankingsMapper.insertAliexpressStoreRankings(aliexpressStoreRankings);
    }

    /**
     * 修改速卖通工具-店铺排名
     * 
     * @param aliexpressStoreRankings 速卖通工具-店铺排名
     * @return 结果
     */
    @Override
    public int updateAliexpressStoreRankings(AliexpressStoreRankings aliexpressStoreRankings)
    {
        return aliexpressStoreRankingsMapper.updateAliexpressStoreRankings(aliexpressStoreRankings);
    }

    /**
     * 批量删除速卖通工具-店铺排名
     * 
     * @param shopss 需要删除的速卖通工具-店铺排名主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressStoreRankingsByShopss(String[] shopss)
    {
        return aliexpressStoreRankingsMapper.deleteAliexpressStoreRankingsByShopss(shopss);
    }

    /**
     * 删除速卖通工具-店铺排名信息
     * 
     * @param shops 速卖通工具-店铺排名主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressStoreRankingsByShops(String shops)
    {
        return aliexpressStoreRankingsMapper.deleteAliexpressStoreRankingsByShops(shops);
    }
}
