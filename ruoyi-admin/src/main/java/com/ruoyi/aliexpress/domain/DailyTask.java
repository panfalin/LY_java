package com.ruoyi.aliexpress.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * dailyTask对象
 *
 * @author panfalin
 * @date 2024-11-04
 */
public class DailyTask extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "刊登ID")
    private Long id;

    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** 刊登大图 */
    // @Excel(name = "刊登大图")
    private String largeImg;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 历史销量 */
    @Excel(name = "历史销量")
    private String sales;

    /** 30天访客 */
    @Excel(name = "30天访客")
    private Long visitorCount;

    /** 刊登ID */

    private String onlineId;

    /** 店铺 */
    @Excel(name = "店铺")
    private String store;

    /** 任务 */
    @Excel(name = "任务")
    private String tasks;

    /** 责任人 */
    @Excel(name = "责任人")
    private String responsiblePerson;

    /** 建议事项 */
    @Excel(name = "建议事项")
    private String suggestions;

    /** 目标 */
    @Excel(name = "目标")
    private String goals;

    /** 日志记录 */
    @Excel(name = "日志记录")
    private String logs;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(Long visitorCount) {
        this.visitorCount = visitorCount;
    }

    public String getLargeImg() {
        return largeImg;
    }

    public void setLargeImg(String largeImg) {
        this.largeImg = largeImg;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getOnlineId() {
        return onlineId;
    }

    public void setOnlineId(String onlineId) {
        this.onlineId = onlineId;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
