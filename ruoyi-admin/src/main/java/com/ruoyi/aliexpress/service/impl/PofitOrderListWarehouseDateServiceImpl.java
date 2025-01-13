package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.PofitOrderListWarehouseDateMapper;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseDate;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseDateService;

/**
 * 时间维度统计Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-11
 */
@Service
public class PofitOrderListWarehouseDateServiceImpl implements IPofitOrderListWarehouseDateService 
{
    @Autowired
    private PofitOrderListWarehouseDateMapper pofitOrderListWarehouseDateMapper;

    /**
     * 查询时间维度统计
     * 
     * @param sId 时间维度统计主键
     * @return 时间维度统计
     */
    @Override
    public PofitOrderListWarehouseDate selectPofitOrderListWarehouseDateBySId(Long sId)
    {
        return pofitOrderListWarehouseDateMapper.selectPofitOrderListWarehouseDateBySId(sId);
    }

    /**
     * 查询时间维度统计列表
     * 
     * @param pofitOrderListWarehouseDate 时间维度统计
     * @return 时间维度统计
     */
    @Override
    public List<PofitOrderListWarehouseDate> selectPofitOrderListWarehouseDateList(PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        return pofitOrderListWarehouseDateMapper.selectPofitOrderListWarehouseDateList(pofitOrderListWarehouseDate);
    }

    /**
     * 新增时间维度统计
     * 
     * @param pofitOrderListWarehouseDate 时间维度统计
     * @return 结果
     */
    @Override
    public int insertPofitOrderListWarehouseDate(PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        return pofitOrderListWarehouseDateMapper.insertPofitOrderListWarehouseDate(pofitOrderListWarehouseDate);
    }

    /**
     * 修改时间维度统计
     * 
     * @param pofitOrderListWarehouseDate 时间维度统计
     * @return 结果
     */
    @Override
    public int updatePofitOrderListWarehouseDate(PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        return pofitOrderListWarehouseDateMapper.updatePofitOrderListWarehouseDate(pofitOrderListWarehouseDate);
    }

    /**
     * 批量删除时间维度统计
     * 
     * @param sIds 需要删除的时间维度统计主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseDateBySIds(Long[] sIds)
    {
        return pofitOrderListWarehouseDateMapper.deletePofitOrderListWarehouseDateBySIds(sIds);
    }

    /**
     * 删除时间维度统计信息
     * 
     * @param sId 时间维度统计主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseDateBySId(Long sId)
    {
        return pofitOrderListWarehouseDateMapper.deletePofitOrderListWarehouseDateBySId(sId);
    }
}
