package com.ruoyi.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 亚马逊任务主表对象 amz_task_main
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Setter
@Getter
public class AmzTaskMain extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 任务名称
     */
    @Excel(name = "任务名称")
    private String taskName;

    /**
     * 任务编号
     */
    @Excel(name = "任务编号")
    private String taskCode;

    /**
     * 店铺名称
     */
    @Excel(name = "店铺名称")
    private String storeName;

    /**
     * SKU编号
     */
    @Excel(name = "SKU编号")
    private String sku;

    /**
     * ASIN
     */
    @Excel(name = "ASIN")
    private String asin;

    /**
     * 市场ID
     */
    @Excel(name = "市场ID")
    private String marketplaceId;

    /**
     * 指标类型(turnoverDays/salesAmount/grossProfit)
     */
    @Excel(name = "指标类型(turnoverDays/salesAmount/grossProfit)")
    private String metricType;

    /**
     * 指标级别(company/manager/personal/system)
     */
    @Excel(name = "指标级别(company/manager/personal/system)")
    private String targetLevel;

    /**
     * 目标值
     */
    @Excel(name = "目标值")
    private BigDecimal targetValue;

    /**
     * 当前值
     */
    @Excel(name = "当前值")
    private BigDecimal currentValue;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private String status;

    /**
     * 产品名称
     */
    @Excel(name = "产品名称")
    private String productName;

    /** 目标类型(increase/decrease) */
    private String targetType;
    
    /** 变化百分比 */
    private BigDecimal changePercentage;
    
    /** SKU任务列表 */
    private List<AmzTaskSubTarget> tasks;
    
}
