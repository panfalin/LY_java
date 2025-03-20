package com.ruoyi.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 亚马逊任务数据快照对象 amz_task_snapshot
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskSnapshot extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 快照ID
     */
    private Long snapshotId;

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
     * 快照时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "快照时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date snapshotTime;

    /**
     * 指标数据快照
     */
    @Excel(name = "指标数据快照")
    private String metricData;

    /**
     * 库存数据快照
     */
    @Excel(name = "库存数据快照")
    private String inventoryData;

    /**
     * 销售数据快照
     */
    @Excel(name = "销售数据快照")
    private String salesData;

    public void setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
    }

    public Long getSnapshotId() {
        return snapshotId;
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

    public void setSnapshotTime(Date snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    public Date getSnapshotTime() {
        return snapshotTime;
    }

    public void setMetricData(String metricData) {
        this.metricData = metricData;
    }

    public String getMetricData() {
        return metricData;
    }

    public void setInventoryData(String inventoryData) {
        this.inventoryData = inventoryData;
    }

    public String getInventoryData() {
        return inventoryData;
    }

    public void setSalesData(String salesData) {
        this.salesData = salesData;
    }

    public String getSalesData() {
        return salesData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("snapshotId", getSnapshotId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("sku", getSku())
                .append("snapshotTime", getSnapshotTime())
                .append("metricData", getMetricData())
                .append("inventoryData", getInventoryData())
                .append("salesData", getSalesData())
                .append("createTime", getCreateTime())
                .toString();
    }
}
