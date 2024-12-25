package com.ruoyi.aliexpress.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.aliexpress.domain.KfAnswersMessage;

/**
 * 消息Service接口
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
public interface IKfAnswersMessageService 
{
    /**
     * 查询消息
     * 
     * @param
     * @return 消息
     */
    public List<KfAnswersMessage> selectKfAnswersMessageByMessageId(String senderId, String shopId);

    /**
     * 查询消息列表
     * 
     * @param kfAnswersMessage 消息
     * @return 消息集合
     */
    public List<KfAnswersMessage> selectKfAnswersMessageList(KfAnswersMessage kfAnswersMessage);

    public List<Map<String,String>> selectKfAnswersClientUnreadCountOnly();

    public List<Map<String,String>> selectKfAnswersMessageByStore();


    /**
     * 新增消息
     * 
     * @param kfAnswersMessage 消息
     * @return 结果
     */
    public int insertKfAnswersMessage(KfAnswersMessage kfAnswersMessage);

    /**
     * 修改消息
     * 
     * @param kfAnswersMessage 消息
     * @return 结果
     */
    public int updateKfAnswersMessage(KfAnswersMessage kfAnswersMessage);

    /**
     * 修改已读
     *
     * @param kfAnswersMessage 消息
     * @return 结果
     */
    public int updateKfAnswersMessageRead(KfAnswersMessage kfAnswersMessage);



    public int updateKfAnswersMessageSendNew(KfAnswersMessage kfAnswersMessage);

    /**
     * 修改消息状态已回复
     *
     * @param kfAnswersMessage 消息
     * @return 结果
     */
    public int updateKfAnswersMessageStatus(KfAnswersMessage kfAnswersMessage);


    /**
     * 批量删除消息
     * 
     * @param messageIds 需要删除的消息主键集合
     * @return 结果
     */
    public int deleteKfAnswersMessageByMessageIds(String[] messageIds);

    /**
     * 删除消息信息
     * 
     * @param messageId 消息主键
     * @return 结果
     */
    public int deleteKfAnswersMessageByMessageId(String messageId);
}
