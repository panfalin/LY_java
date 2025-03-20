package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskNotification;

import java.util.List;

/**
 * 亚马逊任务通知Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskNotificationService {
    /**
     * 查询亚马逊任务通知
     *
     * @param notifyId 亚马逊任务通知主键
     * @return 亚马逊任务通知
     */
    public AmzTaskNotification selectAmzTaskNotificationByNotifyId(Long notifyId);

    /**
     * 查询亚马逊任务通知列表
     *
     * @param amzTaskNotification 亚马逊任务通知
     * @return 亚马逊任务通知集合
     */
    public List<AmzTaskNotification> selectAmzTaskNotificationList(AmzTaskNotification amzTaskNotification);

    /**
     * 新增亚马逊任务通知
     *
     * @param amzTaskNotification 亚马逊任务通知
     * @return 结果
     */
    public int insertAmzTaskNotification(AmzTaskNotification amzTaskNotification);

    /**
     * 修改亚马逊任务通知
     *
     * @param amzTaskNotification 亚马逊任务通知
     * @return 结果
     */
    public int updateAmzTaskNotification(AmzTaskNotification amzTaskNotification);

    /**
     * 批量删除亚马逊任务通知
     *
     * @param notifyIds 需要删除的亚马逊任务通知主键集合
     * @return 结果
     */
    public int deleteAmzTaskNotificationByNotifyIds(Long[] notifyIds);

    /**
     * 删除亚马逊任务通知信息
     *
     * @param notifyId 亚马逊任务通知主键
     * @return 结果
     */
    public int deleteAmzTaskNotificationByNotifyId(Long notifyId);
}
