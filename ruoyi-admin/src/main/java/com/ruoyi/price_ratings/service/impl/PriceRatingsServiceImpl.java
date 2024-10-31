package com.ruoyi.price_ratings.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.price_ratings.mapper.PriceRatingsMapper;
import com.ruoyi.price_ratings.domain.PriceRatings;
import com.ruoyi.price_ratings.service.IPriceRatingsService;

/**
 * 价格和评分信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
@Service
public class PriceRatingsServiceImpl implements IPriceRatingsService 
{
    @Autowired
    private PriceRatingsMapper priceRatingsMapper;

    /**
     * 查询价格和评分信息
     * 
     * @param id 价格和评分信息主键
     * @return 价格和评分信息
     */
    @Override
    public PriceRatings selectPriceRatingsById(Long id)
    {
        return priceRatingsMapper.selectPriceRatingsById(id);
    }

    /**
     * 查询价格和评分信息列表
     * 
     * @param priceRatings 价格和评分信息
     * @return 价格和评分信息
     */
    @Override
    public List<PriceRatings> selectPriceRatingsList(PriceRatings priceRatings)
    {
        return priceRatingsMapper.selectPriceRatingsList(priceRatings);
    }

    /**
     * 新增价格和评分信息
     * 
     * @param priceRatings 价格和评分信息
     * @return 结果
     */
    @Override
    public int insertPriceRatings(PriceRatings priceRatings)
    {
        return priceRatingsMapper.insertPriceRatings(priceRatings);
    }

    /**
     * 修改价格和评分信息
     * 
     * @param priceRatings 价格和评分信息
     * @return 结果
     */
    @Override
    public int updatePriceRatings(PriceRatings priceRatings)
    {
        return priceRatingsMapper.updatePriceRatings(priceRatings);
    }

    /**
     * 批量删除价格和评分信息
     * 
     * @param ids 需要删除的价格和评分信息主键
     * @return 结果
     */
    @Override
    public int deletePriceRatingsByIds(Long[] ids)
    {
        return priceRatingsMapper.deletePriceRatingsByIds(ids);
    }

    /**
     * 删除价格和评分信息信息
     * 
     * @param id 价格和评分信息主键
     * @return 结果
     */
    @Override
    public int deletePriceRatingsById(Long id)
    {
        return priceRatingsMapper.deletePriceRatingsById(id);
    }
}
