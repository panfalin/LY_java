package com.ruoyi.orders.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.orders.mapper.StoresMapper;
import com.ruoyi.orders.domain.Stores;
import com.ruoyi.orders.service.IStoresService;

/**
 * 速卖通分析-店铺信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
@Service
public class StoresServiceImpl implements IStoresService 
{
    @Autowired
    private StoresMapper storesMapper;

    /**
     * 查询速卖通分析-店铺信息
     * 
     * @param id 速卖通分析-店铺信息主键
     * @return 速卖通分析-店铺信息
     */
    @Override
    public Stores selectStoresById(Long id)
    {
        return storesMapper.selectStoresById(id);
    }

    /**
     * 查询速卖通分析-店铺信息列表
     * 
     * @param stores 速卖通分析-店铺信息
     * @return 速卖通分析-店铺信息
     */
    @Override
    public List<Stores> selectStoresList(Stores stores)
    {
        return storesMapper.selectStoresList(stores);
    }

    /**
     * 新增速卖通分析-店铺信息
     * 
     * @param stores 速卖通分析-店铺信息
     * @return 结果
     */
    @Override
    public int insertStores(Stores stores)
    {
        return storesMapper.insertStores(stores);
    }

    /**
     * 修改速卖通分析-店铺信息
     * 
     * @param stores 速卖通分析-店铺信息
     * @return 结果
     */
    @Override
    public int updateStores(Stores stores)
    {
        return storesMapper.updateStores(stores);
    }

    /**
     * 批量删除速卖通分析-店铺信息
     * 
     * @param ids 需要删除的速卖通分析-店铺信息主键
     * @return 结果
     */
    @Override
    public int deleteStoresByIds(Long[] ids)
    {
        return storesMapper.deleteStoresByIds(ids);
    }

    /**
     * 删除速卖通分析-店铺信息信息
     * 
     * @param id 速卖通分析-店铺信息主键
     * @return 结果
     */
    @Override
    public int deleteStoresById(Long id)
    {
        return storesMapper.deleteStoresById(id);
    }
}
