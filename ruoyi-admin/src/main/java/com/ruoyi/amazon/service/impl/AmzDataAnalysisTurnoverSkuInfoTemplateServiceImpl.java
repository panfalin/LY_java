package com.ruoyi.amazon.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.amazon.mapper.AmzDataAnalysisTurnoverSkuInfoTemplateMapper;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverSkuInfoTemplate;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverSkuInfoTemplateService;

/**
 * templateService业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-04
 */
@Service
public class AmzDataAnalysisTurnoverSkuInfoTemplateServiceImpl implements IAmzDataAnalysisTurnoverSkuInfoTemplateService 
{
    @Autowired
    private AmzDataAnalysisTurnoverSkuInfoTemplateMapper amzDataAnalysisTurnoverSkuInfoTemplateMapper;

    /**
     * 查询template
     * 
     * @param id template主键
     * @return template
     */
    @Override
    public AmzDataAnalysisTurnoverSkuInfoTemplate selectAmzDataAnalysisTurnoverSkuInfoTemplateById(Long id)
    {
        return amzDataAnalysisTurnoverSkuInfoTemplateMapper.selectAmzDataAnalysisTurnoverSkuInfoTemplateById(id);
    }

    /**
     * 查询template列表
     * 
     * @param amzDataAnalysisTurnoverSkuInfoTemplate template
     * @return template
     */
    @Override
    public List<AmzDataAnalysisTurnoverSkuInfoTemplate> selectAmzDataAnalysisTurnoverSkuInfoTemplateList(AmzDataAnalysisTurnoverSkuInfoTemplate amzDataAnalysisTurnoverSkuInfoTemplate)
    {
        return amzDataAnalysisTurnoverSkuInfoTemplateMapper.selectAmzDataAnalysisTurnoverSkuInfoTemplateList(amzDataAnalysisTurnoverSkuInfoTemplate);
    }

    /**
     * 新增template
     * 
     * @param amzDataAnalysisTurnoverSkuInfoTemplate template
     * @return 结果
     */
    @Override
    public int insertAmzDataAnalysisTurnoverSkuInfoTemplate(AmzDataAnalysisTurnoverSkuInfoTemplate amzDataAnalysisTurnoverSkuInfoTemplate)
    {
        return amzDataAnalysisTurnoverSkuInfoTemplateMapper.insertAmzDataAnalysisTurnoverSkuInfoTemplate(amzDataAnalysisTurnoverSkuInfoTemplate);
    }

    /**
     * 修改template
     * 
     * @param amzDataAnalysisTurnoverSkuInfoTemplate template
     * @return 结果
     */
    @Override
    public int updateAmzDataAnalysisTurnoverSkuInfoTemplate(AmzDataAnalysisTurnoverSkuInfoTemplate amzDataAnalysisTurnoverSkuInfoTemplate)
    {
        amzDataAnalysisTurnoverSkuInfoTemplate.setUpdateTime(DateUtils.getNowDate());
        return amzDataAnalysisTurnoverSkuInfoTemplateMapper.updateAmzDataAnalysisTurnoverSkuInfoTemplate(amzDataAnalysisTurnoverSkuInfoTemplate);
    }

    /**
     * 批量删除template
     * 
     * @param ids 需要删除的template主键
     * @return 结果
     */
    @Override
    public int deleteAmzDataAnalysisTurnoverSkuInfoTemplateByIds(Long[] ids)
    {
        return amzDataAnalysisTurnoverSkuInfoTemplateMapper.deleteAmzDataAnalysisTurnoverSkuInfoTemplateByIds(ids);
    }

    /**
     * 删除template信息
     * 
     * @param id template主键
     * @return 结果
     */
    @Override
    public int deleteAmzDataAnalysisTurnoverSkuInfoTemplateById(Long id)
    {
        return amzDataAnalysisTurnoverSkuInfoTemplateMapper.deleteAmzDataAnalysisTurnoverSkuInfoTemplateById(id);
    }
}
