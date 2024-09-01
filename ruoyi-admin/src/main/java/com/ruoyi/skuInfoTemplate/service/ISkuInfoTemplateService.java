package com.ruoyi.skuInfoTemplate.service;

import java.util.List;
import com.ruoyi.skuInfoTemplate.domain.SkuInfoTemplate;

/**
 * skuInfoTemplateService接口
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public interface ISkuInfoTemplateService 
{
    /**
     * 查询skuInfoTemplate
     * 
     * @param id skuInfoTemplate主键
     * @return skuInfoTemplate
     */
    public SkuInfoTemplate selectSkuInfoTemplateById(Long id);

    /**
     * 查询skuInfoTemplate列表
     * 
     * @param skuInfoTemplate skuInfoTemplate
     * @return skuInfoTemplate集合
     */
    public List<SkuInfoTemplate> selectSkuInfoTemplateList(SkuInfoTemplate skuInfoTemplate);

    /**
     * 新增skuInfoTemplate
     * 
     * @param skuInfoTemplate skuInfoTemplate
     * @return 结果
     */
    public int insertSkuInfoTemplate(SkuInfoTemplate skuInfoTemplate);

    /**
     * 修改skuInfoTemplate
     * 
     * @param skuInfoTemplate skuInfoTemplate
     * @return 结果
     */
    public int updateSkuInfoTemplate(SkuInfoTemplate skuInfoTemplate);

    /**
     * 批量删除skuInfoTemplate
     * 
     * @param ids 需要删除的skuInfoTemplate主键集合
     * @return 结果
     */
    public int deleteSkuInfoTemplateByIds(Long[] ids);

    /**
     * 删除skuInfoTemplate信息
     * 
     * @param id skuInfoTemplate主键
     * @return 结果
     */
    public int deleteSkuInfoTemplateById(Long id);
}
