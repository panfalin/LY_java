package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseStoreName;

/**
 * 马帮后台导出金额订单数据Service接口
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
public interface IPofitOrderListWarehouseStoreNameService 
{
    /**
     * 查询马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 马帮后台导出金额订单数据
     */
    public PofitOrderListWarehouseStoreName selectPofitOrderListWarehouseStoreNameBySId(Long sId);

    /**
     * 查询马帮后台导出金额订单数据列表
     * 
     * @param pofitOrderListWarehouseStoreName 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据集合
     */
    public List<PofitOrderListWarehouseStoreName> selectPofitOrderListWarehouseStoreNameList(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName);

    /**
     * 新增马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseStoreName 马帮后台导出金额订单数据
     * @return 结果
     */
    public int insertPofitOrderListWarehouseStoreName(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName);

    /**
     * 修改马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseStoreName 马帮后台导出金额订单数据
     * @return 结果
     */
    public int updatePofitOrderListWarehouseStoreName(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName);

    /**
     * 批量删除马帮后台导出金额订单数据
     * 
     * @param sIds 需要删除的马帮后台导出金额订单数据主键集合
     * @return 结果
     */
    public int deletePofitOrderListWarehouseStoreNameBySIds(Long[] sIds);

    /**
     * 删除马帮后台导出金额订单数据信息
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 结果
     */
    public int deletePofitOrderListWarehouseStoreNameBySId(Long sId);
}
