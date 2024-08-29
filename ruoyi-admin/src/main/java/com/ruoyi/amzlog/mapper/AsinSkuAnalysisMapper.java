package com.ruoyi.amzlog.mapper;

import java.util.List;
import com.ruoyi.amzlog.domain.AsinSkuAnalysis;

/**
 * amzlogMapper接口
 * 
 * @author ruoyi
 * @date 2024-08-29
 */
public interface AsinSkuAnalysisMapper 
{
    /**
     * 查询amzlog
     * 
     * @param id amzlog主键
     * @return amzlog
     */
    public AsinSkuAnalysis selectAsinSkuAnalysisById(Long id);

    /**
     * 查询amzlog列表
     * 
     * @param asinSkuAnalysis amzlog
     * @return amzlog集合
     */
    public List<AsinSkuAnalysis> selectAsinSkuAnalysisList(AsinSkuAnalysis asinSkuAnalysis);

    /**
     * 新增amzlog
     * 
     * @param asinSkuAnalysis amzlog
     * @return 结果
     */
    public int insertAsinSkuAnalysis(AsinSkuAnalysis asinSkuAnalysis);

    /**
     * 修改amzlog
     * 
     * @param asinSkuAnalysis amzlog
     * @return 结果
     */
    public int updateAsinSkuAnalysis(AsinSkuAnalysis asinSkuAnalysis);

    /**
     * 删除amzlog
     * 
     * @param id amzlog主键
     * @return 结果
     */
    public int deleteAsinSkuAnalysisById(Long id);

    /**
     * 批量删除amzlog
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAsinSkuAnalysisByIds(Long[] ids);
}
