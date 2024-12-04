package com.ruoyi.aliexpress.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 消息对象 kf_answers_message
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
public class KfAnswersMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 消息ID */
    private String messageId;

    /** 发送方ID */
    @Excel(name = "发送方ID")
    private String senderId;

    /** 接收方ID */
    @Excel(name = "接收方ID")
    private String receiverId;

    /** 关联店铺 ID */
    @Excel(name = "关联店铺 ID")
    private String shopId;

    /** 聊天消息内容 */
    @Excel(name = "聊天消息内容")
    private String messageContent;

    /** 消息发送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "消息发送时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /** 消息是否已读（0 表示未读，1 表示已读） */
    @Excel(name = "消息是否已读", readConverterExp = "0=,表=示未读，1,表=示已读")
    private String isRead;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    /** 自定义字段1 */
    @Excel(name = "会话ID")
    private String conversationId;

    /** 自定义字段2 */
    @Excel(name = "自定义字段2")
    private String customFieldTwo;

    /** 自定义字段3 */
    @Excel(name = "自定义字段3")
    private String customFieldThree;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public void setMessageId(String messageId)
    {
        this.messageId = messageId;
    }

    public String getMessageId() 
    {
        return messageId;
    }
    public void setSenderId(String senderId) 
    {
        this.senderId = senderId;
    }

    public String getSenderId() 
    {
        return senderId;
    }
    public void setReceiverId(String receiverId) 
    {
        this.receiverId = receiverId;
    }

    public String getReceiverId() 
    {
        return receiverId;
    }
    public void setShopId(String shopId) 
    {
        this.shopId = shopId;
    }

    public String getShopId() 
    {
        return shopId;
    }
    public void setMessageContent(String messageContent) 
    {
        this.messageContent = messageContent;
    }

    public String getMessageContent() 
    {
        return messageContent;
    }
    public void setSendTime(Date sendTime) 
    {
        this.sendTime = sendTime;
    }

    public Date getSendTime() 
    {
        return sendTime;
    }
    public void setIsRead(String isRead) 
    {
        this.isRead = isRead;
    }

    public String getIsRead() 
    {
        return isRead;
    }
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime()
    {
        return createdTime;
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
            .append("messageId", getMessageId())
            .append("senderId", getSenderId())
            .append("receiverId", getReceiverId())
            .append("shopId", getShopId())
            .append("messageContent", getMessageContent())
            .append("sendTime", getSendTime())
            .append("isRead", getIsRead())
            .append("createdTime", getCreatedTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("customFieldTwo", getCustomFieldTwo())
            .append("customFieldThree", getCustomFieldThree())
            .toString();
    }
}
