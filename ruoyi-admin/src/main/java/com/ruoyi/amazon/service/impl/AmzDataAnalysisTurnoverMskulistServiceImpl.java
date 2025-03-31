package com.ruoyi.amazon.service.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.ruoyi.amazon.dto.AmzDataAnalysisTurnoverDTO;
import com.ruoyi.amazon.dto.AmzStoreRankingDTO;
import com.ruoyi.amazon.dto.TurnoverStatsDTO;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.stereotype.Service;
import com.ruoyi.amazon.mapper.AmzDataAnalysisTurnoverMskulistMapper;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverMskulist;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverMskulistService;
import com.ruoyi.amazon.domain.vo.CategoryVO;
import com.ruoyi.amazon.domain.vo.TaskMetricsVO;
import org.springframework.util.StringUtils;

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

    // 将 SimpleDateFormat 定义为 ThreadLocal，避免多线程问题
    private static final ThreadLocal<SimpleDateFormat> dateFormat =
        ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

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

        String storeNames = amzDataAnalysisTurnoverMskulist.getStoreName();
        String salesPersons = amzDataAnalysisTurnoverMskulist.getSalesPerson();
        String developers = amzDataAnalysisTurnoverMskulist.getDeveloper();

        if (storeNames != null && !storeNames.isEmpty()) {
            // 将逗号分隔的字符串拆分为数组
            String[] storeNameArray = storeNames.split(",");
            // 将拆分后的数组传递给查询方法
            amzDataAnalysisTurnoverMskulist.setStoreNameArray(storeNameArray);
        }

        if (salesPersons != null && !salesPersons.isEmpty()) {
            // 将逗号分隔的字符串拆分为数组
            String[] salesArray = salesPersons.split(",");
            // 将拆分后的数组传递给查询方法
            amzDataAnalysisTurnoverMskulist.setSalesPersonArray(salesArray);
        }

        if (developers != null && !developers.isEmpty()) {
            // 将逗号分隔的字符串拆分为数组
            String[] developerArray = developers.split(",");
            // 将拆分后的数组传递给查询方法
            amzDataAnalysisTurnoverMskulist.setDeveloperArray(developerArray);
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
        String reshaper = (String) map.get("reshaper");
        String categoryLevelOne = (String) map.get("categoryLevelOne");
        String categoryLevelTwo = (String) map.get("categoryLevelTwo");
        String developer = (String) map.get("developer");
        BigDecimal turnoverDaysMin = (BigDecimal) map.get("turnoverDaysMin");
        BigDecimal turnoverDaysMax = (BigDecimal) map.get("turnoverDaysMax");
        // TODO 这里还缺快捷搜索
        String quickFilter = (String) map.get("quickFilter");
        try {
            // 处理时间参数
            Calendar calendar = Calendar.getInstance();
            // 转换为 sql.Date，只保留日期部分
            Date currentDate = new Date(calendar.getTimeInMillis());
            Date compareEndDate = null;

            // 获取对比时间范围
            Object compareTimeRangeObj = map.get("compareTimeRange");
            if (compareTimeRangeObj instanceof List) {
                @SuppressWarnings("unchecked")
                List<String> compareTimeRange = (List<String>) compareTimeRangeObj;
                if (compareTimeRange.size() > 1) {
                    try {
                        // 解析日期字符串
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        compareEndDate = new Date(sdf.parse(compareTimeRange.get(1)).getTime());
                    } catch (ParseException e) {
                        // 如果解析失败，使用当天
                        compareEndDate = currentDate;
                    }
                }
            }

            // 如果没有选择对比时间范围，默认使用当天
            if (compareEndDate == null) {
                compareEndDate = currentDate;
            }

            amzDataAnalysisTurnoverMskulist.setCurrentDate(String.valueOf(currentDate));
            amzDataAnalysisTurnoverMskulist.setCompareStartDate("2025-02-26");
            amzDataAnalysisTurnoverMskulist.setCompareEndDate(String.valueOf(new Date(compareEndDate.getTime())));
        } catch (Exception e) {
            // 记录异常并抛出
            throw new ServiceException("获取汇总数据失败");
        }

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
        // 增加重塑人的搜索
        if (reshaper != null && !reshaper.trim().isEmpty()) {
            amzDataAnalysisTurnoverMskulist.setReshaper(reshaper);
        }
        if (turnoverDaysMin != null) {
            amzDataAnalysisTurnoverMskulist.setTurnoverDaysMin(turnoverDaysMin);
        }
        if (turnoverDaysMax != null) {
            amzDataAnalysisTurnoverMskulist.setTurnoverDaysMax(turnoverDaysMax);
        }

        // 获取基础汇总数据
        // 获取当前的数据
        AmzDataAnalysisTurnoverDTO summary = amzDataAnalysisTurnoverMskulistMapper
                .selectAmzDataAnalysisTurnoverMskulistSummary(amzDataAnalysisTurnoverMskulist);

        AmzDataAnalysisTurnoverDTO startDateSummary = amzDataAnalysisTurnoverMskulistMapper
                .selectEndAmzDataAnalysisTurnoverMskulistSummary(amzDataAnalysisTurnoverMskulist);

        // 获取周转天数统计数据
        List<TurnoverStatsDTO> turnoverStats = amzDataAnalysisTurnoverMskulistMapper
                .selectTurnoverStats(amzDataAnalysisTurnoverMskulist);

        // 获取FBA周转天数统计数据
        List<TurnoverStatsDTO> fbaTurnoverStats = amzDataAnalysisTurnoverMskulistMapper
                .selectFbaTurnoverStats(amzDataAnalysisTurnoverMskulist);

        summary.setAmzDataAnalysisTurnoverDTO(startDateSummary);
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

    /**
     * @return
     */
    @Override
    public List<String> selectDistinctResetPersons() {
        return amzDataAnalysisTurnoverMskulistMapper.selectDistinctResetPersons();
    }

    /**
     * 获取店铺排名数据
     *
     * @param queryDTO 查询条件
     * @return 店铺排名列表
     */
    @Override
    public List<AmzStoreRankingDTO> getStoreRanking(AmzDataAnalysisTurnoverMskulist queryDTO) {
        return amzDataAnalysisTurnoverMskulistMapper.selectStoreRanking(queryDTO);
    }

    @Override
    public List<CategoryVO> getCategoryTree() {
        // 1. 查询所有分类
        List<Map<String, Object>> categories = amzDataAnalysisTurnoverMskulistMapper.selectAllCategories();
        
        // 2. 构建树形结构
        Map<String, CategoryVO> levelOneMap = new HashMap<>();
        
        for (Map<String, Object> category : categories) {
            String levelOne = (String) category.get("categoryLevelOne");
            String levelTwo = (String) category.get("categoryLevelTwo");
            Long countLong = (Long) category.get("count");
            Integer count = countLong.intValue();
            
            // 处理一级目录
            CategoryVO levelOneVO = levelOneMap.computeIfAbsent(levelOne, k -> {
                CategoryVO vo = new CategoryVO();
                vo.setLabel(levelOne);
                vo.setValue(levelOne);
                vo.setCount(0);  // 初始化计数
                vo.setChildren(new ArrayList<>());
                return vo;
            });
            
            // 累加一级目录的数量
            levelOneVO.setCount(levelOneVO.getCount() + count);
            
            // 处理二级目录
            if (levelTwo != null) {
                CategoryVO levelTwoVO = new CategoryVO();
                levelTwoVO.setLabel(levelTwo);
                levelTwoVO.setValue(levelTwo);
                levelTwoVO.setCount(count);
                levelOneVO.getChildren().add(levelTwoVO);
            }
        }
        
        // 3. 修改显示标签，添加数量信息
        for (CategoryVO levelOne : levelOneMap.values()) {
            levelOne.setLabel(levelOne.getLabel() + " (" + levelOne.getCount() + ")");
            for (CategoryVO levelTwo : levelOne.getChildren()) {
                levelTwo.setLabel(levelTwo.getLabel() + " (" + levelTwo.getCount() + ")");
            }
        }
        
        // 4. 转换为列表
        return new ArrayList<>(levelOneMap.values());
    }

    @Override
    public List<TaskMetricsVO> getTaskMetrics(List<String> skuList, List<String> storeNameList) {
        if (skuList == null || storeNameList == null || skuList.size() != storeNameList.size()) {
            throw new ServiceException("参数错误：SKU列表和店铺名称列表长度不匹配");
        }
        
        List<Map<String, Object>> metricsList = amzDataAnalysisTurnoverMskulistMapper.selectTaskMetrics(skuList, storeNameList);
        
        return metricsList.stream().map(metrics -> {
            TaskMetricsVO vo = new TaskMetricsVO();
            vo.setMsku((String) metrics.get("msku"));
            vo.setStoreName((String) metrics.get("storeName"));
            
            TaskMetricsVO.MetricsData metricsData = new TaskMetricsVO.MetricsData();
            metricsData.setProfit(new BigDecimal(metrics.get("profit").toString()));
            metricsData.setTurnoverDays(new BigDecimal(metrics.get("turnoverDays").toString()));
            metricsData.setSalesAmount(new BigDecimal(metrics.get("salesAmount").toString()));
            metricsData.setCost(new BigDecimal(metrics.get("cost").toString()));
            metricsData.setInventoryAmount(new BigDecimal(metrics.get("inventoryAmount").toString()));
            
            vo.setCurrentMetrics(metricsData);
            return vo;
        }).collect(Collectors.toList());
    }
}
