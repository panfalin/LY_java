package com.ruoyi.amazon.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 亚马逊数据分析，周转率，这个存的是商品运营分析
 * 这个与mskulist关联对象 amz_data_analysis_turnover_operational_analysis
 *
 * @author ruoyi
 * @date 2025-03-03
 */
@Getter
@Setter
public class AmzDataAnalysisTurnoverOperationalAnalysis extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 商品名称
     */
    @Excel(name = "商品名称")
    private String productName;

    /**
     * SKU
     */
    @Excel(name = "SKU")
    private String sku;

    /**
     * 父ASIN
     */
    @Excel(name = "父ASIN")
    private String parentAsin;

    /**
     * 子ASIN
     */
    @Excel(name = "子ASIN")
    private String childAsin;

    /**
     * 平均销售单价
     */
    @Excel(name = "平均销售单价")
    private String avgSalesPrice;

    /**
     * 销量
     */
    @Excel(name = "销量")
    private String sales;

    /**
     * 订单量
     */
    @Excel(name = "订单量")
    private String orderCount;

    /**
     * 多渠道数量
     */
    @Excel(name = "多渠道数量")
    private String multiChannelQuantity;

    /**
     * 销售额
     */
    @Excel(name = "销售额")
    private String salesAmount;

    /**
     * 大类目Rank
     */
    @Excel(name = "大类目Rank")
    private String categoryRankLarge;

    /**
     * 小类目Rank
     */
    @Excel(name = "小类目Rank")
    private String categoryRankSmall;

    /**
     * 页面浏览次数-合计
     */
    @Excel(name = "页面浏览次数-合计")
    private String pageViewsTotal;

    /**
     * 页面浏览次数百分比-合计
     */
    @Excel(name = "页面浏览次数百分比-合计")
    private String pageViewsPercentageTotal;

    /**
     * 退款量
     */
    @Excel(name = "退款量")
    private String refundCount;

    /**
     * 退款金额
     */
    @Excel(name = "退款金额")
    private String refundAmount;

    /**
     * 退款率
     */
    @Excel(name = "退款率")
    private String refundRate;

    /**
     * 广告花费
     */
    @Excel(name = "广告花费")
    private String adSpend;

    /**
     * 花费占比
     */
    @Excel(name = "花费占比")
    private String spendPercentage;

    /**
     * 曝光量
     */
    @Excel(name = "曝光量")
    private String impressions;

    /**
     * 点击量
     */
    @Excel(name = "点击量")
    private String clicks;

    /**
     * 点击率（CTR）
     */
    @Excel(name = "点击率", readConverterExp = "C=TR")
    private String clickThroughRate;

    /**
     * 广告订单量
     */
    @Excel(name = "广告订单量")
    private String adOrderCount;

    /**
     * 广告订单占比
     */
    @Excel(name = "广告订单占比")
    private String adOrderPercentage;

    /**
     * 转化率
     */
    @Excel(name = "转化率")
    private String conversionRate;

    /**
     * 广告销售额
     */
    @Excel(name = "广告销售额")
    private String adSalesAmount;

    /**
     * 单次点击成本（CPC）
     */
    @Excel(name = "单次点击成本", readConverterExp = "C=PC")
    private String costPerClick;

    /**
     * 广告投入产出比（ACOS）
     */
    @Excel(name = "广告投入产出比", readConverterExp = "A=COS")
    private String adAcos;

    /**
     * 可售库存
     */
    @Excel(name = "可售库存")
    private String availableInventory;

    /**
     * 可售天数
     */
    @Excel(name = "可售天数")
    private String availableDays;

    /**
     * 预留库存
     */
    @Excel(name = "预留库存")
    private String reservedInventory;

    /**
     * 总收入
     */
    @Excel(name = "总收入")
    private String totalRevenue;

    /**
     * 总支出
     */
    @Excel(name = "总支出")
    private String totalExpenditure;

    /**
     * 毛利润
     */
    @Excel(name = "毛利润")
    private String grossProfit;

    /**
     * 毛利率
     */
    @Excel(name = "毛利率")
    private String grossMargin;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 记录当天有没有新增过记录
     */
    private Long version;
}
