package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressToolIndicatorsMapper;
import com.ruoyi.aliexpress.domain.AliexpressToolIndicators;
import com.ruoyi.aliexpress.service.IAliexpressToolIndicatorsService;

/**
 * 工具指标Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-17
 */
@Service
public class AliexpressToolIndicatorsServiceImpl implements IAliexpressToolIndicatorsService 
{
    @Autowired
    private AliexpressToolIndicatorsMapper aliexpressToolIndicatorsMapper;

    /**
     * 查询工具指标
     * 
     * @param sId 工具指标主键
     * @return 工具指标
     */
    @Override
    public AliexpressToolIndicators selectAliexpressToolIndicatorsBySId(Long sId)
    {
        return aliexpressToolIndicatorsMapper.selectAliexpressToolIndicatorsBySId(sId);
    }

    /**
     * 查询工具指标列表
     * 
     * @param aliexpressToolIndicators 工具指标
     * @return 工具指标
     */
    @Override
    public List<AliexpressToolIndicators> selectAliexpressToolIndicatorsList(AliexpressToolIndicators aliexpressToolIndicators)
    {
        return aliexpressToolIndicatorsMapper.selectAliexpressToolIndicatorsList(aliexpressToolIndicators);
    }

    /**
     * 查询工具指标列表
     *
     * @param aliexpressToolIndicators 工具指标
     * @return 工具指标
     */
    @Override
    public List<AliexpressToolIndicators> selectAliexpressToolIndicatorsListShop(AliexpressToolIndicators aliexpressToolIndicators)
    {
        return aliexpressToolIndicatorsMapper.selectAliexpressToolIndicatorsListShop(aliexpressToolIndicators);
    }


    /**
     * 查询工具指标列表
     *
     * @param aliexpressToolIndicators 工具指标
     * @return 工具指标
     */
    @Override
    public List<AliexpressToolIndicators> selectAliexpressToolIndicatorsListShopName(AliexpressToolIndicators aliexpressToolIndicators)
    {
        return aliexpressToolIndicatorsMapper.selectAliexpressToolIndicatorsListShopName(aliexpressToolIndicators);
    }



    /**
     * 新增工具指标
     * 
     * @param aliexpressToolIndicators 工具指标
     * @return 结果
     */
    @Override
    public int insertAliexpressToolIndicators(AliexpressToolIndicators aliexpressToolIndicators)
    {
        aliexpressToolIndicators.setCreateTime(DateUtils.getNowDate());
        return aliexpressToolIndicatorsMapper.insertAliexpressToolIndicators(aliexpressToolIndicators);
    }

    /**
     * 修改工具指标
     * 
     * @param aliexpressToolIndicators 工具指标
     * @return 结果
     */
    @Override
    public int updateAliexpressToolIndicators(AliexpressToolIndicators aliexpressToolIndicators)
    {
        return aliexpressToolIndicatorsMapper.updateAliexpressToolIndicators(aliexpressToolIndicators);
    }

    /**
     * 批量删除工具指标
     * 
     * @param sIds 需要删除的工具指标主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressToolIndicatorsBySIds(Long[] sIds)
    {
        return aliexpressToolIndicatorsMapper.deleteAliexpressToolIndicatorsBySIds(sIds);
    }

    /**
     * 删除工具指标信息
     * 
     * @param sId 工具指标主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressToolIndicatorsBySId(Long sId)
    {
        return aliexpressToolIndicatorsMapper.deleteAliexpressToolIndicatorsBySId(sId);
    }
}
