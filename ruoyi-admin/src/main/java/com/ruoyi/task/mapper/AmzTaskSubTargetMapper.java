package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskSubTarget;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 亚马逊任务子目标Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Mapper
public interface AmzTaskSubTargetMapper {
    /**
     * 查询亚马逊任务子目标
     *
     * @param targetId 亚马逊任务子目标主键
     * @return 亚马逊任务子目标
     */
    public AmzTaskSubTarget selectAmzTaskSubTargetByTargetId(Long targetId);

    /**
     * 查询亚马逊任务子目标列表
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 亚马逊任务子目标集合
     */
    public List<AmzTaskSubTarget> selectAmzTaskSubTargetList(AmzTaskSubTarget amzTaskSubTarget);

    /**
     * 新增亚马逊任务子目标
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 结果
     */
    public int insertAmzTaskSubTarget(AmzTaskSubTarget amzTaskSubTarget);

    /**
     * 修改亚马逊任务子目标
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 结果
     */
    public int updateAmzTaskSubTarget(AmzTaskSubTarget amzTaskSubTarget);

    /**
     * 删除亚马逊任务子目标
     *
     * @param targetId 亚马逊任务子目标主键
     * @return 结果
     */
    public int deleteAmzTaskSubTargetByTargetId(Long targetId);

    /**
     * 批量删除亚马逊任务子目标
     *
     * @param targetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskSubTargetByTargetIds(Long[] targetIds);

    /**
     * 查询亚马逊任务子目标列表
     *
     * @param taskIds 任务主键集合
     * @return 亚马逊任务子目标集合
     */
    public List<AmzTaskSubTarget> selectAmzTaskSubTargetByTaskIds(List<Long> taskIds);
}
