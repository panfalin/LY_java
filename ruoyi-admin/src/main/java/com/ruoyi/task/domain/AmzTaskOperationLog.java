package com.ruoyi.task.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 亚马逊任务操作日志对象 amz_task_operation_log
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskOperationLog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    private Long logId;

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
     * 操作人ID
     */
    @Excel(name = "操作人ID")
    private Long operatorId;

    /**
     * 操作类型
     */
    @Excel(name = "操作类型")
    private String operationType;

    /**
     * 操作详情
     */
    @Excel(name = "操作详情")
    private String operationDetail;

    /**
     * 修改前的值
     */
    @Excel(name = "修改前的值")
    private String oldValue;

    /**
     * 修改后的值
     */
    @Excel(name = "修改后的值")
    private String newValue;

    /**
     * IP地址
     */
    @Excel(name = "IP地址")
    private String ipAddress;

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getLogId() {
        return logId;
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

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationDetail(String operationDetail) {
        this.operationDetail = operationDetail;
    }

    public String getOperationDetail() {
        return operationDetail;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("logId", getLogId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("sku", getSku())
                .append("operatorId", getOperatorId())
                .append("operationType", getOperationType())
                .append("operationDetail", getOperationDetail())
                .append("oldValue", getOldValue())
                .append("newValue", getNewValue())
                .append("ipAddress", getIpAddress())
                .append("createTime", getCreateTime())
                .toString();
    }
}
