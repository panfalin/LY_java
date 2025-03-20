package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskTemplate;
import com.ruoyi.task.mapper.AmzTaskTemplateMapper;
import com.ruoyi.task.service.IAmzTaskTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务模板Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskTemplateServiceImpl implements IAmzTaskTemplateService {
    @Autowired
    private AmzTaskTemplateMapper amzTaskTemplateMapper;

    /**
     * 查询亚马逊任务模板
     *
     * @param templateId 亚马逊任务模板主键
     * @return 亚马逊任务模板
     */
    @Override
    public AmzTaskTemplate selectAmzTaskTemplateByTemplateId(Long templateId) {
        return amzTaskTemplateMapper.selectAmzTaskTemplateByTemplateId(templateId);
    }

    /**
     * 查询亚马逊任务模板列表
     *
     * @param amzTaskTemplate 亚马逊任务模板
     * @return 亚马逊任务模板
     */
    @Override
    public List<AmzTaskTemplate> selectAmzTaskTemplateList(AmzTaskTemplate amzTaskTemplate) {
        return amzTaskTemplateMapper.selectAmzTaskTemplateList(amzTaskTemplate);
    }

    /**
     * 新增亚马逊任务模板
     *
     * @param amzTaskTemplate 亚马逊任务模板
     * @return 结果
     */
    @Override
    public int insertAmzTaskTemplate(AmzTaskTemplate amzTaskTemplate) {
        amzTaskTemplate.setCreateTime(DateUtils.getNowDate());
        return amzTaskTemplateMapper.insertAmzTaskTemplate(amzTaskTemplate);
    }

    /**
     * 修改亚马逊任务模板
     *
     * @param amzTaskTemplate 亚马逊任务模板
     * @return 结果
     */
    @Override
    public int updateAmzTaskTemplate(AmzTaskTemplate amzTaskTemplate) {
        amzTaskTemplate.setUpdateTime(DateUtils.getNowDate());
        return amzTaskTemplateMapper.updateAmzTaskTemplate(amzTaskTemplate);
    }

    /**
     * 批量删除亚马逊任务模板
     *
     * @param templateIds 需要删除的亚马逊任务模板主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskTemplateByTemplateIds(Long[] templateIds) {
        return amzTaskTemplateMapper.deleteAmzTaskTemplateByTemplateIds(templateIds);
    }

    /**
     * 删除亚马逊任务模板信息
     *
     * @param templateId 亚马逊任务模板主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskTemplateByTemplateId(Long templateId) {
        return amzTaskTemplateMapper.deleteAmzTaskTemplateByTemplateId(templateId);
    }
}
