package com.ruoyi.amazon.service;

import java.util.List;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverSkuInfoTemplate;

/**
 * templateService接口
 * 
 * @author ruoyi
 * @date 2025-03-04
 */
public interface IAmzDataAnalysisTurnoverSkuInfoTemplateService 
{
    /**
     * 查询template
     * 
     * @param id template主键
     * @return template
     */
    public AmzDataAnalysisTurnoverSkuInfoTemplate selectAmzDataAnalysisTurnoverSkuInfoTemplateById(Long id);

    /**
     * 查询template列表
     * 
     * @param amzDataAnalysisTurnoverSkuInfoTemplate template
     * @return template集合
     */
    public List<AmzDataAnalysisTurnoverSkuInfoTemplate> selectAmzDataAnalysisTurnoverSkuInfoTemplateList(AmzDataAnalysisTurnoverSkuInfoTemplate amzDataAnalysisTurnoverSkuInfoTemplate);

    /**
     * 新增template
     * 
     * @param amzDataAnalysisTurnoverSkuInfoTemplate template
     * @return 结果
     */
    public int insertAmzDataAnalysisTurnoverSkuInfoTemplate(AmzDataAnalysisTurnoverSkuInfoTemplate amzDataAnalysisTurnoverSkuInfoTemplate);

    /**
     * 修改template
     * 
     * @param amzDataAnalysisTurnoverSkuInfoTemplate template
     * @return 结果
     */
    public int updateAmzDataAnalysisTurnoverSkuInfoTemplate(AmzDataAnalysisTurnoverSkuInfoTemplate amzDataAnalysisTurnoverSkuInfoTemplate);

    /**
     * 批量删除template
     * 
     * @param ids 需要删除的template主键集合
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverSkuInfoTemplateByIds(Long[] ids);

    /**
     * 删除template信息
     * 
     * @param id template主键
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverSkuInfoTemplateById(Long id);
}
