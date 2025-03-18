package com.ruoyi.amazon.mapper;

import java.util.List;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverMskulist;
import com.ruoyi.amazon.dto.AmzDataAnalysisTurnoverDTO;
import com.ruoyi.amazon.dto.AmzStoreRankingDTO;
import com.ruoyi.amazon.dto.TurnoverStatsDTO;

/**
 * 亚马逊数据分析，周转率，mskulist，这个是基础信息Mapper接口
 * 
 * @author panfalin
 * @date 2025-02-19
 */
public interface AmzDataAnalysisTurnoverMskulistMapper 
{
    /**
     * 查询亚马逊数据分析，周转率，mskulist，这个是基础信息
     * 
     * @param id 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    public AmzDataAnalysisTurnoverMskulist selectAmzDataAnalysisTurnoverMskulistById(Long id);

    /**
     * 查询亚马逊数据分析，周转率，mskulist，这个是基础信息列表
     * 
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息
     * @return 亚马逊数据分析，周转率，mskulist，这个是基础信息集合
     */
    public List<AmzDataAnalysisTurnoverMskulist> selectAmzDataAnalysisTurnoverMskulistList(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);

    /**
     * 新增亚马逊数据分析，周转率，mskulist，这个是基础信息
     * 
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息
     * @return 结果
     */
    public int insertAmzDataAnalysisTurnoverMskulist(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);

    /**
     * 修改亚马逊数据分析，周转率，mskulist，这个是基础信息
     * 
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息
     * @return 结果
     */
    public int updateAmzDataAnalysisTurnoverMskulist(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);

    /**
     * 删除亚马逊数据分析，周转率，mskulist，这个是基础信息
     * 
     * @param id 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverMskulistById(Long id);

    /**
     * 批量删除亚马逊数据分析，周转率，mskulist，这个是基础信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverMskulistByIds(Long[] ids);

    /**
     * 汇总亚马逊数据分析，周转率，mskulist，这个是基础信息
     *
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    public AmzDataAnalysisTurnoverDTO selectAmzDataAnalysisTurnoverMskulistSummary(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);

    public AmzDataAnalysisTurnoverDTO selectEndAmzDataAnalysisTurnoverMskulistSummary(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);

    public List<TurnoverStatsDTO> selectTurnoverStats(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);

    public List<TurnoverStatsDTO> selectFbaTurnoverStats(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist);
    public List<String> selectDistinctStoreNames();
    public List<String> selectDistinctSalesPersons();
    public List<String> selectDistinctDevelopers();
    /**
     * 查询店铺排名数据
     * @param queryDTO 查询条件
     * @return 店铺排名列表
     */
    List<AmzStoreRankingDTO> selectStoreRanking(AmzDataAnalysisTurnoverMskulist queryDTO);
}
