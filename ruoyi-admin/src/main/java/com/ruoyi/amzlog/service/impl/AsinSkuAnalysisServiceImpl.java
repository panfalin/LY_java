package com.ruoyi.amzlog.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.mskulist.domain.Mskulist;
import com.ruoyi.mskulist.service.IMskulistService;
import com.ruoyi.operationalAnalysis.domain.OperationalAnalysis;
import com.ruoyi.operationalAnalysis.service.IOperationalAnalysisService;
import com.ruoyi.skuInfoTemplate.domain.SkuInfoTemplate;
import com.ruoyi.skuInfoTemplate.service.ISkuInfoTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.amzlog.mapper.AsinSkuAnalysisMapper;
import com.ruoyi.amzlog.domain.AsinSkuAnalysis;
import com.ruoyi.amzlog.service.IAsinSkuAnalysisService;

import javax.annotation.Resource;

import static com.ruoyi.common.utils.PageUtils.startPage;
import static com.ruoyi.common.utils.SecurityUtils.getLoginUser;

/**
 * amzlogService业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-29
 */
@Service
public class AsinSkuAnalysisServiceImpl implements IAsinSkuAnalysisService 
{
    @Autowired
    private AsinSkuAnalysisMapper asinSkuAnalysisMapper;

    @Autowired
    private IMskulistService mskulistService;

    @Autowired
    private ISkuInfoTemplateService skuInfoTemplateService;

    @Autowired
    private IOperationalAnalysisService operationalAnalysisService;

    /**
     * 查询amzlog
     * 
     * @param id amzlog主键
     * @return amzlog
     */
    @Override
    public AsinSkuAnalysis selectAsinSkuAnalysisById(Long id)
    {
        return asinSkuAnalysisMapper.selectAsinSkuAnalysisById(id);
    }

    /**
     * 查询amzlog列表
     * 
     * @param asinSkuAnalysis amzlog
     * @return amzlog
     */
    @Override
    public List<AsinSkuAnalysis> selectAsinSkuAnalysisList(AsinSkuAnalysis asinSkuAnalysis) {
        List<AsinSkuAnalysis> asinSkuAnalyses = new ArrayList<>();
        LoginUser user = getLoginUser();
        String userRoleKey = user.getUser().getRoles().get(0).getRoleKey();
        // 创建mskulist实体
        Mskulist mskulist = new Mskulist();
        String userName = user.getUser().getUserName();
        if (!"admin".equals(userRoleKey)) {
            mskulist.setSalesPerson(userName);
        }
        // 获取mskulist列表
        List<Mskulist> mskulists = mskulistService.selectMskulistList(mskulist);
        for (Mskulist ignored : mskulists) {
            // 创建一个新的实体实例
            AsinSkuAnalysis analysis = new AsinSkuAnalysis();
            SkuInfoTemplate skuInfoTemplate = new SkuInfoTemplate();
            skuInfoTemplate.setSku(ignored.getLocalSku());
            // 获取skuInfoTemplates列表
            List<SkuInfoTemplate> skuInfoTemplates = skuInfoTemplateService.selectSkuInfoTemplateList(skuInfoTemplate);
            if (!skuInfoTemplates.isEmpty()) {
                SkuInfoTemplate infoTemplate = skuInfoTemplates.get(0);
                analysis.setListingDate(infoTemplate.getAmzInventoryShelfTime());
            }
            // 获取operational_analysis记录
            OperationalAnalysis operationalAnalysis = new OperationalAnalysis();
            operationalAnalysis.setSku(ignored.getMsku());
            // 30天船长运营分析
            operationalAnalysis.setType("30");
            List<OperationalAnalysis> operationalAnalyses30 = operationalAnalysisService.selectOperationalAnalysisList(operationalAnalysis);
            if (!operationalAnalyses30.isEmpty()) {
            }
            // 14天船长运营分析
            operationalAnalysis.setType("14");
            List<OperationalAnalysis> operationalAnalyses14 = operationalAnalysisService.selectOperationalAnalysisList(operationalAnalysis);
            if (!operationalAnalyses14.isEmpty()) {

            }
            // 7天船长运营分析
            operationalAnalysis.setType("7");
            List<OperationalAnalysis> operationalAnalyses7 = operationalAnalysisService.selectOperationalAnalysisList(operationalAnalysis);
            if (!operationalAnalyses7.isEmpty()) {

            }
            // 上个月船长运营分析
            operationalAnalysis.setType("last Month");
            List<OperationalAnalysis> operationalAnalysesLastMonth = operationalAnalysisService.selectOperationalAnalysisList(operationalAnalysis);
            if (!operationalAnalysesLastMonth.isEmpty()) {
                String salesAmount = operationalAnalysesLastMonth.get(0).getSalesAmount();
                // 转成float
                float parsedFloat = 0;
                try {
                    parsedFloat = Float.parseFloat(salesAmount);
                    System.out.println("Parsed float: " + parsedFloat);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format: " + salesAmount);
                }

                analysis.setLastMonthTotalSales(salesAmount);       //上一个月利润
                analysis.setLastMonthDailyProfit(String.valueOf(parsedFloat / 30));     //上月日均利润
                if (!operationalAnalyses30.isEmpty()) {

                    analysis.setActualLast30DaysTotalProfit(operationalAnalyses30.get(0).getGrossProfit());     //近30天实际总利润
                }
                if (!operationalAnalyses14.isEmpty()) {
                    analysis.setActualLast14DaysTotalProfit(operationalAnalyses14.get(0).getGrossProfit());     //近14天实际总利润
                }
                if (!operationalAnalyses7.isEmpty()) {
                    analysis.setActualLast7DaysTotalProfit(operationalAnalyses7.get(0).getGrossProfit());       //近7天实际总利润
                    analysis.setActualLast7DaysSales(operationalAnalyses7.get(0).getOrderCount());      //近7天销量
                }
                analysis.setLastMonthTotalSales(operationalAnalysesLastMonth.get(0).getSalesAmount());      //上个月总销售额
                analysis.setLastMonthDailySales(operationalAnalysesLastMonth.get(0).getSalesAmount());      //上个月总销售额
            }
            analysis.setASIN(ignored.getMsku());
            asinSkuAnalyses.add(analysis);
        }
        return asinSkuAnalyses;
    }

    /**
     * 新增amzlog
     * 
     * @param asinSkuAnalysis amzlog
     * @return 结果
     */
    @Override
    public int insertAsinSkuAnalysis(AsinSkuAnalysis asinSkuAnalysis)
    {
        return asinSkuAnalysisMapper.insertAsinSkuAnalysis(asinSkuAnalysis);
    }

    /**
     * 修改amzlog
     * 
     * @param asinSkuAnalysis amzlog
     * @return 结果
     */
    @Override
    public int updateAsinSkuAnalysis(AsinSkuAnalysis asinSkuAnalysis)
    {
        asinSkuAnalysis.setUpdateTime(DateUtils.getNowDate());
        return asinSkuAnalysisMapper.updateAsinSkuAnalysis(asinSkuAnalysis);
    }

    /**
     * 批量删除amzlog
     * 
     * @param ids 需要删除的amzlog主键
     * @return 结果
     */
    @Override
    public int deleteAsinSkuAnalysisByIds(Long[] ids)
    {
        return asinSkuAnalysisMapper.deleteAsinSkuAnalysisByIds(ids);
    }

    /**
     * 删除amzlog信息
     * 
     * @param id amzlog主键
     * @return 结果
     */
    @Override
    public int deleteAsinSkuAnalysisById(Long id)
    {
        return asinSkuAnalysisMapper.deleteAsinSkuAnalysisById(id);
    }
}
