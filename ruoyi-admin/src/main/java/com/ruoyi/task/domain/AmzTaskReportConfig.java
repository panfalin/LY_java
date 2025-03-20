package com.ruoyi.task.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 亚马逊任务报配置对象 amz_task_report_config
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskReportConfig extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 配置ID
     */
    private Long configId;

    /**
     * 店铺名称
     */
    @Excel(name = "店铺名称")
    private String storeName;

    /**
     * 报表名称
     */
    @Excel(name = "报表名称")
    private String reportName;

    /**
     * 报表类型
     */
    @Excel(name = "报表类型")
    private String reportType;

    /**
     * 报表频率
     */
    @Excel(name = "报表频率")
    private String reportFrequency;

    /**
     * 接收人ID列表
     */
    @Excel(name = "接收人ID列表")
    private String recipientIds;

    /**
     * 报表模板配置
     */
    @Excel(name = "报表模板配置")
    private String reportTemplate;

    /**
     * 数据筛选条件
     */
    @Excel(name = "数据筛选条件")
    private String filterCondition;

    /**
     * 排序规则
     */
    @Excel(name = "排序规则")
    private String sortRules;

    /**
     * 是否启用
     */
    @Excel(name = "是否启用")
    private Integer isEnabled;

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportFrequency(String reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    public String getReportFrequency() {
        return reportFrequency;
    }

    public void setRecipientIds(String recipientIds) {
        this.recipientIds = recipientIds;
    }

    public String getRecipientIds() {
        return recipientIds;
    }

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    public String getReportTemplate() {
        return reportTemplate;
    }

    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public String getFilterCondition() {
        return filterCondition;
    }

    public void setSortRules(String sortRules) {
        this.sortRules = sortRules;
    }

    public String getSortRules() {
        return sortRules;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("configId", getConfigId())
                .append("storeName", getStoreName())
                .append("reportName", getReportName())
                .append("reportType", getReportType())
                .append("reportFrequency", getReportFrequency())
                .append("recipientIds", getRecipientIds())
                .append("reportTemplate", getReportTemplate())
                .append("filterCondition", getFilterCondition())
                .append("sortRules", getSortRules())
                .append("isEnabled", getIsEnabled())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
