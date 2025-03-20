package com.ruoyi.aliexpress.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildrenStatistics;
import com.ruoyi.aliexpress.domain.SubSkuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressPublishedDataChildrenMapper;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildren;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataChildrenService;

import static com.ruoyi.common.utils.PageUtils.startPage;

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
            startPage();
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
     * 查询速卖通刊登子数据列表统计数据
     *
     * @param aliexpressPublishedDataChildren 速卖通刊登子数据
     * @return 速卖通刊登子数据
     */
    @Override
    public List<AliexpressPublishedDataChildrenStatistics> selectAliexpressPublishedDataChildrenTotalList(AliexpressPublishedDataChildren aliexpressPublishedDataChildren) {
        // 定义一个总的列表用于存储所有查询到的子sku数据
        List<AliexpressPublishedDataChildrenStatistics> totalChildrenLists = new ArrayList<>();
        List<String> idList= new ArrayList<>();
        /*
            逻辑:如果传过来的有sku 查询子表sku  找到对应商品ID
            将商品ID作为list 赋值给commodityIds  xml文件中用for循环+IN处理
         */
        // 定义一个总的列表用于存储所有查询到的子sku数据
        List<AliexpressPublishedDataChildren> totalChildrenListTotal = new ArrayList<>();
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
                totalChildrenListTotal.addAll(childrenList);
            }

            AliexpressPublishedDataChildrenStatistics aliexpressPublishedDataChildrenTotal = aggregateData(totalChildrenListTotal);
            totalChildrenLists.add(aliexpressPublishedDataChildrenTotal);
            return totalChildrenLists;

        }
        if (aliexpressPublishedDataChildren.getSku() != null && !aliexpressPublishedDataChildren.getSku().equals("")) {
            List<Map<String, Object>> result = aliexpressPublishedDataChildrenMapper.selectCommodityIdBySku(aliexpressPublishedDataChildren);
            for (Map<String, Object> row : result) {
                String commodityIds = row.get("commodity_id") != null ? row.get("commodity_id").toString() : null;
                idList.add(commodityIds);
            }
        }


        // 子数据总计
        aliexpressPublishedDataChildren.setCommodityIds(idList);
        List<AliexpressPublishedDataChildrenStatistics> aliexpressPublishedDataChildrenStatisticsIn = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataListChildrenStatistics(aliexpressPublishedDataChildren);
        totalChildrenLists.addAll(aliexpressPublishedDataChildrenStatisticsIn);
        // 外数据统计
        List<AliexpressPublishedDataChildrenStatistics> aliexpressPublishedDataChildrenStatisticsOut = aliexpressPublishedDataChildrenMapper.selectAliexpressPublishedDataListStatistics(aliexpressPublishedDataChildren);
        if (aliexpressPublishedDataChildrenStatisticsIn == null || aliexpressPublishedDataChildrenStatisticsIn.isEmpty() || aliexpressPublishedDataChildrenStatisticsIn.get(0) == null) {
            return aliexpressPublishedDataChildrenStatisticsOut;
        }
        for (AliexpressPublishedDataChildrenStatistics totalChildrenList : totalChildrenLists) {
            totalChildrenList.setCommodityNumber(aliexpressPublishedDataChildrenStatisticsOut.get(0).getCommodityNumber());
            totalChildrenList.setViews(aliexpressPublishedDataChildrenStatisticsOut.get(0).getViews());
            totalChildrenList.setVisitors(aliexpressPublishedDataChildrenStatisticsOut.get(0).getVisitors());
        }
        return totalChildrenLists;
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

    public AliexpressPublishedDataChildrenStatistics aggregateData(List<AliexpressPublishedDataChildren> totalChildrenListTotal) {
        // 使用 Map 按 commodityId 分组
        Map<String, List<AliexpressPublishedDataChildren>> groupedByCommodityId = totalChildrenListTotal.stream()
                .collect(Collectors.groupingBy(AliexpressPublishedDataChildren::getCommodityId));

        // 初始化汇总结果
        AliexpressPublishedDataChildrenStatistics result = new AliexpressPublishedDataChildrenStatistics();
        result.setCommodityNumber(BigDecimal.valueOf(groupedByCommodityId.size()));
        result.setPaymentAmount(BigDecimal.ZERO);
        result.setPaymentVisitors(BigDecimal.ZERO);
        result.setPaymentNumber(BigDecimal.ZERO);
        result.setSkuAdditionalPeople(BigDecimal.ZERO);
        result.setSkuAdditionalPiece(BigDecimal.ZERO);
        result.setVisitors(BigDecimal.ZERO);
        result.setViews(BigDecimal.ZERO);

        // 遍历每个 commodityId 的分组
        for (List<AliexpressPublishedDataChildren> group : groupedByCommodityId.values()) {
            // 获取分组中的第一条记录
            AliexpressPublishedDataChildren firstItem = group.get(0);

            // 累加数值类型字段
            result.setPaymentAmount(result.getPaymentAmount().add(sumBigDecimal(group, AliexpressPublishedDataChildren::getPaymentAmount)));
            result.setPaymentVisitors(result.getPaymentVisitors().add(sumBigDecimal(group, AliexpressPublishedDataChildren::getPaymentVisitors)));
            result.setPaymentNumber(result.getPaymentNumber().add(sumBigDecimal(group, AliexpressPublishedDataChildren::getPaymentNumber)));
            result.setSkuAdditionalPeople(result.getSkuAdditionalPeople().add(sumBigDecimal(group, AliexpressPublishedDataChildren::getSkuAdditionalPeople)));
            result.setSkuAdditionalPiece(result.getSkuAdditionalPiece().add(sumBigDecimal(group, AliexpressPublishedDataChildren::getSkuAdditionalPiece)));

            // 计算 visitors 和 views
            if (firstItem.getVisitors() != null) {
                result.setVisitors(result.getVisitors().add(firstItem.getVisitors()));
            }
            if (firstItem.getViews() != null) {
                result.setViews(result.getViews().add(firstItem.getViews()));
            }
        }

        return result;
    }

    // 辅助方法：计算 BigDecimal 类型字段的总和
    private BigDecimal sumBigDecimal(List<AliexpressPublishedDataChildren> group, Function<AliexpressPublishedDataChildren, BigDecimal> mapper) {
        return group.stream()
                .map(mapper)
                .filter(value -> value != null)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}


