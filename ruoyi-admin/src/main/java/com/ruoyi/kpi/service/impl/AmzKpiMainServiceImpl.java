package com.ruoyi.kpi.service.impl;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.kpi.domain.AmzKpiHistory;
import com.ruoyi.kpi.domain.AmzKpiMain;
import com.ruoyi.kpi.domain.AmzKpiTarget;
import com.ruoyi.kpi.domain.dto.KpiSettingDTO;
import com.ruoyi.kpi.domain.dto.KpiTargetDTO;
import com.ruoyi.kpi.domain.dto.KpiExportDTO;
import com.ruoyi.kpi.mapper.AmzKpiHistoryMapper;
import com.ruoyi.kpi.mapper.AmzKpiMainMapper;
import com.ruoyi.kpi.mapper.AmzKpiTargetMapper;
import com.ruoyi.kpi.service.IAmzKpiMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * KPI主表Service业务层处理
 *
 * @author ruoyi
 * @date 2025-03-24
 */
@Service
public class AmzKpiMainServiceImpl implements IAmzKpiMainService {
    @Autowired
    private AmzKpiMainMapper amzKpiMainMapper;

    @Autowired
    private AmzKpiTargetMapper amzKpiTargetMapper;

    @Autowired
    private AmzKpiHistoryMapper amzKpiHistoryMapper;

    /**
     * 查询KPI主表
     *
     * @param kpiId KPI主表主键
     * @return KPI主表
     */
    @Override
    public AmzKpiMain selectAmzKpiMainByKpiId(Long kpiId) {
        return amzKpiMainMapper.selectAmzKpiMainByKpiId(kpiId);
    }

    /**
     * 查询KPI主表列表
     *
     * @param amzKpiMain KPI主表
     * @return KPI主表
     */
    @Override
    public List<AmzKpiMain> selectAmzKpiMainList(AmzKpiMain amzKpiMain) {
        return amzKpiMainMapper.selectAmzKpiMainList(amzKpiMain);
    }

    /**
     * 新增KPI主表
     *
     * @param amzKpiMain KPI主表
     * @return 结果
     */
    @Override
    public int insertAmzKpiMain(AmzKpiMain amzKpiMain) {
        amzKpiMain.setCreateTime(DateUtils.getNowDate());
        return amzKpiMainMapper.insertAmzKpiMain(amzKpiMain);
    }

    /**
     * 修改KPI主表
     *
     * @param amzKpiMain KPI主表
     * @return 结果
     */
    @Override
    public int updateAmzKpiMain(AmzKpiMain amzKpiMain) {
        amzKpiMain.setUpdateTime(DateUtils.getNowDate());
        return amzKpiMainMapper.updateAmzKpiMain(amzKpiMain);
    }

    /**
     * 批量删除KPI主表
     *
     * @param kpiIds 需要删除的KPI主表主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiMainByKpiIds(Long[] kpiIds) {
        return amzKpiMainMapper.deleteAmzKpiMainByKpiIds(kpiIds);
    }

    /**
     * 删除KPI主表信息
     *
     * @param kpiId KPI主表主键
     * @return 结果
     */
    @Override
    public int deleteAmzKpiMainByKpiId(Long kpiId) {
        return amzKpiMainMapper.deleteAmzKpiMainByKpiId(kpiId);
    }

    /**
     * 查询KPI列表（包含考核项和历史记录）
     */
    @Override
    public List<AmzKpiMain> selectKpiListWithDetails(AmzKpiMain amzKpiMain) {
        // 1. 获取KPI主表数据
        List<AmzKpiMain> kpiList = amzKpiMainMapper.selectAmzKpiMainList(amzKpiMain);

        // 2. 遍历每个KPI,填充考核项和历史记录
        for (AmzKpiMain kpi : kpiList) {
            // 查询考核项
            AmzKpiTarget queryTarget = new AmzKpiTarget();
            queryTarget.setKpiId(kpi.getKpiId());
            List<AmzKpiTarget> targets = amzKpiTargetMapper.selectAmzKpiTargetList(queryTarget);
            kpi.setTargets(targets);

            // 查询历史记录(最近3个月)
            AmzKpiHistory queryHistory = new AmzKpiHistory();
            queryHistory.setKpiId(kpi.getKpiId());
            queryHistory.setUserId(kpi.getUserId());
            List<AmzKpiHistory> histories = amzKpiHistoryMapper.selectRecentHistory(queryHistory);
            kpi.setHistories(histories);
        }

        return kpiList;
    }

    /**
     * 设置KPI考核项
     */
    @Override
    @Transactional
    public int setKpiTargets(KpiSettingDTO kpiSetting) {
        // 1. 检查当月是否已设置考核项
        String currentMonth = DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate());
        AmzKpiHistory queryHistory = new AmzKpiHistory();
        queryHistory.setUserId(kpiSetting.getUserId());
        queryHistory.setAssessMonth(currentMonth);
        List<AmzKpiHistory> existHistory = amzKpiHistoryMapper.selectAmzKpiHistoryList(queryHistory);
        
        // 如果当月已有考核记录，直接返回错误提示
        if (!existHistory.isEmpty()) {
            throw new ServiceException(String.format("%s当月考核项已设置，不能重复设置", kpiSetting.getUserName()));
        }

        // 2. 查找或创建KPI主表记录
        AmzKpiMain kpiMain;
        AmzKpiMain existKpi = amzKpiMainMapper.selectAmzKpiMainByUserId(kpiSetting.getUserId());
        if (existKpi != null) {
            kpiMain = existKpi;
            // 更新基本信息
            kpiMain.setDepartment(kpiSetting.getDepartment());
            amzKpiMainMapper.updateAmzKpiMain(kpiMain);
        } else {
            kpiMain = new AmzKpiMain();
            kpiMain.setUserId(kpiSetting.getUserId());
            kpiMain.setUserName(kpiSetting.getUserName());
            kpiMain.setDepartment(kpiSetting.getDepartment());
            kpiMain.setStatus("0"); // 初始状态
            kpiMain.setCreateTime(DateUtils.getNowDate());
            amzKpiMainMapper.insertAmzKpiMain(kpiMain);
        }

        // 3. 新增考核项
        for (KpiTargetDTO targetDTO : kpiSetting.getTargets()) {
            AmzKpiTarget target = new AmzKpiTarget();
            target.setKpiId(kpiMain.getKpiId());
            target.setUserId(kpiSetting.getUserId());
            target.setUserName(kpiSetting.getUserName());
            target.setDepartment(kpiSetting.getDepartment());
            target.setMetricName(targetDTO.getName());
            target.setCurrValue(targetDTO.getCurrValue());
            target.setTargetValue(targetDTO.getTargetValue());
            target.setWeight(targetDTO.getWeight());
            target.setCalcType(targetDTO.getCalcType());
            target.setEvaluationCriteria(targetDTO.getEvaluationCriteria());
            target.setCreateTime(DateUtils.getNowDate());

            amzKpiTargetMapper.insertAmzKpiTarget(target);
        }

        // 4. 创建当月历史记录
        AmzKpiHistory history = new AmzKpiHistory();
        history.setKpiId(kpiMain.getKpiId());
        history.setUserId(kpiSetting.getUserId());
        history.setUserName(kpiSetting.getUserName());
        history.setAssessMonth(currentMonth);
        history.setStatus("0"); // 初始状态
        history.setCreateTime(DateUtils.getNowDate());
        amzKpiHistoryMapper.insertAmzKpiHistory(history);

        return 1;
    }

    @Override
    @Transactional
    public int editKpiTargets(KpiSettingDTO kpiSetting) {
        // 1. 查找KPI主表记录
        AmzKpiMain existKpi = amzKpiMainMapper.selectAmzKpiMainByUserId(kpiSetting.getUserId());
        if (existKpi == null) {
            throw new ServiceException("未找到该用户的KPI记录");
        }

        // 2. 获取当前所有考核项
        AmzKpiTarget queryTarget = new AmzKpiTarget();
        queryTarget.setKpiId(existKpi.getKpiId());
        List<AmzKpiTarget> currentTargets = amzKpiTargetMapper.selectAmzKpiTargetList(queryTarget);

        // 3. 创建一个Set存储新提交的考核项名称
        Set<String> newTargetNames = kpiSetting.getTargets().stream()
                .map(KpiTargetDTO::getName)
                .collect(Collectors.toSet());

        // 4. 删除不在新列表中的考核项
        for (AmzKpiTarget target : currentTargets) {
            if (!newTargetNames.contains(target.getMetricName())) {
                amzKpiTargetMapper.deleteAmzKpiTargetByTargetId(target.getTargetId());
            }
        }

        // 5. 更新或新增考核项
        for (KpiTargetDTO targetDTO : kpiSetting.getTargets()) {
            // 查找是否存在该考核项
            queryTarget = new AmzKpiTarget();
            queryTarget.setKpiId(existKpi.getKpiId());
            queryTarget.setMetricName(targetDTO.getName());
            List<AmzKpiTarget> existingTargets = amzKpiTargetMapper.selectAmzKpiTargetList(queryTarget);
            
            if (!existingTargets.isEmpty()) {
                // 如果存在，则更新
                AmzKpiTarget target = existingTargets.get(0);
                target.setCurrValue(targetDTO.getCurrValue());
                target.setTargetValue(targetDTO.getTargetValue());
                target.setWeight(targetDTO.getWeight());
                target.setCalcType(targetDTO.getCalcType());
                target.setEvaluationCriteria(targetDTO.getEvaluationCriteria());
                target.setUpdateTime(DateUtils.getNowDate());
                
                amzKpiTargetMapper.updateAmzKpiTarget(target);
            } else {
                // 如果不存在，则新增
                AmzKpiTarget target = new AmzKpiTarget();
                target.setKpiId(existKpi.getKpiId());
                target.setUserId(kpiSetting.getUserId());
                target.setUserName(kpiSetting.getUserName());
                target.setDepartment(kpiSetting.getDepartment());
                target.setMetricName(targetDTO.getName());
                target.setCurrValue(targetDTO.getCurrValue());
                target.setTargetValue(targetDTO.getTargetValue());
                target.setWeight(targetDTO.getWeight());
                target.setCalcType(targetDTO.getCalcType());
                target.setEvaluationCriteria(targetDTO.getEvaluationCriteria());
                target.setCreateTime(DateUtils.getNowDate());
                
                amzKpiTargetMapper.insertAmzKpiTarget(target);
            }
        }

        // 6. 更新KPI主表信息
        existKpi.setDepartment(kpiSetting.getDepartment());
        existKpi.setUpdateTime(DateUtils.getNowDate());
        amzKpiMainMapper.updateAmzKpiMain(existKpi);

        return 1;
    }

    @Override
    public List<KpiExportDTO> selectKpiExportList(AmzKpiMain amzKpiMain) {
        List<KpiExportDTO> exportList = new ArrayList<>();
        
        // 1. 获取KPI主表数据
        AmzKpiMain kpi = amzKpiMainMapper.selectAmzKpiMainByKpiId(amzKpiMain.getKpiId());
        if (kpi == null) {
            throw new ServiceException("未找到该用户的KPI记录");
        }

        // 2. 查询该用户的考核项
        AmzKpiTarget queryTarget = new AmzKpiTarget();
        queryTarget.setKpiId(kpi.getKpiId());
        List<AmzKpiTarget> targets = amzKpiTargetMapper.selectAmzKpiTargetList(queryTarget);
        
        // 3. 构建导出数据
        int index = 1;
        for (AmzKpiTarget target : targets) {
            KpiExportDTO exportDTO = new KpiExportDTO();
            exportDTO.setIndex(index++);
            exportDTO.setMetricName(target.getMetricName());
            exportDTO.setEvaluationCriteria(target.getEvaluationCriteria());
            exportDTO.setWeight(target.getWeight());
            exportDTO.setDescription(target.getRemark());  // 指标说明使用remark字段
            exportDTO.setCalcType(target.getCalcType());
            exportDTO.setScore(target.getScore());
            
            exportList.add(exportDTO);
        }

        return exportList;
    }
}
