package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskReportConfig;
import com.ruoyi.task.mapper.AmzTaskReportConfigMapper;
import com.ruoyi.task.service.IAmzTaskReportConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务报配置Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskReportConfigServiceImpl implements IAmzTaskReportConfigService {
    @Autowired
    private AmzTaskReportConfigMapper amzTaskReportConfigMapper;

    /**
     * 查询亚马逊任务报配置
     *
     * @param configId 亚马逊任务报配置主键
     * @return 亚马逊任务报配置
     */
    @Override
    public AmzTaskReportConfig selectAmzTaskReportConfigByConfigId(Long configId) {
        return amzTaskReportConfigMapper.selectAmzTaskReportConfigByConfigId(configId);
    }

    /**
     * 查询亚马逊任务报配置列表
     *
     * @param amzTaskReportConfig 亚马逊任务报配置
     * @return 亚马逊任务报配置
     */
    @Override
    public List<AmzTaskReportConfig> selectAmzTaskReportConfigList(AmzTaskReportConfig amzTaskReportConfig) {
        return amzTaskReportConfigMapper.selectAmzTaskReportConfigList(amzTaskReportConfig);
    }

    /**
     * 新增亚马逊任务报配置
     *
     * @param amzTaskReportConfig 亚马逊任务报配置
     * @return 结果
     */
    @Override
    public int insertAmzTaskReportConfig(AmzTaskReportConfig amzTaskReportConfig) {
        amzTaskReportConfig.setCreateTime(DateUtils.getNowDate());
        return amzTaskReportConfigMapper.insertAmzTaskReportConfig(amzTaskReportConfig);
    }

    /**
     * 修改亚马逊任务报配置
     *
     * @param amzTaskReportConfig 亚马逊任务报配置
     * @return 结果
     */
    @Override
    public int updateAmzTaskReportConfig(AmzTaskReportConfig amzTaskReportConfig) {
        amzTaskReportConfig.setUpdateTime(DateUtils.getNowDate());
        return amzTaskReportConfigMapper.updateAmzTaskReportConfig(amzTaskReportConfig);
    }

    /**
     * 批量删除亚马逊任务报配置
     *
     * @param configIds 需要删除的亚马逊任务报配置主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskReportConfigByConfigIds(Long[] configIds) {
        return amzTaskReportConfigMapper.deleteAmzTaskReportConfigByConfigIds(configIds);
    }

    /**
     * 删除亚马逊任务报配置信息
     *
     * @param configId 亚马逊任务报配置主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskReportConfigByConfigId(Long configId) {
        return amzTaskReportConfigMapper.deleteAmzTaskReportConfigByConfigId(configId);
    }
}
