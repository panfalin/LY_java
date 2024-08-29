package com.ruoyi.amzlog.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * amzlog对象 asin_sku_analysis
 * 
 * @author ruoyi
 * @date 2024-08-29
 */
public class AsinSkuAnalysis extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 亚马逊标准识别号 */
    @Excel(name = "亚马逊标准识别号")
    private String ASIN;

    /** 马帮SKU */
    @Excel(name = "马帮SKU")
    private String MSKU;

    /** 销售部门 */
    @Excel(name = "销售部门")
    private String Sales;

    /** 开发部门 */
    @Excel(name = "开发部门")
    private String Development;

    /** 美工部门 */
    @Excel(name = "美工部门")
    private String Designer;

    /** 上架时间 */
    @Excel(name = "上架时间")
    private String ListingDate;

    /** 自定义标签 */
    @Excel(name = "自定义标签")
    private String CustomTags;

    /** SKU更新日志 */
    @Excel(name = "SKU更新日志")
    private String SKULog;

    /** 状态（时间-销量-库存） */
    @Excel(name = "状态", readConverterExp = "时=间-销量-库存")
    private String Status;

    /** 分析类别 */
    @Excel(name = "分析类别")
    private String AnalysisCategory;

    /** 分析内容 */
    @Excel(name = "分析内容")
    private String AnalysisContent;

    /** 动作内容 */
    @Excel(name = "动作内容")
    private String ActionContent;

    /** 竞对ASIN */
    @Excel(name = "竞对ASIN")
    private String CompetitorASIN;

    /** 竞对品牌 */
    @Excel(name = "竞对品牌")
    private String CompetitorBrand;

    /** 竞对小类目排名 */
    @Excel(name = "竞对小类目排名")
    private String CompetitorSubRank;

    /** 竞对大类目排名 */
    @Excel(name = "竞对大类目排名")
    private String CompetitorMainRank;

    /** 竞对月均销量 */
    @Excel(name = "竞对月均销量")
    private String CompetitorMonthlySales;

    /** 竞对日均销量 */
    @Excel(name = "竞对日均销量")
    private String CompetitorDailySales;

    /** 竞对售价 */
    @Excel(name = "竞对售价")
    private String CompetitorPrice;

    /** 竞对毛利率 */
    @Excel(name = "竞对毛利率")
    private String CompetitorGrossMargin;

    /** 竞对日均毛利 */
    @Excel(name = "竞对日均毛利")
    private String CompetitorDailyProfit;

    /** 竞对变体（非标） */
    @Excel(name = "竞对变体", readConverterExp = "非=标")
    private String CompetitorVariants;

    /** 竞对上架日期 */
    @Excel(name = "竞对上架日期")
    private String CompetitorListingDate;

    /** 竞对评论数 */
    @Excel(name = "竞对评论数")
    private String CompetitorReviews;

    /** 竞对星级评分 */
    @Excel(name = "竞对星级评分")
    private String CompetitorRating;

    /** 竞对文案质量 */
    @Excel(name = "竞对文案质量")
    private String CompetitorCopyQuality;

    /** 竞对是否重铺 */
    @Excel(name = "竞对是否重铺")
    private String CompetitorRelisting;

    /** 竞对ASIN-2 */
    @Excel(name = "竞对ASIN-2")
    private String CompetitorASIN2;

    /** 市场月容量 */
    @Excel(name = "市场月容量")
    private String MarketMonthlyCapacity;

    /** 目标日均销量 */
    @Excel(name = "目标日均销量")
    private String TargetDailySales;

    /** 目标售价 */
    @Excel(name = "目标售价")
    private String TargetPrice;

    /** 目标日均销售额 */
    @Excel(name = "目标日均销售额")
    private String TargetDailyRevenue;

    /** 目标毛利率 */
    @Excel(name = "目标毛利率")
    private String TargetGrossMargin;

    /** 目标日利润 */
    @Excel(name = "目标日利润")
    private String TargetDailyProfit;

    /** 目标小类目排名 */
    @Excel(name = "目标小类目排名")
    private String TargetSubRank;

    /** 目标大类目排名 */
    @Excel(name = "目标大类目排名")
    private String TargetMainRank;

    /** 目标资金使用率 */
    @Excel(name = "目标资金使用率")
    private String TargetCapitalUtilization;

    /** 上一个月利润 */
    @Excel(name = "上一个月利润")
    private String LastMonthProfit;

    /** 上月日均利润 */
    @Excel(name = "上月日均利润")
    private String LastMonthDailyProfit;

    /** 近30天目标总利润 */
    @Excel(name = "近30天目标总利润")
    private String TargetLast30DaysTotalProfit;

    /** 近30天实际总利润 */
    @Excel(name = "近30天实际总利润")
    private String ActualLast30DaysTotalProfit;

    /** 近14天实际总利润 */
    @Excel(name = "近14天实际总利润")
    private String ActualLast14DaysTotalProfit;

    /** 近7天实际总利润 */
    @Excel(name = "近7天实际总利润")
    private String ActualLast7DaysTotalProfit;

    /** 近30天总库存金额 */
    @Excel(name = "近30天总库存金额")
    private String TotalInventoryAmountLast30Days;

    /** 近30天资金利用率（月利润/月均总库存） */
    @Excel(name = "近30天资金利用率", readConverterExp = "月=利润/月均总库存")
    private String CapitalUtilizationLast30Days;

    /** 近7天销量 */
    @Excel(name = "近7天销量")
    private String ActualLast7DaysSales;

    /** 上个月总销售额 */
    @Excel(name = "上个月总销售额")
    private String LastMonthTotalSales;

    /** 上月日均销售额 */
    @Excel(name = "上月日均销售额")
    private String LastMonthDailySales;

    /** 近30天目标销售额 */
    @Excel(name = "近30天目标销售额")
    private String TargetLast30DaysTotalSales;

    /** 近30天实际销售额 */
    @Excel(name = "近30天实际销售额")
    private String ActualLast30DaysTotalSales;

    /** 近14天实际销售额 */
    @Excel(name = "近14天实际销售额")
    private String ActualLast14DaysTotalSales;

    /** 近7天实际销售额 */
    @Excel(name = "近7天实际销售额")
    private String ActualLast7DaysTotalSales;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview;

    /** 上个月利润率 */
    @Excel(name = "上个月利润率")
    private String LastMonthProfitRate;

    /** 近30天目标利润率 */
    @Excel(name = "近30天目标利润率")
    private String TargetLast30DaysProfitRate;

    /** 近30天利润率 */
    @Excel(name = "近30天利润率")
    private String ActualLast30DaysProfitRate;

    /** 近14天利润率 */
    @Excel(name = "近14天利润率")
    private String ActualLast14DaysProfitRate;

    /** 近7天利润率 */
    @Excel(name = "近7天利润率")
    private String ActualLast7DaysProfitRate;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview2;

    /** 上个月月库存周转天数（上个月表格读取FBA库存天数） */
    @Excel(name = "上个月月库存周转天数", readConverterExp = "上=个月表格读取FBA库存天数")
    private String LastMonthInventoryTurnoverDays;

    /** 当月目标库存周转天数（目标表格读取） */
    @Excel(name = "当月目标库存周转天数", readConverterExp = "目=标表格读取")
    private String CurrentTargetInventoryTurnoverDays;

    /** 近7天周转天数库存（近7天表格读取FBA库存天数） */
    @Excel(name = "近7天周转天数库存", readConverterExp = "近=7天表格读取FBA库存天数")
    private String ActualLast7DaysInventoryTurnoverDays;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview3;

    /** 近14天广告计划-预算（目标表格读取） */
    @Excel(name = "近14天广告计划-预算", readConverterExp = "目=标表格读取")
    private String TargetLast14DaysAdBudget;

    /** 近14天广告实际消耗 */
    @Excel(name = "近14天广告实际消耗")
    private String ActualLast14DaysAdSpending;

    /** 近30天总广告花费 */
    @Excel(name = "近30天总广告花费")
    private String TotalAdSpendingLast30Days;

    /** 上一个月广告花费占比 */
    @Excel(name = "上一个月广告花费占比")
    private String LastMonthAdSpendingRatio;

    /** 30天【目标】广告花费占比 */
    @Excel(name = "30天【目标】广告花费占比")
    private String TargetLast30DaysAdSpendingRatio;

    /** 近30天广告花费占比 */
    @Excel(name = "近30天广告花费占比")
    private String ActualLast30DaysAdSpendingRatio;

    /** 近14天广告花费占比 */
    @Excel(name = "近14天广告花费占比")
    private String ActualLast14DaysAdSpendingRatio;

    /** 近7天广告花费占比 */
    @Excel(name = "近7天广告花费占比")
    private String ActualLast7DaysAdSpendingRatio;

    /** 近30天广告曝光 */
    @Excel(name = "近30天广告曝光")
    private String TotalAdExposureLast30Days;

    /** 近14天广告曝光 */
    @Excel(name = "近14天广告曝光")
    private String TotalAdExposureLast14Days;

    /** 近7天广告曝光 */
    @Excel(name = "近7天广告曝光")
    private String TotalAdExposureLast7Days;

    /** 近30天广告点击量 */
    @Excel(name = "近30天广告点击量")
    private String TotalAdClicksLast30Days;

    /** 近14天广告点击量 */
    @Excel(name = "近14天广告点击量")
    private String TotalAdClicksLast14Days;

    /** 近7天广告点击量 */
    @Excel(name = "近7天广告点击量")
    private String TotalAdClicksLast7Days;

    /** 近30天广告转化率 */
    @Excel(name = "近30天广告转化率")
    private String AdConversionRateLast30Days;

    /** 近14天广告转化率 */
    @Excel(name = "近14天广告转化率")
    private String AdConversionRateLast14Days;

    /** 近7天广告转化率 */
    @Excel(name = "近7天广告转化率")
    private String AdConversionRateLast7Days;

    /** 近30天ACOS */
    @Excel(name = "近30天ACOS")
    private String ACOSLast30Days;

    /** 近14天ACOS */
    @Excel(name = "近14天ACOS")
    private String ACOSLast14Days;

    /** 近7天ACOS */
    @Excel(name = "近7天ACOS")
    private String ACOSLast7Days;

    /** 近30天目标ACOS */
    @Excel(name = "近30天目标ACOS")
    private String TargetACOSLast30Days;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview4;

    /** 上一个月总页面浏览次数 */
    @Excel(name = "上一个月总页面浏览次数")
    private String TotalPageViewsLastMonth;

    /** 近30天目标页面浏览次数 */
    @Excel(name = "近30天目标页面浏览次数")
    private String TargetTotalPageViewsLast30Days;

    /** 近30天页面浏览次数 */
    @Excel(name = "近30天页面浏览次数")
    private String ActualTotalPageViewsLast30Days;

    /** 近14天页面浏览次数 */
    @Excel(name = "近14天页面浏览次数")
    private String ActualTotalPageViewsLast14Days;

    /** 近7天页面浏览次数 */
    @Excel(name = "近7天页面浏览次数")
    private String ActualTotalPageViewsLast7Days;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview5;

    /** 上个月总转化率 */
    @Excel(name = "上个月总转化率")
    private String ConversionRateLastMonth;

    /** 近30天目标总转化率 */
    @Excel(name = "近30天目标总转化率")
    private String TargetTotalConversionRateLast30Days;

    /** 近30天总转化率 */
    @Excel(name = "近30天总转化率")
    private String ActualTotalConversionRateLast30Days;

    /** 近14天总转化率 */
    @Excel(name = "近14天总转化率")
    private String ActualTotalConversionRateLast14Days;

    /** 近7天总转化率 */
    @Excel(name = "近7天总转化率")
    private String ActualTotalConversionRateLast7Days;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview6;

    /** SP广告（是/否） */
    @Excel(name = "SP广告", readConverterExp = "是=/否")
    private String SPAd;

    /** 近30天广告ROI */
    @Excel(name = "近30天广告ROI")
    private String ROILast30DaysSPAd;

    /** 近14天广告花费占比 */
    @Excel(name = "近14天广告花费占比")
    private String ROILast14DaysSPAd;

    /** 近30天广告曝光 */
    @Excel(name = "近30天广告曝光")
    private String TotalAdExposureLast30DaysSPAd;

    /** 近14天广告曝光 */
    @Excel(name = "近14天广告曝光")
    private String TotalAdExposureLast14DaysSPAd;

    /** 近30天广告点击量 */
    @Excel(name = "近30天广告点击量")
    private String TotalAdClicksLast30DaysSPAd;

    /** 近14天广告点击量 */
    @Excel(name = "近14天广告点击量")
    private String TotalAdClicksLast14DaysSPAd;

    /** 近30天广告转化率 */
    @Excel(name = "近30天广告转化率")
    private String AdConversionRateLast30DaysSPAd;

    /** 近14天广告转化率 */
    @Excel(name = "近14天广告转化率")
    private String AdConversionRateLast14DaysSPAd;

    /** 近30天ACOS */
    @Excel(name = "近30天ACOS")
    private String ACOSLast30DaysSPAd;

    /** 近14天ACOS */
    @Excel(name = "近14天ACOS")
    private String ACOSLast14DaysSPAd;

    /** SP分析-执行-复盘 */
    @Excel(name = "SP分析-执行-复盘")
    private String AnalysisExecutionReviewSPAd;

    /** SD广告（是/否） */
    @Excel(name = "SD广告", readConverterExp = "是=/否")
    private String SDAd;

    /** 近30天广告ROI */
    @Excel(name = "近30天广告ROI")
    private String ROILast30DaysSDAd;

    /** 近14天广告花费占比 */
    @Excel(name = "近14天广告花费占比")
    private String ROILast14DaysSDAd;

    /** 近30天广告曝光 */
    @Excel(name = "近30天广告曝光")
    private String TotalAdExposureLast30DaysSDAd;

    /** 近14天广告曝光 */
    @Excel(name = "近14天广告曝光")
    private String TotalAdExposureLast14DaysSDAd;

    /** 近30天广告点击量 */
    @Excel(name = "近30天广告点击量")
    private String TotalAdClicksLast30DaysSDAd;

    /** 近14天广告点击量 */
    @Excel(name = "近14天广告点击量")
    private String TotalAdClicksLast14DaysSDAd;

    /** 近30天广告转化率 */
    @Excel(name = "近30天广告转化率")
    private String AdConversionRateLast30DaysSDAd;

    /** 近14天广告转化率 */
    @Excel(name = "近14天广告转化率")
    private String AdConversionRateLast14DaysSDAd;

    /** 近30天ACOS */
    @Excel(name = "近30天ACOS")
    private String ACOSLast30DaysSDAd;

    /** 近14天ACOS */
    @Excel(name = "近14天ACOS")
    private String ACOSLast14DaysSDAd;

    /** SD分析-执行-复盘 */
    @Excel(name = "SD分析-执行-复盘")
    private String AnalysisExecutionReviewSDAd;

    /** SB广告（是/否） */
    @Excel(name = "SB广告", readConverterExp = "是=/否")
    private String SBad;

    /** 近30天广告ROI */
    @Excel(name = "近30天广告ROI")
    private String ROILast30DaysSBad;

    /** 近14天广告花费占比 */
    @Excel(name = "近14天广告花费占比")
    private String ROILast14DaysSBad;

    /** 近30天广告曝光 */
    @Excel(name = "近30天广告曝光")
    private String TotalAdExposureLast30DaysSBad;

    /** 近14天广告曝光 */
    @Excel(name = "近14天广告曝光")
    private String TotalAdExposureLast14DaysSBad;

    /** 近30天广告点击量 */
    @Excel(name = "近30天广告点击量")
    private String TotalAdClicksLast30DaysSBad;

    /** 近14天广告点击量 */
    @Excel(name = "近14天广告点击量")
    private String TotalAdClicksLast14DaysSBad;

    /** 近30天广告转化率 */
    @Excel(name = "近30天广告转化率")
    private String AdConversionRateLast30DaysSBad;

    /** 近14天广告转化率 */
    @Excel(name = "近14天广告转化率")
    private String AdConversionRateLast14DaysSBad;

    /** 近30天ACOS */
    @Excel(name = "近30天ACOS")
    private String ACOSLast30DaysSBad;

    /** 近14天ACOS */
    @Excel(name = "近14天ACOS")
    private String ACOSLast14DaysSBad;

    /** SB分析-执行-复盘 */
    @Excel(name = "SB分析-执行-复盘")
    private String AnalysisExecutionReviewSBad;

    /** 上个月退款率 */
    @Excel(name = "上个月退款率")
    private String RefundRateLastMonth;

    /** 近30天目标退款率 */
    @Excel(name = "近30天目标退款率")
    private String TargetRefundRateLast30Days;

    /** 近30天退款率 */
    @Excel(name = "近30天退款率")
    private String ActualRefundRateLast30Days;

    /** 近14天退款率 */
    @Excel(name = "近14天退款率")
    private String ActualRefundRateLast14Days;

    /** 近7天退款率 */
    @Excel(name = "近7天退款率")
    private String ActualRefundRateLast7Days;

    /** 分析-执行-复盘 */
    @Excel(name = "分析-执行-复盘")
    private String AnalysisExecutionReview7;

    /** 上架是否大于3个月(90天) */
    @Excel(name = "上架是否大于3个月(90天)")
    private String ListingAgeMoreThan3Months;

    /** 动销 */
    @Excel(name = "动销")
    private String SalesVelocity;

    /** 上月广告花费 */
    @Excel(name = "上月广告花费")
    private String AdSpendingLastMonth;

    /** 上月广告销售额 */
    @Excel(name = "上月广告销售额")
    private String AdSalesLastMonth;

    /** 上月广告ROI */
    @Excel(name = "上月广告ROI")
    private String ROILastMonth;

    /** 本地库存 */
    @Excel(name = "本地库存")
    private String LocalInventory;

    /** 本地采购在途 */
    @Excel(name = "本地采购在途")
    private String LocalProcurementInTransit;

    /** FBA可售库存 */
    @Excel(name = "FBA可售库存")
    private String FBASellableInventory;

    /** FBA在途库存 */
    @Excel(name = "FBA在途库存")
    private String FBAInTransitInventory;

    /** 本地库存金额 */
    @Excel(name = "本地库存金额")
    private String LocalInventoryValue;

    /** 本地采购在途金额 */
    @Excel(name = "本地采购在途金额")
    private String LocalProcurementInTransitValue;

    /** FBA可售库存金额 */
    @Excel(name = "FBA可售库存金额")
    private String FBASellableInventoryValue;

    /** FBA在途库存金额 */
    @Excel(name = "FBA在途库存金额")
    private String FBAInTransitInventoryValue;

    /** 总库存金额 */
    @Excel(name = "总库存金额")
    private String TotalInventoryValue;

    /** 上月资金利用率 */
    @Excel(name = "上月资金利用率")
    private String CapitalUtilizationLastMonth;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Long isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setASIN(String ASIN) 
    {
        this.ASIN = ASIN;
    }

    public String getASIN() 
    {
        return ASIN;
    }
    public void setMSKU(String MSKU) 
    {
        this.MSKU = MSKU;
    }

    public String getMSKU() 
    {
        return MSKU;
    }
    public void setSales(String Sales) 
    {
        this.Sales = Sales;
    }

    public String getSales() 
    {
        return Sales;
    }
    public void setDevelopment(String Development) 
    {
        this.Development = Development;
    }

    public String getDevelopment() 
    {
        return Development;
    }
    public void setDesigner(String Designer) 
    {
        this.Designer = Designer;
    }

    public String getDesigner() 
    {
        return Designer;
    }
    public void setListingDate(String ListingDate) 
    {
        this.ListingDate = ListingDate;
    }

    public String getListingDate() 
    {
        return ListingDate;
    }
    public void setCustomTags(String CustomTags) 
    {
        this.CustomTags = CustomTags;
    }

    public String getCustomTags() 
    {
        return CustomTags;
    }
    public void setSKULog(String SKULog) 
    {
        this.SKULog = SKULog;
    }

    public String getSKULog() 
    {
        return SKULog;
    }
    public void setStatus(String Status) 
    {
        this.Status = Status;
    }

    public String getStatus() 
    {
        return Status;
    }
    public void setAnalysisCategory(String AnalysisCategory) 
    {
        this.AnalysisCategory = AnalysisCategory;
    }

    public String getAnalysisCategory() 
    {
        return AnalysisCategory;
    }
    public void setAnalysisContent(String AnalysisContent) 
    {
        this.AnalysisContent = AnalysisContent;
    }

    public String getAnalysisContent() 
    {
        return AnalysisContent;
    }
    public void setActionContent(String ActionContent) 
    {
        this.ActionContent = ActionContent;
    }

    public String getActionContent() 
    {
        return ActionContent;
    }
    public void setCompetitorASIN(String CompetitorASIN) 
    {
        this.CompetitorASIN = CompetitorASIN;
    }

    public String getCompetitorASIN() 
    {
        return CompetitorASIN;
    }
    public void setCompetitorBrand(String CompetitorBrand) 
    {
        this.CompetitorBrand = CompetitorBrand;
    }

    public String getCompetitorBrand() 
    {
        return CompetitorBrand;
    }
    public void setCompetitorSubRank(String CompetitorSubRank) 
    {
        this.CompetitorSubRank = CompetitorSubRank;
    }

    public String getCompetitorSubRank() 
    {
        return CompetitorSubRank;
    }
    public void setCompetitorMainRank(String CompetitorMainRank) 
    {
        this.CompetitorMainRank = CompetitorMainRank;
    }

    public String getCompetitorMainRank() 
    {
        return CompetitorMainRank;
    }
    public void setCompetitorMonthlySales(String CompetitorMonthlySales) 
    {
        this.CompetitorMonthlySales = CompetitorMonthlySales;
    }

    public String getCompetitorMonthlySales() 
    {
        return CompetitorMonthlySales;
    }
    public void setCompetitorDailySales(String CompetitorDailySales) 
    {
        this.CompetitorDailySales = CompetitorDailySales;
    }

    public String getCompetitorDailySales() 
    {
        return CompetitorDailySales;
    }
    public void setCompetitorPrice(String CompetitorPrice) 
    {
        this.CompetitorPrice = CompetitorPrice;
    }

    public String getCompetitorPrice() 
    {
        return CompetitorPrice;
    }
    public void setCompetitorGrossMargin(String CompetitorGrossMargin) 
    {
        this.CompetitorGrossMargin = CompetitorGrossMargin;
    }

    public String getCompetitorGrossMargin() 
    {
        return CompetitorGrossMargin;
    }
    public void setCompetitorDailyProfit(String CompetitorDailyProfit) 
    {
        this.CompetitorDailyProfit = CompetitorDailyProfit;
    }

    public String getCompetitorDailyProfit() 
    {
        return CompetitorDailyProfit;
    }
    public void setCompetitorVariants(String CompetitorVariants) 
    {
        this.CompetitorVariants = CompetitorVariants;
    }

    public String getCompetitorVariants() 
    {
        return CompetitorVariants;
    }
    public void setCompetitorListingDate(String CompetitorListingDate) 
    {
        this.CompetitorListingDate = CompetitorListingDate;
    }

    public String getCompetitorListingDate() 
    {
        return CompetitorListingDate;
    }
    public void setCompetitorReviews(String CompetitorReviews) 
    {
        this.CompetitorReviews = CompetitorReviews;
    }

    public String getCompetitorReviews() 
    {
        return CompetitorReviews;
    }
    public void setCompetitorRating(String CompetitorRating) 
    {
        this.CompetitorRating = CompetitorRating;
    }

    public String getCompetitorRating() 
    {
        return CompetitorRating;
    }
    public void setCompetitorCopyQuality(String CompetitorCopyQuality) 
    {
        this.CompetitorCopyQuality = CompetitorCopyQuality;
    }

    public String getCompetitorCopyQuality() 
    {
        return CompetitorCopyQuality;
    }
    public void setCompetitorRelisting(String CompetitorRelisting) 
    {
        this.CompetitorRelisting = CompetitorRelisting;
    }

    public String getCompetitorRelisting() 
    {
        return CompetitorRelisting;
    }
    public void setCompetitorASIN2(String CompetitorASIN2) 
    {
        this.CompetitorASIN2 = CompetitorASIN2;
    }

    public String getCompetitorASIN2() 
    {
        return CompetitorASIN2;
    }
    public void setMarketMonthlyCapacity(String MarketMonthlyCapacity) 
    {
        this.MarketMonthlyCapacity = MarketMonthlyCapacity;
    }

    public String getMarketMonthlyCapacity() 
    {
        return MarketMonthlyCapacity;
    }
    public void setTargetDailySales(String TargetDailySales) 
    {
        this.TargetDailySales = TargetDailySales;
    }

    public String getTargetDailySales() 
    {
        return TargetDailySales;
    }
    public void setTargetPrice(String TargetPrice) 
    {
        this.TargetPrice = TargetPrice;
    }

    public String getTargetPrice() 
    {
        return TargetPrice;
    }
    public void setTargetDailyRevenue(String TargetDailyRevenue) 
    {
        this.TargetDailyRevenue = TargetDailyRevenue;
    }

    public String getTargetDailyRevenue() 
    {
        return TargetDailyRevenue;
    }
    public void setTargetGrossMargin(String TargetGrossMargin) 
    {
        this.TargetGrossMargin = TargetGrossMargin;
    }

    public String getTargetGrossMargin() 
    {
        return TargetGrossMargin;
    }
    public void setTargetDailyProfit(String TargetDailyProfit) 
    {
        this.TargetDailyProfit = TargetDailyProfit;
    }

    public String getTargetDailyProfit() 
    {
        return TargetDailyProfit;
    }
    public void setTargetSubRank(String TargetSubRank) 
    {
        this.TargetSubRank = TargetSubRank;
    }

    public String getTargetSubRank() 
    {
        return TargetSubRank;
    }
    public void setTargetMainRank(String TargetMainRank) 
    {
        this.TargetMainRank = TargetMainRank;
    }

    public String getTargetMainRank() 
    {
        return TargetMainRank;
    }
    public void setTargetCapitalUtilization(String TargetCapitalUtilization) 
    {
        this.TargetCapitalUtilization = TargetCapitalUtilization;
    }

    public String getTargetCapitalUtilization() 
    {
        return TargetCapitalUtilization;
    }
    public void setLastMonthProfit(String LastMonthProfit) 
    {
        this.LastMonthProfit = LastMonthProfit;
    }

    public String getLastMonthProfit() 
    {
        return LastMonthProfit;
    }
    public void setLastMonthDailyProfit(String LastMonthDailyProfit) 
    {
        this.LastMonthDailyProfit = LastMonthDailyProfit;
    }

    public String getLastMonthDailyProfit() 
    {
        return LastMonthDailyProfit;
    }
    public void setTargetLast30DaysTotalProfit(String TargetLast30DaysTotalProfit) 
    {
        this.TargetLast30DaysTotalProfit = TargetLast30DaysTotalProfit;
    }

    public String getTargetLast30DaysTotalProfit() 
    {
        return TargetLast30DaysTotalProfit;
    }
    public void setActualLast30DaysTotalProfit(String ActualLast30DaysTotalProfit) 
    {
        this.ActualLast30DaysTotalProfit = ActualLast30DaysTotalProfit;
    }

    public String getActualLast30DaysTotalProfit() 
    {
        return ActualLast30DaysTotalProfit;
    }
    public void setActualLast14DaysTotalProfit(String ActualLast14DaysTotalProfit) 
    {
        this.ActualLast14DaysTotalProfit = ActualLast14DaysTotalProfit;
    }

    public String getActualLast14DaysTotalProfit() 
    {
        return ActualLast14DaysTotalProfit;
    }
    public void setActualLast7DaysTotalProfit(String ActualLast7DaysTotalProfit) 
    {
        this.ActualLast7DaysTotalProfit = ActualLast7DaysTotalProfit;
    }

    public String getActualLast7DaysTotalProfit() 
    {
        return ActualLast7DaysTotalProfit;
    }
    public void setTotalInventoryAmountLast30Days(String TotalInventoryAmountLast30Days) 
    {
        this.TotalInventoryAmountLast30Days = TotalInventoryAmountLast30Days;
    }

    public String getTotalInventoryAmountLast30Days() 
    {
        return TotalInventoryAmountLast30Days;
    }
    public void setCapitalUtilizationLast30Days(String CapitalUtilizationLast30Days) 
    {
        this.CapitalUtilizationLast30Days = CapitalUtilizationLast30Days;
    }

    public String getCapitalUtilizationLast30Days() 
    {
        return CapitalUtilizationLast30Days;
    }
    public void setActualLast7DaysSales(String ActualLast7DaysSales) 
    {
        this.ActualLast7DaysSales = ActualLast7DaysSales;
    }

    public String getActualLast7DaysSales() 
    {
        return ActualLast7DaysSales;
    }
    public void setLastMonthTotalSales(String LastMonthTotalSales) 
    {
        this.LastMonthTotalSales = LastMonthTotalSales;
    }

    public String getLastMonthTotalSales() 
    {
        return LastMonthTotalSales;
    }
    public void setLastMonthDailySales(String LastMonthDailySales) 
    {
        this.LastMonthDailySales = LastMonthDailySales;
    }

    public String getLastMonthDailySales() 
    {
        return LastMonthDailySales;
    }
    public void setTargetLast30DaysTotalSales(String TargetLast30DaysTotalSales) 
    {
        this.TargetLast30DaysTotalSales = TargetLast30DaysTotalSales;
    }

    public String getTargetLast30DaysTotalSales() 
    {
        return TargetLast30DaysTotalSales;
    }
    public void setActualLast30DaysTotalSales(String ActualLast30DaysTotalSales) 
    {
        this.ActualLast30DaysTotalSales = ActualLast30DaysTotalSales;
    }

    public String getActualLast30DaysTotalSales() 
    {
        return ActualLast30DaysTotalSales;
    }
    public void setActualLast14DaysTotalSales(String ActualLast14DaysTotalSales) 
    {
        this.ActualLast14DaysTotalSales = ActualLast14DaysTotalSales;
    }

    public String getActualLast14DaysTotalSales() 
    {
        return ActualLast14DaysTotalSales;
    }
    public void setActualLast7DaysTotalSales(String ActualLast7DaysTotalSales) 
    {
        this.ActualLast7DaysTotalSales = ActualLast7DaysTotalSales;
    }

    public String getActualLast7DaysTotalSales() 
    {
        return ActualLast7DaysTotalSales;
    }
    public void setAnalysisExecutionReview(String AnalysisExecutionReview) 
    {
        this.AnalysisExecutionReview = AnalysisExecutionReview;
    }

    public String getAnalysisExecutionReview() 
    {
        return AnalysisExecutionReview;
    }
    public void setLastMonthProfitRate(String LastMonthProfitRate) 
    {
        this.LastMonthProfitRate = LastMonthProfitRate;
    }

    public String getLastMonthProfitRate() 
    {
        return LastMonthProfitRate;
    }
    public void setTargetLast30DaysProfitRate(String TargetLast30DaysProfitRate) 
    {
        this.TargetLast30DaysProfitRate = TargetLast30DaysProfitRate;
    }

    public String getTargetLast30DaysProfitRate() 
    {
        return TargetLast30DaysProfitRate;
    }
    public void setActualLast30DaysProfitRate(String ActualLast30DaysProfitRate) 
    {
        this.ActualLast30DaysProfitRate = ActualLast30DaysProfitRate;
    }

    public String getActualLast30DaysProfitRate() 
    {
        return ActualLast30DaysProfitRate;
    }
    public void setActualLast14DaysProfitRate(String ActualLast14DaysProfitRate) 
    {
        this.ActualLast14DaysProfitRate = ActualLast14DaysProfitRate;
    }

    public String getActualLast14DaysProfitRate() 
    {
        return ActualLast14DaysProfitRate;
    }
    public void setActualLast7DaysProfitRate(String ActualLast7DaysProfitRate) 
    {
        this.ActualLast7DaysProfitRate = ActualLast7DaysProfitRate;
    }

    public String getActualLast7DaysProfitRate() 
    {
        return ActualLast7DaysProfitRate;
    }
    public void setAnalysisExecutionReview2(String AnalysisExecutionReview2) 
    {
        this.AnalysisExecutionReview2 = AnalysisExecutionReview2;
    }

    public String getAnalysisExecutionReview2() 
    {
        return AnalysisExecutionReview2;
    }
    public void setLastMonthInventoryTurnoverDays(String LastMonthInventoryTurnoverDays) 
    {
        this.LastMonthInventoryTurnoverDays = LastMonthInventoryTurnoverDays;
    }

    public String getLastMonthInventoryTurnoverDays() 
    {
        return LastMonthInventoryTurnoverDays;
    }
    public void setCurrentTargetInventoryTurnoverDays(String CurrentTargetInventoryTurnoverDays) 
    {
        this.CurrentTargetInventoryTurnoverDays = CurrentTargetInventoryTurnoverDays;
    }

    public String getCurrentTargetInventoryTurnoverDays() 
    {
        return CurrentTargetInventoryTurnoverDays;
    }
    public void setActualLast7DaysInventoryTurnoverDays(String ActualLast7DaysInventoryTurnoverDays) 
    {
        this.ActualLast7DaysInventoryTurnoverDays = ActualLast7DaysInventoryTurnoverDays;
    }

    public String getActualLast7DaysInventoryTurnoverDays() 
    {
        return ActualLast7DaysInventoryTurnoverDays;
    }
    public void setAnalysisExecutionReview3(String AnalysisExecutionReview3) 
    {
        this.AnalysisExecutionReview3 = AnalysisExecutionReview3;
    }

    public String getAnalysisExecutionReview3() 
    {
        return AnalysisExecutionReview3;
    }
    public void setTargetLast14DaysAdBudget(String TargetLast14DaysAdBudget) 
    {
        this.TargetLast14DaysAdBudget = TargetLast14DaysAdBudget;
    }

    public String getTargetLast14DaysAdBudget() 
    {
        return TargetLast14DaysAdBudget;
    }
    public void setActualLast14DaysAdSpending(String ActualLast14DaysAdSpending) 
    {
        this.ActualLast14DaysAdSpending = ActualLast14DaysAdSpending;
    }

    public String getActualLast14DaysAdSpending() 
    {
        return ActualLast14DaysAdSpending;
    }
    public void setTotalAdSpendingLast30Days(String TotalAdSpendingLast30Days) 
    {
        this.TotalAdSpendingLast30Days = TotalAdSpendingLast30Days;
    }

    public String getTotalAdSpendingLast30Days() 
    {
        return TotalAdSpendingLast30Days;
    }
    public void setLastMonthAdSpendingRatio(String LastMonthAdSpendingRatio) 
    {
        this.LastMonthAdSpendingRatio = LastMonthAdSpendingRatio;
    }

    public String getLastMonthAdSpendingRatio() 
    {
        return LastMonthAdSpendingRatio;
    }
    public void setTargetLast30DaysAdSpendingRatio(String TargetLast30DaysAdSpendingRatio) 
    {
        this.TargetLast30DaysAdSpendingRatio = TargetLast30DaysAdSpendingRatio;
    }

    public String getTargetLast30DaysAdSpendingRatio() 
    {
        return TargetLast30DaysAdSpendingRatio;
    }
    public void setActualLast30DaysAdSpendingRatio(String ActualLast30DaysAdSpendingRatio) 
    {
        this.ActualLast30DaysAdSpendingRatio = ActualLast30DaysAdSpendingRatio;
    }

    public String getActualLast30DaysAdSpendingRatio() 
    {
        return ActualLast30DaysAdSpendingRatio;
    }
    public void setActualLast14DaysAdSpendingRatio(String ActualLast14DaysAdSpendingRatio) 
    {
        this.ActualLast14DaysAdSpendingRatio = ActualLast14DaysAdSpendingRatio;
    }

    public String getActualLast14DaysAdSpendingRatio() 
    {
        return ActualLast14DaysAdSpendingRatio;
    }
    public void setActualLast7DaysAdSpendingRatio(String ActualLast7DaysAdSpendingRatio) 
    {
        this.ActualLast7DaysAdSpendingRatio = ActualLast7DaysAdSpendingRatio;
    }

    public String getActualLast7DaysAdSpendingRatio() 
    {
        return ActualLast7DaysAdSpendingRatio;
    }
    public void setTotalAdExposureLast30Days(String TotalAdExposureLast30Days) 
    {
        this.TotalAdExposureLast30Days = TotalAdExposureLast30Days;
    }

    public String getTotalAdExposureLast30Days() 
    {
        return TotalAdExposureLast30Days;
    }
    public void setTotalAdExposureLast14Days(String TotalAdExposureLast14Days) 
    {
        this.TotalAdExposureLast14Days = TotalAdExposureLast14Days;
    }

    public String getTotalAdExposureLast14Days() 
    {
        return TotalAdExposureLast14Days;
    }
    public void setTotalAdExposureLast7Days(String TotalAdExposureLast7Days) 
    {
        this.TotalAdExposureLast7Days = TotalAdExposureLast7Days;
    }

    public String getTotalAdExposureLast7Days() 
    {
        return TotalAdExposureLast7Days;
    }
    public void setTotalAdClicksLast30Days(String TotalAdClicksLast30Days) 
    {
        this.TotalAdClicksLast30Days = TotalAdClicksLast30Days;
    }

    public String getTotalAdClicksLast30Days() 
    {
        return TotalAdClicksLast30Days;
    }
    public void setTotalAdClicksLast14Days(String TotalAdClicksLast14Days) 
    {
        this.TotalAdClicksLast14Days = TotalAdClicksLast14Days;
    }

    public String getTotalAdClicksLast14Days() 
    {
        return TotalAdClicksLast14Days;
    }
    public void setTotalAdClicksLast7Days(String TotalAdClicksLast7Days) 
    {
        this.TotalAdClicksLast7Days = TotalAdClicksLast7Days;
    }

    public String getTotalAdClicksLast7Days() 
    {
        return TotalAdClicksLast7Days;
    }
    public void setAdConversionRateLast30Days(String AdConversionRateLast30Days) 
    {
        this.AdConversionRateLast30Days = AdConversionRateLast30Days;
    }

    public String getAdConversionRateLast30Days() 
    {
        return AdConversionRateLast30Days;
    }
    public void setAdConversionRateLast14Days(String AdConversionRateLast14Days) 
    {
        this.AdConversionRateLast14Days = AdConversionRateLast14Days;
    }

    public String getAdConversionRateLast14Days() 
    {
        return AdConversionRateLast14Days;
    }
    public void setAdConversionRateLast7Days(String AdConversionRateLast7Days) 
    {
        this.AdConversionRateLast7Days = AdConversionRateLast7Days;
    }

    public String getAdConversionRateLast7Days() 
    {
        return AdConversionRateLast7Days;
    }
    public void setACOSLast30Days(String ACOSLast30Days) 
    {
        this.ACOSLast30Days = ACOSLast30Days;
    }

    public String getACOSLast30Days() 
    {
        return ACOSLast30Days;
    }
    public void setACOSLast14Days(String ACOSLast14Days) 
    {
        this.ACOSLast14Days = ACOSLast14Days;
    }

    public String getACOSLast14Days() 
    {
        return ACOSLast14Days;
    }
    public void setACOSLast7Days(String ACOSLast7Days) 
    {
        this.ACOSLast7Days = ACOSLast7Days;
    }

    public String getACOSLast7Days() 
    {
        return ACOSLast7Days;
    }
    public void setTargetACOSLast30Days(String TargetACOSLast30Days) 
    {
        this.TargetACOSLast30Days = TargetACOSLast30Days;
    }

    public String getTargetACOSLast30Days() 
    {
        return TargetACOSLast30Days;
    }
    public void setAnalysisExecutionReview4(String AnalysisExecutionReview4) 
    {
        this.AnalysisExecutionReview4 = AnalysisExecutionReview4;
    }

    public String getAnalysisExecutionReview4() 
    {
        return AnalysisExecutionReview4;
    }
    public void setTotalPageViewsLastMonth(String TotalPageViewsLastMonth) 
    {
        this.TotalPageViewsLastMonth = TotalPageViewsLastMonth;
    }

    public String getTotalPageViewsLastMonth() 
    {
        return TotalPageViewsLastMonth;
    }
    public void setTargetTotalPageViewsLast30Days(String TargetTotalPageViewsLast30Days) 
    {
        this.TargetTotalPageViewsLast30Days = TargetTotalPageViewsLast30Days;
    }

    public String getTargetTotalPageViewsLast30Days() 
    {
        return TargetTotalPageViewsLast30Days;
    }
    public void setActualTotalPageViewsLast30Days(String ActualTotalPageViewsLast30Days) 
    {
        this.ActualTotalPageViewsLast30Days = ActualTotalPageViewsLast30Days;
    }

    public String getActualTotalPageViewsLast30Days() 
    {
        return ActualTotalPageViewsLast30Days;
    }
    public void setActualTotalPageViewsLast14Days(String ActualTotalPageViewsLast14Days) 
    {
        this.ActualTotalPageViewsLast14Days = ActualTotalPageViewsLast14Days;
    }

    public String getActualTotalPageViewsLast14Days() 
    {
        return ActualTotalPageViewsLast14Days;
    }
    public void setActualTotalPageViewsLast7Days(String ActualTotalPageViewsLast7Days) 
    {
        this.ActualTotalPageViewsLast7Days = ActualTotalPageViewsLast7Days;
    }

    public String getActualTotalPageViewsLast7Days() 
    {
        return ActualTotalPageViewsLast7Days;
    }
    public void setAnalysisExecutionReview5(String AnalysisExecutionReview5) 
    {
        this.AnalysisExecutionReview5 = AnalysisExecutionReview5;
    }

    public String getAnalysisExecutionReview5() 
    {
        return AnalysisExecutionReview5;
    }
    public void setConversionRateLastMonth(String ConversionRateLastMonth) 
    {
        this.ConversionRateLastMonth = ConversionRateLastMonth;
    }

    public String getConversionRateLastMonth() 
    {
        return ConversionRateLastMonth;
    }
    public void setTargetTotalConversionRateLast30Days(String TargetTotalConversionRateLast30Days) 
    {
        this.TargetTotalConversionRateLast30Days = TargetTotalConversionRateLast30Days;
    }

    public String getTargetTotalConversionRateLast30Days() 
    {
        return TargetTotalConversionRateLast30Days;
    }
    public void setActualTotalConversionRateLast30Days(String ActualTotalConversionRateLast30Days) 
    {
        this.ActualTotalConversionRateLast30Days = ActualTotalConversionRateLast30Days;
    }

    public String getActualTotalConversionRateLast30Days() 
    {
        return ActualTotalConversionRateLast30Days;
    }
    public void setActualTotalConversionRateLast14Days(String ActualTotalConversionRateLast14Days) 
    {
        this.ActualTotalConversionRateLast14Days = ActualTotalConversionRateLast14Days;
    }

    public String getActualTotalConversionRateLast14Days() 
    {
        return ActualTotalConversionRateLast14Days;
    }
    public void setActualTotalConversionRateLast7Days(String ActualTotalConversionRateLast7Days) 
    {
        this.ActualTotalConversionRateLast7Days = ActualTotalConversionRateLast7Days;
    }

    public String getActualTotalConversionRateLast7Days() 
    {
        return ActualTotalConversionRateLast7Days;
    }
    public void setAnalysisExecutionReview6(String AnalysisExecutionReview6) 
    {
        this.AnalysisExecutionReview6 = AnalysisExecutionReview6;
    }

    public String getAnalysisExecutionReview6() 
    {
        return AnalysisExecutionReview6;
    }
    public void setSPAd(String SPAd) 
    {
        this.SPAd = SPAd;
    }

    public String getSPAd() 
    {
        return SPAd;
    }
    public void setROILast30DaysSPAd(String ROILast30DaysSPAd) 
    {
        this.ROILast30DaysSPAd = ROILast30DaysSPAd;
    }

    public String getROILast30DaysSPAd() 
    {
        return ROILast30DaysSPAd;
    }
    public void setROILast14DaysSPAd(String ROILast14DaysSPAd) 
    {
        this.ROILast14DaysSPAd = ROILast14DaysSPAd;
    }

    public String getROILast14DaysSPAd() 
    {
        return ROILast14DaysSPAd;
    }
    public void setTotalAdExposureLast30DaysSPAd(String TotalAdExposureLast30DaysSPAd) 
    {
        this.TotalAdExposureLast30DaysSPAd = TotalAdExposureLast30DaysSPAd;
    }

    public String getTotalAdExposureLast30DaysSPAd() 
    {
        return TotalAdExposureLast30DaysSPAd;
    }
    public void setTotalAdExposureLast14DaysSPAd(String TotalAdExposureLast14DaysSPAd) 
    {
        this.TotalAdExposureLast14DaysSPAd = TotalAdExposureLast14DaysSPAd;
    }

    public String getTotalAdExposureLast14DaysSPAd() 
    {
        return TotalAdExposureLast14DaysSPAd;
    }
    public void setTotalAdClicksLast30DaysSPAd(String TotalAdClicksLast30DaysSPAd) 
    {
        this.TotalAdClicksLast30DaysSPAd = TotalAdClicksLast30DaysSPAd;
    }

    public String getTotalAdClicksLast30DaysSPAd() 
    {
        return TotalAdClicksLast30DaysSPAd;
    }
    public void setTotalAdClicksLast14DaysSPAd(String TotalAdClicksLast14DaysSPAd) 
    {
        this.TotalAdClicksLast14DaysSPAd = TotalAdClicksLast14DaysSPAd;
    }

    public String getTotalAdClicksLast14DaysSPAd() 
    {
        return TotalAdClicksLast14DaysSPAd;
    }
    public void setAdConversionRateLast30DaysSPAd(String AdConversionRateLast30DaysSPAd) 
    {
        this.AdConversionRateLast30DaysSPAd = AdConversionRateLast30DaysSPAd;
    }

    public String getAdConversionRateLast30DaysSPAd() 
    {
        return AdConversionRateLast30DaysSPAd;
    }
    public void setAdConversionRateLast14DaysSPAd(String AdConversionRateLast14DaysSPAd) 
    {
        this.AdConversionRateLast14DaysSPAd = AdConversionRateLast14DaysSPAd;
    }

    public String getAdConversionRateLast14DaysSPAd() 
    {
        return AdConversionRateLast14DaysSPAd;
    }
    public void setACOSLast30DaysSPAd(String ACOSLast30DaysSPAd) 
    {
        this.ACOSLast30DaysSPAd = ACOSLast30DaysSPAd;
    }

    public String getACOSLast30DaysSPAd() 
    {
        return ACOSLast30DaysSPAd;
    }
    public void setACOSLast14DaysSPAd(String ACOSLast14DaysSPAd) 
    {
        this.ACOSLast14DaysSPAd = ACOSLast14DaysSPAd;
    }

    public String getACOSLast14DaysSPAd() 
    {
        return ACOSLast14DaysSPAd;
    }
    public void setAnalysisExecutionReviewSPAd(String AnalysisExecutionReviewSPAd) 
    {
        this.AnalysisExecutionReviewSPAd = AnalysisExecutionReviewSPAd;
    }

    public String getAnalysisExecutionReviewSPAd() 
    {
        return AnalysisExecutionReviewSPAd;
    }
    public void setSDAd(String SDAd) 
    {
        this.SDAd = SDAd;
    }

    public String getSDAd() 
    {
        return SDAd;
    }
    public void setROILast30DaysSDAd(String ROILast30DaysSDAd) 
    {
        this.ROILast30DaysSDAd = ROILast30DaysSDAd;
    }

    public String getROILast30DaysSDAd() 
    {
        return ROILast30DaysSDAd;
    }
    public void setROILast14DaysSDAd(String ROILast14DaysSDAd) 
    {
        this.ROILast14DaysSDAd = ROILast14DaysSDAd;
    }

    public String getROILast14DaysSDAd() 
    {
        return ROILast14DaysSDAd;
    }
    public void setTotalAdExposureLast30DaysSDAd(String TotalAdExposureLast30DaysSDAd) 
    {
        this.TotalAdExposureLast30DaysSDAd = TotalAdExposureLast30DaysSDAd;
    }

    public String getTotalAdExposureLast30DaysSDAd() 
    {
        return TotalAdExposureLast30DaysSDAd;
    }
    public void setTotalAdExposureLast14DaysSDAd(String TotalAdExposureLast14DaysSDAd) 
    {
        this.TotalAdExposureLast14DaysSDAd = TotalAdExposureLast14DaysSDAd;
    }

    public String getTotalAdExposureLast14DaysSDAd() 
    {
        return TotalAdExposureLast14DaysSDAd;
    }
    public void setTotalAdClicksLast30DaysSDAd(String TotalAdClicksLast30DaysSDAd) 
    {
        this.TotalAdClicksLast30DaysSDAd = TotalAdClicksLast30DaysSDAd;
    }

    public String getTotalAdClicksLast30DaysSDAd() 
    {
        return TotalAdClicksLast30DaysSDAd;
    }
    public void setTotalAdClicksLast14DaysSDAd(String TotalAdClicksLast14DaysSDAd) 
    {
        this.TotalAdClicksLast14DaysSDAd = TotalAdClicksLast14DaysSDAd;
    }

    public String getTotalAdClicksLast14DaysSDAd() 
    {
        return TotalAdClicksLast14DaysSDAd;
    }
    public void setAdConversionRateLast30DaysSDAd(String AdConversionRateLast30DaysSDAd) 
    {
        this.AdConversionRateLast30DaysSDAd = AdConversionRateLast30DaysSDAd;
    }

    public String getAdConversionRateLast30DaysSDAd() 
    {
        return AdConversionRateLast30DaysSDAd;
    }
    public void setAdConversionRateLast14DaysSDAd(String AdConversionRateLast14DaysSDAd) 
    {
        this.AdConversionRateLast14DaysSDAd = AdConversionRateLast14DaysSDAd;
    }

    public String getAdConversionRateLast14DaysSDAd() 
    {
        return AdConversionRateLast14DaysSDAd;
    }
    public void setACOSLast30DaysSDAd(String ACOSLast30DaysSDAd) 
    {
        this.ACOSLast30DaysSDAd = ACOSLast30DaysSDAd;
    }

    public String getACOSLast30DaysSDAd() 
    {
        return ACOSLast30DaysSDAd;
    }
    public void setACOSLast14DaysSDAd(String ACOSLast14DaysSDAd) 
    {
        this.ACOSLast14DaysSDAd = ACOSLast14DaysSDAd;
    }

    public String getACOSLast14DaysSDAd() 
    {
        return ACOSLast14DaysSDAd;
    }
    public void setAnalysisExecutionReviewSDAd(String AnalysisExecutionReviewSDAd) 
    {
        this.AnalysisExecutionReviewSDAd = AnalysisExecutionReviewSDAd;
    }

    public String getAnalysisExecutionReviewSDAd() 
    {
        return AnalysisExecutionReviewSDAd;
    }
    public void setSBad(String SBad) 
    {
        this.SBad = SBad;
    }

    public String getSBad() 
    {
        return SBad;
    }
    public void setROILast30DaysSBad(String ROILast30DaysSBad) 
    {
        this.ROILast30DaysSBad = ROILast30DaysSBad;
    }

    public String getROILast30DaysSBad() 
    {
        return ROILast30DaysSBad;
    }
    public void setROILast14DaysSBad(String ROILast14DaysSBad) 
    {
        this.ROILast14DaysSBad = ROILast14DaysSBad;
    }

    public String getROILast14DaysSBad() 
    {
        return ROILast14DaysSBad;
    }
    public void setTotalAdExposureLast30DaysSBad(String TotalAdExposureLast30DaysSBad) 
    {
        this.TotalAdExposureLast30DaysSBad = TotalAdExposureLast30DaysSBad;
    }

    public String getTotalAdExposureLast30DaysSBad() 
    {
        return TotalAdExposureLast30DaysSBad;
    }
    public void setTotalAdExposureLast14DaysSBad(String TotalAdExposureLast14DaysSBad) 
    {
        this.TotalAdExposureLast14DaysSBad = TotalAdExposureLast14DaysSBad;
    }

    public String getTotalAdExposureLast14DaysSBad() 
    {
        return TotalAdExposureLast14DaysSBad;
    }
    public void setTotalAdClicksLast30DaysSBad(String TotalAdClicksLast30DaysSBad) 
    {
        this.TotalAdClicksLast30DaysSBad = TotalAdClicksLast30DaysSBad;
    }

    public String getTotalAdClicksLast30DaysSBad() 
    {
        return TotalAdClicksLast30DaysSBad;
    }
    public void setTotalAdClicksLast14DaysSBad(String TotalAdClicksLast14DaysSBad) 
    {
        this.TotalAdClicksLast14DaysSBad = TotalAdClicksLast14DaysSBad;
    }

    public String getTotalAdClicksLast14DaysSBad() 
    {
        return TotalAdClicksLast14DaysSBad;
    }
    public void setAdConversionRateLast30DaysSBad(String AdConversionRateLast30DaysSBad) 
    {
        this.AdConversionRateLast30DaysSBad = AdConversionRateLast30DaysSBad;
    }

    public String getAdConversionRateLast30DaysSBad() 
    {
        return AdConversionRateLast30DaysSBad;
    }
    public void setAdConversionRateLast14DaysSBad(String AdConversionRateLast14DaysSBad) 
    {
        this.AdConversionRateLast14DaysSBad = AdConversionRateLast14DaysSBad;
    }

    public String getAdConversionRateLast14DaysSBad() 
    {
        return AdConversionRateLast14DaysSBad;
    }
    public void setACOSLast30DaysSBad(String ACOSLast30DaysSBad) 
    {
        this.ACOSLast30DaysSBad = ACOSLast30DaysSBad;
    }

    public String getACOSLast30DaysSBad() 
    {
        return ACOSLast30DaysSBad;
    }
    public void setACOSLast14DaysSBad(String ACOSLast14DaysSBad) 
    {
        this.ACOSLast14DaysSBad = ACOSLast14DaysSBad;
    }

    public String getACOSLast14DaysSBad() 
    {
        return ACOSLast14DaysSBad;
    }
    public void setAnalysisExecutionReviewSBad(String AnalysisExecutionReviewSBad) 
    {
        this.AnalysisExecutionReviewSBad = AnalysisExecutionReviewSBad;
    }

    public String getAnalysisExecutionReviewSBad() 
    {
        return AnalysisExecutionReviewSBad;
    }
    public void setRefundRateLastMonth(String RefundRateLastMonth) 
    {
        this.RefundRateLastMonth = RefundRateLastMonth;
    }

    public String getRefundRateLastMonth() 
    {
        return RefundRateLastMonth;
    }
    public void setTargetRefundRateLast30Days(String TargetRefundRateLast30Days) 
    {
        this.TargetRefundRateLast30Days = TargetRefundRateLast30Days;
    }

    public String getTargetRefundRateLast30Days() 
    {
        return TargetRefundRateLast30Days;
    }
    public void setActualRefundRateLast30Days(String ActualRefundRateLast30Days) 
    {
        this.ActualRefundRateLast30Days = ActualRefundRateLast30Days;
    }

    public String getActualRefundRateLast30Days() 
    {
        return ActualRefundRateLast30Days;
    }
    public void setActualRefundRateLast14Days(String ActualRefundRateLast14Days) 
    {
        this.ActualRefundRateLast14Days = ActualRefundRateLast14Days;
    }

    public String getActualRefundRateLast14Days() 
    {
        return ActualRefundRateLast14Days;
    }
    public void setActualRefundRateLast7Days(String ActualRefundRateLast7Days) 
    {
        this.ActualRefundRateLast7Days = ActualRefundRateLast7Days;
    }

    public String getActualRefundRateLast7Days() 
    {
        return ActualRefundRateLast7Days;
    }
    public void setAnalysisExecutionReview7(String AnalysisExecutionReview7) 
    {
        this.AnalysisExecutionReview7 = AnalysisExecutionReview7;
    }

    public String getAnalysisExecutionReview7() 
    {
        return AnalysisExecutionReview7;
    }
    public void setListingAgeMoreThan3Months(String ListingAgeMoreThan3Months) 
    {
        this.ListingAgeMoreThan3Months = ListingAgeMoreThan3Months;
    }

    public String getListingAgeMoreThan3Months() 
    {
        return ListingAgeMoreThan3Months;
    }
    public void setSalesVelocity(String SalesVelocity) 
    {
        this.SalesVelocity = SalesVelocity;
    }

    public String getSalesVelocity() 
    {
        return SalesVelocity;
    }
    public void setAdSpendingLastMonth(String AdSpendingLastMonth) 
    {
        this.AdSpendingLastMonth = AdSpendingLastMonth;
    }

    public String getAdSpendingLastMonth() 
    {
        return AdSpendingLastMonth;
    }
    public void setAdSalesLastMonth(String AdSalesLastMonth) 
    {
        this.AdSalesLastMonth = AdSalesLastMonth;
    }

    public String getAdSalesLastMonth() 
    {
        return AdSalesLastMonth;
    }
    public void setROILastMonth(String ROILastMonth) 
    {
        this.ROILastMonth = ROILastMonth;
    }

    public String getROILastMonth() 
    {
        return ROILastMonth;
    }
    public void setLocalInventory(String LocalInventory) 
    {
        this.LocalInventory = LocalInventory;
    }

    public String getLocalInventory() 
    {
        return LocalInventory;
    }
    public void setLocalProcurementInTransit(String LocalProcurementInTransit) 
    {
        this.LocalProcurementInTransit = LocalProcurementInTransit;
    }

    public String getLocalProcurementInTransit() 
    {
        return LocalProcurementInTransit;
    }
    public void setFBASellableInventory(String FBASellableInventory) 
    {
        this.FBASellableInventory = FBASellableInventory;
    }

    public String getFBASellableInventory() 
    {
        return FBASellableInventory;
    }
    public void setFBAInTransitInventory(String FBAInTransitInventory) 
    {
        this.FBAInTransitInventory = FBAInTransitInventory;
    }

    public String getFBAInTransitInventory() 
    {
        return FBAInTransitInventory;
    }
    public void setLocalInventoryValue(String LocalInventoryValue) 
    {
        this.LocalInventoryValue = LocalInventoryValue;
    }

    public String getLocalInventoryValue() 
    {
        return LocalInventoryValue;
    }
    public void setLocalProcurementInTransitValue(String LocalProcurementInTransitValue) 
    {
        this.LocalProcurementInTransitValue = LocalProcurementInTransitValue;
    }

    public String getLocalProcurementInTransitValue() 
    {
        return LocalProcurementInTransitValue;
    }
    public void setFBASellableInventoryValue(String FBASellableInventoryValue) 
    {
        this.FBASellableInventoryValue = FBASellableInventoryValue;
    }

    public String getFBASellableInventoryValue() 
    {
        return FBASellableInventoryValue;
    }
    public void setFBAInTransitInventoryValue(String FBAInTransitInventoryValue) 
    {
        this.FBAInTransitInventoryValue = FBAInTransitInventoryValue;
    }

    public String getFBAInTransitInventoryValue() 
    {
        return FBAInTransitInventoryValue;
    }
    public void setTotalInventoryValue(String TotalInventoryValue) 
    {
        this.TotalInventoryValue = TotalInventoryValue;
    }

    public String getTotalInventoryValue() 
    {
        return TotalInventoryValue;
    }
    public void setCapitalUtilizationLastMonth(String CapitalUtilizationLastMonth) 
    {
        this.CapitalUtilizationLastMonth = CapitalUtilizationLastMonth;
    }

    public String getCapitalUtilizationLastMonth() 
    {
        return CapitalUtilizationLastMonth;
    }
    public void setIsDelete(Long isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Long getIsDelete() 
    {
        return isDelete;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ASIN", getASIN())
            .append("MSKU", getMSKU())
            .append("Sales", getSales())
            .append("Development", getDevelopment())
            .append("Designer", getDesigner())
            .append("ListingDate", getListingDate())
            .append("CustomTags", getCustomTags())
            .append("SKULog", getSKULog())
            .append("Status", getStatus())
            .append("AnalysisCategory", getAnalysisCategory())
            .append("AnalysisContent", getAnalysisContent())
            .append("ActionContent", getActionContent())
            .append("CompetitorASIN", getCompetitorASIN())
            .append("CompetitorBrand", getCompetitorBrand())
            .append("CompetitorSubRank", getCompetitorSubRank())
            .append("CompetitorMainRank", getCompetitorMainRank())
            .append("CompetitorMonthlySales", getCompetitorMonthlySales())
            .append("CompetitorDailySales", getCompetitorDailySales())
            .append("CompetitorPrice", getCompetitorPrice())
            .append("CompetitorGrossMargin", getCompetitorGrossMargin())
            .append("CompetitorDailyProfit", getCompetitorDailyProfit())
            .append("CompetitorVariants", getCompetitorVariants())
            .append("CompetitorListingDate", getCompetitorListingDate())
            .append("CompetitorReviews", getCompetitorReviews())
            .append("CompetitorRating", getCompetitorRating())
            .append("CompetitorCopyQuality", getCompetitorCopyQuality())
            .append("CompetitorRelisting", getCompetitorRelisting())
            .append("CompetitorASIN2", getCompetitorASIN2())
            .append("MarketMonthlyCapacity", getMarketMonthlyCapacity())
            .append("TargetDailySales", getTargetDailySales())
            .append("TargetPrice", getTargetPrice())
            .append("TargetDailyRevenue", getTargetDailyRevenue())
            .append("TargetGrossMargin", getTargetGrossMargin())
            .append("TargetDailyProfit", getTargetDailyProfit())
            .append("TargetSubRank", getTargetSubRank())
            .append("TargetMainRank", getTargetMainRank())
            .append("TargetCapitalUtilization", getTargetCapitalUtilization())
            .append("LastMonthProfit", getLastMonthProfit())
            .append("LastMonthDailyProfit", getLastMonthDailyProfit())
            .append("TargetLast30DaysTotalProfit", getTargetLast30DaysTotalProfit())
            .append("ActualLast30DaysTotalProfit", getActualLast30DaysTotalProfit())
            .append("ActualLast14DaysTotalProfit", getActualLast14DaysTotalProfit())
            .append("ActualLast7DaysTotalProfit", getActualLast7DaysTotalProfit())
            .append("TotalInventoryAmountLast30Days", getTotalInventoryAmountLast30Days())
            .append("CapitalUtilizationLast30Days", getCapitalUtilizationLast30Days())
            .append("ActualLast7DaysSales", getActualLast7DaysSales())
            .append("LastMonthTotalSales", getLastMonthTotalSales())
            .append("LastMonthDailySales", getLastMonthDailySales())
            .append("TargetLast30DaysTotalSales", getTargetLast30DaysTotalSales())
            .append("ActualLast30DaysTotalSales", getActualLast30DaysTotalSales())
            .append("ActualLast14DaysTotalSales", getActualLast14DaysTotalSales())
            .append("ActualLast7DaysTotalSales", getActualLast7DaysTotalSales())
            .append("AnalysisExecutionReview", getAnalysisExecutionReview())
            .append("LastMonthProfitRate", getLastMonthProfitRate())
            .append("TargetLast30DaysProfitRate", getTargetLast30DaysProfitRate())
            .append("ActualLast30DaysProfitRate", getActualLast30DaysProfitRate())
            .append("ActualLast14DaysProfitRate", getActualLast14DaysProfitRate())
            .append("ActualLast7DaysProfitRate", getActualLast7DaysProfitRate())
            .append("AnalysisExecutionReview2", getAnalysisExecutionReview2())
            .append("LastMonthInventoryTurnoverDays", getLastMonthInventoryTurnoverDays())
            .append("CurrentTargetInventoryTurnoverDays", getCurrentTargetInventoryTurnoverDays())
            .append("ActualLast7DaysInventoryTurnoverDays", getActualLast7DaysInventoryTurnoverDays())
            .append("AnalysisExecutionReview3", getAnalysisExecutionReview3())
            .append("TargetLast14DaysAdBudget", getTargetLast14DaysAdBudget())
            .append("ActualLast14DaysAdSpending", getActualLast14DaysAdSpending())
            .append("TotalAdSpendingLast30Days", getTotalAdSpendingLast30Days())
            .append("LastMonthAdSpendingRatio", getLastMonthAdSpendingRatio())
            .append("TargetLast30DaysAdSpendingRatio", getTargetLast30DaysAdSpendingRatio())
            .append("ActualLast30DaysAdSpendingRatio", getActualLast30DaysAdSpendingRatio())
            .append("ActualLast14DaysAdSpendingRatio", getActualLast14DaysAdSpendingRatio())
            .append("ActualLast7DaysAdSpendingRatio", getActualLast7DaysAdSpendingRatio())
            .append("TotalAdExposureLast30Days", getTotalAdExposureLast30Days())
            .append("TotalAdExposureLast14Days", getTotalAdExposureLast14Days())
            .append("TotalAdExposureLast7Days", getTotalAdExposureLast7Days())
            .append("TotalAdClicksLast30Days", getTotalAdClicksLast30Days())
            .append("TotalAdClicksLast14Days", getTotalAdClicksLast14Days())
            .append("TotalAdClicksLast7Days", getTotalAdClicksLast7Days())
            .append("AdConversionRateLast30Days", getAdConversionRateLast30Days())
            .append("AdConversionRateLast14Days", getAdConversionRateLast14Days())
            .append("AdConversionRateLast7Days", getAdConversionRateLast7Days())
            .append("ACOSLast30Days", getACOSLast30Days())
            .append("ACOSLast14Days", getACOSLast14Days())
            .append("ACOSLast7Days", getACOSLast7Days())
            .append("TargetACOSLast30Days", getTargetACOSLast30Days())
            .append("AnalysisExecutionReview4", getAnalysisExecutionReview4())
            .append("TotalPageViewsLastMonth", getTotalPageViewsLastMonth())
            .append("TargetTotalPageViewsLast30Days", getTargetTotalPageViewsLast30Days())
            .append("ActualTotalPageViewsLast30Days", getActualTotalPageViewsLast30Days())
            .append("ActualTotalPageViewsLast14Days", getActualTotalPageViewsLast14Days())
            .append("ActualTotalPageViewsLast7Days", getActualTotalPageViewsLast7Days())
            .append("AnalysisExecutionReview5", getAnalysisExecutionReview5())
            .append("ConversionRateLastMonth", getConversionRateLastMonth())
            .append("TargetTotalConversionRateLast30Days", getTargetTotalConversionRateLast30Days())
            .append("ActualTotalConversionRateLast30Days", getActualTotalConversionRateLast30Days())
            .append("ActualTotalConversionRateLast14Days", getActualTotalConversionRateLast14Days())
            .append("ActualTotalConversionRateLast7Days", getActualTotalConversionRateLast7Days())
            .append("AnalysisExecutionReview6", getAnalysisExecutionReview6())
            .append("SPAd", getSPAd())
            .append("ROILast30DaysSPAd", getROILast30DaysSPAd())
            .append("ROILast14DaysSPAd", getROILast14DaysSPAd())
            .append("TotalAdExposureLast30DaysSPAd", getTotalAdExposureLast30DaysSPAd())
            .append("TotalAdExposureLast14DaysSPAd", getTotalAdExposureLast14DaysSPAd())
            .append("TotalAdClicksLast30DaysSPAd", getTotalAdClicksLast30DaysSPAd())
            .append("TotalAdClicksLast14DaysSPAd", getTotalAdClicksLast14DaysSPAd())
            .append("AdConversionRateLast30DaysSPAd", getAdConversionRateLast30DaysSPAd())
            .append("AdConversionRateLast14DaysSPAd", getAdConversionRateLast14DaysSPAd())
            .append("ACOSLast30DaysSPAd", getACOSLast30DaysSPAd())
            .append("ACOSLast14DaysSPAd", getACOSLast14DaysSPAd())
            .append("AnalysisExecutionReviewSPAd", getAnalysisExecutionReviewSPAd())
            .append("SDAd", getSDAd())
            .append("ROILast30DaysSDAd", getROILast30DaysSDAd())
            .append("ROILast14DaysSDAd", getROILast14DaysSDAd())
            .append("TotalAdExposureLast30DaysSDAd", getTotalAdExposureLast30DaysSDAd())
            .append("TotalAdExposureLast14DaysSDAd", getTotalAdExposureLast14DaysSDAd())
            .append("TotalAdClicksLast30DaysSDAd", getTotalAdClicksLast30DaysSDAd())
            .append("TotalAdClicksLast14DaysSDAd", getTotalAdClicksLast14DaysSDAd())
            .append("AdConversionRateLast30DaysSDAd", getAdConversionRateLast30DaysSDAd())
            .append("AdConversionRateLast14DaysSDAd", getAdConversionRateLast14DaysSDAd())
            .append("ACOSLast30DaysSDAd", getACOSLast30DaysSDAd())
            .append("ACOSLast14DaysSDAd", getACOSLast14DaysSDAd())
            .append("AnalysisExecutionReviewSDAd", getAnalysisExecutionReviewSDAd())
            .append("SBad", getSBad())
            .append("ROILast30DaysSBad", getROILast30DaysSBad())
            .append("ROILast14DaysSBad", getROILast14DaysSBad())
            .append("TotalAdExposureLast30DaysSBad", getTotalAdExposureLast30DaysSBad())
            .append("TotalAdExposureLast14DaysSBad", getTotalAdExposureLast14DaysSBad())
            .append("TotalAdClicksLast30DaysSBad", getTotalAdClicksLast30DaysSBad())
            .append("TotalAdClicksLast14DaysSBad", getTotalAdClicksLast14DaysSBad())
            .append("AdConversionRateLast30DaysSBad", getAdConversionRateLast30DaysSBad())
            .append("AdConversionRateLast14DaysSBad", getAdConversionRateLast14DaysSBad())
            .append("ACOSLast30DaysSBad", getACOSLast30DaysSBad())
            .append("ACOSLast14DaysSBad", getACOSLast14DaysSBad())
            .append("AnalysisExecutionReviewSBad", getAnalysisExecutionReviewSBad())
            .append("RefundRateLastMonth", getRefundRateLastMonth())
            .append("TargetRefundRateLast30Days", getTargetRefundRateLast30Days())
            .append("ActualRefundRateLast30Days", getActualRefundRateLast30Days())
            .append("ActualRefundRateLast14Days", getActualRefundRateLast14Days())
            .append("ActualRefundRateLast7Days", getActualRefundRateLast7Days())
            .append("AnalysisExecutionReview7", getAnalysisExecutionReview7())
            .append("ListingAgeMoreThan3Months", getListingAgeMoreThan3Months())
            .append("SalesVelocity", getSalesVelocity())
            .append("AdSpendingLastMonth", getAdSpendingLastMonth())
            .append("AdSalesLastMonth", getAdSalesLastMonth())
            .append("ROILastMonth", getROILastMonth())
            .append("LocalInventory", getLocalInventory())
            .append("LocalProcurementInTransit", getLocalProcurementInTransit())
            .append("FBASellableInventory", getFBASellableInventory())
            .append("FBAInTransitInventory", getFBAInTransitInventory())
            .append("LocalInventoryValue", getLocalInventoryValue())
            .append("LocalProcurementInTransitValue", getLocalProcurementInTransitValue())
            .append("FBASellableInventoryValue", getFBASellableInventoryValue())
            .append("FBAInTransitInventoryValue", getFBAInTransitInventoryValue())
            .append("TotalInventoryValue", getTotalInventoryValue())
            .append("CapitalUtilizationLastMonth", getCapitalUtilizationLastMonth())
            .append("isDelete", getIsDelete())
            .append("createdAt", getCreatedAt())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
