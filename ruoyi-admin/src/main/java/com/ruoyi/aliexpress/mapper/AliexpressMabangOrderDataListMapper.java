package com.ruoyi.aliexpress.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.ruoyi.aliexpress.domain.AliexpressFinancialRecord;
import com.ruoyi.aliexpress.domain.AliexpressMabangOrderDataList;

/**
 * 马帮订单数据Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-18
 */
public interface AliexpressMabangOrderDataListMapper 
{
    /**
     * 查询马帮订单数据
     * 
     * @param sId 马帮订单数据主键
     * @return 马帮订单数据
     */
    public AliexpressMabangOrderDataList selectAliexpressMabangOrderDataListBySId(Long sId);

    /**
     * 查询马帮订单数据列表
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 马帮订单数据集合
     */
    public List<AliexpressMabangOrderDataList> selectAliexpressMabangOrderDataListList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList);

    /**
     * 新增马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    public int insertAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList);

    /**
     * 修改马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    public int updateAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList);

    /**
     * 删除马帮订单数据
     * 
     * @param sId 马帮订单数据主键
     * @return 结果
     */
    public int deleteAliexpressMabangOrderDataListBySId(Long sId);

    /**
     * 批量删除马帮订单数据
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressMabangOrderDataListBySIds(Long[] sIds);

        /**
         * 根据订单号获取所有相关账务记录的物流赔付总和
         *
         * @param orderId 订单号
         * @return 物流赔付总和
         */
    public List<AliexpressFinancialRecord> getTotalLogisticsCompensation(String orderId);

    /**
     * 根据订单号获取所有相关账务记录的物流赔付总和
     *
     * @param orderId 订单号
     * @return 物流赔付总和
     */
    public BigDecimal getTotalRefundAmountByOrderId(String orderId);



    /**
     * 查询马帮订单数据列表
     *
     * @param transactionId 马帮订单数据
     * @return 马帮订单数据集合
     */
    public List<AliexpressFinancialRecord> getRecordsByTransactionId(String transactionId);


    public int countBySku(String sku);




}
