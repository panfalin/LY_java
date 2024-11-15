package com.ruoyi.stores.service;

import java.util.List;
import com.ruoyi.stores.domain.Stores;

/**
 * 速卖通分析-店铺信息Service接口
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
public interface IStoresService 
{
    /**
     * 查询速卖通分析-店铺信息
     * 
     * @param id 速卖通分析-店铺信息主键
     * @return 速卖通分析-店铺信息
     */
    public Stores selectStoresById(Long id);

    /**
     * 查询速卖通分析-店铺信息列表
     * 
     * @param stores 速卖通分析-店铺信息
     * @return 速卖通分析-店铺信息集合
     */
    public List<Stores> selectStoresList(Stores stores);

    /**
     * 新增速卖通分析-店铺信息
     * 
     * @param stores 速卖通分析-店铺信息
     * @return 结果
     */
    public int insertStores(Stores stores);

    /**
     * 修改速卖通分析-店铺信息
     * 
     * @param stores 速卖通分析-店铺信息
     * @return 结果
     */
    public int updateStores(Stores stores);

    /**
     * 批量删除速卖通分析-店铺信息
     * 
     * @param ids 需要删除的速卖通分析-店铺信息主键集合
     * @return 结果
     */
    public int deleteStoresByIds(Long[] ids);

    /**
     * 删除速卖通分析-店铺信息信息
     * 
     * @param id 速卖通分析-店铺信息主键
     * @return 结果
     */
    public int deleteStoresById(Long id);
}
