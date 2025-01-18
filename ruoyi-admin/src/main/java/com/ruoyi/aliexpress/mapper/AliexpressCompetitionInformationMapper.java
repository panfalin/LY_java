package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.AliexpressCompetitionInformation;

/**
 * 竞对信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-16
 */
public interface AliexpressCompetitionInformationMapper 
{
    /**
     * 查询竞对信息
     * 
     * @param sku 竞对信息主键
     * @return 竞对信息
     */
    public AliexpressCompetitionInformation selectAliexpressCompetitionInformationBySku(String sku);

    /**
     * 查询竞对信息列表
     * 
     * @param aliexpressCompetitionInformation 竞对信息
     * @return 竞对信息集合
     */
    public List<AliexpressCompetitionInformation> selectAliexpressCompetitionInformationList(AliexpressCompetitionInformation aliexpressCompetitionInformation);

    /**
     * 新增竞对信息
     * 
     * @param aliexpressCompetitionInformation 竞对信息
     * @return 结果
     */
    public int insertAliexpressCompetitionInformation(AliexpressCompetitionInformation aliexpressCompetitionInformation);

    /**
     * 修改竞对信息
     * 
     * @param aliexpressCompetitionInformation 竞对信息
     * @return 结果
     */
    public int updateAliexpressCompetitionInformation(AliexpressCompetitionInformation aliexpressCompetitionInformation);

    /**
     * 删除竞对信息
     * 
     * @param sku 竞对信息主键
     * @return 结果
     */
    public int deleteAliexpressCompetitionInformationBySku(String sku);

    /**
     * 批量删除竞对信息
     * 
     * @param skus 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAliexpressCompetitionInformationBySkus(String[] skus);
}
