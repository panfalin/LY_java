package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskTemplate;

import java.util.List;

/**
 * 亚马逊任务模板Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskTemplateService {
    /**
     * 查询亚马逊任务模板
     *
     * @param templateId 亚马逊任务模板主键
     * @return 亚马逊任务模板
     */
    public AmzTaskTemplate selectAmzTaskTemplateByTemplateId(Long templateId);

    /**
     * 查询亚马逊任务模板列表
     *
     * @param amzTaskTemplate 亚马逊任务模板
     * @return 亚马逊任务模板集合
     */
    public List<AmzTaskTemplate> selectAmzTaskTemplateList(AmzTaskTemplate amzTaskTemplate);

    /**
     * 新增亚马逊任务模板
     *
     * @param amzTaskTemplate 亚马逊任务模板
     * @return 结果
     */
    public int insertAmzTaskTemplate(AmzTaskTemplate amzTaskTemplate);

    /**
     * 修改亚马逊任务模板
     *
     * @param amzTaskTemplate 亚马逊任务模板
     * @return 结果
     */
    public int updateAmzTaskTemplate(AmzTaskTemplate amzTaskTemplate);

    /**
     * 批量删除亚马逊任务模板
     *
     * @param templateIds 需要删除的亚马逊任务模板主键集合
     * @return 结果
     */
    public int deleteAmzTaskTemplateByTemplateIds(Long[] templateIds);

    /**
     * 删除亚马逊任务模板信息
     *
     * @param templateId 亚马逊任务模板主键
     * @return 结果
     */
    public int deleteAmzTaskTemplateByTemplateId(Long templateId);
}
