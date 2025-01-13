package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseDate;

/**
 * 时间维度统计Service接口
 * 
 * @author ruoyi
 * @date 2025-01-11
 */
public interface IPofitOrderListWarehouseDateService 
{
    /**
     * 查询时间维度统计
     * 
     * @param sId 时间维度统计主键
     * @return 时间维度统计
     */
    public PofitOrderListWarehouseDate selectPofitOrderListWarehouseDateBySId(Long sId);

    /**
     * 查询时间维度统计列表
     * 
     * @param pofitOrderListWarehouseDate 时间维度统计
     * @return 时间维度统计集合
     */
    public List<PofitOrderListWarehouseDate> selectPofitOrderListWarehouseDateList(PofitOrderListWarehouseDate pofitOrderListWarehouseDate);

    /**
     * 新增时间维度统计
     * 
     * @param pofitOrderListWarehouseDate 时间维度统计
     * @return 结果
     */
    public int insertPofitOrderListWarehouseDate(PofitOrderListWarehouseDate pofitOrderListWarehouseDate);

    /**
     * 修改时间维度统计
     * 
     * @param pofitOrderListWarehouseDate 时间维度统计
     * @return 结果
     */
    public int updatePofitOrderListWarehouseDate(PofitOrderListWarehouseDate pofitOrderListWarehouseDate);

    /**
     * 批量删除时间维度统计
     * 
     * @param sIds 需要删除的时间维度统计主键集合
     * @return 结果
     */
    public int deletePofitOrderListWarehouseDateBySIds(Long[] sIds);

    /**
     * 删除时间维度统计信息
     * 
     * @param sId 时间维度统计主键
     * @return 结果
     */
    public int deletePofitOrderListWarehouseDateBySId(Long sId);
}
