package com.ruoyi.price_ratings.service;

import java.util.List;
import com.ruoyi.price_ratings.domain.PriceRatings;

/**
 * price_ratingsService接口
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public interface IPriceRatingsService 
{
    /**
     * 查询price_ratings
     * 
     * @param id price_ratings主键
     * @return price_ratings
     */
    public PriceRatings selectPriceRatingsById(Long id);

    /**
     * 查询price_ratings列表
     * 
     * @param priceRatings price_ratings
     * @return price_ratings集合
     */
    public List<PriceRatings> selectPriceRatingsList(PriceRatings priceRatings);

    /**
     * 新增price_ratings
     * 
     * @param priceRatings price_ratings
     * @return 结果
     */
    public int insertPriceRatings(PriceRatings priceRatings);

    /**
     * 修改price_ratings
     * 
     * @param priceRatings price_ratings
     * @return 结果
     */
    public int updatePriceRatings(PriceRatings priceRatings);

    /**
     * 批量删除price_ratings
     * 
     * @param ids 需要删除的price_ratings主键集合
     * @return 结果
     */
    public int deletePriceRatingsByIds(Long[] ids);

    /**
     * 删除price_ratings信息
     * 
     * @param id price_ratings主键
     * @return 结果
     */
    public int deletePriceRatingsById(Long id);
}
