package com.ruoyi.amazon.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.amazon.mapper.AmzDataAnalysisTurnoverOperationalAnalysisMapper;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverOperationalAnalysis;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverOperationalAnalysisService;

/**
 * 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-04
 */
@Service
public class AmzDataAnalysisTurnoverOperationalAnalysisServiceImpl implements IAmzDataAnalysisTurnoverOperationalAnalysisService 
{
    @Autowired
    private AmzDataAnalysisTurnoverOperationalAnalysisMapper amzDataAnalysisTurnoverOperationalAnalysisMapper;

    /**
     * 查询亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param id 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键
     * @return 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     */
    @Override
    public AmzDataAnalysisTurnoverOperationalAnalysis selectAmzDataAnalysisTurnoverOperationalAnalysisById(Long id)
    {
        return amzDataAnalysisTurnoverOperationalAnalysisMapper.selectAmzDataAnalysisTurnoverOperationalAnalysisById(id);
    }

    /**
     * 查询亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联列表
     * 
     * @param amzDataAnalysisTurnoverOperationalAnalysis 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * @return 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     */
    @Override
    public List<AmzDataAnalysisTurnoverOperationalAnalysis> selectAmzDataAnalysisTurnoverOperationalAnalysisList(AmzDataAnalysisTurnoverOperationalAnalysis amzDataAnalysisTurnoverOperationalAnalysis)
    {
        return amzDataAnalysisTurnoverOperationalAnalysisMapper.selectAmzDataAnalysisTurnoverOperationalAnalysisList(amzDataAnalysisTurnoverOperationalAnalysis);
    }

    /**
     * 新增亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param amzDataAnalysisTurnoverOperationalAnalysis 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * @return 结果
     */
    @Override
    public int insertAmzDataAnalysisTurnoverOperationalAnalysis(AmzDataAnalysisTurnoverOperationalAnalysis amzDataAnalysisTurnoverOperationalAnalysis)
    {
        return amzDataAnalysisTurnoverOperationalAnalysisMapper.insertAmzDataAnalysisTurnoverOperationalAnalysis(amzDataAnalysisTurnoverOperationalAnalysis);
    }

    /**
     * 修改亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param amzDataAnalysisTurnoverOperationalAnalysis 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * @return 结果
     */
    @Override
    public int updateAmzDataAnalysisTurnoverOperationalAnalysis(AmzDataAnalysisTurnoverOperationalAnalysis amzDataAnalysisTurnoverOperationalAnalysis)
    {
        amzDataAnalysisTurnoverOperationalAnalysis.setUpdateTime(DateUtils.getNowDate());
        return amzDataAnalysisTurnoverOperationalAnalysisMapper.updateAmzDataAnalysisTurnoverOperationalAnalysis(amzDataAnalysisTurnoverOperationalAnalysis);
    }

    /**
     * 批量删除亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param ids 需要删除的亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键
     * @return 结果
     */
    @Override
    public int deleteAmzDataAnalysisTurnoverOperationalAnalysisByIds(Long[] ids)
    {
        return amzDataAnalysisTurnoverOperationalAnalysisMapper.deleteAmzDataAnalysisTurnoverOperationalAnalysisByIds(ids);
    }

    /**
     * 删除亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联信息
     * 
     * @param id 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键
     * @return 结果
     */
    @Override
    public int deleteAmzDataAnalysisTurnoverOperationalAnalysisById(Long id)
    {
        return amzDataAnalysisTurnoverOperationalAnalysisMapper.deleteAmzDataAnalysisTurnoverOperationalAnalysisById(id);
    }
}
