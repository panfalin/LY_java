package com.ruoyi.amazon.mapper;

import java.util.List;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverOperationalAnalysis;

/**
 * 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-04
 */
public interface AmzDataAnalysisTurnoverOperationalAnalysisMapper 
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
     * 删除亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param id 亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联主键
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverOperationalAnalysisById(Long id);

    /**
     * 批量删除亚马逊数据分析，周转率，这个存的是商品运营分析
这个与mskulist关联
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverOperationalAnalysisByIds(Long[] ids);
}
