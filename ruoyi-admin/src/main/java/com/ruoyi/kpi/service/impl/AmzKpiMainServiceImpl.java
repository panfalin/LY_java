package com.ruoyi.kpi.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.kpi.domain.AmzKpiHistory;
import com.ruoyi.kpi.domain.AmzKpiMain;
import com.ruoyi.kpi.domain.AmzKpiTarget;
import com.ruoyi.kpi.domain.dto.KpiSettingDTO;
import com.ruoyi.kpi.domain.dto.KpiTargetDTO;
import com.ruoyi.kpi.mapper.AmzKpiHistoryMapper;
import com.ruoyi.kpi.mapper.AmzKpiMainMapper;
import com.ruoyi.kpi.mapper.AmzKpiTargetMapper;
import com.ruoyi.kpi.service.IAmzKpiMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        // 1. 新增或更新KPI主表
        AmzKpiMain kpiMain = new AmzKpiMain();
        kpiMain.setUserId(kpiSetting.getUserId());
        kpiMain.setUserName(kpiSetting.getUserName());
        kpiMain.setDepartment(kpiSetting.getDepartment());
        kpiMain.setStatus("0"); // 初始状态

        // 检查是否已存在
        AmzKpiMain existKpi = amzKpiMainMapper.selectAmzKpiMainByKpiId(Long.valueOf(kpiSetting.getUserId()));
        if (existKpi != null) {
            kpiMain.setKpiId(existKpi.getKpiId());
            amzKpiMainMapper.updateAmzKpiMain(kpiMain);
        } else {
            amzKpiMainMapper.insertAmzKpiMain(kpiMain);
        }

        // 2. 删除原有考核项
        if (existKpi != null) {
            amzKpiTargetMapper.deleteAmzKpiTargetByTargetId(existKpi.getKpiId());
        }

        // 3. 新增考核项
        for (KpiTargetDTO targetDTO : kpiSetting.getTargets()) {
            AmzKpiTarget target = new AmzKpiTarget();
            target.setKpiId(kpiMain.getKpiId());
            target.setUserId(kpiSetting.getUserId());
            target.setUserName(kpiSetting.getUserName());
            target.setDepartment(kpiSetting.getDepartment());
            target.setMetricName(targetDTO.getName());
            target.setTargetValue(targetDTO.getTargetValue());
            target.setWeight(targetDTO.getWeight());
            target.setCalcType(targetDTO.getCalcType());
            target.setEvaluationCriteria(targetDTO.getEvaluationCriteria());

            amzKpiTargetMapper.insertAmzKpiTarget(target);
        }

        return 1;
    }
}
