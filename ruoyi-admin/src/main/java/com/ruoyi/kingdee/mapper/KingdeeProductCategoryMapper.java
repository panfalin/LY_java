package com.ruoyi.kingdee.mapper;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeeProductCategory;

/**
 * 金蝶商品分类信息Mapper接口
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public interface KingdeeProductCategoryMapper 
{
    /**
     * 查询金蝶商品分类信息
     * 
     * @param rk 金蝶商品分类信息主键
     * @return 金蝶商品分类信息
     */
    public KingdeeProductCategory selectKingdeeProductCategoryByRk(Long rk);

    /**
     * 查询金蝶商品分类信息列表
     * 
     * @param kingdeeProductCategory 金蝶商品分类信息
     * @return 金蝶商品分类信息集合
     */
    public List<KingdeeProductCategory> selectKingdeeProductCategoryList(KingdeeProductCategory kingdeeProductCategory);

    /**
     * 新增金蝶商品分类信息
     * 
     * @param kingdeeProductCategory 金蝶商品分类信息
     * @return 结果
     */
    public int insertKingdeeProductCategory(KingdeeProductCategory kingdeeProductCategory);

    /**
     * 修改金蝶商品分类信息
     * 
     * @param kingdeeProductCategory 金蝶商品分类信息
     * @return 结果
     */
    public int updateKingdeeProductCategory(KingdeeProductCategory kingdeeProductCategory);

    /**
     * 删除金蝶商品分类信息
     * 
     * @param rk 金蝶商品分类信息主键
     * @return 结果
     */
    public int deleteKingdeeProductCategoryByRk(Long rk);

    /**
     * 批量删除金蝶商品分类信息
     * 
     * @param rks 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKingdeeProductCategoryByRks(Long[] rks);
}
