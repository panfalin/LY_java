package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskReportConfig;

import java.util.List;

/**
 * 亚马逊任务报配置Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface AmzTaskReportConfigMapper {
    /**
     * 查询亚马逊任务报配置
     *
     * @param configId 亚马逊任务报配置主键
     * @return 亚马逊任务报配置
     */
    public AmzTaskReportConfig selectAmzTaskReportConfigByConfigId(Long configId);

    /**
     * 查询亚马逊任务报配置列表
     *
     * @param amzTaskReportConfig 亚马逊任务报配置
     * @return 亚马逊任务报配置集合
     */
    public List<AmzTaskReportConfig> selectAmzTaskReportConfigList(AmzTaskReportConfig amzTaskReportConfig);

    /**
     * 新增亚马逊任务报配置
     *
     * @param amzTaskReportConfig 亚马逊任务报配置
     * @return 结果
     */
    public int insertAmzTaskReportConfig(AmzTaskReportConfig amzTaskReportConfig);

    /**
     * 修改亚马逊任务报配置
     *
     * @param amzTaskReportConfig 亚马逊任务报配置
     * @return 结果
     */
    public int updateAmzTaskReportConfig(AmzTaskReportConfig amzTaskReportConfig);

    /**
     * 删除亚马逊任务报配置
     *
     * @param configId 亚马逊任务报配置主键
     * @return 结果
     */
    public int deleteAmzTaskReportConfigByConfigId(Long configId);

    /**
     * 批量删除亚马逊任务报配置
     *
     * @param configIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskReportConfigByConfigIds(Long[] configIds);
}
