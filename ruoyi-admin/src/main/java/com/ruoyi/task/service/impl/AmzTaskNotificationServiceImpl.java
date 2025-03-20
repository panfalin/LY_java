package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskNotification;
import com.ruoyi.task.mapper.AmzTaskNotificationMapper;
import com.ruoyi.task.service.IAmzTaskNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务通知Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskNotificationServiceImpl implements IAmzTaskNotificationService {
    @Autowired
    private AmzTaskNotificationMapper amzTaskNotificationMapper;

    /**
     * 查询亚马逊任务通知
     *
     * @param notifyId 亚马逊任务通知主键
     * @return 亚马逊任务通知
     */
    @Override
    public AmzTaskNotification selectAmzTaskNotificationByNotifyId(Long notifyId) {
        return amzTaskNotificationMapper.selectAmzTaskNotificationByNotifyId(notifyId);
    }

    /**
     * 查询亚马逊任务通知列表
     *
     * @param amzTaskNotification 亚马逊任务通知
     * @return 亚马逊任务通知
     */
    @Override
    public List<AmzTaskNotification> selectAmzTaskNotificationList(AmzTaskNotification amzTaskNotification) {
        return amzTaskNotificationMapper.selectAmzTaskNotificationList(amzTaskNotification);
    }

    /**
     * 新增亚马逊任务通知
     *
     * @param amzTaskNotification 亚马逊任务通知
     * @return 结果
     */
    @Override
    public int insertAmzTaskNotification(AmzTaskNotification amzTaskNotification) {
        amzTaskNotification.setCreateTime(DateUtils.getNowDate());
        return amzTaskNotificationMapper.insertAmzTaskNotification(amzTaskNotification);
    }

    /**
     * 修改亚马逊任务通知
     *
     * @param amzTaskNotification 亚马逊任务通知
     * @return 结果
     */
    @Override
    public int updateAmzTaskNotification(AmzTaskNotification amzTaskNotification) {
        return amzTaskNotificationMapper.updateAmzTaskNotification(amzTaskNotification);
    }

    /**
     * 批量删除亚马逊任务通知
     *
     * @param notifyIds 需要删除的亚马逊任务通知主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskNotificationByNotifyIds(Long[] notifyIds) {
        return amzTaskNotificationMapper.deleteAmzTaskNotificationByNotifyIds(notifyIds);
    }

    /**
     * 删除亚马逊任务通知信息
     *
     * @param notifyId 亚马逊任务通知主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskNotificationByNotifyId(Long notifyId) {
        return amzTaskNotificationMapper.deleteAmzTaskNotificationByNotifyId(notifyId);
    }
}
