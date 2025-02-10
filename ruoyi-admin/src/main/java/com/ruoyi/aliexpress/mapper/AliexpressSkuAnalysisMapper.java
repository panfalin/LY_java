package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisAttribute;
import com.ruoyi.aliexpress.domain.AliexpressSkuStatistics;

/**
 * 速卖通滞销SKU分析Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-21
 */
public interface AliexpressSkuAnalysisMapper 
{
    /**
     * 查询速卖通滞销SKU分析
     * 
     * @param id 速卖通滞销SKU分析主键
     * @return 速卖通滞销SKU分析
     */
    public AliexpressSkuAnalysis selectAliexpressSkuAnalysisById(Long id);

    /**
     * 查询速卖通滞销SKU分析列表
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 速卖通滞销SKU分析集合
     */
    public List<AliexpressSkuAnalysis> selectAliexpressSkuAnalysisList(AliexpressSkuAnalysis aliexpressSkuAnalysis);


    public List<AliexpressSkuAnalysisAttribute> selectAliexpressSkuAnalysisAttributeList(AliexpressSkuAnalysisAttribute aliexpressSkuAnalysis);

    public List<AliexpressSkuStatistics> selectAliexpressSkuStatistics(AliexpressSkuAnalysis aliexpressSkuAnalysis);

    /**
     * 新增速卖通滞销SKU分析
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 结果
     */
    public int insertAliexpressSkuAnalysis(AliexpressSkuAnalysis aliexpressSkuAnalysis);

    /**
     * 修改速卖通滞销SKU分析
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 结果
     */
    public int updateAliexpressSkuAnalysis(AliexpressSkuAnalysis aliexpressSkuAnalysis);

    /**
     * 删除速卖通滞销SKU分析
     * 
     * @param id 速卖通滞销SKU分析主键
     * @return 结果
     */
    public int deleteAliexpressSkuAnalysisById(Long id);

    /**
     * 批量删除速卖通滞销SKU分析
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressSkuAnalysisByIds(Long[] ids);
}
