package com.ruoyi.kingdee.service;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeePurchasePlan;

/**
 * 金蝶采购计划Service接口
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public interface IKingdeePurchasePlanService 
{
    /**
     * 查询金蝶采购计划
     * 
     * @param skuCode 金蝶采购计划主键
     * @return 金蝶采购计划
     */
    public KingdeePurchasePlan selectKingdeePurchasePlanBySkuCode(String skuCode);

    /**
     * 查询金蝶采购计划列表
     * 
     * @param kingdeePurchasePlan 金蝶采购计划
     * @return 金蝶采购计划集合
     */
    public List<KingdeePurchasePlan> selectKingdeePurchasePlanList(KingdeePurchasePlan kingdeePurchasePlan);

    /**
     * 新增金蝶采购计划
     * 
     * @param kingdeePurchasePlan 金蝶采购计划
     * @return 结果
     */
    public int insertKingdeePurchasePlan(KingdeePurchasePlan kingdeePurchasePlan);

    /**
     * 修改金蝶采购计划
     * 
     * @param kingdeePurchasePlan 金蝶采购计划
     * @return 结果
     */
    public int updateKingdeePurchasePlan(KingdeePurchasePlan kingdeePurchasePlan);

    /**
     * 批量删除金蝶采购计划
     * 
     * @param skuCodes 需要删除的金蝶采购计划主键集合
     * @return 结果
     */
    public int deleteKingdeePurchasePlanBySkuCodes(String[] skuCodes);

    /**
     * 删除金蝶采购计划信息
     * 
     * @param skuCode 金蝶采购计划主键
     * @return 结果
     */
    public int deleteKingdeePurchasePlanBySkuCode(String skuCode);
}
