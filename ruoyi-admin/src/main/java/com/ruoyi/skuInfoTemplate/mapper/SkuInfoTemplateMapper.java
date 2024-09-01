package com.ruoyi.skuInfoTemplate.mapper;

import java.util.List;
import com.ruoyi.skuInfoTemplate.domain.SkuInfoTemplate;

/**
 * skuInfoTemplateMapper接口
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public interface SkuInfoTemplateMapper 
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
     * 删除skuInfoTemplate
     * 
     * @param id skuInfoTemplate主键
     * @return 结果
     */
    public int deleteSkuInfoTemplateById(Long id);

    /**
     * 批量删除skuInfoTemplate
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSkuInfoTemplateByIds(Long[] ids);
}
