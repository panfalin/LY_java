package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseCategory;

/**
 * 马帮后台导出金额订单数据Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-08
 */
public interface PofitOrderListWarehouseCategoryMapper 
{
    /**
     * 查询马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 马帮后台导出金额订单数据
     */
    public PofitOrderListWarehouseCategory selectPofitOrderListWarehouseCategoryBySId(Long sId);

    /**
     * 查询马帮后台导出金额订单数据列表
     * 
     * @param pofitOrderListWarehouseCategory 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据集合
     */
    public List<PofitOrderListWarehouseCategory> selectPofitOrderListWarehouseCategoryList(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory);

    /**
     * 新增马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseCategory 马帮后台导出金额订单数据
     * @return 结果
     */
    public int insertPofitOrderListWarehouseCategory(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory);

    /**
     * 修改马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseCategory 马帮后台导出金额订单数据
     * @return 结果
     */
    public int updatePofitOrderListWarehouseCategory(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory);

    /**
     * 删除马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 结果
     */
    public int deletePofitOrderListWarehouseCategoryBySId(Long sId);

    /**
     * 批量删除马帮后台导出金额订单数据
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePofitOrderListWarehouseCategoryBySIds(Long[] sIds);
}
