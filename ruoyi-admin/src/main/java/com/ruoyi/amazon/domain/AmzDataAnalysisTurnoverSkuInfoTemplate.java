package com.ruoyi.amazon.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 amz_data_analysis_turnover_sku_info_template
 *
 * @author ruoyi
 * @date 2025-03-03
 */
@Getter
@Setter
public class AmzDataAnalysisTurnoverSkuInfoTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

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

    /** 采购天数 */
    @Excel(name = "采购天数")
    private BigDecimal procurementDays;

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
    private String amzInventoryShelfTime;

    /** 重塑人【扩展属性】 */
    @Excel(name = "重塑人【扩展属性】")
    private String reshaper;

    /** 重塑【扩展属性】 */
    @Excel(name = "重塑【扩展属性】")
    private String reshaping;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 是否删除 */
    private Integer isDelete;

    /** 记录当天有没有新增过记录 */
    private Long version;

}
