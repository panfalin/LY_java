package com.ruoyi.kingdee.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kingdee.mapper.KingdeeProductCategoryMapper;
import com.ruoyi.kingdee.domain.KingdeeProductCategory;
import com.ruoyi.kingdee.service.IKingdeeProductCategoryService;

/**
 * 金蝶商品分类信息Service业务层处理
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@Service
public class KingdeeProductCategoryServiceImpl implements IKingdeeProductCategoryService 
{
    @Autowired
    private KingdeeProductCategoryMapper kingdeeProductCategoryMapper;

    /**
     * 查询金蝶商品分类信息
     * 
     * @param rk 金蝶商品分类信息主键
     * @return 金蝶商品分类信息
     */
    @Override
    public KingdeeProductCategory selectKingdeeProductCategoryByRk(Long rk)
    {
        return kingdeeProductCategoryMapper.selectKingdeeProductCategoryByRk(rk);
    }

    /**
     * 查询金蝶商品分类信息列表
     * 
     * @param kingdeeProductCategory 金蝶商品分类信息
     * @return 金蝶商品分类信息
     */
    @Override
    public List<KingdeeProductCategory> selectKingdeeProductCategoryList(KingdeeProductCategory kingdeeProductCategory)
    {
        return kingdeeProductCategoryMapper.selectKingdeeProductCategoryList(kingdeeProductCategory);
    }

    /**
     * 新增金蝶商品分类信息
     * 
     * @param kingdeeProductCategory 金蝶商品分类信息
     * @return 结果
     */
    @Override
    public int insertKingdeeProductCategory(KingdeeProductCategory kingdeeProductCategory)
    {
        return kingdeeProductCategoryMapper.insertKingdeeProductCategory(kingdeeProductCategory);
    }

    /**
     * 修改金蝶商品分类信息
     * 
     * @param kingdeeProductCategory 金蝶商品分类信息
     * @return 结果
     */
    @Override
    public int updateKingdeeProductCategory(KingdeeProductCategory kingdeeProductCategory)
    {
        return kingdeeProductCategoryMapper.updateKingdeeProductCategory(kingdeeProductCategory);
    }

    /**
     * 批量删除金蝶商品分类信息
     * 
     * @param rks 需要删除的金蝶商品分类信息主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeProductCategoryByRks(Long[] rks)
    {
        return kingdeeProductCategoryMapper.deleteKingdeeProductCategoryByRks(rks);
    }

    /**
     * 删除金蝶商品分类信息信息
     * 
     * @param rk 金蝶商品分类信息主键
     * @return 结果
     */
    @Override
    public int deleteKingdeeProductCategoryByRk(Long rk)
    {
        return kingdeeProductCategoryMapper.deleteKingdeeProductCategoryByRk(rk);
    }

    @Override
    public List<KingdeeProductCategory> selectProductCategoryTree() {
        List<KingdeeProductCategory> allCategories = kingdeeProductCategoryMapper.selectKingdeeProductCategoryList(new KingdeeProductCategory());

        // 构建树形结构
        List<KingdeeProductCategory> rootCategories = new ArrayList<>();
        Map<String, List<KingdeeProductCategory>> parentIdMap = new HashMap<>();

        // 按父级编号分组
        for (KingdeeProductCategory category : allCategories) {
            String parentNumber = category.getParentNumber();
            if (StringUtils.isEmpty(parentNumber)) {
                rootCategories.add(category);
            } else {
                parentIdMap.computeIfAbsent(parentNumber, k -> new ArrayList<>()).add(category);
            }
        }

        // 递归构建树
        for (KingdeeProductCategory root : rootCategories) {
            buildChildrenTree(root, parentIdMap);
        }

        return rootCategories;
    }

    private void buildChildrenTree(KingdeeProductCategory parent, Map<String, List<KingdeeProductCategory>> parentIdMap) {
        String parentNumber = parent.getNumber();
        List<KingdeeProductCategory> children = parentIdMap.get(parentNumber);
        if (children != null) {
            parent.setChildren(children);
            for (KingdeeProductCategory child : children) {
                buildChildrenTree(child, parentIdMap);
            }
        }
    }
}
