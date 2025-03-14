package com.ruoyi.kingdee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kingdee.mapper.KingdeeSkuUsageMapper;
import com.ruoyi.kingdee.domain.KingdeeSkuUsage;
import com.ruoyi.kingdee.service.IKingdeeSkuUsageService;

/**
 * 物料使用记录Service业务层处理
 * 
 * @author panfalin
 * @date 2025-03-14
 */
@Service
public class KingdeeSkuUsageServiceImpl implements IKingdeeSkuUsageService 
{
    @Autowired
    private KingdeeSkuUsageMapper kingdeeSkuUsageMapper;

    /**
     * 查询物料使用记录
     * 
     * @param skuCode 物料使用记录主键
     * @return 物料使用记录
     */
    @Override
    public KingdeeSkuUsage selectKingdeeSkuUsageBySkuCode(String skuCode)
    {
        return kingdeeSkuUsageMapper.selectKingdeeSkuUsageBySkuCode(skuCode);
    }

    /**
     * 查询物料使用记录列表
     * 
     * @param kingdeeSkuUsage 物料使用记录
     * @return 物料使用记录
     */
    @Override
    public List<KingdeeSkuUsage> selectKingdeeSkuUsageList(KingdeeSkuUsage kingdeeSkuUsage)
    {
        return kingdeeSkuUsageMapper.selectKingdeeSkuUsageList(kingdeeSkuUsage);
    }

    /**
     * 新增物料使用记录
     * 
     * @param kingdeeSkuUsage 物料使用记录
     * @return 结果
     */
    @Override
    public int insertKingdeeSkuUsage(KingdeeSkuUsage kingdeeSkuUsage)
    {
        return kingdeeSkuUsageMapper.insertKingdeeSkuUsage(kingdeeSkuUsage);
    }

    /**
     * 修改物料使用记录
     * 
     * @param kingdeeSkuUsage 物料使用记录
     * @return 结果
     */
    @Override
    public int updateKingdeeSkuUsage(KingdeeSkuUsage kingdeeSkuUsage)
    {
        return kingdeeSkuUsageMapper.updateKingdeeSkuUsage(kingdeeSkuUsage);
    }

    /**
     * 批量删除物料使用记录
     * 
     * @param skuCodes 需要删除的物料使用记录主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeSkuUsageBySkuCodes(String[] skuCodes)
    {
        return kingdeeSkuUsageMapper.deleteKingdeeSkuUsageBySkuCodes(skuCodes);
    }

    /**
     * 删除物料使用记录信息
     * 
     * @param skuCode 物料使用记录主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeSkuUsageBySkuCode(String skuCode)
    {
        return kingdeeSkuUsageMapper.deleteKingdeeSkuUsageBySkuCode(skuCode);
    }
}
