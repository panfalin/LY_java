package com.ruoyi.amazon.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AmzStoreRankingDTO {
    private Integer rank;           // 排名
    private String storeName;       // 店铺名称
    private Integer skuCount;       // SKU数量
    private BigDecimal salesAmount; // 销售额
    private BigDecimal salesGrowth; // 销售增长率
    private BigDecimal turnoverDays;// 周转天数
    private BigDecimal profit;      // 利润
    private BigDecimal profitGrowth;// 利润增长率
    private BigDecimal profitMargin;// 利润率
}
