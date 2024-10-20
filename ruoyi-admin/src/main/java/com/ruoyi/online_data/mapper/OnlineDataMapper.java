package com.ruoyi.online_data.mapper;

import java.util.List;
import com.ruoyi.online_data.domain.OnlineData;

/**
 * 速卖通分析-刊登数据Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public interface OnlineDataMapper 
{
    /**
     * 查询速卖通分析-刊登数据
     * 
     * @param id 速卖通分析-刊登数据主键
     * @return 速卖通分析-刊登数据
     */
    public OnlineData selectOnlineDataById(Long id);

    /**
     * 查询速卖通分析-刊登数据列表
     * 
     * @param onlineData 速卖通分析-刊登数据
     * @return 速卖通分析-刊登数据集合
     */
    public List<OnlineData> selectOnlineDataList(OnlineData onlineData);

    /**
     * 新增速卖通分析-刊登数据
     * 
     * @param onlineData 速卖通分析-刊登数据
     * @return 结果
     */
    public int insertOnlineData(OnlineData onlineData);

    /**
     * 修改速卖通分析-刊登数据
     * 
     * @param onlineData 速卖通分析-刊登数据
     * @return 结果
     */
    public int updateOnlineData(OnlineData onlineData);

    /**
     * 删除速卖通分析-刊登数据
     * 
     * @param id 速卖通分析-刊登数据主键
     * @return 结果
     */
    public int deleteOnlineDataById(Long id);

    /**
     * 批量删除速卖通分析-刊登数据
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOnlineDataByIds(Long[] ids);
}
