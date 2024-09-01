package com.ruoyi.advertisingData.service;

import java.util.List;
import com.ruoyi.advertisingData.domain.AdvertisingData;

/**
 * 广告数据Service接口
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public interface IAdvertisingDataService 
{
    /**
     * 查询广告数据
     * 
     * @param id 广告数据主键
     * @return 广告数据
     */
    public AdvertisingData selectAdvertisingDataById(Long id);

    /**
     * 查询广告数据列表
     * 
     * @param advertisingData 广告数据
     * @return 广告数据集合
     */
    public List<AdvertisingData> selectAdvertisingDataList(AdvertisingData advertisingData);

    /**
     * 新增广告数据
     * 
     * @param advertisingData 广告数据
     * @return 结果
     */
    public int insertAdvertisingData(AdvertisingData advertisingData);

    /**
     * 修改广告数据
     * 
     * @param advertisingData 广告数据
     * @return 结果
     */
    public int updateAdvertisingData(AdvertisingData advertisingData);

    /**
     * 批量删除广告数据
     * 
     * @param ids 需要删除的广告数据主键集合
     * @return 结果
     */
    public int deleteAdvertisingDataByIds(Long[] ids);

    /**
     * 删除广告数据信息
     * 
     * @param id 广告数据主键
     * @return 结果
     */
    public int deleteAdvertisingDataById(Long id);
}
