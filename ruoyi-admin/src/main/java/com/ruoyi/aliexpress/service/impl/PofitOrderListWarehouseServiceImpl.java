package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.PofitOrderListWarehouseMapper;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouse;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseService;

/**
 * 马帮后台导出金额订单数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
@Service
public class PofitOrderListWarehouseServiceImpl implements IPofitOrderListWarehouseService 
{
    @Autowired
    private PofitOrderListWarehouseMapper pofitOrderListWarehouseMapper;

    /**
     * 查询马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 马帮后台导出金额订单数据
     */
    @Override
    public PofitOrderListWarehouse selectPofitOrderListWarehouseBySId(Long sId)
    {
        return pofitOrderListWarehouseMapper.selectPofitOrderListWarehouseBySId(sId);
    }

    /**
     * 查询马帮后台导出金额订单数据列表
     * 
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据
     */
    @Override
    public List<PofitOrderListWarehouse> selectPofitOrderListWarehouseList(PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        return pofitOrderListWarehouseMapper.selectPofitOrderListWarehouseList(pofitOrderListWarehouse);
    }

    /**
     * 新增马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 结果
     */
    @Override
    public int insertPofitOrderListWarehouse(PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        return pofitOrderListWarehouseMapper.insertPofitOrderListWarehouse(pofitOrderListWarehouse);
    }

    /**
     * 修改马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 结果
     */
    @Override
    public int updatePofitOrderListWarehouse(PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        return pofitOrderListWarehouseMapper.updatePofitOrderListWarehouse(pofitOrderListWarehouse);
    }

    /**
     * 批量删除马帮后台导出金额订单数据
     * 
     * @param sIds 需要删除的马帮后台导出金额订单数据主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseBySIds(Long[] sIds)
    {
        return pofitOrderListWarehouseMapper.deletePofitOrderListWarehouseBySIds(sIds);
    }

    /**
     * 删除马帮后台导出金额订单数据信息
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseBySId(Long sId)
    {
        return pofitOrderListWarehouseMapper.deletePofitOrderListWarehouseBySId(sId);
    }
}
