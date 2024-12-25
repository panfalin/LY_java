package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.BcReserveWarehouseMapper;
import com.ruoyi.aliexpress.domain.BcReserveWarehouse;
import com.ruoyi.aliexpress.service.IBcReserveWarehouseService;

/**
 * warehouseService业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-10
 */
@Service
public class BcReserveWarehouseServiceImpl implements IBcReserveWarehouseService 
{
    @Autowired
    private BcReserveWarehouseMapper bcReserveWarehouseMapper;

    /**
     * 查询warehouse
     * 
     * @param sku warehouse主键
     * @return warehouse
     */
    @Override
    public BcReserveWarehouse selectBcReserveWarehouseBySku(String sku)
    {
        return bcReserveWarehouseMapper.selectBcReserveWarehouseBySku(sku);
    }

    /**
     * 查询warehouse列表
     * 
     * @param bcReserveWarehouse warehouse
     * @return warehouse
     */
    @Override
    public List<BcReserveWarehouse> selectBcReserveWarehouseList(BcReserveWarehouse bcReserveWarehouse)
    {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        String nickName = user.getNickName();
        if (nickName != null && !nickName.trim().equalsIgnoreCase("管理员")) {
            bcReserveWarehouse.setUserName(nickName);
        }

        return bcReserveWarehouseMapper.selectBcReserveWarehouseList(bcReserveWarehouse);
    }


    public List<Map<String,String>> selectBcReserveWarehouseShopName(String storeManager)
    {
        if (storeManager != null && storeManager.trim().equalsIgnoreCase("管理员")) {
            storeManager = null;
        }

        return bcReserveWarehouseMapper.selectBcReserveWarehouseShopName(storeManager);
    }


    /**
     * 查询warehouse列表
     *
     * @param bcReserveWarehouse warehouse
     * @return warehouse集合
     */
    public List<BcReserveWarehouse> selectBcReserveWarehouseListName(BcReserveWarehouse bcReserveWarehouse) {

        return bcReserveWarehouseMapper.selectBcReserveWarehouseListName(bcReserveWarehouse);
    }


    /**
     * 新增warehouse
     * 
     * @param bcReserveWarehouse warehouse
     * @return 结果
     */
    @Override
    public int insertBcReserveWarehouse(BcReserveWarehouse bcReserveWarehouse)
    {
        return bcReserveWarehouseMapper.insertBcReserveWarehouse(bcReserveWarehouse);
    }

    /**
     * 修改warehouse
     * 
     * @param bcReserveWarehouse warehouse
     * @return 结果
     */
    @Override
    public int updateBcReserveWarehouse(BcReserveWarehouse bcReserveWarehouse)
    {
        return bcReserveWarehouseMapper.updateBcReserveWarehouse(bcReserveWarehouse);
    }

    /**
     * 批量删除warehouse
     * 
     * @param skus 需要删除的warehouse主键
     * @return 结果
     */
    @Override
    public int deleteBcReserveWarehouseBySkus(String[] skus)
    {
        return bcReserveWarehouseMapper.deleteBcReserveWarehouseBySkus(skus);
    }

    /**
     * 删除warehouse信息
     * 
     * @param sku warehouse主键
     * @return 结果
     */
    @Override
    public int deleteBcReserveWarehouseBySku(String sku)
    {
        return bcReserveWarehouseMapper.deleteBcReserveWarehouseBySku(sku);
    }

    @Override
    public int insertOrUpdateExcel(List<BcReserveWarehouse> dataList) {
        return bcReserveWarehouseMapper.insertOrUpdateExcel(dataList);
    }
}
