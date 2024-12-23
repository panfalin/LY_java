package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.BcReserveWarehouse;

/**
 * warehouseMapper接口
 * 
 * @author ruoyi
 * @date 2024-12-10
 */
public interface BcReserveWarehouseMapper 
{
    /**
     * 查询warehouse
     * 
     * @param sku warehouse主键
     * @return warehouse
     */
    public BcReserveWarehouse selectBcReserveWarehouseBySku(String sku);

    /**
     * 查询warehouse列表
     * 
     * @param bcReserveWarehouse warehouse
     * @return warehouse集合
     */
    public List<BcReserveWarehouse> selectBcReserveWarehouseList(BcReserveWarehouse bcReserveWarehouse);

    /**
     * 查询warehouse列表
     *
     * @param bcReserveWarehouse warehouse
     * @return warehouse集合
     */
    public List<BcReserveWarehouse> selectBcReserveWarehouseListName(BcReserveWarehouse bcReserveWarehouse);



    /**
     * 新增warehouse
     * 
     * @param bcReserveWarehouse warehouse
     * @return 结果
     */
    public int insertBcReserveWarehouse(BcReserveWarehouse bcReserveWarehouse);


    public int insertOrUpdateExcel(List<BcReserveWarehouse> dataList);

    /**
     * 修改warehouse
     * 
     * @param bcReserveWarehouse warehouse
     * @return 结果
     */
    public int updateBcReserveWarehouse(BcReserveWarehouse bcReserveWarehouse);

    /**
     * 删除warehouse
     * 
     * @param sku warehouse主键
     * @return 结果
     */
    public int deleteBcReserveWarehouseBySku(String sku);

    /**
     * 批量删除warehouse
     * 
     * @param skus 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBcReserveWarehouseBySkus(String[] skus);
}
