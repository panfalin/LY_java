package com.ruoyi.kingdee.mapper;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeeProductionTaskOrder;

/**
 * 金蝶生产任务订单列Mapper接口
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public interface KingdeeProductionTaskOrderMapper 
{
    /**
     * 查询金蝶生产任务订单列
     * 
     * @param rk 金蝶生产任务订单列主键
     * @return 金蝶生产任务订单列
     */
    public KingdeeProductionTaskOrder selectKingdeeProductionTaskOrderByRk(Long rk);

    /**
     * 查询金蝶生产任务订单列列表
     * 
     * @param kingdeeProductionTaskOrder 金蝶生产任务订单列
     * @return 金蝶生产任务订单列集合
     */
    public List<KingdeeProductionTaskOrder> selectKingdeeProductionTaskOrderList(KingdeeProductionTaskOrder kingdeeProductionTaskOrder);

    /**
     * 新增金蝶生产任务订单列
     * 
     * @param kingdeeProductionTaskOrder 金蝶生产任务订单列
     * @return 结果
     */
    public int insertKingdeeProductionTaskOrder(KingdeeProductionTaskOrder kingdeeProductionTaskOrder);

    /**
     * 修改金蝶生产任务订单列
     * 
     * @param kingdeeProductionTaskOrder 金蝶生产任务订单列
     * @return 结果
     */
    public int updateKingdeeProductionTaskOrder(KingdeeProductionTaskOrder kingdeeProductionTaskOrder);

    /**
     * 删除金蝶生产任务订单列
     * 
     * @param rk 金蝶生产任务订单列主键
     * @return 结果
     */
    public int deleteKingdeeProductionTaskOrderByRk(Long rk);

    /**
     * 批量删除金蝶生产任务订单列
     * 
     * @param rks 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKingdeeProductionTaskOrderByRks(Long[] rks);
}
