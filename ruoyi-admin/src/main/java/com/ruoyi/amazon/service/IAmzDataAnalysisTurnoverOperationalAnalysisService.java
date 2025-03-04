package com.ruoyi.amazon.service;

import java.util.List;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverOperationalAnalysis;

/**
 * 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联Service接口
 * 
 * @author ruoyi
 * @date 2025-03-04
 */
public interface IAmzDataAnalysisTurnoverOperationalAnalysisService 
{
    /**
     * 查询亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param id 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键
     * @return 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     */
    public AmzDataAnalysisTurnoverOperationalAnalysis selectAmzDataAnalysisTurnoverOperationalAnalysisById(Long id);

    /**
     * 查询亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联列表
     * 
     * @param amzDataAnalysisTurnoverOperationalAnalysis 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * @return 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联集合
     */
    public List<AmzDataAnalysisTurnoverOperationalAnalysis> selectAmzDataAnalysisTurnoverOperationalAnalysisList(AmzDataAnalysisTurnoverOperationalAnalysis amzDataAnalysisTurnoverOperationalAnalysis);

    /**
     * 新增亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param amzDataAnalysisTurnoverOperationalAnalysis 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * @return 结果
     */
    public int insertAmzDataAnalysisTurnoverOperationalAnalysis(AmzDataAnalysisTurnoverOperationalAnalysis amzDataAnalysisTurnoverOperationalAnalysis);

    /**
     * 修改亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param amzDataAnalysisTurnoverOperationalAnalysis 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * @return 结果
     */
    public int updateAmzDataAnalysisTurnoverOperationalAnalysis(AmzDataAnalysisTurnoverOperationalAnalysis amzDataAnalysisTurnoverOperationalAnalysis);

    /**
     * 批量删除亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param ids 需要删除的亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键集合
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverOperationalAnalysisByIds(Long[] ids);

    /**
     * 删除亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联信息
     * 
     * @param id 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverOperationalAnalysisById(Long id);
}
