package com.ruoyi.aliexpress.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.KfAnswersOrderMapper;
import com.ruoyi.aliexpress.domain.KfAnswersOrder;
import com.ruoyi.aliexpress.service.IKfAnswersOrderService;

/**
 * 订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
@Service
public class KfAnswersOrderServiceImpl implements IKfAnswersOrderService 
{
    @Autowired
    private KfAnswersOrderMapper kfAnswersOrderMapper;

    /**
     * 查询订单
     * 
     * @param orderId 订单主键
     * @return 订单
     */
    @Override
    public KfAnswersOrder selectKfAnswersOrderByOrderId(String orderId)
    {
        return kfAnswersOrderMapper.selectKfAnswersOrderByOrderId(orderId);
    }

    /**
     * 查询订单列表
     * 
     * @param kfAnswersOrder 订单
     * @return 订单
     */
    @Override
    public List<KfAnswersOrder> selectKfAnswersOrderList(KfAnswersOrder kfAnswersOrder)
    {
        return kfAnswersOrderMapper.selectKfAnswersOrderList(kfAnswersOrder);
    }

    @Override
    public List<KfAnswersOrder> selectKfAnswersOrderDetail(String clientId, String storeName) {

        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("clientId", clientId);
        paramMap.put("storeName", storeName);


        return kfAnswersOrderMapper.selectKfAnswersOrderDetail((HashMap) paramMap);
    }

    /**
     * 新增订单
     * 
     * @param kfAnswersOrder 订单
     * @return 结果
     */
    @Override
    public int insertKfAnswersOrder(KfAnswersOrder kfAnswersOrder)
    {
        return kfAnswersOrderMapper.insertKfAnswersOrder(kfAnswersOrder);
    }

    /**
     * 修改订单
     * 
     * @param kfAnswersOrder 订单
     * @return 结果
     */
    @Override
    public int updateKfAnswersOrder(KfAnswersOrder kfAnswersOrder)
    {
        kfAnswersOrder.setUpdateTime(DateUtils.getNowDate());
        return kfAnswersOrderMapper.updateKfAnswersOrder(kfAnswersOrder);
    }

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的订单主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersOrderByOrderIds(String[] orderIds)
    {
        return kfAnswersOrderMapper.deleteKfAnswersOrderByOrderIds(orderIds);
    }

    /**
     * 删除订单信息
     * 
     * @param orderId 订单主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersOrderByOrderId(String orderId)
    {
        return kfAnswersOrderMapper.deleteKfAnswersOrderByOrderId(orderId);
    }
}
