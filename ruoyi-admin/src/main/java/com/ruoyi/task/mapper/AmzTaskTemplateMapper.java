package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskTemplate;

import java.util.List;

/**
 * 亚马逊任务模板Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface AmzTaskTemplateMapper {
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
     * 删除亚马逊任务模板
     *
     * @param templateId 亚马逊任务模板主键
     * @return 结果
     */
    public int deleteAmzTaskTemplateByTemplateId(Long templateId);

    /**
     * 批量删除亚马逊任务模板
     *
     * @param templateIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskTemplateByTemplateIds(Long[] templateIds);
}
