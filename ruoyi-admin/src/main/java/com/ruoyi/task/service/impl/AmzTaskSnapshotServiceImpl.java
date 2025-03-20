package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskSnapshot;
import com.ruoyi.task.mapper.AmzTaskSnapshotMapper;
import com.ruoyi.task.service.IAmzTaskSnapshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务数据快照Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskSnapshotServiceImpl implements IAmzTaskSnapshotService {
    @Autowired
    private AmzTaskSnapshotMapper amzTaskSnapshotMapper;

    /**
     * 查询亚马逊任务数据快照
     *
     * @param snapshotId 亚马逊任务数据快照主键
     * @return 亚马逊任务数据快照
     */
    @Override
    public AmzTaskSnapshot selectAmzTaskSnapshotBySnapshotId(Long snapshotId) {
        return amzTaskSnapshotMapper.selectAmzTaskSnapshotBySnapshotId(snapshotId);
    }

    /**
     * 查询亚马逊任务数据快照列表
     *
     * @param amzTaskSnapshot 亚马逊任务数据快照
     * @return 亚马逊任务数据快照
     */
    @Override
    public List<AmzTaskSnapshot> selectAmzTaskSnapshotList(AmzTaskSnapshot amzTaskSnapshot) {
        return amzTaskSnapshotMapper.selectAmzTaskSnapshotList(amzTaskSnapshot);
    }

    /**
     * 新增亚马逊任务数据快照
     *
     * @param amzTaskSnapshot 亚马逊任务数据快照
     * @return 结果
     */
    @Override
    public int insertAmzTaskSnapshot(AmzTaskSnapshot amzTaskSnapshot) {
        amzTaskSnapshot.setCreateTime(DateUtils.getNowDate());
        return amzTaskSnapshotMapper.insertAmzTaskSnapshot(amzTaskSnapshot);
    }

    /**
     * 修改亚马逊任务数据快照
     *
     * @param amzTaskSnapshot 亚马逊任务数据快照
     * @return 结果
     */
    @Override
    public int updateAmzTaskSnapshot(AmzTaskSnapshot amzTaskSnapshot) {
        return amzTaskSnapshotMapper.updateAmzTaskSnapshot(amzTaskSnapshot);
    }

    /**
     * 批量删除亚马逊任务数据快照
     *
     * @param snapshotIds 需要删除的亚马逊任务数据快照主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskSnapshotBySnapshotIds(Long[] snapshotIds) {
        return amzTaskSnapshotMapper.deleteAmzTaskSnapshotBySnapshotIds(snapshotIds);
    }

    /**
     * 删除亚马逊任务数据快照信息
     *
     * @param snapshotId 亚马逊任务数据快照主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskSnapshotBySnapshotId(Long snapshotId) {
        return amzTaskSnapshotMapper.deleteAmzTaskSnapshotBySnapshotId(snapshotId);
    }
}
