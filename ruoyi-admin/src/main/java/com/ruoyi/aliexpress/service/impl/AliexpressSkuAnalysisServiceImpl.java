package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressSkuAnalysisMapper;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.service.IAliexpressSkuAnalysisService;

import javax.annotation.Resource;

/**
 * 速卖通滞销SKU分析Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-21
 */
@Service
public class AliexpressSkuAnalysisServiceImpl implements IAliexpressSkuAnalysisService 
{
    @Resource
    private AliexpressSkuAnalysisMapper aliexpressSkuAnalysisMapper;

    /**
     * 查询速卖通滞销SKU分析
     * 
     * @param id 速卖通滞销SKU分析主键
     * @return 速卖通滞销SKU分析
     */
    @Override
    public AliexpressSkuAnalysis selectAliexpressSkuAnalysisById(Long id)
    {
        return aliexpressSkuAnalysisMapper.selectAliexpressSkuAnalysisById(id);
    }

    /**
     * 查询速卖通滞销SKU分析列表
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 速卖通滞销SKU分析
     */
    @Override
    public List<AliexpressSkuAnalysis> selectAliexpressSkuAnalysisList(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        aliexpressSkuAnalysis.setSales28Days(0L);
        return aliexpressSkuAnalysisMapper.selectAliexpressSkuAnalysisList(aliexpressSkuAnalysis);
    }

    /**
     * 新增速卖通滞销SKU分析
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 结果
     */
    @Override
    public int insertAliexpressSkuAnalysis(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        return aliexpressSkuAnalysisMapper.insertAliexpressSkuAnalysis(aliexpressSkuAnalysis);
    }

    /**
     * 修改速卖通滞销SKU分析
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 结果
     */
    @Override
    public int updateAliexpressSkuAnalysis(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        return aliexpressSkuAnalysisMapper.updateAliexpressSkuAnalysis(aliexpressSkuAnalysis);
    }

    /**
     * 批量删除速卖通滞销SKU分析
     * 
     * @param ids 需要删除的速卖通滞销SKU分析主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressSkuAnalysisByIds(Long[] ids)
    {
        return aliexpressSkuAnalysisMapper.deleteAliexpressSkuAnalysisByIds(ids);
    }

    /**
     * 删除速卖通滞销SKU分析信息
     * 
     * @param id 速卖通滞销SKU分析主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressSkuAnalysisById(Long id)
    {
        return aliexpressSkuAnalysisMapper.deleteAliexpressSkuAnalysisById(id);
    }
}
