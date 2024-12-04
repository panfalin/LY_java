package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单对象 kf_answers_order
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
public class KfAnswersOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private String orderId;

    /** 客户ID */
    @Excel(name = "客户ID")
    private String clientId;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String storeName;

    /** 订单金额 */
    @Excel(name = "订单金额")
    private String orderAmount;

    /** 订单状态（如已支付、待发货、已完成等） */
    @Excel(name = "订单状态", readConverterExp = "如=已支付、待发货、已完成等")
    private String orderStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 自定义字段1 */
    @Excel(name = "商品名")
    private String produceName;

    /** 自定义字段2 */
    @Excel(name = "商品图片")
    private String producePicture;

    /** 自定义字段3 */
    @Excel(name = "自定义字段3")
    private String customFieldThree;

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    public String getProducePicture() {
        return producePicture;
    }

    public void setProducePicture(String producePicture) {
        this.producePicture = producePicture;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setOrderAmount(String orderAmount)
    {
        this.orderAmount = orderAmount;
    }

    public String getOrderAmount()
    {
        return orderAmount;
    }
    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() 
    {
        return orderStatus;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }

    public void setCustomFieldThree(String customFieldThree) 
    {
        this.customFieldThree = customFieldThree;
    }

    public String getCustomFieldThree() 
    {
        return customFieldThree;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("clientId", getClientId())
            .append("storeName", getStoreName())
            .append("orderAmount", getOrderAmount())
            .append("orderStatus", getOrderStatus())
            .append("createdTime", getCreatedTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("customFieldThree", getCustomFieldThree())
            .toString();
    }
}
