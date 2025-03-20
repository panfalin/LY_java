package com.ruoyi.task.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 亚马逊任务通知对象 amz_task_notification
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskNotification extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 通知ID
     */
    private Long notifyId;

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
     * 通知类型
     */
    @Excel(name = "通知类型")
    private String notifyType;

    /**
     * 通知级别
     */
    @Excel(name = "通知级别")
    private String notifyLevel;

    /**
     * 通知内容
     */
    @Excel(name = "通知内容")
    private String notifyContent;

    /**
     * 触发时的指标值
     */
    @Excel(name = "触发时的指标值")
    private BigDecimal metricValue;

    /**
     * 是否已读
     */
    @Excel(name = "是否已读")
    private Integer isRead;

    public void setNotifyId(Long notifyId) {
        this.notifyId = notifyId;
    }

    public Long getNotifyId() {
        return notifyId;
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

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyLevel(String notifyLevel) {
        this.notifyLevel = notifyLevel;
    }

    public String getNotifyLevel() {
        return notifyLevel;
    }

    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
    }

    public String getNotifyContent() {
        return notifyContent;
    }

    public void setMetricValue(BigDecimal metricValue) {
        this.metricValue = metricValue;
    }

    public BigDecimal getMetricValue() {
        return metricValue;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getIsRead() {
        return isRead;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("notifyId", getNotifyId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("sku", getSku())
                .append("notifyType", getNotifyType())
                .append("notifyLevel", getNotifyLevel())
                .append("notifyContent", getNotifyContent())
                .append("metricValue", getMetricValue())
                .append("isRead", getIsRead())
                .append("createTime", getCreateTime())
                .toString();
    }
}
