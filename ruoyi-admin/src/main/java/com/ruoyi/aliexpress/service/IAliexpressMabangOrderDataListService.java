package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressMabangOrderDataList;

/**
 * 马帮订单数据Service接口
 * 
 * @author ruoyi
 * @date 2025-01-18
 */
public interface IAliexpressMabangOrderDataListService 
{
    /**
     * 查询马帮订单数据
     * 
     * @param sId 马帮订单数据主键
     * @return 马帮订单数据
     */
    public AliexpressMabangOrderDataList selectAliexpressMabangOrderDataListBySId(Long sId);

    /**
     * 查询马帮订单数据列表
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 马帮订单数据集合
     */
    public List<AliexpressMabangOrderDataList> selectAliexpressMabangOrderDataListList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList);

    /**
     * 新增马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    public int insertAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList);

    /**
     * 修改马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    public int updateAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList);

    /**
     * 批量删除马帮订单数据
     * 
     * @param sIds 需要删除的马帮订单数据主键集合
     * @return 结果
     */
    public int deleteAliexpressMabangOrderDataListBySIds(Long[] sIds);

    /**
     * 删除马帮订单数据信息
     * 
     * @param sId 马帮订单数据主键
     * @return 结果
     */
    public int deleteAliexpressMabangOrderDataListBySId(Long sId);
}
