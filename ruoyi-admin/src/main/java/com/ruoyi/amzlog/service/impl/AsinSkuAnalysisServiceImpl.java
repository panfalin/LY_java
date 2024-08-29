package com.ruoyi.amzlog.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.amzlog.mapper.AsinSkuAnalysisMapper;
import com.ruoyi.amzlog.domain.AsinSkuAnalysis;
import com.ruoyi.amzlog.service.IAsinSkuAnalysisService;

/**
 * amzlogService业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-29
 */
@Service
public class AsinSkuAnalysisServiceImpl implements IAsinSkuAnalysisService 
{
    @Autowired
    private AsinSkuAnalysisMapper asinSkuAnalysisMapper;

    /**
     * 查询amzlog
     * 
     * @param id amzlog主键
     * @return amzlog
     */
    @Override
    public AsinSkuAnalysis selectAsinSkuAnalysisById(Long id)
    {
        return asinSkuAnalysisMapper.selectAsinSkuAnalysisById(id);
    }

    /**
     * 查询amzlog列表
     * 
     * @param asinSkuAnalysis amzlog
     * @return amzlog
     */
    @Override
    public List<AsinSkuAnalysis> selectAsinSkuAnalysisList(AsinSkuAnalysis asinSkuAnalysis)
    {
        return asinSkuAnalysisMapper.selectAsinSkuAnalysisList(asinSkuAnalysis);
    }

    /**
     * 新增amzlog
     * 
     * @param asinSkuAnalysis amzlog
     * @return 结果
     */
    @Override
    public int insertAsinSkuAnalysis(AsinSkuAnalysis asinSkuAnalysis)
    {
        return asinSkuAnalysisMapper.insertAsinSkuAnalysis(asinSkuAnalysis);
    }

    /**
     * 修改amzlog
     * 
     * @param asinSkuAnalysis amzlog
     * @return 结果
     */
    @Override
    public int updateAsinSkuAnalysis(AsinSkuAnalysis asinSkuAnalysis)
    {
        asinSkuAnalysis.setUpdateTime(DateUtils.getNowDate());
        return asinSkuAnalysisMapper.updateAsinSkuAnalysis(asinSkuAnalysis);
    }

    /**
     * 批量删除amzlog
     * 
     * @param ids 需要删除的amzlog主键
     * @return 结果
     */
    @Override
    public int deleteAsinSkuAnalysisByIds(Long[] ids)
    {
        return asinSkuAnalysisMapper.deleteAsinSkuAnalysisByIds(ids);
    }

    /**
     * 删除amzlog信息
     * 
     * @param id amzlog主键
     * @return 结果
     */
    @Override
    public int deleteAsinSkuAnalysisById(Long id)
    {
        return asinSkuAnalysisMapper.deleteAsinSkuAnalysisById(id);
    }
}
