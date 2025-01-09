package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.PofitOrderListWarehouseStoreNameMapper;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseStoreName;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseStoreNameService;

/**
 * 马帮后台导出金额订单数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
@Service
public class PofitOrderListWarehouseStoreNameServiceImpl implements IPofitOrderListWarehouseStoreNameService 
{
    @Autowired
    private PofitOrderListWarehouseStoreNameMapper pofitOrderListWarehouseStoreNameMapper;

    /**
     * 查询马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 马帮后台导出金额订单数据
     */
    @Override
    public PofitOrderListWarehouseStoreName selectPofitOrderListWarehouseStoreNameBySId(Long sId)
    {
        return pofitOrderListWarehouseStoreNameMapper.selectPofitOrderListWarehouseStoreNameBySId(sId);
    }

    /**
     * 查询马帮后台导出金额订单数据列表
     * 
     * @param pofitOrderListWarehouseStoreName 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据
     */
    @Override
    public List<PofitOrderListWarehouseStoreName> selectPofitOrderListWarehouseStoreNameList(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        return pofitOrderListWarehouseStoreNameMapper.selectPofitOrderListWarehouseStoreNameList(pofitOrderListWarehouseStoreName);
    }

    /**
     * 新增马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseStoreName 马帮后台导出金额订单数据
     * @return 结果
     */
    @Override
    public int insertPofitOrderListWarehouseStoreName(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        return pofitOrderListWarehouseStoreNameMapper.insertPofitOrderListWarehouseStoreName(pofitOrderListWarehouseStoreName);
    }

    /**
     * 修改马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseStoreName 马帮后台导出金额订单数据
     * @return 结果
     */
    @Override
    public int updatePofitOrderListWarehouseStoreName(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        return pofitOrderListWarehouseStoreNameMapper.updatePofitOrderListWarehouseStoreName(pofitOrderListWarehouseStoreName);
    }

    /**
     * 批量删除马帮后台导出金额订单数据
     * 
     * @param sIds 需要删除的马帮后台导出金额订单数据主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseStoreNameBySIds(Long[] sIds)
    {
        return pofitOrderListWarehouseStoreNameMapper.deletePofitOrderListWarehouseStoreNameBySIds(sIds);
    }

    /**
     * 删除马帮后台导出金额订单数据信息
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseStoreNameBySId(Long sId)
    {
        return pofitOrderListWarehouseStoreNameMapper.deletePofitOrderListWarehouseStoreNameBySId(sId);
    }
}
