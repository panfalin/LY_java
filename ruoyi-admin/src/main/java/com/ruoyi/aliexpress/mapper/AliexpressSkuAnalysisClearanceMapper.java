package com.ruoyi.aliexpress.mapper;

import java.util.List;

import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisAttribute;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisClearance;
import com.ruoyi.aliexpress.domain.AliexpressSkuStatistics;

/**
 * 清仓库存Mapper接口
 * 
 * @author ruoyi
 * @date 2025-02-11
 */
public interface AliexpressSkuAnalysisClearanceMapper 
{
    /**
     * 查询清仓库存
     * 
     * @param id 清仓库存主键
     * @return 清仓库存
     */
    public AliexpressSkuAnalysis selectAliexpressSkuAnalysisClearanceById(Long id);

    /**
     * 查询清仓库存列表
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 清仓库存集合
     */
    public List<AliexpressSkuAnalysis> selectAliexpressSkuAnalysisClearanceList(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance);

    public List<AliexpressSkuAnalysisAttribute> selectAliexpressSkuAnalysisAttributeList(AliexpressSkuAnalysisAttribute aliexpressSkuAnalysis);


    public List<AliexpressSkuStatistics> selectAliexpressSkuStatistics(AliexpressSkuAnalysis aliexpressSkuAnalysis);


    /**
     * 新增清仓库存
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 结果
     */
    public int insertAliexpressSkuAnalysisClearance(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance);

    /**
     * 修改清仓库存
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 结果
     */
    public int updateAliexpressSkuAnalysisClearance(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance);

    /**
     * 删除清仓库存
     * 
     * @param id 清仓库存主键
     * @return 结果
     */
    public int deleteAliexpressSkuAnalysisClearanceById(Long id);

    /**
     * 批量删除清仓库存
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressSkuAnalysisClearanceByIds(Long[] ids);
}
