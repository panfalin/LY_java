package com.ruoyi.amazon.service.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
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
        String turnoverRange = amzDataAnalysisTurnoverMskulist.getTurnoverRange();
        // 根据 turnoverRange 设置最小和最大周转天数
        if (turnoverRange != null) {
            switch (turnoverRange) {
                case "over360":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(BigDecimal.valueOf(360));
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(null); // 不限制最大值
                    break;
                case "d270_360":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(BigDecimal.valueOf(270));
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(BigDecimal.valueOf(360));
                    break;
                case "d210_270":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(BigDecimal.valueOf(210));
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(BigDecimal.valueOf(270));
                    break;
                case "d150_210":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(BigDecimal.valueOf(150));
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(BigDecimal.valueOf(210));
                    break;
                case "d120_150":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(BigDecimal.valueOf(120));
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(BigDecimal.valueOf(150));
                    break;
                case "d60_120":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(BigDecimal.valueOf(60));
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(BigDecimal.valueOf(120));
                    break;
                case "under60":
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(null); // 不限制最小值
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(BigDecimal.valueOf(60));
                    break;
                default:
                    // 如果 turnoverRange 不在预定义范围内，可以选择抛出异常或设置默认值
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(null);
                    amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(null);
                    break;
            }
        }

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
        // TODO: 现在需要加入对比数，从前端返回的date_range中获取
        AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist = new AmzDataAnalysisTurnoverMskulist();
        // 从 map 中获取 store_name
        String storeName = (String) map.get("storeName");
        String salesPerson = (String) map.get("salesPerson");
        String categoryLevelOne = (String) map.get("categoryLevelOne");
        String categoryLevelTwo = (String) map.get("categoryLevelTwo");
        String developer = (String) map.get("developer");
        BigDecimal turnoverDaysMin = (BigDecimal) map.get("turnoverDaysMin");
        BigDecimal turnoverDaysMax = (BigDecimal) map.get("turnoverDaysMax");
        // TODO 这里还缺快捷搜索
        String quickFilter = (String) map.get("quickFilter");


        if (quickFilter != null) {
            switch (quickFilter) {
                case "after2024":
                    amzDataAnalysisTurnoverMskulist.setBeginTime(Date.valueOf("2024-01-01"));
                    amzDataAnalysisTurnoverMskulist.setEndTime(null);
                    break;
                case "before2024":
                    amzDataAnalysisTurnoverMskulist.setBeginTime(null); // 不限制开始时间
                    amzDataAnalysisTurnoverMskulist.setEndTime(Date.valueOf("2023-12-31")); // 设置结束时间为2023年12月31日a
                default:
                    amzDataAnalysisTurnoverMskulist.setBeginTime(null);
                    amzDataAnalysisTurnoverMskulist.setEndTime(null);
            }
        }

        List<String> shelfTimeArray = (List<String>) map.get("inventoryShelfTimeRange"); // 确保类型是List<String>
        if (shelfTimeArray != null && shelfTimeArray.size() > 1) {
            try {
                Date beginTime = Date.valueOf(shelfTimeArray.get(0)); // 需要是 "yyyy-MM-dd" 格式
                Date endTime = Date.valueOf(shelfTimeArray.get(1));
                amzDataAnalysisTurnoverMskulist.setBeginTime(beginTime);
                amzDataAnalysisTurnoverMskulist.setEndTime(endTime);
            } catch (IllegalArgumentException e) {
                System.out.println("日期格式错误: " + e.getMessage());
            }
        }

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
        if (turnoverDaysMin != null) {
            amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(turnoverDaysMin);
        }
        if (turnoverDaysMax != null) {
            amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(turnoverDaysMax);
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
