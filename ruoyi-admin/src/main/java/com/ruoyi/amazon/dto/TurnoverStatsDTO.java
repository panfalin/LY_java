package com.ruoyi.amazon.dto;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TurnoverStatsDTO {
    private String turnover_range;          // 行类型
    private Integer skuCount;              // SKU数量
    private BigDecimal skuRatio;          // SKU数量占比
    private BigDecimal inventoryValue;     // 库存金额
    private BigDecimal inventoryRatio;     // 库存金额占比
    private BigDecimal revenue;            // 营业额
    private BigDecimal revenueRatio;       // 营业额占比
    private BigDecimal profit;             // 利润
    private BigDecimal profitRatio;        // 利润占比
    private BigDecimal profitMargin;       // 利润率
}
