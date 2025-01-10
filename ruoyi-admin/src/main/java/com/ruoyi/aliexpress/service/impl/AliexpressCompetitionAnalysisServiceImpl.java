package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressCompetitionAnalysisMapper;
import com.ruoyi.aliexpress.domain.AliexpressCompetitionAnalysis;
import com.ruoyi.aliexpress.service.IAliexpressCompetitionAnalysisService;

/**
 * 竞对SKUService业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-10
 */
@Service
public class AliexpressCompetitionAnalysisServiceImpl implements IAliexpressCompetitionAnalysisService 
{
    @Autowired
    private AliexpressCompetitionAnalysisMapper aliexpressCompetitionAnalysisMapper;

    /**
     * 查询竞对SKU
     * 
     * @param sId 竞对SKU主键
     * @return 竞对SKU
     */
    @Override
    public AliexpressCompetitionAnalysis selectAliexpressCompetitionAnalysisBySId(Long sId)
    {
        return aliexpressCompetitionAnalysisMapper.selectAliexpressCompetitionAnalysisBySId(sId);
    }

    /**
     * 查询竞对SKU列表
     * 
     * @param aliexpressCompetitionAnalysis 竞对SKU
     * @return 竞对SKU
     */
    @Override
    public List<AliexpressCompetitionAnalysis> selectAliexpressCompetitionAnalysisList(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        return aliexpressCompetitionAnalysisMapper.selectAliexpressCompetitionAnalysisList(aliexpressCompetitionAnalysis);
    }

    /**
     * 新增竞对SKU
     * 
     * @param aliexpressCompetitionAnalysis 竞对SKU
     * @return 结果
     */
    @Override
    public int insertAliexpressCompetitionAnalysis(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        aliexpressCompetitionAnalysis.setCreateTime(DateUtils.getNowDate());
        return aliexpressCompetitionAnalysisMapper.insertAliexpressCompetitionAnalysis(aliexpressCompetitionAnalysis);
    }

    /**
     * 修改竞对SKU
     * 
     * @param aliexpressCompetitionAnalysis 竞对SKU
     * @return 结果
     */
    @Override
    public int updateAliexpressCompetitionAnalysis(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        return aliexpressCompetitionAnalysisMapper.updateAliexpressCompetitionAnalysis(aliexpressCompetitionAnalysis);
    }

    /**
     * 批量删除竞对SKU
     * 
     * @param sIds 需要删除的竞对SKU主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressCompetitionAnalysisBySIds(Long[] sIds)
    {
        return aliexpressCompetitionAnalysisMapper.deleteAliexpressCompetitionAnalysisBySIds(sIds);
    }

    /**
     * 删除竞对SKU信息
     * 
     * @param sId 竞对SKU主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressCompetitionAnalysisBySId(Long sId)
    {
        return aliexpressCompetitionAnalysisMapper.deleteAliexpressCompetitionAnalysisBySId(sId);
    }
}
