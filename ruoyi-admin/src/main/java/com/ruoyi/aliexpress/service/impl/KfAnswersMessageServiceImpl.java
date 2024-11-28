package com.ruoyi.aliexpress.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.KfAnswersMessageMapper;
import com.ruoyi.aliexpress.domain.KfAnswersMessage;
import com.ruoyi.aliexpress.service.IKfAnswersMessageService;

/**
 * 消息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
@Service
public class KfAnswersMessageServiceImpl implements IKfAnswersMessageService 
{
    @Autowired
    private KfAnswersMessageMapper kfAnswersMessageMapper;

    /**
     * 查询消息
     *
     * @param
     * @return 消息
     */
    @Override
    public List<KfAnswersMessage> selectKfAnswersMessageByMessageId(String senderId, String shopId)
    {
        String receiverId = "客服";
        String conversationId = generateMessageId(senderId, receiverId);
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("conversationId", conversationId);
        paramMap.put("shopId", shopId);
        return (List<KfAnswersMessage>) kfAnswersMessageMapper.selectKfAnswersMessageByMessageId((HashMap) paramMap);
    }

    public static String generateMessageId(String senderId, String receiverId) {
        // 使用Arrays.sort方法对包含发送者ID和接收者ID的数组进行排序
        String[] ids = {senderId, receiverId};
        Arrays.sort(ids);

        // 使用String的format方法或者直接拼接字符串的方式将排序后的两个ID用下划线连接
        return String.format("%s_%s", ids[0], ids[1]);
    }


    /**
     * 查询消息列表
     * 
     * @param kfAnswersMessage 消息
     * @return 消息
     */
    @Override
    public List<KfAnswersMessage> selectKfAnswersMessageList(KfAnswersMessage kfAnswersMessage)
    {
        return kfAnswersMessageMapper.selectKfAnswersMessageList(kfAnswersMessage);
    }

    @Override
    public List<Map<String, String>> selectKfAnswersClientUnreadCountOnly() {
        return kfAnswersMessageMapper.selectKfAnswersClientUnreadCountOnly();
    }

    /**
     * 新增消息
     * 
     * @param kfAnswersMessage 消息
     * @return 结果
     */
    @Override
    public int insertKfAnswersMessage(KfAnswersMessage kfAnswersMessage)
    {
        return kfAnswersMessageMapper.insertKfAnswersMessage(kfAnswersMessage);
    }

    /**
     * 修改消息
     * 
     * @param kfAnswersMessage 消息
     * @return 结果
     */
    @Override
    public int updateKfAnswersMessage(KfAnswersMessage kfAnswersMessage)
    {
        kfAnswersMessage.setUpdateTime(DateUtils.getNowDate());
        return kfAnswersMessageMapper.updateKfAnswersMessage(kfAnswersMessage);
    }

    @Override
    public int updateKfAnswersMessageRead(KfAnswersMessage kfAnswersMessage) {
        kfAnswersMessage.setUpdateTime(DateUtils.getNowDate());
        return kfAnswersMessageMapper.updateKfAnswersMessageRead(kfAnswersMessage);
    }

    /**
     * 批量删除消息
     * 
     * @param messageIds 需要删除的消息主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersMessageByMessageIds(String[] messageIds)
    {
        return kfAnswersMessageMapper.deleteKfAnswersMessageByMessageIds(messageIds);
    }

    /**
     * 删除消息信息
     * 
     * @param messageId 消息主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersMessageByMessageId(String messageId)
    {
        return kfAnswersMessageMapper.deleteKfAnswersMessageByMessageId(messageId);
    }
}
