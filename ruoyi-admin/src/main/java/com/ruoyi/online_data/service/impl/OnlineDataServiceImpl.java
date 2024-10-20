package com.ruoyi.online_data.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.online_data.mapper.OnlineDataMapper;
import com.ruoyi.online_data.domain.OnlineData;
import com.ruoyi.online_data.service.IOnlineDataService;

/**
 * 速卖通分析-刊登数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@Service
public class OnlineDataServiceImpl implements IOnlineDataService 
{
    @Autowired
    private OnlineDataMapper onlineDataMapper;

    /**
     * 查询速卖通分析-刊登数据
     * 
     * @param id 速卖通分析-刊登数据主键
     * @return 速卖通分析-刊登数据
     */
    @Override
    public OnlineData selectOnlineDataById(Long id)
    {
        return onlineDataMapper.selectOnlineDataById(id);
    }

    /**
     * 查询速卖通分析-刊登数据列表
     * 
     * @param onlineData 速卖通分析-刊登数据
     * @return 速卖通分析-刊登数据
     */
    @Override
    public List<OnlineData> selectOnlineDataList(OnlineData onlineData)
    {
        return onlineDataMapper.selectOnlineDataList(onlineData);
    }

    /**
     * 新增速卖通分析-刊登数据
     * 
     * @param onlineData 速卖通分析-刊登数据
     * @return 结果
     */
    @Override
    public int insertOnlineData(OnlineData onlineData)
    {
        return onlineDataMapper.insertOnlineData(onlineData);
    }

    /**
     * 修改速卖通分析-刊登数据
     * 
     * @param onlineData 速卖通分析-刊登数据
     * @return 结果
     */
    @Override
    public int updateOnlineData(OnlineData onlineData)
    {
        return onlineDataMapper.updateOnlineData(onlineData);
    }

    /**
     * 批量删除速卖通分析-刊登数据
     * 
     * @param ids 需要删除的速卖通分析-刊登数据主键
     * @return 结果
     */
    @Override
    public int deleteOnlineDataByIds(Long[] ids)
    {
        return onlineDataMapper.deleteOnlineDataByIds(ids);
    }

    /**
     * 删除速卖通分析-刊登数据信息
     * 
     * @param id 速卖通分析-刊登数据主键
     * @return 结果
     */
    @Override
    public int deleteOnlineDataById(Long id)
    {
        return onlineDataMapper.deleteOnlineDataById(id);
    }
}
