package com.ruoyi.kingdee.mapper;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeeSkuUsage;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物料使用记录Mapper接口
 * 
 * @author panfalin
 * @date 2025-03-14
 */
@Mapper
public interface KingdeeSkuUsageMapper 
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
     * 删除物料使用记录
     * 
     * @param skuCode 物料使用记录主键
     * @return 结果
     */
    public int deleteKingdeeSkuUsageBySkuCode(String skuCode);

    /**
     * 批量删除物料使用记录
     * 
     * @param skuCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKingdeeSkuUsageBySkuCodes(String[] skuCodes);
}
