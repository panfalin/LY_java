package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressStoreProfit;

/**
 * 店铺利润汇总Mapper接口
 * 
 * @author panfalin
 * @date 2024-12-11
 */
public interface AliexpressStoreProfitMapper 
{
    /**
     * 查询店铺利润汇总
     * 
     * @param id 店铺利润汇总主键
     * @return 店铺利润汇总
     */
    public AliexpressStoreProfit selectAliexpressStoreProfitById(Long id);

    /**
     * 查询店铺利润汇总列表
     * 
     * @param aliexpressStoreProfit 店铺利润汇总
     * @return 店铺利润汇总集合
     */
    public List<AliexpressStoreProfit> selectAliexpressStoreProfitList(AliexpressStoreProfit aliexpressStoreProfit);

    /**
     * 新增店铺利润汇总
     * 
     * @param aliexpressStoreProfit 店铺利润汇总
     * @return 结果
     */
    public int insertAliexpressStoreProfit(AliexpressStoreProfit aliexpressStoreProfit);

    /**
     * 修改店铺利润汇总
     * 
     * @param aliexpressStoreProfit 店铺利润汇总
     * @return 结果
     */
    public int updateAliexpressStoreProfit(AliexpressStoreProfit aliexpressStoreProfit);

    /**
     * 删除店铺利润汇总
     * 
     * @param id 店铺利润汇总主键
     * @return 结果
     */
    public int deleteAliexpressStoreProfitById(Long id);

    /**
     * 批量删除店铺利润汇总
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressStoreProfitByIds(Long[] ids);
}
