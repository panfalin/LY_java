package com.ruoyi.skuInfoTemplate.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.skuInfoTemplate.mapper.SkuInfoTemplateMapper;
import com.ruoyi.skuInfoTemplate.domain.SkuInfoTemplate;
import com.ruoyi.skuInfoTemplate.service.ISkuInfoTemplateService;

/**
 * skuInfoTemplateService业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@Service
public class SkuInfoTemplateServiceImpl implements ISkuInfoTemplateService 
{
    @Autowired
    private SkuInfoTemplateMapper skuInfoTemplateMapper;

    /**
     * 查询skuInfoTemplate
     * 
     * @param id skuInfoTemplate主键
     * @return skuInfoTemplate
     */
    @Override
    public SkuInfoTemplate selectSkuInfoTemplateById(Long id)
    {
        return skuInfoTemplateMapper.selectSkuInfoTemplateById(id);
    }

    /**
     * 查询skuInfoTemplate列表
     * 
     * @param skuInfoTemplate skuInfoTemplate
     * @return skuInfoTemplate
     */
    @Override
    public List<SkuInfoTemplate> selectSkuInfoTemplateList(SkuInfoTemplate skuInfoTemplate)
    {
        return skuInfoTemplateMapper.selectSkuInfoTemplateList(skuInfoTemplate);
    }

    /**
     * 新增skuInfoTemplate
     * 
     * @param skuInfoTemplate skuInfoTemplate
     * @return 结果
     */
    @Override
    public int insertSkuInfoTemplate(SkuInfoTemplate skuInfoTemplate)
    {
        return skuInfoTemplateMapper.insertSkuInfoTemplate(skuInfoTemplate);
    }

    /**
     * 修改skuInfoTemplate
     * 
     * @param skuInfoTemplate skuInfoTemplate
     * @return 结果
     */
    @Override
    public int updateSkuInfoTemplate(SkuInfoTemplate skuInfoTemplate)
    {
        skuInfoTemplate.setUpdateTime(DateUtils.getNowDate());
        return skuInfoTemplateMapper.updateSkuInfoTemplate(skuInfoTemplate);
    }

    /**
     * 批量删除skuInfoTemplate
     * 
     * @param ids 需要删除的skuInfoTemplate主键
     * @return 结果
     */
    @Override
    public int deleteSkuInfoTemplateByIds(Long[] ids)
    {
        return skuInfoTemplateMapper.deleteSkuInfoTemplateByIds(ids);
    }

    /**
     * 删除skuInfoTemplate信息
     * 
     * @param id skuInfoTemplate主键
     * @return 结果
     */
    @Override
    public int deleteSkuInfoTemplateById(Long id)
    {
        return skuInfoTemplateMapper.deleteSkuInfoTemplateById(id);
    }
}
