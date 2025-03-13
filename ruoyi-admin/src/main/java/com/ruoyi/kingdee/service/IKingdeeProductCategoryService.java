package com.ruoyi.kingdee.service;

import java.util.List;
import com.ruoyi.kingdee.domain.KingdeeProductCategory;

/**
 * 金蝶商品分类信息Service接口
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public interface IKingdeeProductCategoryService 
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
     * 批量删除金蝶商品分类信息
     * 
     * @param rks 需要删除的金蝶商品分类信息主键集合
     * @return 结果
     */
    public int deleteKingdeeProductCategoryByRks(Long[] rks);

    /**
     * 删除金蝶商品分类信息信息
     * 
     * @param rk 金蝶商品分类信息主键
     * @return 结果
     */
    public int deleteKingdeeProductCategoryByRk(Long rk);

    public List<KingdeeProductCategory> selectProductCategoryTree();
}
