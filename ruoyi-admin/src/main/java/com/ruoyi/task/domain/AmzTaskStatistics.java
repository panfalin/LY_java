package com.ruoyi.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 亚马逊任务统计对象 amz_task_statistics
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskStatistics extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 统计ID
     */
    private Long statsId;

    /**
     * 店铺名称
     */
    @Excel(name = "店铺名称")
    private String storeName;

    /**
     * 统计日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statsDate;

    /**
     * 指标类型
     */
    @Excel(name = "指标类型")
    private String metricType;

    /**
     * 任务总数
     */
    @Excel(name = "任务总数")
    private Long totalTasks;

    /**
     * 已完成数
     */
    @Excel(name = "已完成数")
    private Long completedTasks;

    /**
     * 超时数
     */
    @Excel(name = "超时数")
    private Long overtimeTasks;

    /**
     * 完成率
     */
    @Excel(name = "完成率")
    private BigDecimal completionRate;

    /**
     * 平均进度
     */
    @Excel(name = "平均进度")
    private BigDecimal avgProgress;

    /**
     * 详细统计数据
     */
    @Excel(name = "详细统计数据")
    private String statsData;

    public void setStatsId(Long statsId) {
        this.statsId = statsId;
    }

    public Long getStatsId() {
        return statsId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStatsDate(Date statsDate) {
        this.statsDate = statsDate;
    }

    public Date getStatsDate() {
        return statsDate;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setTotalTasks(Long totalTasks) {
        this.totalTasks = totalTasks;
    }

    public Long getTotalTasks() {
        return totalTasks;
    }

    public void setCompletedTasks(Long completedTasks) {
        this.completedTasks = completedTasks;
    }

    public Long getCompletedTasks() {
        return completedTasks;
    }

    public void setOvertimeTasks(Long overtimeTasks) {
        this.overtimeTasks = overtimeTasks;
    }

    public Long getOvertimeTasks() {
        return overtimeTasks;
    }

    public void setCompletionRate(BigDecimal completionRate) {
        this.completionRate = completionRate;
    }

    public BigDecimal getCompletionRate() {
        return completionRate;
    }

    public void setAvgProgress(BigDecimal avgProgress) {
        this.avgProgress = avgProgress;
    }

    public BigDecimal getAvgProgress() {
        return avgProgress;
    }

    public void setStatsData(String statsData) {
        this.statsData = statsData;
    }

    public String getStatsData() {
        return statsData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("statsId", getStatsId())
                .append("storeName", getStoreName())
                .append("statsDate", getStatsDate())
                .append("metricType", getMetricType())
                .append("totalTasks", getTotalTasks())
                .append("completedTasks", getCompletedTasks())
                .append("overtimeTasks", getOvertimeTasks())
                .append("completionRate", getCompletionRate())
                .append("avgProgress", getAvgProgress())
                .append("statsData", getStatsData())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
