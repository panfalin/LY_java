package com.ruoyi.operationalAnalysis.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.operationalAnalysis.mapper.OperationalAnalysisMapper;
import com.ruoyi.operationalAnalysis.domain.OperationalAnalysis;
import com.ruoyi.operationalAnalysis.service.IOperationalAnalysisService;

/**
 * 运营分析Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@Service
public class OperationalAnalysisServiceImpl implements IOperationalAnalysisService 
{
    @Autowired
    private OperationalAnalysisMapper operationalAnalysisMapper;

    /**
     * 查询运营分析
     * 
     * @param id 运营分析主键
     * @return 运营分析
     */
    @Override
    public OperationalAnalysis selectOperationalAnalysisById(Long id)
    {
        return operationalAnalysisMapper.selectOperationalAnalysisById(id);
    }

    /**
     * 查询运营分析列表
     * 
     * @param operationalAnalysis 运营分析
     * @return 运营分析
     */
    @Override
    public List<OperationalAnalysis> selectOperationalAnalysisList(OperationalAnalysis operationalAnalysis)
    {
        return operationalAnalysisMapper.selectOperationalAnalysisList(operationalAnalysis);
    }

    /**
     * 新增运营分析
     * 
     * @param operationalAnalysis 运营分析
     * @return 结果
     */
    @Override
    public int insertOperationalAnalysis(OperationalAnalysis operationalAnalysis)
    {
        return operationalAnalysisMapper.insertOperationalAnalysis(operationalAnalysis);
    }

    /**
     * 修改运营分析
     * 
     * @param operationalAnalysis 运营分析
     * @return 结果
     */
    @Override
    public int updateOperationalAnalysis(OperationalAnalysis operationalAnalysis)
    {
        operationalAnalysis.setUpdateTime(DateUtils.getNowDate());
        return operationalAnalysisMapper.updateOperationalAnalysis(operationalAnalysis);
    }

    /**
     * 批量删除运营分析
     * 
     * @param ids 需要删除的运营分析主键
     * @return 结果
     */
    @Override
    public int deleteOperationalAnalysisByIds(Long[] ids)
    {
        return operationalAnalysisMapper.deleteOperationalAnalysisByIds(ids);
    }

    /**
     * 删除运营分析信息
     * 
     * @param id 运营分析主键
     * @return 结果
     */
    @Override
    public int deleteOperationalAnalysisById(Long id)
    {
        return operationalAnalysisMapper.deleteOperationalAnalysisById(id);
    }
}
