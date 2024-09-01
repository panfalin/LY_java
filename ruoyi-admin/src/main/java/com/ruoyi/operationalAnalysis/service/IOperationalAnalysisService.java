package com.ruoyi.operationalAnalysis.service;

import java.util.List;
import com.ruoyi.operationalAnalysis.domain.OperationalAnalysis;

/**
 * 运营分析Service接口
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public interface IOperationalAnalysisService 
{
    /**
     * 查询运营分析
     * 
     * @param id 运营分析主键
     * @return 运营分析
     */
    public OperationalAnalysis selectOperationalAnalysisById(Long id);

    /**
     * 查询运营分析列表
     * 
     * @param operationalAnalysis 运营分析
     * @return 运营分析集合
     */
    public List<OperationalAnalysis> selectOperationalAnalysisList(OperationalAnalysis operationalAnalysis);

    /**
     * 新增运营分析
     * 
     * @param operationalAnalysis 运营分析
     * @return 结果
     */
    public int insertOperationalAnalysis(OperationalAnalysis operationalAnalysis);

    /**
     * 修改运营分析
     * 
     * @param operationalAnalysis 运营分析
     * @return 结果
     */
    public int updateOperationalAnalysis(OperationalAnalysis operationalAnalysis);

    /**
     * 批量删除运营分析
     * 
     * @param ids 需要删除的运营分析主键集合
     * @return 结果
     */
    public int deleteOperationalAnalysisByIds(Long[] ids);

    /**
     * 删除运营分析信息
     * 
     * @param id 运营分析主键
     * @return 结果
     */
    public int deleteOperationalAnalysisById(Long id);
}
