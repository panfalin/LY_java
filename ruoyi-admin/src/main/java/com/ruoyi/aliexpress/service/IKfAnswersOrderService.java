package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.KfAnswersOrder;

/**
 * 订单Service接口
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
public interface IKfAnswersOrderService 
{
    /**
     * 查询订单
     * 
     * @param orderId 订单主键
     * @return 订单
     */
    public KfAnswersOrder selectKfAnswersOrderByOrderId(String orderId);

    /**
     * 查询订单列表
     * 
     * @param kfAnswersOrder 订单
     * @return 订单集合
     */
    public List<KfAnswersOrder> selectKfAnswersOrderList(KfAnswersOrder kfAnswersOrder);

    /**
     * 查询订单列表详情
     *
     * @param
     * @return 订单集合
     */
    public List<KfAnswersOrder> selectKfAnswersOrderDetail(String clientId,String storeName);



    /**
     * 新增订单
     * 
     * @param kfAnswersOrder 订单
     * @return 结果
     */
    public int insertKfAnswersOrder(KfAnswersOrder kfAnswersOrder);

    /**
     * 修改订单
     * 
     * @param kfAnswersOrder 订单
     * @return 结果
     */
    public int updateKfAnswersOrder(KfAnswersOrder kfAnswersOrder);

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的订单主键集合
     * @return 结果
     */
    public int deleteKfAnswersOrderByOrderIds(String[] orderIds);

    /**
     * 删除订单信息
     * 
     * @param orderId 订单主键
     * @return 结果
     */
    public int deleteKfAnswersOrderByOrderId(String orderId);
}
