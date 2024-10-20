package com.ruoyi.price_ratings.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.price_ratings.mapper.PriceRatingsMapper;
import com.ruoyi.price_ratings.domain.PriceRatings;
import com.ruoyi.price_ratings.service.IPriceRatingsService;

/**
 * price_ratingsService业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@Service
public class PriceRatingsServiceImpl implements IPriceRatingsService 
{
    @Autowired
    private PriceRatingsMapper priceRatingsMapper;

    /**
     * 查询price_ratings
     * 
     * @param id price_ratings主键
     * @return price_ratings
     */
    @Override
    public PriceRatings selectPriceRatingsById(Long id)
    {
        return priceRatingsMapper.selectPriceRatingsById(id);
    }

    /**
     * 查询price_ratings列表
     * 
     * @param priceRatings price_ratings
     * @return price_ratings
     */
    @Override
    public List<PriceRatings> selectPriceRatingsList(PriceRatings priceRatings)
    {
        return priceRatingsMapper.selectPriceRatingsList(priceRatings);
    }

    /**
     * 新增price_ratings
     * 
     * @param priceRatings price_ratings
     * @return 结果
     */
    @Override
    public int insertPriceRatings(PriceRatings priceRatings)
    {
        return priceRatingsMapper.insertPriceRatings(priceRatings);
    }

    /**
     * 修改price_ratings
     * 
     * @param priceRatings price_ratings
     * @return 结果
     */
    @Override
    public int updatePriceRatings(PriceRatings priceRatings)
    {
        return priceRatingsMapper.updatePriceRatings(priceRatings);
    }

    /**
     * 批量删除price_ratings
     * 
     * @param ids 需要删除的price_ratings主键
     * @return 结果
     */
    @Override
    public int deletePriceRatingsByIds(Long[] ids)
    {
        return priceRatingsMapper.deletePriceRatingsByIds(ids);
    }

    /**
     * 删除price_ratings信息
     * 
     * @param id price_ratings主键
     * @return 结果
     */
    @Override
    public int deletePriceRatingsById(Long id)
    {
        return priceRatingsMapper.deletePriceRatingsById(id);
    }
}
