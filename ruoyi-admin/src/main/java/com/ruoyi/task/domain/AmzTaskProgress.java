package com.ruoyi.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 亚马逊任务进度记录对象 amz_task_progress
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskProgress extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 进度ID
     */
    private Long progressId;

    /**
     * 任务ID
     */
    @Excel(name = "任务ID")
    private Long taskId;

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
     * 指标类型(turnoverDays/salesAmount/grossProfit/adConversion等)
     */
    @Excel(name = "指标类型(turnoverDays/salesAmount/grossProfit/adConversion等)")
    private String metricType;

    /**
     * 指标值
     */
    @Excel(name = "指标值")
    private BigDecimal metricValue;

    /**
     * 指标单位(天/元/%/个等)
     */
    @Excel(name = "指标单位(天/元/%/个等)")
    private String metricUnit;

    /**
     * 相关指标数据，如：
     * {
     * "inventory": 100,          -- 库存
     * "sales": 50,              -- 销量
     * "cost": 1000.00,         -- 成本
     * "price": 29.99,          -- 售价
     * "adSpend": 500.00,       -- 广告花费
     * "adSales": 1500.00,      -- 广告销售额
     * "clicks": 1000,          -- 点击量
     * "impressions": 10000     -- 展示量
     * }
     */
    private String relatedData;

    /**
     * 记录日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordDate;

    /**
     * 记录类型(manual:手动/system:系统/calculate:计算)
     */
    @Excel(name = "记录类型(manual:手动/system:系统/calculate:计算)")
    private String recordType;

    /**
     * 数据来源(manual/api/calculation等)
     */
    @Excel(name = "数据来源(manual/api/calculation等)")
    private String dataSource;

    public void setProgressId(Long progressId) {
        this.progressId = progressId;
    }

    public Long getProgressId() {
        return progressId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricValue(BigDecimal metricValue) {
        this.metricValue = metricValue;
    }

    public BigDecimal getMetricValue() {
        return metricValue;
    }

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    public String getMetricUnit() {
        return metricUnit;
    }

    public void setRelatedData(String relatedData) {
        this.relatedData = relatedData;
    }

    public String getRelatedData() {
        return relatedData;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSource() {
        return dataSource;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("progressId", getProgressId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("sku", getSku())
                .append("metricType", getMetricType())
                .append("metricValue", getMetricValue())
                .append("metricUnit", getMetricUnit())
                .append("relatedData", getRelatedData())
                .append("recordDate", getRecordDate())
                .append("recordType", getRecordType())
                .append("dataSource", getDataSource())
                .append("remark", getRemark())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
