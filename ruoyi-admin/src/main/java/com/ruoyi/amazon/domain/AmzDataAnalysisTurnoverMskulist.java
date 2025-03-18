package com.ruoyi.amazon.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 亚马逊数据分析，周转率，mskulist，这个是基础信息对象 amz_data_analysis_turnover_mskulist
 * 
 * @author panfalin
 * @date 2025-02-19
 */
@Getter
@Setter
public class AmzDataAnalysisTurnoverMskulist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** MSKU */
    @Excel(name = "MSKU")
    private String msku;

    /** 商品一级目录 */
    @Excel(name = "商品一级目录")
    private String categoryLevelOne;

    /** 商品二级目录 */
    @Excel(name = "商品二级目录")
    private String categoryLevelTwo;

    /** FNSKU */
    @Excel(name = "FNSKU")
    private String fnsku;

    /** 本地SKU */
    @Excel(name = "本地SKU")
    private String localSku;

    /** 主SKU */
    @Excel(name = "主SKU")
    private String mainSku;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** ASIN */
    @Excel(name = "ASIN")
    private String asin;

    /** 库存状态 */
    @Excel(name = "库存状态")
    private String stockStatus;

    /** 7天销量 */
    @Excel(name = "7天销量")
    private BigDecimal sales7Days;

    /** 14天销量 */
    @Excel(name = "14天销量")
    private BigDecimal sales14Days;

    /** 30天销量 */
    @Excel(name = "30天销量")
    private BigDecimal sales30Days;

    /** 90天销量 */
    @Excel(name = "90天销量")
    private BigDecimal sales90Days;

    /** 日均销量 */
    @Excel(name = "日均销量")
    private BigDecimal avgDailySales;

    /** 采购在途 */
    @Excel(name = "采购在途")
    private BigDecimal procurementInTransit;

    /** 本地库存 */
    @Excel(name = "本地库存")
    private BigDecimal localInventory;

    /** 可售 */
    @Excel(name = "可售")
    private BigDecimal available;

    /** 待入库 */
    @Excel(name = "待入库")
    private BigDecimal awaitingStock;

    /** 库存SKU */
    @Excel(name = "库存SKU")
    private String sku;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehouseName;

    /** 库存警戒天数 */
    @Excel(name = "库存警戒天数")
    private BigDecimal stockWarningDays;

    /** AM-季节性产品-淡季【扩展属性】 */
    @Excel(name = "AM-季节性产品-淡季【扩展属性】")
    private String amSeasonalProductOffseason;

    /** AM-季节性产品-旺季上升比例【扩展属性】 */
    @Excel(name = "AM-季节性产品-旺季上升比例【扩展属性】")
    private String amSeasonalProductPeakIncreaseRatio;

    /** AM-季节性产品-旺季【扩展属性】 */
    @Excel(name = "AM-季节性产品-旺季【扩展属性】")
    private String amSeasonalProductPeak;

    /** AM-竞对销量【扩展属性】 */
    @Excel(name = "AM-竞对销量【扩展属性】")
    private String amCompetitorSales;

    /** AM-市场容量【扩展属性】 */
    @Excel(name = "AM-市场容量【扩展属性】")
    private String amMarketCapacity;

    /** AM-产品生命周期状态【扩展属性】 */
    @Excel(name = "AM-产品生命周期状态【扩展属性】")
    private String amProductLifecycleStatus;

    /** AM-季节性产品-淡季下滑比例【扩展属性】 */
    @Excel(name = "AM-季节性产品-淡季下滑比例【扩展属性】")
    private String amSeasonalProductOffseasonDecline;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 最新采购价 */
    @Excel(name = "最新采购价")
    private BigDecimal latestPurchasePrice;

    /** 重量 */
    @Excel(name = "重量")
    private BigDecimal weight;

    /** 体积(cm³) */
    @Excel(name = "体积(cm³)")
    private BigDecimal volumeCm3;

    /** 仓库最小采购量 */
    @Excel(name = "仓库最小采购量")
    private BigDecimal minPurchaseQuantity;

    /** AMZ-库存上架时间【扩展属性】 */
    @Excel(name = "AMZ-库存上架时间【扩展属性】")
    private Date amzInventoryShelfTime;
    private Date beginTime; // 新增开始时间
    private Date endTime;   // 新增结束时间

    /** 重塑人【扩展属性】 */
    @Excel(name = "重塑人【扩展属性】")
    private String reshaper;

    /** 重塑【扩展属性】 */
    @Excel(name = "重塑【扩展属性】")
    private String reshaping;

    /** 在途 */
    @Excel(name = "在途")
    private BigDecimal inTransit;

    /** 可售天数 */
    @Excel(name = "可售天数")
    private BigDecimal availableDays;

    /** 采购天数 */
    @Excel(name = "采购天数")
    private BigDecimal procurementDays;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 预留 */
    @Excel(name = "预留")
    private BigDecimal reserved;

    /** 计划入库 */
    @Excel(name = "计划入库")
    private BigDecimal plannedStockIn;

    /** 销售员 */
    @Excel(name = "销售员")
    private String salesPerson;

    /** 开发员 */
    @Excel(name = "开发员")
    private String developer;

    /** 上架时间 */
    @Excel(name = "上架时间")
    private String listingDate;

    /** 是否删除 */
    // @Excel(name = "是否删除")
    private Integer isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    // @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 记录当天有没有新增过记录 */
    // @Excel(name = "记录当天有没有新增过记录")
    private Long version;

    /** （计算字段）本地库存总额 */
    @Excel(name = "本地库存总额")
    private BigDecimal totalLocalInventoryValue;

    /** （计算字段）FBA库存总额 */
    @Excel(name = "FBA库存总额")
    private BigDecimal totalFbaInventoryValue;

    /** （计算字段）库存金额总计 */
    @Excel(name = "库存金额总计", readConverterExp = "计=算字段")
    private BigDecimal totalInventoryValue;

    /** （计算字段）周转天数 */
    @Excel(name = "周转天数", readConverterExp = "计=算字段")
    private BigDecimal turnoverDays;

    // TODO 这里还需要确认数据库连接
    private BigDecimal turnoverDaysMin; // 最小周转天数
    private BigDecimal turnoverDaysMax; // 最大周转天数
    private String turnoverRange; // 最大周转天数

    /** （计算字段）FBA周转天数 */
    @Excel(name = "FBA周转天数", readConverterExp = "计=算字段")
    private BigDecimal fbaTurnoverDays;

    /** （计算字段）库存个数总计 */
    @Excel(name = "库存个数总计", readConverterExp = "计=算字段")
    private Long totalInventoryCount;

    /** （运营分析表）销量 */
    @Excel(name = "船长销量", readConverterExp = "运=营分析表")
    private String sales;

    /** （运营分析表）销售额 */
    @Excel(name = "船长销售额", readConverterExp = "运=营分析表")
    private String salesAmount;

    /** （运营分析表）毛利润 */
    @Excel(name = "船长毛利润", readConverterExp = "运=营分析表")
    private String grossProfit;

    /** 店铺名称数组 */
    private String[] storeNameArray;

    /** 销售员数组 */
    private String[] salesPersonArray;

    /** 开发员数组 */
    private String[] developerArray;

    /** 增加对比时间，开始时间 */
    private String startDate;

    /** 增加对比时间，开始时间 */
    private String endDate;

    /** 当前数据的时间 */
    private String currentDate;

    /** 对比开始时间 */
    private String compareStartDate;

    /** 对比结束时间 */
    private String compareEndDate;
}
