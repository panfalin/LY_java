package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressToolIndicatorsAutoMapper;
import com.ruoyi.aliexpress.domain.AliexpressToolIndicatorsAuto;
import com.ruoyi.aliexpress.service.IAliexpressToolIndicatorsAutoService;

/**
 * 工具指标-全托管Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
@Service
public class AliexpressToolIndicatorsAutoServiceImpl implements IAliexpressToolIndicatorsAutoService 
{
    @Autowired
    private AliexpressToolIndicatorsAutoMapper aliexpressToolIndicatorsAutoMapper;

    /**
     * 查询工具指标-全托管
     * 
     * @param sId 工具指标-全托管主键
     * @return 工具指标-全托管
     */
    @Override
    public AliexpressToolIndicatorsAuto selectAliexpressToolIndicatorsAutoBySId(Long sId)
    {
        return aliexpressToolIndicatorsAutoMapper.selectAliexpressToolIndicatorsAutoBySId(sId);
    }

    /**
     * 查询工具指标-全托管列表
     * 
     * @param aliexpressToolIndicatorsAuto 工具指标-全托管
     * @return 工具指标-全托管
     */
    @Override
    public List<AliexpressToolIndicatorsAuto> selectAliexpressToolIndicatorsAutoList(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        return aliexpressToolIndicatorsAutoMapper.selectAliexpressToolIndicatorsAutoList(aliexpressToolIndicatorsAuto);
    }

    /**
     * 新增工具指标-全托管
     * 
     * @param aliexpressToolIndicatorsAuto 工具指标-全托管
     * @return 结果
     */
    @Override
    public int insertAliexpressToolIndicatorsAuto(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        aliexpressToolIndicatorsAuto.setCreateTime(DateUtils.getNowDate());
        return aliexpressToolIndicatorsAutoMapper.insertAliexpressToolIndicatorsAuto(aliexpressToolIndicatorsAuto);
    }

    /**
     * 修改工具指标-全托管
     * 
     * @param aliexpressToolIndicatorsAuto 工具指标-全托管
     * @return 结果
     */
    @Override
    public int updateAliexpressToolIndicatorsAuto(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        return aliexpressToolIndicatorsAutoMapper.updateAliexpressToolIndicatorsAuto(aliexpressToolIndicatorsAuto);
    }

    /**
     * 批量删除工具指标-全托管
     * 
     * @param sIds 需要删除的工具指标-全托管主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressToolIndicatorsAutoBySIds(Long[] sIds)
    {
        return aliexpressToolIndicatorsAutoMapper.deleteAliexpressToolIndicatorsAutoBySIds(sIds);
    }

    /**
     * 删除工具指标-全托管信息
     * 
     * @param sId 工具指标-全托管主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressToolIndicatorsAutoBySId(Long sId)
    {
        return aliexpressToolIndicatorsAutoMapper.deleteAliexpressToolIndicatorsAutoBySId(sId);
    }
}
