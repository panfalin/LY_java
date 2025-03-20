package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.task.domain.AmzTaskAssignee;
import com.ruoyi.task.domain.AmzTaskMain;
import com.ruoyi.task.domain.AmzTaskNotification;
import com.ruoyi.task.domain.AmzTaskSubTarget;
import com.ruoyi.task.domain.vo.*;
import com.ruoyi.task.mapper.AmzTaskAssigneeMapper;
import com.ruoyi.task.mapper.AmzTaskMainMapper;
import com.ruoyi.task.mapper.AmzTaskNotificationMapper;
import com.ruoyi.task.mapper.AmzTaskSubTargetMapper;
import com.ruoyi.task.service.IAmzTaskMainService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 亚马逊任务主表Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskMainServiceImpl implements IAmzTaskMainService {
    @Autowired
    private AmzTaskMainMapper amzTaskMainMapper;

    @Autowired
    private AmzTaskNotificationMapper notificationMapper;
    @Autowired
    private AmzTaskSubTargetMapper subTargetMapper;
    @Autowired
    private AmzTaskAssigneeMapper assigneeMapper;

    /**
     * 查询亚马逊任务主表
     *
     * @param taskId 亚马逊任务主表主键
     * @return 亚马逊任务主表
     */
    @Override
    public AmzTaskMain selectAmzTaskMainByTaskId(Long taskId) {
        return amzTaskMainMapper.selectAmzTaskMainByTaskId(taskId);
    }

    /**
     * 查询亚马逊任务主表列表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 亚马逊任务主表
     */
    @Override
    public List<AmzTaskMain> selectAmzTaskMainList(AmzTaskMain amzTaskMain) {
        return amzTaskMainMapper.selectAmzTaskMainList(amzTaskMain);
    }

    /**
     * 新增亚马逊任务主表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 结果
     */
    @Override
    public int insertAmzTaskMain(AmzTaskMain amzTaskMain) {
        amzTaskMain.setCreateTime(DateUtils.getNowDate());
        return amzTaskMainMapper.insertAmzTaskMain(amzTaskMain);
    }

    /**
     * 修改亚马逊任务主表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 结果
     */
    @Override
    public int updateAmzTaskMain(AmzTaskMain amzTaskMain) {
        amzTaskMain.setUpdateTime(DateUtils.getNowDate());
        return amzTaskMainMapper.updateAmzTaskMain(amzTaskMain);
    }

    /**
     * 批量删除亚马逊任务主表
     *
     * @param taskIds 需要删除的亚马逊任务主表主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskMainByTaskIds(Long[] taskIds) {
        return amzTaskMainMapper.deleteAmzTaskMainByTaskIds(taskIds);
    }

    /**
     * 删除亚马逊任务主表信息
     *
     * @param taskId 亚马逊任务主表主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskMainByTaskId(Long taskId) {
        return amzTaskMainMapper.deleteAmzTaskMainByTaskId(taskId);
    }


    /**
     * 以sku的维度查询任务信息
     *
     * @return 结果
     */
    @Override
    public List<SkuTaskVO> selectTaskGroupBySku(AmzTaskMain amzTaskMain) {
        List<SkuTaskVO> skuList = amzTaskMainMapper.selectTaskGroupBySku(amzTaskMain);

        // 查询每个SKU的任务详情
        for (SkuTaskVO sku : skuList) {
            AmzTaskMain query = new AmzTaskMain();
            query.setStoreName(sku.getStoreName());
            query.setSku(sku.getSku());
            List<TaskMainVO> tasks = selectTaskMainVOList(query);
            sku.setTasks(tasks);
        }

        return skuList;
    }

    /**
     * 查询任务列表
     */
    @Override
    public List<TaskMainVO> selectTaskMainVOList(AmzTaskMain amzTaskMain) {
        // 1. 查询主表数据
        List<AmzTaskMain> mainList = amzTaskMainMapper.selectAmzTaskMainList(amzTaskMain);
        if (CollectionUtils.isEmpty(mainList)) {
            return new ArrayList<>();
        }

        // 2. 获取所有taskIds
        List<Long> taskIds = mainList.stream()
                .map(AmzTaskMain::getTaskId)
                .collect(Collectors.toList());

        // 3. 批量查询关联数据
        Map<Long, List<AmzTaskAssignee>> assigneeMap = new HashMap<>();
        Map<Long, List<AmzTaskNotification>> notificationMap = new HashMap<>();
        Map<Long, List<AmzTaskSubTarget>> subTargetMap = new HashMap<>();

        // 批量查询团队成员
        List<AmzTaskAssignee> allAssignees = assigneeMapper.selectAmzTaskAssigneeByTaskIds(taskIds);
        for (AmzTaskAssignee assignee : allAssignees) {
            assigneeMap.computeIfAbsent(assignee.getTaskId(), k -> new ArrayList<>()).add(assignee);
        }

        // 批量查询通知信息
        List<AmzTaskNotification> allNotifications = notificationMapper.selectAmzTaskNotificationByTaskIds(taskIds);
        for (AmzTaskNotification notification : allNotifications) {
            notificationMap.computeIfAbsent(notification.getTaskId(), k -> new ArrayList<>()).add(notification);
        }

        // 批量查询子目标
        List<AmzTaskSubTarget> allSubTargets = subTargetMapper.selectAmzTaskSubTargetByTaskIds(taskIds);
        for (AmzTaskSubTarget subTarget : allSubTargets) {
            subTargetMap.computeIfAbsent(subTarget.getTaskId(), k -> new ArrayList<>()).add(subTarget);
        }

        // 对于没有找到记录的taskId，设置空列表
        for (Long taskId : taskIds) {
            assigneeMap.putIfAbsent(taskId, new ArrayList<>());
            notificationMap.putIfAbsent(taskId, new ArrayList<>());
            subTargetMap.putIfAbsent(taskId, new ArrayList<>());
        }

        // 4. 转换为VO
        return mainList.stream().map(main -> {
            TaskMainVO vo = new TaskMainVO();
            BeanUtils.copyProperties(main, vo);

            // 设置团队成员
            List<AmzTaskAssignee> assignees = assigneeMap.getOrDefault(main.getTaskId(), new ArrayList<>());
            vo.setAssignees(convertToAssigneeVOList(assignees));

            // 设置通知信息
            List<AmzTaskNotification> notifications = notificationMap.getOrDefault(main.getTaskId(), new ArrayList<>());
            vo.setNotifications(convertToNotificationVOList(notifications));
            vo.setNotifyCount(notifications.size());

            // 设置子目标
            List<AmzTaskSubTarget> subTargets = subTargetMap.getOrDefault(main.getTaskId(), new ArrayList<>());
            vo.setCompletedTargets(convertToSubTargetVOList(subTargets));

            // 计算剩余天数
            vo.setRemainingDays(DateUtils.calculateRemainingDays(main.getEndTime()));
            vo.setFinishTime(vo.getRemainingDays() + "天");

            return vo;
        }).collect(Collectors.toList());
    }

    /**
     * 转换为团队成员VO列表
     */
    private List<AssigneeVO> convertToAssigneeVOList(List<AmzTaskAssignee> assignees) {
        if (CollectionUtils.isEmpty(assignees)) {
            return new ArrayList<>();
        }
        return assignees.stream().map(assignee -> {
            AssigneeVO vo = new AssigneeVO();
            BeanUtils.copyProperties(assignee, vo);
            return vo;
        }).collect(Collectors.toList());
    }

    /**
     * 转换为通知信息VO列表
     */
    private List<NotificationVO> convertToNotificationVOList(List<AmzTaskNotification> notifications) {
        if (CollectionUtils.isEmpty(notifications)) {
            return new ArrayList<>();
        }
        return notifications.stream().map(notification -> {
            NotificationVO vo = new NotificationVO();
            BeanUtils.copyProperties(notification, vo);
            return vo;
        }).collect(Collectors.toList());
    }

    /**
     * 转换为子目标VO列表
     */
    private List<SubTargetVO> convertToSubTargetVOList(List<AmzTaskSubTarget> subTargets) {
        if (CollectionUtils.isEmpty(subTargets)) {
            return new ArrayList<>();
        }
        return subTargets.stream().map(subTarget -> {
            SubTargetVO vo = new SubTargetVO();
            BeanUtils.copyProperties(subTarget, vo);
            return vo;
        }).collect(Collectors.toList());
    }
}
