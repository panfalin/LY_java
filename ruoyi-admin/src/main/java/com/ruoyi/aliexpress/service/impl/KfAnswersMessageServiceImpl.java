package com.ruoyi.aliexpress.service.impl;

import java.util.List;
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
     * @param messageId 消息主键
     * @return 消息
     */
    @Override
    public KfAnswersMessage selectKfAnswersMessageByMessageId(String messageId)
    {
        return kfAnswersMessageMapper.selectKfAnswersMessageByMessageId(messageId);
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
