package com.ruoyi.aliexpress.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.aliexpress.domain.SubSkuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressPublishedDataChildrenMapper;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildren;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataChildrenService;

/**
 * 速卖通刊登子数据Service业务层处理
 *
 * @author ruoyi
 * @date 2025-03-14
 */
@Service
public class AliexpressPublishedDataChildrenServiceImpl implements IAliexpressPublishedDataChildrenService {
    @Autowired
    private AliexpressPublishedDataChildrenMapper aliexpressPublishedDataChildrenMapper;

    /**
     * 查询速卖通刊登子数据
     *
     * @param commodityId 速卖通刊登子数据主键
     * @return 速卖通刊登子数据
     */
    @Override
    public AliexpressPublishedDataChildren selectAliexpressPublishedDataChildrenByCommodityId(String commodityId) {
        return aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenByCommodityId(commodityId);
    }

    /**
     * 查询速卖通刊登子数据列表
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据
     */
    @Override
    public List<AliexpressPublishedDataChildren> selectAliexpressPublishedDataChildrenList(AliexpressPublishedDataChildren aliexpressPublishedDataChildren) {
        // 定义一个总的列表用于存储所有查询到的子sku数据
        List<AliexpressPublishedDataChildren> totalChildrenList = new ArrayList<>();
        // 如果是搜索子sku 做特殊处理
        if (aliexpressPublishedDataChildren.getSkuChildren() != null && !aliexpressPublishedDataChildren.getSkuChildren().equals("")) {
            //获取到所有数据 子数据以及对应商品ID、sku、子sku
            List<SubSkuDTO> subSkuList = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenListChilds(aliexpressPublishedDataChildren);
            for (SubSkuDTO item : subSkuList) {
                /*
                将数据赋值给aliexpressPublishedDataChildren重构搜索条件
                将商品ID 组合sku赋值 子sku清空  目的是 搜索子sku时不光要展示单条子sku  要展示整组数据！！！
                 */
                // 为每个子sku设置commodityId
                aliexpressPublishedDataChildren.setCommodityId(item.getCommodityId());
                // 为每个子sku设置组合sku
                aliexpressPublishedDataChildren.setSku(item.getSku());
                // 清空子sku  如果后面需求变动  要展示单条子sku可以将 此处注释！！！！！
                aliexpressPublishedDataChildren.setSkuChildren(null);
                // 临时办法，后面需要修改：查询对应子sku的数据（性能低） 获取到最终数据  此时获取的数据还没有子sku字段
                List<AliexpressPublishedDataChildren> childrenList = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenList(aliexpressPublishedDataChildren);
                /*
                遍历childrenList 再次根据child 查询关系表中的对应组合sku 的子sku 并赋值
                 */
                for (AliexpressPublishedDataChildren child : childrenList) {
                    //查询子sku数据
                    List<SubSkuDTO> subSkuListChildren = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenListChilds(child);
                    //将数据赋值给对象
                    child.setChildren(subSkuListChildren);
                }
                // 将查询得到的数据追加到总列表中
                totalChildrenList.addAll(childrenList);
            }
            return totalChildrenList;
        } else {
            List<AliexpressPublishedDataChildren> aliexpressPublishedDataChildrenComplete = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenList(aliexpressPublishedDataChildren);
            for (AliexpressPublishedDataChildren item : aliexpressPublishedDataChildrenComplete) {
                //获取到查询ID的子sku
                //临时办法  后面需要修改
                List<SubSkuDTO> subSkuList = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataChildrenListChilds(item);
                item.setChildren(subSkuList);
            }
            return aliexpressPublishedDataChildrenComplete;
        }
        //获取所有包含统计信息

    }

    /**
     * 新增速卖通刊登子数据
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 结果
     */
    @Override
    public int insertAliexpressPublishedDataChildren(AliexpressPublishedDataChildren aliexpressPublishedDataChildren) {
        return aliexpressPublishedDataChildrenMapper.insertAliexpressPublishedDataChildren(aliexpressPublishedDataChildren);
    }

    /**
     * 修改速卖通刊登子数据
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 结果
     */
    @Override
    public int updateAliexpressPublishedDataChildren(AliexpressPublishedDataChildren aliexpressPublishedDataChildren) {
        return aliexpressPublishedDataChildrenMapper.updateAliexpressPublishedDataChildren(aliexpressPublishedDataChildren);
    }

    /**
     * 批量删除速卖通刊登子数据
     *
     * @param commodityIds 需要删除的速卖通刊登子数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataChildrenByCommodityIds(String[] commodityIds) {
        return aliexpressPublishedDataChildrenMapper.deleteAliexpressPublishedDataChildrenByCommodityIds(commodityIds);
    }

    /**
     * 删除速卖通刊登子数据信息
     *
     * @param commodityId 速卖通刊登子数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataChildrenByCommodityId(String commodityId) {
        return aliexpressPublishedDataChildrenMapper.deleteAliexpressPublishedDataChildrenByCommodityId(commodityId);
    }
}
