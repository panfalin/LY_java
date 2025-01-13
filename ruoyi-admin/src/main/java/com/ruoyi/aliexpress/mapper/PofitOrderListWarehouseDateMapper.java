package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseDate;

/**
 * 时间维度统计Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-11
 */
public interface PofitOrderListWarehouseDateMapper 
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
     * 删除时间维度统计
     * 
     * @param sId 时间维度统计主键
     * @return 结果
     */
    public int deletePofitOrderListWarehouseDateBySId(Long sId);

    /**
     * 批量删除时间维度统计
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePofitOrderListWarehouseDateBySIds(Long[] sIds);
}
