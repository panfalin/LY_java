package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressStoreRankings;

/**
 * 速卖通工具-店铺排名Service接口
 * 
 * @author ruoyi
 * @date 2025-02-27
 */
public interface IAliexpressStoreRankingsService 
{
    /**
     * 查询速卖通工具-店铺排名
     * 
     * @param shops 速卖通工具-店铺排名主键
     * @return 速卖通工具-店铺排名
     */
    public AliexpressStoreRankings selectAliexpressStoreRankingsByShops(String shops);

    /**
     * 查询速卖通工具-店铺排名列表
     * 
     * @param aliexpressStoreRankings 速卖通工具-店铺排名
     * @return 速卖通工具-店铺排名集合
     */
    public List<AliexpressStoreRankings> selectAliexpressStoreRankingsList(AliexpressStoreRankings aliexpressStoreRankings);

    /**
     * 新增速卖通工具-店铺排名
     * 
     * @param aliexpressStoreRankings 速卖通工具-店铺排名
     * @return 结果
     */
    public int insertAliexpressStoreRankings(AliexpressStoreRankings aliexpressStoreRankings);

    /**
     * 修改速卖通工具-店铺排名
     * 
     * @param aliexpressStoreRankings 速卖通工具-店铺排名
     * @return 结果
     */
    public int updateAliexpressStoreRankings(AliexpressStoreRankings aliexpressStoreRankings);

    /**
     * 批量删除速卖通工具-店铺排名
     * 
     * @param shopss 需要删除的速卖通工具-店铺排名主键集合
     * @return 结果
     */
    public int deleteAliexpressStoreRankingsByShopss(String[] shopss);

    /**
     * 删除速卖通工具-店铺排名信息
     * 
     * @param shops 速卖通工具-店铺排名主键
     * @return 结果
     */
    public int deleteAliexpressStoreRankingsByShops(String shops);
}
