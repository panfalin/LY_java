package com.ruoyi.kingdee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kingdee.mapper.KingdeeProductInfoMapper;
import com.ruoyi.kingdee.domain.KingdeeProductInfo;
import com.ruoyi.kingdee.service.IKingdeeProductInfoService;

/**
 * 金蝶商品信息Service业务层处理
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@Service
public class KingdeeProductInfoServiceImpl implements IKingdeeProductInfoService 
{
    @Autowired
    private KingdeeProductInfoMapper kingdeeProductInfoMapper;

    /**
     * 查询金蝶商品信息
     * 
     * @param rk 金蝶商品信息主键
     * @return 金蝶商品信息
     */
    @Override
    public KingdeeProductInfo selectKingdeeProductInfoByRk(Long rk)
    {
        return kingdeeProductInfoMapper.selectKingdeeProductInfoByRk(rk);
    }

    /**
     * 查询金蝶商品信息列表
     * 
     * @param kingdeeProductInfo 金蝶商品信息
     * @return 金蝶商品信息
     */
    @Override
    public List<KingdeeProductInfo> selectKingdeeProductInfoList(KingdeeProductInfo kingdeeProductInfo)
    {
        return kingdeeProductInfoMapper.selectKingdeeProductInfoList(kingdeeProductInfo);
    }

    /**
     * 新增金蝶商品信息
     * 
     * @param kingdeeProductInfo 金蝶商品信息
     * @return 结果
     */
    @Override
    public int insertKingdeeProductInfo(KingdeeProductInfo kingdeeProductInfo)
    {
        return kingdeeProductInfoMapper.insertKingdeeProductInfo(kingdeeProductInfo);
    }

    /**
     * 修改金蝶商品信息
     * 
     * @param kingdeeProductInfo 金蝶商品信息
     * @return 结果
     */
    @Override
    public int updateKingdeeProductInfo(KingdeeProductInfo kingdeeProductInfo)
    {
        return kingdeeProductInfoMapper.updateKingdeeProductInfo(kingdeeProductInfo);
    }

    /**
     * 批量删除金蝶商品信息
     * 
     * @param rks 需要删除的金蝶商品信息主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeProductInfoByRks(Long[] rks)
    {
        return kingdeeProductInfoMapper.deleteKingdeeProductInfoByRks(rks);
    }

    /**
     * 删除金蝶商品信息信息
     * 
     * @param rk 金蝶商品信息主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeProductInfoByRk(Long rk)
    {
        return kingdeeProductInfoMapper.deleteKingdeeProductInfoByRk(rk);
    }
}
