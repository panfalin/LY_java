package com.ruoyi.amazon.domain.vo;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class TaskMetricsVO {
    private String msku;
    private String storeName;
    private MetricsData currentMetrics;

    @Data
    public static class MetricsData {
        private BigDecimal profit;        // 利润率(%)
        private BigDecimal turnoverDays;  // 周转天数(天)
        private BigDecimal salesAmount;   // 销售额(元)
        private BigDecimal cost;          // 成本(元)
        private BigDecimal inventoryAmount; // 库存金额(元)
        
        // 销售数据
        private Integer sales7Days;       // 7天销量
        private Integer sales14Days;      // 14天销量
        private Integer sales30Days;      // 30天销量
        private Integer sales90Days;      // 90天销量
        private BigDecimal avgDailySales; // 日均销量
        
        // 库存数据
        private Integer procurementInTransit; // 在途采购
        private Integer localInventory;       // 本地库存
        private Integer available;            // 可用库存
        private Integer awaitingStock;        // 等待入库
        
        // 库存价值
        private BigDecimal totalLocalInventoryValue;  // 本地库存价值
        private BigDecimal totalFbaInventoryValue;    // FBA库存价值
        private BigDecimal fbaTurnoverDays;          // FBA周转天数
        private Integer totalInventoryCount;          // 总库存数量
    }
} 