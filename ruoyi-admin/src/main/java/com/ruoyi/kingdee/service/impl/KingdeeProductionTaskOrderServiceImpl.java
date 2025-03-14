package com.ruoyi.kingdee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kingdee.mapper.KingdeeProductionTaskOrderMapper;
import com.ruoyi.kingdee.domain.KingdeeProductionTaskOrder;
import com.ruoyi.kingdee.service.IKingdeeProductionTaskOrderService;

/**
 * 金蝶生产任务订单列Service业务层处理
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@Service
public class KingdeeProductionTaskOrderServiceImpl implements IKingdeeProductionTaskOrderService 
{
    @Autowired
    private KingdeeProductionTaskOrderMapper kingdeeProductionTaskOrderMapper;

    /**
     * 查询金蝶生产任务订单列
     * 
     * @param rk 金蝶生产任务订单列主键
     * @return 金蝶生产任务订单列
     */
    @Override
    public KingdeeProductionTaskOrder selectKingdeeProductionTaskOrderByRk(Long rk)
    {
        return kingdeeProductionTaskOrderMapper.selectKingdeeProductionTaskOrderByRk(rk);
    }

    /**
     * 查询金蝶生产任务订单列列表
     * 
     * @param kingdeeProductionTaskOrder 金蝶生产任务订单列
     * @return 金蝶生产任务订单列
     */
    @Override
    public List<KingdeeProductionTaskOrder> selectKingdeeProductionTaskOrderList(KingdeeProductionTaskOrder kingdeeProductionTaskOrder)
    {
        return kingdeeProductionTaskOrderMapper.selectKingdeeProductionTaskOrderList(kingdeeProductionTaskOrder);
    }

    /**
     * 新增金蝶生产任务订单列
     * 
     * @param kingdeeProductionTaskOrder 金蝶生产任务订单列
     * @return 结果
     */
    @Override
    public int insertKingdeeProductionTaskOrder(KingdeeProductionTaskOrder kingdeeProductionTaskOrder)
    {
        return kingdeeProductionTaskOrderMapper.insertKingdeeProductionTaskOrder(kingdeeProductionTaskOrder);
    }

    /**
     * 修改金蝶生产任务订单列
     * 
     * @param kingdeeProductionTaskOrder 金蝶生产任务订单列
     * @return 结果
     */
    @Override
    public int updateKingdeeProductionTaskOrder(KingdeeProductionTaskOrder kingdeeProductionTaskOrder)
    {
        return kingdeeProductionTaskOrderMapper.updateKingdeeProductionTaskOrder(kingdeeProductionTaskOrder);
    }

    /**
     * 批量删除金蝶生产任务订单列
     * 
     * @param rks 需要删除的金蝶生产任务订单列主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeProductionTaskOrderByRks(Long[] rks)
    {
        return kingdeeProductionTaskOrderMapper.deleteKingdeeProductionTaskOrderByRks(rks);
    }

    /**
     * 删除金蝶生产任务订单列信息
     * 
     * @param rk 金蝶生产任务订单列主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeProductionTaskOrderByRk(Long rk)
    {
        return kingdeeProductionTaskOrderMapper.deleteKingdeeProductionTaskOrderByRk(rk);
    }
}
