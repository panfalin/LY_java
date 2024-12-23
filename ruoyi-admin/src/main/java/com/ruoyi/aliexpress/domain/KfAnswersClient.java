package com.ruoyi.aliexpress.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户对象 kf_answers_client
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
public class KfAnswersClient extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户ID */
    private String clientId;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String clientName;

    /** 客户联系电话 */
    @Excel(name = "客户联系电话")
    private String clientNumber;

    /** 客户电子邮箱 */
    @Excel(name = "客户电子邮箱")
    private String email;

    /** 客户头像链接 */
    @Excel(name = "客户头像链接")
    private String avatarUrl;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    /** 自定义字段1 */
    @Excel(name = "自定义字段1")
    private String storeName;

    /** 自定义字段2 */
    @Excel(name = "自定义字段2")
    private String customFieldTwo;

    /** 自定义字段3 */
    @Excel(name = "自定义字段3")
    private String customFieldThree;

    /** 最新消息内容 */
    @Excel(name = "最新消息内容")
    private String messageContent;
    /** 最新消息内容 */
    @Excel(name = "最新消息内容是否已读")
    private String isRead;
    @Excel(name = "最新消息内容是否回复")
    private String messageStatus;

    private String orderStatus;


    private String ifSendNewUs;

    public String getIfSendNewUs() {
        return ifSendNewUs;
    }

    public void setIfSendNewUs(String ifSendNewUs) {
        this.ifSendNewUs = ifSendNewUs;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    public String getClientName() 
    {
        return clientName;
    }
    public void setClientNumber(String clientNumber) 
    {
        this.clientNumber = clientNumber;
    }

    public String getClientNumber() 
    {
        return clientNumber;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setAvatarUrl(String avatarUrl) 
    {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() 
    {
        return avatarUrl;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setstoreName(String storeName)
    {
        this.storeName = storeName;
    }

    public String getstoreName()
    {
        return storeName;
    }
    public void setCustomFieldTwo(String customFieldTwo) 
    {
        this.customFieldTwo = customFieldTwo;
    }

    public String getCustomFieldTwo() 
    {
        return customFieldTwo;
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
            .append("clientId", getClientId())
            .append("clientName", getClientName())
            .append("clientNumber", getClientNumber())
            .append("email", getEmail())
            .append("avatarUrl", getAvatarUrl())
            .append("createdTime", getCreatedTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("storeName", getstoreName())
            .append("customFieldTwo", getCustomFieldTwo())
            .append("customFieldThree", getCustomFieldThree())
            .toString();
    }
}
