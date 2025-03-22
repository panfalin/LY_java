package com.ruoyi.task.service.impl;

import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverMskulist;
import com.ruoyi.amazon.mapper.AmzDataAnalysisTurnoverMskulistMapper;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
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
import com.ruoyi.system.service.ISysUserService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    @Autowired
    private AmzDataAnalysisTurnoverMskulistMapper amzDataAnalysisTurnoverMskulistMapper;

    @Autowired
    private ISysUserService userService;  // 注入用户服务

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
     * @param taskMain 亚马逊任务主表
     * @return 结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertAmzTaskMain(AmzTaskMain taskMain) {
        try {
            // 1. 生成任务编号
            String taskCode = generateTaskCode();
            int rows = 0;

            // 2. 批量创建任务
            if (taskMain.getTasks() != null && !taskMain.getTasks().isEmpty()) {
                for (AmzTaskSubTarget task : taskMain.getTasks()) {
                    AmzTaskMain newTask = new AmzTaskMain();
                    // 复制基本信息
                    BeanUtils.copyProperties(taskMain, newTask);
                    
                    // 设置任务编号 (添加序号后缀确保唯一)
                    newTask.setTaskCode(taskCode + "_" + (rows + 1));
                    
                    // 设置SKU相关信息
                    newTask.setStoreName(task.getStoreName());
                    newTask.setSku(task.getMsku());
                    newTask.setCurrentValue(task.getCurrentValue());
                    
                    // 计算目标值
                    BigDecimal targetValue = calculateTargetValue(
                        task.getCurrentValue(),
                        taskMain.getChangePercentage(),
                        taskMain.getTargetType()
                    );
                    newTask.setTargetValue(targetValue);
                    
                    // 设置状态和时间
                    newTask.setStatus("running");
                    newTask.setCreateTime(DateUtils.getNowDate());
                    
                    // 插入任务主表
                    amzTaskMainMapper.insertAmzTaskMain(newTask);
                    rows++;
                    
                    // 3. 创建任务指派记录
                    if (task.getTargetId() != null) {
                        // 根据targetId查询SKU负责人信息
                        AmzDataAnalysisTurnoverMskulist mskulist = amzDataAnalysisTurnoverMskulistMapper.selectAmzDataAnalysisTurnoverMskulistById(task.getTargetId());
                        
                        // 创建各角色的指派记录
                        createTaskAssignee(newTask, mskulist.getSalesPerson(), "operator", taskMain);
                        createTaskAssignee(newTask, mskulist.getDeveloper(), "manager", taskMain);
                        createTaskAssignee(newTask, mskulist.getReshaper(), "leader", taskMain);
                    }
                }
            }
            
            return rows;
        } catch (Exception e) {
            throw new ServiceException("创建任务失败：" + e.getMessage());
        }
    }
    
    /**
     * 生成任务编号
     */
    private synchronized String generateTaskCode() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return "TASK" + sdf.format(new Date());
    }
    
    /**
     * 计算目标值
     */
    private BigDecimal calculateTargetValue(BigDecimal currentValue, BigDecimal changePercentage, String targetType) {
        if (currentValue == null || changePercentage == null) {
            return currentValue;
        }
        
        BigDecimal changeRate = changePercentage.divide(new BigDecimal("100"), 4, RoundingMode.HALF_UP);
        if ("increase".equals(targetType)) {
            return currentValue.multiply(BigDecimal.ONE.add(changeRate));
        } else {
            return currentValue.multiply(BigDecimal.ONE.subtract(changeRate));
        }
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

    /**
     * 根据用户名获取用户ID
     */
    private Long getUserIdByUsername(String username) {
        if (username == null) {
            return null;
        }
        SysUser user = userService.selectUserByUserName(username);
        return user != null ? user.getUserId() : null;
    }

    /**
     * 创建任务指派记录
     */
    private void createTaskAssignee(AmzTaskMain task, String username, String roleType, AmzTaskMain taskMain) {
        if (username != null) {
            Long userId = getUserIdByUsername(username);
            if (userId != null) {
                // 写入指派人信息
                AmzTaskAssignee assignee = new AmzTaskAssignee();
                assignee.setTaskId(task.getTaskId());
                assignee.setStoreName(task.getStoreName());
                assignee.setSku(task.getSku());
                assignee.setUserId(userId);
                assignee.setUserName(username);
                assignee.setRoleType(roleType);
                assignee.setIsLeader(0);
                assignee.setAssignType("inherit");
                assignee.setPermissionType("edit");
                assignee.setStartTime(task.getStartTime());
                assignee.setEndTime(task.getEndTime());
                assignee.setStatus("active");
                assignee.setCreateTime(DateUtils.getNowDate());
                assignee.setCreateBy(taskMain.getCreateBy());
                assigneeMapper.insertAmzTaskAssignee(assignee);
            }
        }
    }
}
