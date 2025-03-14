package com.ruoyi.kingdee.service;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeeSkuUsage;

/**
 * 物料使用记录Service接口
 * 
 * @author panfalin
 * @date 2025-03-14
 */
public interface IKingdeeSkuUsageService 
{
    /**
     * 查询物料使用记录
     * 
     * @param skuCode 物料使用记录主键
     * @return 物料使用记录
     */
    public KingdeeSkuUsage selectKingdeeSkuUsageBySkuCode(String skuCode);

    /**
     * 查询物料使用记录列表
     * 
     * @param kingdeeSkuUsage 物料使用记录
     * @return 物料使用记录集合
     */
    public List<KingdeeSkuUsage> selectKingdeeSkuUsageList(KingdeeSkuUsage kingdeeSkuUsage);

    /**
     * 新增物料使用记录
     * 
     * @param kingdeeSkuUsage 物料使用记录
     * @return 结果
     */
    public int insertKingdeeSkuUsage(KingdeeSkuUsage kingdeeSkuUsage);

    /**
     * 修改物料使用记录
     * 
     * @param kingdeeSkuUsage 物料使用记录
     * @return 结果
     */
    public int updateKingdeeSkuUsage(KingdeeSkuUsage kingdeeSkuUsage);

    /**
     * 批量删除物料使用记录
     * 
     * @param skuCodes 需要删除的物料使用记录主键集合
     * @return 结果
     */
    public int deleteKingdeeSkuUsageBySkuCodes(String[] skuCodes);

    /**
     * 删除物料使用记录信息
     * 
     * @param skuCode 物料使用记录主键
     * @return 结果
     */
    public int deleteKingdeeSkuUsageBySkuCode(String skuCode);
}
