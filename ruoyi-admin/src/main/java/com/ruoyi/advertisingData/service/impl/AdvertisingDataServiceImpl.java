package com.ruoyi.advertisingData.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.advertisingData.mapper.AdvertisingDataMapper;
import com.ruoyi.advertisingData.domain.AdvertisingData;
import com.ruoyi.advertisingData.service.IAdvertisingDataService;

/**
 * 广告数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@Service
public class AdvertisingDataServiceImpl implements IAdvertisingDataService 
{
    @Autowired
    private AdvertisingDataMapper advertisingDataMapper;

    /**
     * 查询广告数据
     * 
     * @param id 广告数据主键
     * @return 广告数据
     */
    @Override
    public AdvertisingData selectAdvertisingDataById(Long id)
    {
        return advertisingDataMapper.selectAdvertisingDataById(id);
    }

    /**
     * 查询广告数据列表
     * 
     * @param advertisingData 广告数据
     * @return 广告数据
     */
    @Override
    public List<AdvertisingData> selectAdvertisingDataList(AdvertisingData advertisingData)
    {
        return advertisingDataMapper.selectAdvertisingDataList(advertisingData);
    }

    /**
     * 新增广告数据
     * 
     * @param advertisingData 广告数据
     * @return 结果
     */
    @Override
    public int insertAdvertisingData(AdvertisingData advertisingData)
    {
        return advertisingDataMapper.insertAdvertisingData(advertisingData);
    }

    /**
     * 修改广告数据
     * 
     * @param advertisingData 广告数据
     * @return 结果
     */
    @Override
    public int updateAdvertisingData(AdvertisingData advertisingData)
    {
        advertisingData.setUpdateTime(DateUtils.getNowDate());
        return advertisingDataMapper.updateAdvertisingData(advertisingData);
    }

    /**
     * 批量删除广告数据
     * 
     * @param ids 需要删除的广告数据主键
     * @return 结果
     */
    @Override
    public int deleteAdvertisingDataByIds(Long[] ids)
    {
        return advertisingDataMapper.deleteAdvertisingDataByIds(ids);
    }

    /**
     * 删除广告数据信息
     * 
     * @param id 广告数据主键
     * @return 结果
     */
    @Override
    public int deleteAdvertisingDataById(Long id)
    {
        return advertisingDataMapper.deleteAdvertisingDataById(id);
    }
}
