package com.ruoyi.price_ratings.mapper;

import java.util.List;
import com.ruoyi.price_ratings.domain.PriceRatings;

/**
 * 价格和评分信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
public interface PriceRatingsMapper 
{
    /**
     * 查询价格和评分信息
     * 
     * @param id 价格和评分信息主键
     * @return 价格和评分信息
     */
    public PriceRatings selectPriceRatingsById(Long id);

    /**
     * 查询价格和评分信息列表
     * 
     * @param priceRatings 价格和评分信息
     * @return 价格和评分信息集合
     */
    public List<PriceRatings> selectPriceRatingsList(PriceRatings priceRatings);

    /**
     * 新增价格和评分信息
     * 
     * @param priceRatings 价格和评分信息
     * @return 结果
     */
    public int insertPriceRatings(PriceRatings priceRatings);

    /**
     * 修改价格和评分信息
     * 
     * @param priceRatings 价格和评分信息
     * @return 结果
     */
    public int updatePriceRatings(PriceRatings priceRatings);

    /**
     * 删除价格和评分信息
     * 
     * @param id 价格和评分信息主键
     * @return 结果
     */
    public int deletePriceRatingsById(Long id);

    /**
     * 批量删除价格和评分信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePriceRatingsByIds(Long[] ids);
}
