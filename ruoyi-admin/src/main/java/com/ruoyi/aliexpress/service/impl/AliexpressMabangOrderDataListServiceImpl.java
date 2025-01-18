package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressMabangOrderDataListMapper;
import com.ruoyi.aliexpress.domain.AliexpressMabangOrderDataList;
import com.ruoyi.aliexpress.service.IAliexpressMabangOrderDataListService;

/**
 * 马帮订单数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-18
 */
@Service
public class AliexpressMabangOrderDataListServiceImpl implements IAliexpressMabangOrderDataListService 
{
    @Autowired
    private AliexpressMabangOrderDataListMapper aliexpressMabangOrderDataListMapper;

    /**
     * 查询马帮订单数据
     * 
     * @param sId 马帮订单数据主键
     * @return 马帮订单数据
     */
    @Override
    public AliexpressMabangOrderDataList selectAliexpressMabangOrderDataListBySId(Long sId)
    {
        return aliexpressMabangOrderDataListMapper.selectAliexpressMabangOrderDataListBySId(sId);
    }

    /**
     * 查询马帮订单数据列表
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 马帮订单数据
     */
    @Override
    public List<AliexpressMabangOrderDataList> selectAliexpressMabangOrderDataListList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return aliexpressMabangOrderDataListMapper.selectAliexpressMabangOrderDataListList(aliexpressMabangOrderDataList);
    }

    /**
     * 新增马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    @Override
    public int insertAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return aliexpressMabangOrderDataListMapper.insertAliexpressMabangOrderDataList(aliexpressMabangOrderDataList);
    }

    /**
     * 修改马帮订单数据
     * 
     * @param aliexpressMabangOrderDataList 马帮订单数据
     * @return 结果
     */
    @Override
    public int updateAliexpressMabangOrderDataList(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return aliexpressMabangOrderDataListMapper.updateAliexpressMabangOrderDataList(aliexpressMabangOrderDataList);
    }

    /**
     * 批量删除马帮订单数据
     * 
     * @param sIds 需要删除的马帮订单数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressMabangOrderDataListBySIds(Long[] sIds)
    {
        return aliexpressMabangOrderDataListMapper.deleteAliexpressMabangOrderDataListBySIds(sIds);
    }

    /**
     * 删除马帮订单数据信息
     * 
     * @param sId 马帮订单数据主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressMabangOrderDataListBySId(Long sId)
    {
        return aliexpressMabangOrderDataListMapper.deleteAliexpressMabangOrderDataListBySId(sId);
    }
}
