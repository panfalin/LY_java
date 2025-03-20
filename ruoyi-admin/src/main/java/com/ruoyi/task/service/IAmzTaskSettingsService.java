package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskSettings;

import java.util.List;

/**
 * 亚马逊任务设置Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskSettingsService {
    /**
     * 查询亚马逊任务设置
     *
     * @param settingId 亚马逊任务设置主键
     * @return 亚马逊任务设置
     */
    public AmzTaskSettings selectAmzTaskSettingsBySettingId(Long settingId);

    /**
     * 查询亚马逊任务设置列表
     *
     * @param amzTaskSettings 亚马逊任务设置
     * @return 亚马逊任务设置集合
     */
    public List<AmzTaskSettings> selectAmzTaskSettingsList(AmzTaskSettings amzTaskSettings);

    /**
     * 新增亚马逊任务设置
     *
     * @param amzTaskSettings 亚马逊任务设置
     * @return 结果
     */
    public int insertAmzTaskSettings(AmzTaskSettings amzTaskSettings);

    /**
     * 修改亚马逊任务设置
     *
     * @param amzTaskSettings 亚马逊任务设置
     * @return 结果
     */
    public int updateAmzTaskSettings(AmzTaskSettings amzTaskSettings);

    /**
     * 批量删除亚马逊任务设置
     *
     * @param settingIds 需要删除的亚马逊任务设置主键集合
     * @return 结果
     */
    public int deleteAmzTaskSettingsBySettingIds(Long[] settingIds);

    /**
     * 删除亚马逊任务设置信息
     *
     * @param settingId 亚马逊任务设置主键
     * @return 结果
     */
    public int deleteAmzTaskSettingsBySettingId(Long settingId);
}
