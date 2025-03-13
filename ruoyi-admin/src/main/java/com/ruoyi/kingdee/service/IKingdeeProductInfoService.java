package com.ruoyi.kingdee.service;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeeProductInfo;

/**
 * 金蝶商品信息Service接口
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public interface IKingdeeProductInfoService 
{
    /**
     * 查询金蝶商品信息
     * 
     * @param rk 金蝶商品信息主键
     * @return 金蝶商品信息
     */
    public KingdeeProductInfo selectKingdeeProductInfoByRk(Long rk);

    /**
     * 查询金蝶商品信息列表
     * 
     * @param kingdeeProductInfo 金蝶商品信息
     * @return 金蝶商品信息集合
     */
    public List<KingdeeProductInfo> selectKingdeeProductInfoList(KingdeeProductInfo kingdeeProductInfo);

    /**
     * 新增金蝶商品信息
     * 
     * @param kingdeeProductInfo 金蝶商品信息
     * @return 结果
     */
    public int insertKingdeeProductInfo(KingdeeProductInfo kingdeeProductInfo);

    /**
     * 修改金蝶商品信息
     * 
     * @param kingdeeProductInfo 金蝶商品信息
     * @return 结果
     */
    public int updateKingdeeProductInfo(KingdeeProductInfo kingdeeProductInfo);

    /**
     * 批量删除金蝶商品信息
     * 
     * @param rks 需要删除的金蝶商品信息主键集合
     * @return 结果
     */
    public int deleteKingdeeProductInfoByRks(Long[] rks);

    /**
     * 删除金蝶商品信息信息
     * 
     * @param rk 金蝶商品信息主键
     * @return 结果
     */
    public int deleteKingdeeProductInfoByRk(Long rk);
}
