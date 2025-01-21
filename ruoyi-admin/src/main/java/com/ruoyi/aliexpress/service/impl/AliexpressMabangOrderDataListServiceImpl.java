package com.ruoyi.aliexpress.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.aliexpress.domain.AliexpressFinancialRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressMabangOrderDataListMapper;
import com.ruoyi.aliexpress.domain.AliexpressMabangOrderDataList;
import com.ruoyi.aliexpress.service.IAliexpressMabangOrderDataListService;

/**
 * 马帮订单数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-18
 */
@Service
public class AliexpressMabangOrderDataListServiceImpl implements IAliexpressMabangOrderDataListService 
{
    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private AliexpressMabangOrderDataListMapper aliexpressMabangOrderDataListMapper;

    /**
     * 查询马帮订单数据
     * 
     * @param sId 马帮订单数据主键
     * @return 马帮订单数据
     */
    @Override
    public AliexpressMabangOrderDataList selectAliexpressMabangOrderDataListBySId(Long sId)
    {
        return aliexpressMabangOrderDataListMapper.selectAliexpressMabangOrderDataListBySId(sId);
    }

    /**
     * 查询马帮订单数据列表
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 马帮订单数据
     */
    @Override
    public List<AliexpressMabangOrderDataList> selectAliexpressMabangOrderDataListList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
//        计算数据处理
//        原始数据
        List<AliexpressMabangOrderDataList> listOriginal =aliexpressMabangOrderDataListMapper.selectAliexpressMabangOrderDataListList(aliexpressMabangOrderDataList);
//        物流赔付
        for (AliexpressMabangOrderDataList orderData : listOriginal) {
            // 获取每个订单号的物流赔付总和
            List<AliexpressFinancialRecord> totalLogisticsCompensationData = aliexpressMabangOrderDataListMapper.getTotalLogisticsCompensation(orderData.getOrderId());
            // Step 2: 汇总金额
            BigDecimal totalLogisticsCompensationAmount = BigDecimal.ZERO;
            for (AliexpressFinancialRecord record : totalLogisticsCompensationData) {
                String amount = record.getAmount();
                totalLogisticsCompensationAmount = totalLogisticsCompensationAmount.add(parseAmountJSON(amount).abs()); // 累加金额
            }
            // Step 3: 将累加的金额赋值给 orderData 的 semiManagedCompensation
            orderData.setLogisticsCompensation(totalLogisticsCompensationAmount);


            //        半托管赔付
            String transactionId = orderData.getTransactionId(); // 获取交易单号
            if (transactionId != null && !transactionId.isEmpty()) {
                // Step 1: 查询该 transaction_id 的所有财务记录
                List<AliexpressFinancialRecord> records = aliexpressMabangOrderDataListMapper.getRecordsByTransactionId(transactionId);
                // Step 2: 汇总金额
                BigDecimal totalAmount = BigDecimal.ZERO;
                for (AliexpressFinancialRecord record : records) {
                    String amount = record.getAmount();
                    totalAmount = totalAmount.add(parseAmount(amount)); // 累加金额
                }
                // Step 3: 将累加的金额赋值给 orderData 的 semiManagedCompensation
                orderData.setSemiManagedCompensation(totalAmount);
            } else {
                // 如果没有交易单号，确保物流赔付总和为0
                orderData.setSemiManagedCompensation(BigDecimal.ZERO);
            }
//        实际退款
            String orderId = orderData.getOrderId(); // 获取订单号
            if (orderId != null && !orderId.isEmpty()) {
                // Step 1: 查询该订单号在 aliexpress_order_recharge_records 表中的所有记录
                BigDecimal totalRefundAmount = aliexpressMabangOrderDataListMapper.getTotalRefundAmountByOrderId(orderId);

                // Step 2: 如果没有找到记录，则设置退款金额为0
                if (totalRefundAmount == null) {
                    totalRefundAmount = BigDecimal.ZERO;
                }

                // Step 3: 将累计的退款金额赋值给 orderData 的 actualRefund 字段
                orderData.setActualRefund(totalRefundAmount);
            } else {
                // 如果订单号为空，确保实际退款金额为0
                orderData.setActualRefund(BigDecimal.ZERO);
            }



//        清仓补助
            String skuInfoJson  = orderData.getSkuInfo(); // 获取订单号
            try {

                if (skuInfoJson==null){
                    orderData.setClearanceSubsidy(BigDecimal.ZERO);
                    continue;
                }
                // 解析 skuInfo JSON 字符串
                Map<String, Map<String, Object>> skuInfoMap = objectMapper.readValue(skuInfoJson, Map.class);
                BigDecimal clearanceSubsidy = BigDecimal.ZERO;  // 初始化 clearanceSubsidy 为 BigDecimal.ZERO

                // 遍历每个 SKU
                for (String sku : skuInfoMap.keySet()) {
                    // 获取 quantity 和 unifiedCost
                    Map<String, Object> skuData = skuInfoMap.get(sku);
                    int quantity = (int) skuData.get("quantity");
                    BigDecimal unifiedCost = new BigDecimal(skuData.get("unifiedCost").toString());  // 转为 BigDecimal

                    // 查询数据库，判断该 SKU 是否存在
                    if (isSkuExists(sku)) {
                        // 计算并累加 unifiedCost * quantity
                        BigDecimal quantityBigDecimal = new BigDecimal(quantity);
                        BigDecimal skuSubsidy = unifiedCost.multiply(quantityBigDecimal);
                        clearanceSubsidy = clearanceSubsidy.add(skuSubsidy);
                    }
                }
                // 将 clearanceSubsidy 更新到 orderData 或其他地方
                orderData.setClearanceSubsidy(clearanceSubsidy);
                System.out.println("Clearance Subsidy for Order ID " + orderData.getOrderId() + ": " + clearanceSubsidy);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


//        实际利润
        for (AliexpressMabangOrderDataList orderData : listOriginal) {

            // 从 orderData 获取相关字段
            BigDecimal orderProfit = orderData.getOrderProfit();  // 订单利润
            BigDecimal clearanceSubsidy = orderData.getClearanceSubsidy();  // 清关补贴
            BigDecimal actualRefund = orderData.getActualRefund();  // 实际退款
            BigDecimal semiManagedCompensation = orderData.getSemiManagedCompensation();  // 半托管补偿
            BigDecimal logisticsCompensation = orderData.getLogisticsCompensation();  // 物流补偿

            // 如果这些值为空（null），则将它们设置为 0
            if (orderProfit == null) {
                orderProfit = BigDecimal.ZERO;
            }
            if (clearanceSubsidy == null) {
                clearanceSubsidy = BigDecimal.ZERO;
            }
            if (actualRefund == null) {
                actualRefund = BigDecimal.ZERO;
            }
            if (semiManagedCompensation == null) {
                semiManagedCompensation = BigDecimal.ZERO;
            }
            if (logisticsCompensation == null) {
                logisticsCompensation = BigDecimal.ZERO;
            }

            // 计算实际利润
            BigDecimal actualProfit = orderProfit.add(clearanceSubsidy)
                    .subtract(actualRefund)
                    .add(semiManagedCompensation)
                    .add(logisticsCompensation);

            // 更新 orderData 中的实际利润字段
            orderData.setActualProfit(actualProfit);


//        实际利润率
            BigDecimal totalAmount = orderData.getTotalOrderAmount();  // 获取总订单金额
            if (totalAmount != null && totalAmount.compareTo(BigDecimal.ZERO) > 0) {
                BigDecimal actualProfitRate = actualProfit.divide(totalAmount, 4, RoundingMode.HALF_UP);  // 计算实际利润率，保留 4 位小数
                orderData.setActualProfitRate(actualProfitRate);
            }



        }



















        return listOriginal;
    }




    public boolean isSkuExists(String sku) {
        int count = aliexpressMabangOrderDataListMapper.countBySku(sku);
        return count > 0;  // 如果存在，返回 true
    }




    // 处理金额字符串，转换为 BigDecimal
    public static BigDecimal parseAmount(String amount) {
        if (amount == null || amount.isEmpty()) {
            return BigDecimal.ZERO;
        }

        // 去掉货币符号
        if (amount.startsWith("US $")) {
            return new BigDecimal(amount.substring(4).trim()).multiply(BigDecimal.valueOf(7.31));
        } else if (amount.startsWith("CN￥")) {
            return new BigDecimal(amount.substring(3).trim());
        } else {
            // 如果没有识别的符号，直接返回 0
            return BigDecimal.ZERO;
        }
    }


    public static BigDecimal parseAmountJSON(String amount) {
        if (amount == null || amount.isEmpty()) {
            return BigDecimal.ZERO;  // 如果为空，则返回 0
        }

        try {
            // 去掉外部的花括号和引号，例如：{'CNY': -300.0}
            String cleanAmount = amount.replaceAll("[{}' ]", "");

            // 切分键和值，键是货币符号，值是金额
            String[] parts = cleanAmount.split(":");

            if (parts.length == 2) {
                String currency = parts[0];  // 获取货币类型
                String value = parts[1];      // 获取金额字符串

                // 将金额转换为 BigDecimal
                BigDecimal amountValue = new BigDecimal(value.trim());

                // 处理不同的货币符号
                if ("CNY".equalsIgnoreCase(currency)) {
                    // 如果是人民币（CNY），直接返回金额
                    return amountValue;
                } else if ("USD".equalsIgnoreCase(currency)) {
                    // 如果是美元（USD），这里可以做一些转换，暂时不处理
                    amountValue=amountValue.multiply(BigDecimal.valueOf(7.31));
                    return amountValue;
                } else {
                    // 对于其他币种，直接返回金额（可以做扩展）
                    return amountValue;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();  // 出现错误时打印异常
        }

        // 如果无法解析金额，则返回 0
        return BigDecimal.ZERO;
    }



    /**
     * 新增马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    @Override
    public int insertAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return aliexpressMabangOrderDataListMapper.insertAliexpressMabangOrderDataList(aliexpressMabangOrderDataList);
    }

    /**
     * 修改马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    @Override
    public int updateAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return aliexpressMabangOrderDataListMapper.updateAliexpressMabangOrderDataList(aliexpressMabangOrderDataList);
    }

    /**
     * 批量删除马帮订单数据
     * 
     * @param sIds 需要删除的马帮订单数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressMabangOrderDataListBySIds(Long[] sIds)
    {
        return aliexpressMabangOrderDataListMapper.deleteAliexpressMabangOrderDataListBySIds(sIds);
    }

    /**
     * 删除马帮订单数据信息
     * 
     * @param sId 马帮订单数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressMabangOrderDataListBySId(Long sId)
    {
        return aliexpressMabangOrderDataListMapper.deleteAliexpressMabangOrderDataListBySId(sId);
    }
}
