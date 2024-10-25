package com.ruoyi.order_data.service;

import java.util.List;
import com.ruoyi.order_data.domain.OrderData;

/**
 * 速卖通分析-店铺维度Service接口
 * 
 * @author ruoyi
 * @date 2024-10-23
 */
public interface IOrderDataService 
{
    /**
     * 查询速卖通分析-店铺维度
     * 
     * @param productId 速卖通分析-店铺维度主键
     * @return 速卖通分析-店铺维度
     */
    public OrderData selectOrderDataByProductId(String productId);

    /**
     * 查询速卖通分析-店铺维度列表
     * 
     * @param orderData 速卖通分析-店铺维度
     * @return 速卖通分析-店铺维度集合
     */
    public List<OrderData> selectOrderDataList(OrderData orderData);

    /**
     * 新增速卖通分析-店铺维度
     * 
     * @param orderData 速卖通分析-店铺维度
     * @return 结果
     */
    public int insertOrderData(OrderData orderData);

    /**
     * 修改速卖通分析-店铺维度
     * 
     * @param orderData 速卖通分析-店铺维度
     * @return 结果
     */
    public int updateOrderData(OrderData orderData);

    /**
     * 批量删除速卖通分析-店铺维度
     * 
     * @param productIds 需要删除的速卖通分析-店铺维度主键集合
     * @return 结果
     */
    public int deleteOrderDataByProductIds(String[] productIds);

    /**
     * 删除速卖通分析-店铺维度信息
     * 
     * @param productId 速卖通分析-店铺维度主键
     * @return 结果
     */
    public int deleteOrderDataByProductId(String productId);

    /**
     * 获取所有店铺
     *
     * @return
     */
    public List<String> getAllStores();
}
