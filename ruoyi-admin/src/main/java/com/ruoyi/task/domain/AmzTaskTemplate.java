package com.ruoyi.task.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 亚马逊任务模板对象 amz_task_template
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskTemplate extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private Long templateId;

    /**
     * 模板名称
     */
    @Excel(name = "模板名称")
    private String templateName;

    /**
     * 店铺名称
     */
    @Excel(name = "店铺名称")
    private String storeName;

    /**
     * 指标类型
     */
    @Excel(name = "指标类型")
    private String metricType;

    /**
     * 指标级别
     */
    @Excel(name = "指标级别")
    private String targetLevel;

    /**
     * 默认持续天数
     */
    @Excel(name = "默认持续天数")
    private Long defaultDuration;

    /**
     * 模板配置
     */
    @Excel(name = "模板配置")
    private String templateConfig;

    /**
     * 子目标配置
     */
    @Excel(name = "子目标配置")
    private String subTargets;

    /**
     * 通知规则配置
     */
    @Excel(name = "通知规则配置")
    private String notifyRules;

    /**
     * 是否启用
     */
    @Excel(name = "是否启用")
    private Integer isEnabled;

    /**
     * 是否公共模板
     */
    @Excel(name = "是否公共模板")
    private Integer isPublic;

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setTargetLevel(String targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getTargetLevel() {
        return targetLevel;
    }

    public void setDefaultDuration(Long defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public Long getDefaultDuration() {
        return defaultDuration;
    }

    public void setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
    }

    public String getTemplateConfig() {
        return templateConfig;
    }

    public void setSubTargets(String subTargets) {
        this.subTargets = subTargets;
    }

    public String getSubTargets() {
        return subTargets;
    }

    public void setNotifyRules(String notifyRules) {
        this.notifyRules = notifyRules;
    }

    public String getNotifyRules() {
        return notifyRules;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("templateId", getTemplateId())
                .append("templateName", getTemplateName())
                .append("storeName", getStoreName())
                .append("metricType", getMetricType())
                .append("targetLevel", getTargetLevel())
                .append("defaultDuration", getDefaultDuration())
                .append("templateConfig", getTemplateConfig())
                .append("subTargets", getSubTargets())
                .append("notifyRules", getNotifyRules())
                .append("isEnabled", getIsEnabled())
                .append("isPublic", getIsPublic())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
