package com.ruoyi.aliexpress.service;

import java.util.List;

import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisClearance;
import com.ruoyi.aliexpress.domain.AliexpressSkuStatistics;

/**
 * 清仓库存Service接口
 * 
 * @author ruoyi
 * @date 2025-02-11
 */
public interface IAliexpressSkuAnalysisClearanceService 
{
    /**
     * 查询清仓库存
     * 
     * @param id 清仓库存主键
     * @return 清仓库存
     */
    public AliexpressSkuAnalysis selectAliexpressSkuAnalysisClearanceById(Long id);

    /**
     * 查询清仓库存列表
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 清仓库存集合
     */
    public List<AliexpressSkuAnalysis> selectAliexpressSkuAnalysisClearanceList(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance);


    public List<AliexpressSkuStatistics> selectAliexpressSkuStatistics(AliexpressSkuAnalysis aliexpressSkuAnalysis);


    /**
     * 新增清仓库存
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 结果
     */
    public int insertAliexpressSkuAnalysisClearance(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance);

    /**
     * 修改清仓库存
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 结果
     */
    public int updateAliexpressSkuAnalysisClearance(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance);



    /**
     * 批量删除清仓库存
     * 
     * @param ids 需要删除的清仓库存主键集合
     * @return 结果
     */
    public int deleteAliexpressSkuAnalysisClearanceByIds(Long[] ids);

    /**
     * 删除清仓库存信息
     * 
     * @param id 清仓库存主键
     * @return 结果
     */
    public int deleteAliexpressSkuAnalysisClearanceById(Long id);
}
