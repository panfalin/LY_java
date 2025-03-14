package com.ruoyi.kingdee.service;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeePurchaseOrderList;

/**
 * 金蝶采购订单列表Service接口
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public interface IKingdeePurchaseOrderListService 
{
    /**
     * 查询金蝶采购订单列表
     * 
     * @param rk 金蝶采购订单列表主键
     * @return 金蝶采购订单列表
     */
    public KingdeePurchaseOrderList selectKingdeePurchaseOrderListByRk(Long rk);

    /**
     * 查询金蝶采购订单列表列表
     * 
     * @param kingdeePurchaseOrderList 金蝶采购订单列表
     * @return 金蝶采购订单列表集合
     */
    public List<KingdeePurchaseOrderList> selectKingdeePurchaseOrderListList(KingdeePurchaseOrderList kingdeePurchaseOrderList);

    /**
     * 新增金蝶采购订单列表
     * 
     * @param kingdeePurchaseOrderList 金蝶采购订单列表
     * @return 结果
     */
    public int insertKingdeePurchaseOrderList(KingdeePurchaseOrderList kingdeePurchaseOrderList);

    /**
     * 修改金蝶采购订单列表
     * 
     * @param kingdeePurchaseOrderList 金蝶采购订单列表
     * @return 结果
     */
    public int updateKingdeePurchaseOrderList(KingdeePurchaseOrderList kingdeePurchaseOrderList);

    /**
     * 批量删除金蝶采购订单列表
     * 
     * @param rks 需要删除的金蝶采购订单列表主键集合
     * @return 结果
     */
    public int deleteKingdeePurchaseOrderListByRks(Long[] rks);

    /**
     * 删除金蝶采购订单列表信息
     * 
     * @param rk 金蝶采购订单列表主键
     * @return 结果
     */
    public int deleteKingdeePurchaseOrderListByRk(Long rk);
}
