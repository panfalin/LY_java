package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskOperationLog;

import java.util.List;

/**
 * 亚马逊任务操作日志Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskOperationLogService {
    /**
     * 查询亚马逊任务操作日志
     *
     * @param logId 亚马逊任务操作日志主键
     * @return 亚马逊任务操作日志
     */
    public AmzTaskOperationLog selectAmzTaskOperationLogByLogId(Long logId);

    /**
     * 查询亚马逊任务操作日志列表
     *
     * @param amzTaskOperationLog 亚马逊任务操作日志
     * @return 亚马逊任务操作日志集合
     */
    public List<AmzTaskOperationLog> selectAmzTaskOperationLogList(AmzTaskOperationLog amzTaskOperationLog);

    /**
     * 新增亚马逊任务操作日志
     *
     * @param amzTaskOperationLog 亚马逊任务操作日志
     * @return 结果
     */
    public int insertAmzTaskOperationLog(AmzTaskOperationLog amzTaskOperationLog);

    /**
     * 修改亚马逊任务操作日志
     *
     * @param amzTaskOperationLog 亚马逊任务操作日志
     * @return 结果
     */
    public int updateAmzTaskOperationLog(AmzTaskOperationLog amzTaskOperationLog);

    /**
     * 批量删除亚马逊任务操作日志
     *
     * @param logIds 需要删除的亚马逊任务操作日志主键集合
     * @return 结果
     */
    public int deleteAmzTaskOperationLogByLogIds(Long[] logIds);

    /**
     * 删除亚马逊任务操作日志信息
     *
     * @param logId 亚马逊任务操作日志主键
     * @return 结果
     */
    public int deleteAmzTaskOperationLogByLogId(Long logId);
}
