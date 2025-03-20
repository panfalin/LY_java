package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskSnapshot;

import java.util.List;

/**
 * 亚马逊任务数据快照Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface AmzTaskSnapshotMapper {
    /**
     * 查询亚马逊任务数据快照
     *
     * @param snapshotId 亚马逊任务数据快照主键
     * @return 亚马逊任务数据快照
     */
    public AmzTaskSnapshot selectAmzTaskSnapshotBySnapshotId(Long snapshotId);

    /**
     * 查询亚马逊任务数据快照列表
     *
     * @param amzTaskSnapshot 亚马逊任务数据快照
     * @return 亚马逊任务数据快照集合
     */
    public List<AmzTaskSnapshot> selectAmzTaskSnapshotList(AmzTaskSnapshot amzTaskSnapshot);

    /**
     * 新增亚马逊任务数据快照
     *
     * @param amzTaskSnapshot 亚马逊任务数据快照
     * @return 结果
     */
    public int insertAmzTaskSnapshot(AmzTaskSnapshot amzTaskSnapshot);

    /**
     * 修改亚马逊任务数据快照
     *
     * @param amzTaskSnapshot 亚马逊任务数据快照
     * @return 结果
     */
    public int updateAmzTaskSnapshot(AmzTaskSnapshot amzTaskSnapshot);

    /**
     * 删除亚马逊任务数据快照
     *
     * @param snapshotId 亚马逊任务数据快照主键
     * @return 结果
     */
    public int deleteAmzTaskSnapshotBySnapshotId(Long snapshotId);

    /**
     * 批量删除亚马逊任务数据快照
     *
     * @param snapshotIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskSnapshotBySnapshotIds(Long[] snapshotIds);
}
