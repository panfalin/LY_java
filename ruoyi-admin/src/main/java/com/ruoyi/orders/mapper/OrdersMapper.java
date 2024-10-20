package com.ruoyi.orders.mapper;

import java.util.List;
import com.ruoyi.orders.domain.Orders;
import org.apache.ibatis.annotations.Param;

/**
 * 订单数据Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-17
 */
public interface OrdersMapper 
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
public List<Orders> selectOrdersList(@Param("orders") Orders orders,
                                      @Param("startPaymentTime") String startPaymentTime,
                                      @Param("endPaymentTime") String endPaymentTime);

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
     * 删除订单数据
     * 
     * @param orderId 订单数据主键
     * @return 结果
     */
    public int deleteOrdersByOrderId(String orderId);

    /**
     * 批量删除订单数据
     * 
     * @param orderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrdersByOrderIds(String[] orderIds);

    /**
     * 查询所有店铺
     *
     * @return
     */
    public List<String> selectAllStores();

    /**
     * 查询所有国家
     *
     * @return
     */
    public List<String> selectAllCountry();
}
