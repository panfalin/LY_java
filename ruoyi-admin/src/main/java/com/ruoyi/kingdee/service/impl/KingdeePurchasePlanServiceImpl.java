package com.ruoyi.kingdee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kingdee.mapper.KingdeePurchasePlanMapper;
import com.ruoyi.kingdee.domain.KingdeePurchasePlan;
import com.ruoyi.kingdee.service.IKingdeePurchasePlanService;

/**
 * 金蝶采购计划Service业务层处理
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@Service
public class KingdeePurchasePlanServiceImpl implements IKingdeePurchasePlanService 
{
    @Autowired
    private KingdeePurchasePlanMapper kingdeePurchasePlanMapper;

    /**
     * 查询金蝶采购计划
     * 
     * @param skuCode 金蝶采购计划主键
     * @return 金蝶采购计划
     */
    @Override
    public KingdeePurchasePlan selectKingdeePurchasePlanBySkuCode(String skuCode)
    {
        return kingdeePurchasePlanMapper.selectKingdeePurchasePlanBySkuCode(skuCode);
    }

    /**
     * 查询金蝶采购计划列表
     * 
     * @param kingdeePurchasePlan 金蝶采购计划
     * @return 金蝶采购计划
     */
    @Override
    public List<KingdeePurchasePlan> selectKingdeePurchasePlanList(KingdeePurchasePlan kingdeePurchasePlan)
    {
        return kingdeePurchasePlanMapper.selectKingdeePurchasePlanList(kingdeePurchasePlan);
    }

    /**
     * 新增金蝶采购计划
     * 
     * @param kingdeePurchasePlan 金蝶采购计划
     * @return 结果
     */
    @Override
    public int insertKingdeePurchasePlan(KingdeePurchasePlan kingdeePurchasePlan)
    {
        return kingdeePurchasePlanMapper.insertKingdeePurchasePlan(kingdeePurchasePlan);
    }

    /**
     * 修改金蝶采购计划
     * 
     * @param kingdeePurchasePlan 金蝶采购计划
     * @return 结果
     */
    @Override
    public int updateKingdeePurchasePlan(KingdeePurchasePlan kingdeePurchasePlan)
    {
        return kingdeePurchasePlanMapper.updateKingdeePurchasePlan(kingdeePurchasePlan);
    }

    /**
     * 批量删除金蝶采购计划
     * 
     * @param skuCodes 需要删除的金蝶采购计划主键
     * @return 结果
     */
    @Override
    public int deleteKingdeePurchasePlanBySkuCodes(String[] skuCodes)
    {
        return kingdeePurchasePlanMapper.deleteKingdeePurchasePlanBySkuCodes(skuCodes);
    }

    /**
     * 删除金蝶采购计划信息
     * 
     * @param skuCode 金蝶采购计划主键
     * @return 结果
     */
    @Override
    public int deleteKingdeePurchasePlanBySkuCode(String skuCode)
    {
        return kingdeePurchasePlanMapper.deleteKingdeePurchasePlanBySkuCode(skuCode);
    }
}
