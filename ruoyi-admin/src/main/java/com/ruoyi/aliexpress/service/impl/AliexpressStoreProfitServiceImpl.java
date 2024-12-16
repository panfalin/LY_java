package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressStoreProfitMapper;
import com.ruoyi.aliexpress.domain.AliexpressStoreProfit;
import com.ruoyi.aliexpress.service.IAliexpressStoreProfitService;

/**
 * 店铺利润汇总Service业务层处理
 * 
 * @author panfalin
 * @date 2024-12-11
 */
@Service
public class AliexpressStoreProfitServiceImpl implements IAliexpressStoreProfitService 
{
    @Autowired
    private AliexpressStoreProfitMapper aliexpressStoreProfitMapper;

    /**
     * 查询店铺利润汇总
     * 
     * @param id 店铺利润汇总主键
     * @return 店铺利润汇总
     */
    @Override
    public AliexpressStoreProfit selectAliexpressStoreProfitById(Long id)
    {
        return aliexpressStoreProfitMapper.selectAliexpressStoreProfitById(id);
    }

    /**
     * 查询店铺利润汇总列表
     * 
     * @param aliexpressStoreProfit 店铺利润汇总
     * @return 店铺利润汇总
     */
    @Override
    public List<AliexpressStoreProfit> selectAliexpressStoreProfitList(AliexpressStoreProfit aliexpressStoreProfit)
    {
        return aliexpressStoreProfitMapper.selectAliexpressStoreProfitList(aliexpressStoreProfit);
    }

    /**
     * 新增店铺利润汇总
     * 
     * @param aliexpressStoreProfit 店铺利润汇总
     * @return 结果
     */
    @Override
    public int insertAliexpressStoreProfit(AliexpressStoreProfit aliexpressStoreProfit)
    {
        return aliexpressStoreProfitMapper.insertAliexpressStoreProfit(aliexpressStoreProfit);
    }

    /**
     * 修改店铺利润汇总
     * 
     * @param aliexpressStoreProfit 店铺利润汇总
     * @return 结果
     */
    @Override
    public int updateAliexpressStoreProfit(AliexpressStoreProfit aliexpressStoreProfit)
    {
        return aliexpressStoreProfitMapper.updateAliexpressStoreProfit(aliexpressStoreProfit);
    }

    /**
     * 批量删除店铺利润汇总
     * 
     * @param ids 需要删除的店铺利润汇总主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressStoreProfitByIds(Long[] ids)
    {
        return aliexpressStoreProfitMapper.deleteAliexpressStoreProfitByIds(ids);
    }

    /**
     * 删除店铺利润汇总信息
     * 
     * @param id 店铺利润汇总主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressStoreProfitById(Long id)
    {
        return aliexpressStoreProfitMapper.deleteAliexpressStoreProfitById(id);
    }
}
