package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.PofitOrderListWarehouseCategoryMapper;
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseCategory;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseCategoryService;

/**
 * 马帮后台导出金额订单数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-08
 */
@Service
public class PofitOrderListWarehouseCategoryServiceImpl implements IPofitOrderListWarehouseCategoryService 
{
    @Autowired
    private PofitOrderListWarehouseCategoryMapper pofitOrderListWarehouseCategoryMapper;

    /**
     * 查询马帮后台导出金额订单数据
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 马帮后台导出金额订单数据
     */
    @Override
    public PofitOrderListWarehouseCategory selectPofitOrderListWarehouseCategoryBySId(Long sId)
    {
        return pofitOrderListWarehouseCategoryMapper.selectPofitOrderListWarehouseCategoryBySId(sId);
    }

    /**
     * 查询马帮后台导出金额订单数据列表
     * 
     * @param pofitOrderListWarehouseCategory 马帮后台导出金额订单数据
     * @return 马帮后台导出金额订单数据
     */
    @Override
    public List<PofitOrderListWarehouseCategory> selectPofitOrderListWarehouseCategoryList(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        return pofitOrderListWarehouseCategoryMapper.selectPofitOrderListWarehouseCategoryList(pofitOrderListWarehouseCategory);
    }

    /**
     * 新增马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseCategory 马帮后台导出金额订单数据
     * @return 结果
     */
    @Override
    public int insertPofitOrderListWarehouseCategory(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        return pofitOrderListWarehouseCategoryMapper.insertPofitOrderListWarehouseCategory(pofitOrderListWarehouseCategory);
    }

    /**
     * 修改马帮后台导出金额订单数据
     * 
     * @param pofitOrderListWarehouseCategory 马帮后台导出金额订单数据
     * @return 结果
     */
    @Override
    public int updatePofitOrderListWarehouseCategory(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        return pofitOrderListWarehouseCategoryMapper.updatePofitOrderListWarehouseCategory(pofitOrderListWarehouseCategory);
    }

    /**
     * 批量删除马帮后台导出金额订单数据
     * 
     * @param sIds 需要删除的马帮后台导出金额订单数据主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseCategoryBySIds(Long[] sIds)
    {
        return pofitOrderListWarehouseCategoryMapper.deletePofitOrderListWarehouseCategoryBySIds(sIds);
    }

    /**
     * 删除马帮后台导出金额订单数据信息
     * 
     * @param sId 马帮后台导出金额订单数据主键
     * @return 结果
     */
    @Override
    public int deletePofitOrderListWarehouseCategoryBySId(Long sId)
    {
        return pofitOrderListWarehouseCategoryMapper.deletePofitOrderListWarehouseCategoryBySId(sId);
    }
}
