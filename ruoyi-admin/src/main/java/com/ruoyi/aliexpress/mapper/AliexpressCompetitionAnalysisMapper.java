package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressCompetitionAnalysis;

/**
 * 竞对SKUMapper接口
 * 
 * @author ruoyi
 * @date 2025-01-10
 */
public interface AliexpressCompetitionAnalysisMapper 
{
    /**
     * 查询竞对SKU
     * 
     * @param sId 竞对SKU主键
     * @return 竞对SKU
     */
    public AliexpressCompetitionAnalysis selectAliexpressCompetitionAnalysisBySId(Long sId);

    /**
     * 查询竞对SKU列表
     * 
     * @param aliexpressCompetitionAnalysis 竞对SKU
     * @return 竞对SKU集合
     */
    public List<AliexpressCompetitionAnalysis> selectAliexpressCompetitionAnalysisList(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis);

    /**
     * 新增竞对SKU
     * 
     * @param aliexpressCompetitionAnalysis 竞对SKU
     * @return 结果
     */
    public int insertAliexpressCompetitionAnalysis(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis);

    /**
     * 修改竞对SKU
     * 
     * @param aliexpressCompetitionAnalysis 竞对SKU
     * @return 结果
     */
    public int updateAliexpressCompetitionAnalysis(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis);

    /**
     * 删除竞对SKU
     * 
     * @param sId 竞对SKU主键
     * @return 结果
     */
    public int deleteAliexpressCompetitionAnalysisBySId(Long sId);

    /**
     * 批量删除竞对SKU
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressCompetitionAnalysisBySIds(Long[] sIds);
}
