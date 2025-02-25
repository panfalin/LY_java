package com.ruoyi.amazon.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.ruoyi.amazon.dto.AmzDataAnalysisTurnoverDTO;
import com.ruoyi.amazon.dto.TurnoverStatsDTO;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.amazon.mapper.AmzDataAnalysisTurnoverMskulistMapper;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverMskulist;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverMskulistService;

import javax.annotation.Resource;

/**
 * 亚马逊数据分析，周转率，mskulist，这个是基础信息Service业务层处理
 *
 * @author panfalin
 * @date 2025-02-19
 */
@Service
public class AmzDataAnalysisTurnoverMskulistServiceImpl implements IAmzDataAnalysisTurnoverMskulistService {
    @Resource
    private AmzDataAnalysisTurnoverMskulistMapper amzDataAnalysisTurnoverMskulistMapper;

    /**
     * 查询亚马逊数据分析，周转率，mskulist，这个是基础信息
     *
     * @param id 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    @Override
    public AmzDataAnalysisTurnoverMskulist selectAmzDataAnalysisTurnoverMskulistById(Long id) {
        return amzDataAnalysisTurnoverMskulistMapper.selectAmzDataAnalysisTurnoverMskulistById(id);
    }

    /**
     * 查询亚马逊数据分析，周转率，mskulist，这个是基础信息列表
     *
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息
     * @return 亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    @Override
    public List<AmzDataAnalysisTurnoverMskulist> selectAmzDataAnalysisTurnoverMskulistList(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist) {
        return amzDataAnalysisTurnoverMskulistMapper.selectAmzDataAnalysisTurnoverMskulistList(amzDataAnalysisTurnoverMskulist);
    }

    /**
     * 新增亚马逊数据分析，周转率，mskulist，这个是基础信息
     *
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息
     * @return 结果
     */
    @Override
    public int insertAmzDataAnalysisTurnoverMskulist(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist) {
        return amzDataAnalysisTurnoverMskulistMapper.insertAmzDataAnalysisTurnoverMskulist(amzDataAnalysisTurnoverMskulist);
    }

    /**
     * 修改亚马逊数据分析，周转率，mskulist，这个是基础信息
     *
     * @param amzDataAnalysisTurnoverMskulist 亚马逊数据分析，周转率，mskulist，这个是基础信息
     * @return 结果
     */
    @Override
    public int updateAmzDataAnalysisTurnoverMskulist(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist) {
        amzDataAnalysisTurnoverMskulist.setUpdateTime(DateUtils.getNowDate());
        return amzDataAnalysisTurnoverMskulistMapper.updateAmzDataAnalysisTurnoverMskulist(amzDataAnalysisTurnoverMskulist);
    }

    /**
     * 批量删除亚马逊数据分析，周转率，mskulist，这个是基础信息
     *
     * @param ids 需要删除的亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 结果
     */
    @Override
    public int deleteAmzDataAnalysisTurnoverMskulistByIds(Long[] ids) {
        return amzDataAnalysisTurnoverMskulistMapper.deleteAmzDataAnalysisTurnoverMskulistByIds(ids);
    }

    /**
     * 删除亚马逊数据分析，周转率，mskulist，这个是基础信息信息
     *
     * @param id 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 结果
     */
    @Override
    public int deleteAmzDataAnalysisTurnoverMskulistById(Long id) {
        return amzDataAnalysisTurnoverMskulistMapper.deleteAmzDataAnalysisTurnoverMskulistById(id);
    }

    /**
     * 亚马逊数据分析，周转率，mskulist，这个是基础信息信息
     * 这个接口是亚马逊周转数据汇总
     *
     * @param map 亚马逊数据分析，周转率，mskulist，这个是基础信息主键
     * @return 结果
     */
    @Override
    public AmzDataAnalysisTurnoverDTO getAmzDataAnalysisTurnoverMskulistAll(Map<String, Object> map) {
        AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist = new AmzDataAnalysisTurnoverMskulist();
        // 从 map 中获取 store_name
        String storeName = (String) map.get("storeName");
        String salesPerson = (String) map.get("salesPerson");
        String categoryLevelOne = (String) map.get("categoryLevelOne");
        String categoryLevelTwo = (String) map.get("categoryLevelTwo");
        String developer = (String) map.get("developer");

        // 如果 store_name 不为空，则设置到对象中
        if (storeName != null && !storeName.trim().isEmpty()) {
            amzDataAnalysisTurnoverMskulist.setStoreName(storeName);
        }
        if (salesPerson != null && !salesPerson.trim().isEmpty()) {
            amzDataAnalysisTurnoverMskulist.setSalesPerson(salesPerson);
        }
        if (categoryLevelOne != null && !categoryLevelOne.trim().isEmpty()) {
            amzDataAnalysisTurnoverMskulist.setCategoryLevelOne(categoryLevelOne);
        }
        if (categoryLevelTwo != null && !categoryLevelTwo.trim().isEmpty()) {
            amzDataAnalysisTurnoverMskulist.setCategoryLevelTwo(categoryLevelTwo);
        }
        if (developer != null && !developer.trim().isEmpty()) {
            amzDataAnalysisTurnoverMskulist.setDeveloper(developer);
        }
        // 获取基础汇总数据
        AmzDataAnalysisTurnoverDTO summary = amzDataAnalysisTurnoverMskulistMapper
                .selectAmzDataAnalysisTurnoverMskulistSummary(amzDataAnalysisTurnoverMskulist);

        // 获取周转天数统计数据
        List<TurnoverStatsDTO> turnoverStats = amzDataAnalysisTurnoverMskulistMapper
                .selectTurnoverStats(amzDataAnalysisTurnoverMskulist);

        // 获取FBA周转天数统计数据
        List<TurnoverStatsDTO> fbaTurnoverStats = amzDataAnalysisTurnoverMskulistMapper
                .selectFbaTurnoverStats(amzDataAnalysisTurnoverMskulist);

        summary.setTurnoverStats(turnoverStats);
        summary.setFbaTurnoverStats(fbaTurnoverStats);

        return summary;
    }

    public List<String> selectDistinctStoreNames() {
        return amzDataAnalysisTurnoverMskulistMapper.selectDistinctStoreNames();
    }

    public List<String> selectDistinctSalesPersons() {
        return amzDataAnalysisTurnoverMskulistMapper.selectDistinctSalesPersons();
    }

    public List<String> selectDistinctDevelopers() {
        return amzDataAnalysisTurnoverMskulistMapper.selectDistinctDevelopers();
    }
}
