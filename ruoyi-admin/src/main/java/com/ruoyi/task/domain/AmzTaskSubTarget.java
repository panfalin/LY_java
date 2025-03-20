package com.ruoyi.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 亚马逊任务子目标对象 amz_task_sub_target
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskSubTarget extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 子目标ID
     */
    private Long targetId;

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
    private String msku;

    /**
     * 目标名称
     */
    @Excel(name = "目标名称")
    private String targetName;

    /**
     * 目标级别
     */
    @Excel(name = "目标级别")
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
     * 负责人ID
     */
    @Excel(name = "负责人ID")
    private Long assigneeId;

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

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getTargetId() {
        return targetId;
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

    public void setMsku(String msku) {
        this.msku = msku;
    }

    public String getMsku() {
        return msku;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetLevel(String targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getTargetLevel() {
        return targetLevel;
    }

    public void setTargetValue(BigDecimal targetValue) {
        this.targetValue = targetValue;
    }

    public BigDecimal getTargetValue() {
        return targetValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("targetId", getTargetId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("msku", getMsku())
                .append("targetName", getTargetName())
                .append("targetLevel", getTargetLevel())
                .append("targetValue", getTargetValue())
                .append("currentValue", getCurrentValue())
                .append("assigneeId", getAssigneeId())
                .append("startTime", getStartTime())
                .append("endTime", getEndTime())
                .append("status", getStatus())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
