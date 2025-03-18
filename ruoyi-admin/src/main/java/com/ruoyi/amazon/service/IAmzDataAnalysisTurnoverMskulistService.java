package com.ruoyi.amazon.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverMskulist;
import com.ruoyi.amazon.dto.AmzDataAnalysisTurnoverDTO;
import com.ruoyi.amazon.dto.AmzStoreRankingDTO;

/**
 * 亚马逊数据分析，周转率，mskulist，这个是基础信息Service接口
 * 
 * @author panfalin
 * @date 2025-02-19
 */
public interface IAmzDataAnalysisTurnoverMskulistService 
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
     * 批量删除亚马逊数据分析，周转率，mskulist，这个是基础信息
     * 
     * @param ids 需要删除的亚马逊数据分析，周转率，mskulist，这个是基础信息主键集合
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverMskulistByIds(Long[] ids);

    /**
     * 删除亚马逊数据分析，周转率，mskulist，这个是基础信息信息
     * 
     * @param id 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 结果
     */
    public int deleteAmzDataAnalysisTurnoverMskulistById(Long id);

    /**
     * 亚马逊数据分析，周转率，mskulist，这个是基础信息信息
     * 这个接口是亚马逊周转数据汇总
     *
     * @param map 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 结果
     */
    public AmzDataAnalysisTurnoverDTO getAmzDataAnalysisTurnoverMskulistAll(Map<String, Object> map);

    public List<String> selectDistinctStoreNames();
    public List<String> selectDistinctSalesPersons();
    public List<String> selectDistinctDevelopers();

    /**
     * 获取店铺排名数据
     * @param queryDTO 查询条件
     * @return 店铺排名列表
     */
    List<AmzStoreRankingDTO> getStoreRanking(AmzDataAnalysisTurnoverMskulist queryDTO);
}
