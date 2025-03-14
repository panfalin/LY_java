package com.ruoyi.kingdee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kingdee.mapper.KingdeePurchaseOrderListMapper;
import com.ruoyi.kingdee.domain.KingdeePurchaseOrderList;
import com.ruoyi.kingdee.service.IKingdeePurchaseOrderListService;

/**
 * 金蝶采购订单列表Service业务层处理
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@Service
public class KingdeePurchaseOrderListServiceImpl implements IKingdeePurchaseOrderListService 
{
    @Autowired
    private KingdeePurchaseOrderListMapper kingdeePurchaseOrderListMapper;

    /**
     * 查询金蝶采购订单列表
     * 
     * @param rk 金蝶采购订单列表主键
     * @return 金蝶采购订单列表
     */
    @Override
    public KingdeePurchaseOrderList selectKingdeePurchaseOrderListByRk(Long rk)
    {
        return kingdeePurchaseOrderListMapper.selectKingdeePurchaseOrderListByRk(rk);
    }

    /**
     * 查询金蝶采购订单列表列表
     * 
     * @param kingdeePurchaseOrderList 金蝶采购订单列表
     * @return 金蝶采购订单列表
     */
    @Override
    public List<KingdeePurchaseOrderList> selectKingdeePurchaseOrderListList(KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        return kingdeePurchaseOrderListMapper.selectKingdeePurchaseOrderListList(kingdeePurchaseOrderList);
    }

    /**
     * 新增金蝶采购订单列表
     * 
     * @param kingdeePurchaseOrderList 金蝶采购订单列表
     * @return 结果
     */
    @Override
    public int insertKingdeePurchaseOrderList(KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        return kingdeePurchaseOrderListMapper.insertKingdeePurchaseOrderList(kingdeePurchaseOrderList);
    }

    /**
     * 修改金蝶采购订单列表
     * 
     * @param kingdeePurchaseOrderList 金蝶采购订单列表
     * @return 结果
     */
    @Override
    public int updateKingdeePurchaseOrderList(KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        return kingdeePurchaseOrderListMapper.updateKingdeePurchaseOrderList(kingdeePurchaseOrderList);
    }

    /**
     * 批量删除金蝶采购订单列表
     * 
     * @param rks 需要删除的金蝶采购订单列表主键
     * @return 结果
     */
    @Override
    public int deleteKingdeePurchaseOrderListByRks(Long[] rks)
    {
        return kingdeePurchaseOrderListMapper.deleteKingdeePurchaseOrderListByRks(rks);
    }

    /**
     * 删除金蝶采购订单列表信息
     * 
     * @param rk 金蝶采购订单列表主键
     * @return 结果
     */
    @Override
    public int deleteKingdeePurchaseOrderListByRk(Long rk)
    {
        return kingdeePurchaseOrderListMapper.deleteKingdeePurchaseOrderListByRk(rk);
    }
}
