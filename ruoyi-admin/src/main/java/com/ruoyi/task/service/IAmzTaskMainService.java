package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskMain;
import com.ruoyi.task.domain.vo.SkuTaskVO;
import com.ruoyi.task.domain.vo.TaskMainVO;

import java.util.List;

/**
 * 亚马逊任务主表Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskMainService {
    /**
     * 查询亚马逊任务主表
     *
     * @param taskId 亚马逊任务主表主键
     * @return 亚马逊任务主表
     */
    public AmzTaskMain selectAmzTaskMainByTaskId(Long taskId);

    /**
     * 查询亚马逊任务主表列表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 亚马逊任务主表集合
     */
    public List<AmzTaskMain> selectAmzTaskMainList(AmzTaskMain amzTaskMain);

    /**
     * 新增亚马逊任务主表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 结果
     */
    public int insertAmzTaskMain(AmzTaskMain amzTaskMain);

    /**
     * 修改亚马逊任务主表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 结果
     */
    public int updateAmzTaskMain(AmzTaskMain amzTaskMain);

    /**
     * 批量删除亚马逊任务主表
     *
     * @param taskIds 需要删除的亚马逊任务主表主键集合
     * @return 结果
     */
    public int deleteAmzTaskMainByTaskIds(Long[] taskIds);

    /**
     * 查询亚马逊任务主表信息
     *
     * @param taskId 亚马逊任务主表主键
     * @return 结果
     */
    public int deleteAmzTaskMainByTaskId(Long taskId);

    public List<TaskMainVO> selectTaskMainVOList(AmzTaskMain amzTaskMain);

    List<SkuTaskVO> selectTaskGroupBySku(AmzTaskMain amzTaskMain);
}
