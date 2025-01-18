package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressCompetitionInformationMapper;
import com.ruoyi.aliexpress.domain.AliexpressCompetitionInformation;
import com.ruoyi.aliexpress.service.IAliexpressCompetitionInformationService;

/**
 * 竞对信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-16
 */
@Service
public class AliexpressCompetitionInformationServiceImpl implements IAliexpressCompetitionInformationService 
{
    @Autowired
    private AliexpressCompetitionInformationMapper aliexpressCompetitionInformationMapper;

    /**
     * 查询竞对信息
     * 
     * @param sku 竞对信息主键
     * @return 竞对信息
     */
    @Override
    public AliexpressCompetitionInformation selectAliexpressCompetitionInformationBySku(String sku)
    {
        return aliexpressCompetitionInformationMapper.selectAliexpressCompetitionInformationBySku(sku);
    }

    /**
     * 查询竞对信息列表
     * 
     * @param aliexpressCompetitionInformation 竞对信息
     * @return 竞对信息
     */
    @Override
    public List<AliexpressCompetitionInformation> selectAliexpressCompetitionInformationList(AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        return aliexpressCompetitionInformationMapper.selectAliexpressCompetitionInformationList(aliexpressCompetitionInformation);
    }

    /**
     * 新增竞对信息
     * 
     * @param aliexpressCompetitionInformation 竞对信息
     * @return 结果
     */
    @Override
    public int insertAliexpressCompetitionInformation(AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        aliexpressCompetitionInformation.setCreateTime(DateUtils.getNowDate());
        return aliexpressCompetitionInformationMapper.insertAliexpressCompetitionInformation(aliexpressCompetitionInformation);
    }

    /**
     * 修改竞对信息
     * 
     * @param aliexpressCompetitionInformation 竞对信息
     * @return 结果
     */
    @Override
    public int updateAliexpressCompetitionInformation(AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        return aliexpressCompetitionInformationMapper.updateAliexpressCompetitionInformation(aliexpressCompetitionInformation);
    }

    /**
     * 批量删除竞对信息
     * 
     * @param skus 需要删除的竞对信息主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressCompetitionInformationBySkus(String[] skus)
    {
        return aliexpressCompetitionInformationMapper.deleteAliexpressCompetitionInformationBySkus(skus);
    }

    /**
     * 删除竞对信息信息
     * 
     * @param sku 竞对信息主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressCompetitionInformationBySku(String sku)
    {
        return aliexpressCompetitionInformationMapper.deleteAliexpressCompetitionInformationBySku(sku);
    }
}
