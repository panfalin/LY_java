package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.PofitWarehouseUnsalableStatistics;

/**
 * 滞销库存Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-14
 */
public interface PofitWarehouseUnsalableStatisticsMapper 
{
    /**
     * 查询滞销库存
     * 
     * @param year 滞销库存主键
     * @return 滞销库存
     */
    public PofitWarehouseUnsalableStatistics selectPofitWarehouseUnsalableStatisticsByYear(Long year);

    /**
     * 查询滞销库存列表
     * 
     * @param pofitWarehouseUnsalableStatistics 滞销库存
     * @return 滞销库存集合
     */
    public List<PofitWarehouseUnsalableStatistics> selectPofitWarehouseUnsalableStatisticsList(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics);

    /**
     * 新增滞销库存
     * 
     * @param pofitWarehouseUnsalableStatistics 滞销库存
     * @return 结果
     */
    public int insertPofitWarehouseUnsalableStatistics(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics);

    /**
     * 修改滞销库存
     * 
     * @param pofitWarehouseUnsalableStatistics 滞销库存
     * @return 结果
     */
    public int updatePofitWarehouseUnsalableStatistics(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics);

    /**
     * 删除滞销库存
     * 
     * @param year 滞销库存主键
     * @return 结果
     */
    public int deletePofitWarehouseUnsalableStatisticsByYear(Long year);

    /**
     * 批量删除滞销库存
     * 
     * @param years 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePofitWarehouseUnsalableStatisticsByYears(Long[] years);
}
