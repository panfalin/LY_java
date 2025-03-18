package com.ruoyi.amazon.dto;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AmzDataAnalysisTurnoverDTO extends BaseEntity {

    /** 上架SKU数量 */
    @Excel(name = "上架SKU数量")
    private Integer listedSkuCount;

    /** 库存个数总计 */
    @Excel(name = "库存个数总计")
    private Integer totalInventoryCount;

    /** 船长7天销量 */
    @Excel(name = "销量")
    private Integer totalSales;

    /** 库存金额总计 */
    @Excel(name = "库存金额总计")
    private BigDecimal totalInventoryValue;

    /** 产品采购库存总额 */
    @Excel(name = "产品采购库存总额")
    private BigDecimal totalProcurementInventory;

    /** 产品本地库存总额 */
    @Excel(name = "产品本地库存总额")
    private BigDecimal totalLocalInventory;

    /** 产品FBA在途总额 */
    @Excel(name = "产品FBA在途总额")
    private BigDecimal totalFbaInTransit;

    /** 产品FBA可售总额 */
    @Excel(name = "产品FBA可售总额")
    private BigDecimal totalFbaAvailable;

    /** 销售数量（近7天平均） */
    @Excel(name = "日均销售数量（近7天平均）")
    private BigDecimal avgSalesLast7Days;

    /** 销售成本金额（近7天平均） */
    @Excel(name = "销售成本金额（近7天平均）")
    private Double avgSalesCostLast7Days;

    /** 周转天数（近7天数据平均） */
    @Excel(name = "周转天数（近7天数据平均）")
    private Double avgTurnoverDaysLast7Days;

    /** FBA周转天数（近7天数据平均） */
    @Excel(name = "FBA周转天数（近7天数据平均）")
    private Double avgFbaTurnoverDaysLast7Days;

    /** 总营业额 */
    @Excel(name = "总营业额")
    private Double totalRevenue;

    /** 总利润 */
    @Excel(name = "总利润")
    private Double totalProfit;

    private List<TurnoverStatsDTO> turnoverStats;  // 不同周转天数区间的统计数据

    private List<TurnoverStatsDTO> fbaTurnoverStats;  // 不同周转天数区间的统计数据

    /** 当前数据的时间 */
    private Date currentDate;

    /** 对比开始时间 */
    private Date compareStartDate;

    /** 对比结束时间 */
    private Date compareEndDate;

    /** 对比类型：month_on_month(环比)、year_on_year(同比) */
    private String compareType;

    private AmzDataAnalysisTurnoverDTO amzDataAnalysisTurnoverDTO;
}
