package com.ruoyi.order_data.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.order_data.mapper.OrderDataMapper;
import com.ruoyi.order_data.domain.OrderData;
import com.ruoyi.order_data.service.IOrderDataService;

/**
 * 速卖通分析-店铺维度Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-23
 */
@Service
public class OrderDataServiceImpl implements IOrderDataService {
    @Autowired
    private OrderDataMapper orderDataMapper;

    /**
     * 查询速卖通分析-店铺维度
     *
     * @param productId 速卖通分析-店铺维度主键
     * @return 速卖通分析-店铺维度
     */
    @Override
    public OrderData selectOrderDataByProductId(String productId) {
        return orderDataMapper.selectOrderDataByProductId(productId);
    }

    /**
     * 查询速卖通分析-店铺维度列表
     *
     * @param orderData 速卖通分析-店铺维度
     * @return 速卖通分析-店铺维度
     */
    public List<OrderData> selectOrderDataList(OrderData orderData) {
        List<OrderData> orderDataList = orderDataMapper.selectOrderDataList(orderData);

        orderDataList.sort(Comparator.comparing(OrderData::getStatisticalDate).reversed());

        orderDataList.forEach(data -> {
            if ("yangyangyang_gz01@163.com".equals(data.getStoreName()) || "yyy05".equals(data.getStoreName()) || "jingwan_ae01@163.com".equals(data.getStoreName())) {
                // data.setP
            }
            String skuDetails = data.getSkuDetails();
            if (skuDetails != null && !skuDetails.isEmpty() && !skuDetails.contains("null")) {
                skuDetails = skuDetails.replace(',', '\n');
                data.setSkuDetails(skuDetails);
            }

            String countryDetail = data.getCountryDetail();
            if (countryDetail != null && !countryDetail.isEmpty() && !countryDetail.contains("null")) {
                countryDetail = countryDetail.replace(',', '\n');
                data.setCountryDetail(countryDetail);
            }

        });
        // Map<String, List<OrderData>> groupedByStore = new HashMap<>();
        //
        // for (OrderData data : orderDataList) {
        //     // 获取店铺名称
        //     String storeName = data.getStoreName();
        //
        //     // 如果 map 中没有这个店铺，先创建一个新的列表
        //     groupedByStore.computeIfAbsent(storeName, k -> new ArrayList<>());
        //
        //     // 将数据加入到对应店铺的列表中
        //     groupedByStore.get(storeName).add(data);
        // }
        //
        // // 这里是最终返回的数据
        // List<OrderData> result = new ArrayList<>();
        //
        // for (Map.Entry<String, List<OrderData>> entry : groupedByStore.entrySet()) {
        //     String storeName = entry.getKey();
        //     List<OrderData> dataList = entry.getValue();
        //
        //     // 使用 Map 来存储按日期分类的数据
        //     Map<Date, List<OrderData>> groupedByDate = new HashMap<>();
        //
        //     for (OrderData data : dataList) {
        //         // 获取日期
        //         Date date = data.getStatisticalDate();
        //
        //         // 如果 map 中没有这个日期，先创建一个新的列表
        //         groupedByDate.computeIfAbsent(date, k -> new ArrayList<>());
        //
        //         // 将数据加入到对应日期的列表中
        //         groupedByDate.get(date).add(data);
        //     }
        //
        //
        //     for (Map.Entry<Date, List<OrderData>> dateListEntry : groupedByDate.entrySet()) {
        //         Date date = dateListEntry.getKey();
        //         List<OrderData> orderDataListGroupedByDate = dateListEntry.getValue();
        //
        //         // 示例：汇总每个日期每个店铺的数据（例如总销量和访客数）
        //         int totalSales = 0;
        //         int totalVisitors = 0;
        //         int totalPayingOldBuyers = 0;
        //         int totalPayingBuyers = 0;
        //         int totalPaidProductQuantity = 0;
        //
        //         for (OrderData data : orderDataListGroupedByDate) {
        //             totalSales += data.getOrderedProductQuantity();
        //             totalVisitors += data.getVisitorCount();
        //             totalPayingOldBuyers += data.getPayingOldBuyers();
        //             totalPayingBuyers += data.getPayingBuyers();
        //             totalPaidProductQuantity += data.getPaidProductQuantity();
        //             totalPayingBuyers += data.getPayingBuyers();
        //             totalPaidProductQuantity += data.getPaidProductQuantity();
        //         }
        //
        //         OrderData summaryData = new OrderData();
        //         summaryData.setStatisticalDate(date);
        //         summaryData.setStoreName(storeName);
        //         summaryData.setPayingOldBuyers((long) totalPayingOldBuyers);
        //         summaryData.setOrderedProductQuantity((long) totalSales);
        //         summaryData.setVisitorCount((long) totalVisitors);
        //         summaryData.setPayingBuyers((long) totalPayingBuyers);
        //         summaryData.setPaidProductQuantity((long) totalPaidProductQuantity);
        //
        //         // 将汇总后的数据添加到结果中
        //         result.add(summaryData);
        //     }
        // }
        // // 按日期排序
        // result.sort(Comparator.comparing(OrderData::getStatisticalDate).reversed());
        // return result;

        return orderDataList;
    }


        /**
         * 新增速卖通分析-店铺维度
         *
         * @param orderData 速卖通分析-店铺维度
         * @return 结果
         */
        @Override
        public int insertOrderData (OrderData orderData){
            return orderDataMapper.insertOrderData(orderData);
        }

        /**
         * 修改速卖通分析-店铺维度
         *
         * @param orderData 速卖通分析-店铺维度
         * @return 结果
         */
        @Override
        public int updateOrderData (OrderData orderData){
            return orderDataMapper.updateOrderData(orderData);
        }

        /**
         * 批量删除速卖通分析-店铺维度
         *
         * @param productIds 需要删除的速卖通分析-店铺维度主键
         * @return 结果
         */
        @Override
        public int deleteOrderDataByProductIds (String[]productIds){
            return orderDataMapper.deleteOrderDataByProductIds(productIds);
        }

        /**
         * 删除速卖通分析-店铺维度信息
         *
         * @param productId 速卖通分析-店铺维度主键
         * @return 结果
         */
        @Override
        public int deleteOrderDataByProductId (String productId){
            return orderDataMapper.deleteOrderDataByProductId(productId);
        }

        /**
         * 获取所有店铺
         *
         * @return
         */
        @Override
        public List<String> getAllStores () {
            return orderDataMapper.selectAllStores();
        }
    }
