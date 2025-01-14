package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.PofitWarehouseUnsalableStatisticsMapper;
import com.ruoyi.aliexpress.domain.PofitWarehouseUnsalableStatistics;
import com.ruoyi.aliexpress.service.IPofitWarehouseUnsalableStatisticsService;

/**
 * 滞销库存Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class PofitWarehouseUnsalableStatisticsServiceImpl implements IPofitWarehouseUnsalableStatisticsService 
{
    @Autowired
    private PofitWarehouseUnsalableStatisticsMapper pofitWarehouseUnsalableStatisticsMapper;

    /**
     * 查询滞销库存
     * 
     * @param year 滞销库存主键
     * @return 滞销库存
     */
    @Override
    public PofitWarehouseUnsalableStatistics selectPofitWarehouseUnsalableStatisticsByYear(Long year)
    {
        return pofitWarehouseUnsalableStatisticsMapper.selectPofitWarehouseUnsalableStatisticsByYear(year);
    }

    /**
     * 查询滞销库存列表
     * 
     * @param pofitWarehouseUnsalableStatistics 滞销库存
     * @return 滞销库存
     */
    @Override
    public List<PofitWarehouseUnsalableStatistics> selectPofitWarehouseUnsalableStatisticsList(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        return pofitWarehouseUnsalableStatisticsMapper.selectPofitWarehouseUnsalableStatisticsList(pofitWarehouseUnsalableStatistics);
    }

    /**
     * 新增滞销库存
     * 
     * @param pofitWarehouseUnsalableStatistics 滞销库存
     * @return 结果
     */
    @Override
    public int insertPofitWarehouseUnsalableStatistics(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        return pofitWarehouseUnsalableStatisticsMapper.insertPofitWarehouseUnsalableStatistics(pofitWarehouseUnsalableStatistics);
    }

    /**
     * 修改滞销库存
     * 
     * @param pofitWarehouseUnsalableStatistics 滞销库存
     * @return 结果
     */
    @Override
    public int updatePofitWarehouseUnsalableStatistics(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        return pofitWarehouseUnsalableStatisticsMapper.updatePofitWarehouseUnsalableStatistics(pofitWarehouseUnsalableStatistics);
    }

    /**
     * 批量删除滞销库存
     * 
     * @param years 需要删除的滞销库存主键
     * @return 结果
     */
    @Override
    public int deletePofitWarehouseUnsalableStatisticsByYears(Long[] years)
    {
        return pofitWarehouseUnsalableStatisticsMapper.deletePofitWarehouseUnsalableStatisticsByYears(years);
    }

    /**
     * 删除滞销库存信息
     * 
     * @param year 滞销库存主键
     * @return 结果
     */
    @Override
    public int deletePofitWarehouseUnsalableStatisticsByYear(Long year)
    {
        return pofitWarehouseUnsalableStatisticsMapper.deletePofitWarehouseUnsalableStatisticsByYear(year);
    }
}
