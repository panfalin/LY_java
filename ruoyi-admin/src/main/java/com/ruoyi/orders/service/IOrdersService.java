package com.ruoyi.orders.service;

import java.util.List;
import com.ruoyi.orders.domain.Orders;

/**
 * 订单数据Service接口
 * 
 * @author ruoyi
 * @date 2024-10-17
 */
public interface IOrdersService 
{
    /**
     * 查询订单数据
     * 
     * @param orderId 订单数据主键
     * @return 订单数据
     */
    public Orders selectOrdersByOrderId(String orderId);

    /**
     * 查询订单数据列表
     * 
     * @param orders 订单数据
     * @return 订单数据集合
     */
    public List<Orders> selectOrdersList(Orders orders);

    /**
     * 新增订单数据
     * 
     * @param orders 订单数据
     * @return 结果
     */
    public int insertOrders(Orders orders);

    /**
     * 修改订单数据
     * 
     * @param orders 订单数据
     * @return 结果
     */
    public int updateOrders(Orders orders);

    /**
     * 批量删除订单数据
     * 
     * @param orderIds 需要删除的订单数据主键集合
     * @return 结果
     */
    public int deleteOrdersByOrderIds(String[] orderIds);

    /**
     * 删除订单数据信息
     * 
     * @param orderId 订单数据主键
     * @return 结果
     */
    public int deleteOrdersByOrderId(String orderId);

    /**
     * 获取所有店铺
     *
     * @return
     */
    public List<String> getAllStores();

    /**
     * 获取所有国家
     *
     * @return
     */
    public List<String> getAllCountry();
}
