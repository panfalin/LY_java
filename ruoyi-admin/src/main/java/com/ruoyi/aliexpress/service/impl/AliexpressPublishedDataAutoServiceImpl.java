package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressPublishedDataAutoMapper;
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataAuto;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataAutoService;

/**
 * 刊登数据-全托管Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-17
 */
@Service
public class AliexpressPublishedDataAutoServiceImpl implements IAliexpressPublishedDataAutoService 
{
    @Autowired
    private AliexpressPublishedDataAutoMapper aliexpressPublishedDataAutoMapper;

    /**
     * 查询刊登数据-全托管
     * 
     * @param sId 刊登数据-全托管主键
     * @return 刊登数据-全托管
     */
    @Override
    public AliexpressPublishedDataAuto selectAliexpressPublishedDataAutoBySId(Long sId)
    {
        return aliexpressPublishedDataAutoMapper.selectAliexpressPublishedDataAutoBySId(sId);
    }

    /**
     * 查询刊登数据-全托管列表
     * 
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 刊登数据-全托管
     */
    @Override
    public List<AliexpressPublishedDataAuto> selectAliexpressPublishedDataAutoList(AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        return aliexpressPublishedDataAutoMapper.selectAliexpressPublishedDataAutoList(aliexpressPublishedDataAuto);
    }

    /**
     * 查询刊登数据-全托管列表
     *
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 刊登数据-全托管
     */
    @Override
    public List<AliexpressPublishedDataAuto> selectAliexpressPublishedDataAutoStatisticsList(AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        return aliexpressPublishedDataAutoMapper.selectAliexpressPublishedDataAutoStatisticsList(aliexpressPublishedDataAuto);
    }



    /**
     * 新增刊登数据-全托管
     * 
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 结果
     */
    @Override
    public int insertAliexpressPublishedDataAuto(AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        return aliexpressPublishedDataAutoMapper.insertAliexpressPublishedDataAuto(aliexpressPublishedDataAuto);
    }

    /**
     * 修改刊登数据-全托管
     * 
     * @param aliexpressPublishedDataAuto 刊登数据-全托管
     * @return 结果
     */
    @Override
    public int updateAliexpressPublishedDataAuto(AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        return aliexpressPublishedDataAutoMapper.updateAliexpressPublishedDataAuto(aliexpressPublishedDataAuto);
    }

    /**
     * 批量删除刊登数据-全托管
     * 
     * @param sIds 需要删除的刊登数据-全托管主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataAutoBySIds(Long[] sIds)
    {
        return aliexpressPublishedDataAutoMapper.deleteAliexpressPublishedDataAutoBySIds(sIds);
    }

    /**
     * 删除刊登数据-全托管信息
     * 
     * @param sId 刊登数据-全托管主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressPublishedDataAutoBySId(Long sId)
    {
        return aliexpressPublishedDataAutoMapper.deleteAliexpressPublishedDataAutoBySId(sId);
    }
}
