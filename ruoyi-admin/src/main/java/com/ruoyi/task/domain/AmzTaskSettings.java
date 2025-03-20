package com.ruoyi.task.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 亚马逊任务设置对象 amz_task_settings
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskSettings extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 设置ID
     */
    private Long settingId;

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
     * 通知阈值
     */
    @Excel(name = "通知阈值")
    private BigDecimal notifyThreshold;

    /**
     * 通知间隔(分钟)
     */
    @Excel(name = "通知间隔(分钟)")
    private Long notifyInterval;

    /**
     * 是否自动暂停
     */
    @Excel(name = "是否自动暂停")
    private Integer autoPause;

    /**
     * 暂停条件
     */
    @Excel(name = "暂停条件")
    private String pauseCondition;

    /**
     * 预警规则配置
     */
    @Excel(name = "预警规则配置")
    private String alertRules;

    /**
     * 指标计算规则
     */
    @Excel(name = "指标计算规则")
    private String metricRules;

    public void setSettingId(Long settingId) {
        this.settingId = settingId;
    }

    public Long getSettingId() {
        return settingId;
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

    public void setNotifyThreshold(BigDecimal notifyThreshold) {
        this.notifyThreshold = notifyThreshold;
    }

    public BigDecimal getNotifyThreshold() {
        return notifyThreshold;
    }

    public void setNotifyInterval(Long notifyInterval) {
        this.notifyInterval = notifyInterval;
    }

    public Long getNotifyInterval() {
        return notifyInterval;
    }

    public void setAutoPause(Integer autoPause) {
        this.autoPause = autoPause;
    }

    public Integer getAutoPause() {
        return autoPause;
    }

    public void setPauseCondition(String pauseCondition) {
        this.pauseCondition = pauseCondition;
    }

    public String getPauseCondition() {
        return pauseCondition;
    }

    public void setAlertRules(String alertRules) {
        this.alertRules = alertRules;
    }

    public String getAlertRules() {
        return alertRules;
    }

    public void setMetricRules(String metricRules) {
        this.metricRules = metricRules;
    }

    public String getMetricRules() {
        return metricRules;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("settingId", getSettingId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("notifyThreshold", getNotifyThreshold())
                .append("notifyInterval", getNotifyInterval())
                .append("autoPause", getAutoPause())
                .append("pauseCondition", getPauseCondition())
                .append("alertRules", getAlertRules())
                .append("metricRules", getMetricRules())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
