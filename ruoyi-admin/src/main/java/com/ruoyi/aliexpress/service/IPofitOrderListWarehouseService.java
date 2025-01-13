package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouse;

/**
 * 马帮后台导出金额订单数据Service接口
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
public interface IPofitOrderListWarehouseService 
{
    /**
     * 查询马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 马帮后台导出金额订单数据
     */
    public PofitOrderListWarehouse selectPofitOrderListWarehouseBySId(Long sId);


    /**
     * 查询马帮后台导出金额订单数据列表
     * 
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据集合
     */
    public List<PofitOrderListWarehouse> selectPofitOrderListWarehouseList(PofitOrderListWarehouse pofitOrderListWarehouse);


    /**
     * 查询马帮后台导出金额订单数据列表
     *
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据集合
     */
    public List<PofitOrderListWarehouse> selectPofitOrderListWarehouseTotalList(PofitOrderListWarehouse pofitOrderListWarehouse);



    /**
     * 新增马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 结果
     */
    public int insertPofitOrderListWarehouse(PofitOrderListWarehouse pofitOrderListWarehouse);

    /**
     * 修改马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouse 马帮后台导出金额订单数据
     * @return 结果
     */
    public int updatePofitOrderListWarehouse(PofitOrderListWarehouse pofitOrderListWarehouse);

    /**
     * 批量删除马帮后台导出金额订单数据
     * 
     * @param sIds 需要删除的马帮后台导出金额订单数据主键集合
     * @return 结果
     */
    public int deletePofitOrderListWarehouseBySIds(Long[] sIds);

    /**
     * 删除马帮后台导出金额订单数据信息
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 结果
     */
    public int deletePofitOrderListWarehouseBySId(Long sId);
}
