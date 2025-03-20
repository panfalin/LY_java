package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskNotification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 亚马逊任务通知Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Mapper
public interface AmzTaskNotificationMapper {
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
     * 删除亚马逊任务通知
     *
     * @param notifyId 亚马逊任务通知主键
     * @return 结果
     */
    public int deleteAmzTaskNotificationByNotifyId(Long notifyId);

    /**
     * 批量删除亚马逊任务通知
     *
     * @param notifyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskNotificationByNotifyIds(Long[] notifyIds);

    /**
     * 查询亚马逊任务通知列表
     *
     * @param taskIds 任务主键集合
     * @return 亚马逊任务通知集合
     */
    public List<AmzTaskNotification> selectAmzTaskNotificationByTaskIds(List<Long> taskIds);
}
