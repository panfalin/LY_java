package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskSettings;
import com.ruoyi.task.mapper.AmzTaskSettingsMapper;
import com.ruoyi.task.service.IAmzTaskSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务设置Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskSettingsServiceImpl implements IAmzTaskSettingsService {
    @Autowired
    private AmzTaskSettingsMapper amzTaskSettingsMapper;

    /**
     * 查询亚马逊任务设置
     *
     * @param settingId 亚马逊任务设置主键
     * @return 亚马逊任务设置
     */
    @Override
    public AmzTaskSettings selectAmzTaskSettingsBySettingId(Long settingId) {
        return amzTaskSettingsMapper.selectAmzTaskSettingsBySettingId(settingId);
    }

    /**
     * 查询亚马逊任务设置列表
     *
     * @param amzTaskSettings 亚马逊任务设置
     * @return 亚马逊任务设置
     */
    @Override
    public List<AmzTaskSettings> selectAmzTaskSettingsList(AmzTaskSettings amzTaskSettings) {
        return amzTaskSettingsMapper.selectAmzTaskSettingsList(amzTaskSettings);
    }

    /**
     * 新增亚马逊任务设置
     *
     * @param amzTaskSettings 亚马逊任务设置
     * @return 结果
     */
    @Override
    public int insertAmzTaskSettings(AmzTaskSettings amzTaskSettings) {
        amzTaskSettings.setCreateTime(DateUtils.getNowDate());
        return amzTaskSettingsMapper.insertAmzTaskSettings(amzTaskSettings);
    }

    /**
     * 修改亚马逊任务设置
     *
     * @param amzTaskSettings 亚马逊任务设置
     * @return 结果
     */
    @Override
    public int updateAmzTaskSettings(AmzTaskSettings amzTaskSettings) {
        amzTaskSettings.setUpdateTime(DateUtils.getNowDate());
        return amzTaskSettingsMapper.updateAmzTaskSettings(amzTaskSettings);
    }

    /**
     * 批量删除亚马逊任务设置
     *
     * @param settingIds 需要删除的亚马逊任务设置主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskSettingsBySettingIds(Long[] settingIds) {
        return amzTaskSettingsMapper.deleteAmzTaskSettingsBySettingIds(settingIds);
    }

    /**
     * 删除亚马逊任务设置信息
     *
     * @param settingId 亚马逊任务设置主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskSettingsBySettingId(Long settingId) {
        return amzTaskSettingsMapper.deleteAmzTaskSettingsBySettingId(settingId);
    }
}
