package com.ruoyi.orders.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.orders.mapper.OrdersMapper;
import com.ruoyi.orders.domain.Orders;
import com.ruoyi.orders.service.IOrdersService;

/**
 * 订单数据Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-17
 */
@Service
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 查询订单数据
     *
     * @param orderId 订单数据主键
     * @return 订单数据
     */
    @Override
    public Orders selectOrdersByOrderId(String orderId) {
        return ordersMapper.selectOrdersByOrderId(orderId);
    }

    /**
     * 查询订单数据列表
     *
     * @param orders 订单数据
     * @return 订单数据
     */
    @Override
    public List<Orders> selectOrdersList(Orders orders, String paymentTime) {
    if (paymentTime != null && !paymentTime.isEmpty()) {
        String[] paymentTimes = paymentTime.split(" - ");
        return ordersMapper.selectOrdersList(orders, paymentTimes[0], paymentTimes[1]);
    } else {
        return ordersMapper.selectOrdersList(orders, null, null);
    }
}


    /**
     * 新增订单数据
     *
     * @param orders 订单数据
     * @return 结果
     */
    @Override
    public int insertOrders(Orders orders) {
        return ordersMapper.insertOrders(orders);
    }

    /**
     * 修改订单数据
     *
     * @param orders 订单数据
     * @return 结果
     */
    @Override
    public int updateOrders(Orders orders) {
        return ordersMapper.updateOrders(orders);
    }

    /**
     * 批量删除订单数据
     *
     * @param orderIds 需要删除的订单数据主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByOrderIds(String[] orderIds) {
        return ordersMapper.deleteOrdersByOrderIds(orderIds);
    }

    /**
     * 删除订单数据信息
     *
     * @param orderId 订单数据主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByOrderId(String orderId) {
        return ordersMapper.deleteOrdersByOrderId(orderId);
    }

    /**
     * 获取所有店铺
     *
     * @return
     */
    @Override
    public List<String> getAllStores() {
        return ordersMapper.selectAllStores();
    }

    @Override
    public List<String> getAllCountry() {
        return ordersMapper.selectAllCountry();
    }
}
