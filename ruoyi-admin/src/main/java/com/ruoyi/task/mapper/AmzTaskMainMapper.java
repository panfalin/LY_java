package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskMain;
import com.ruoyi.task.domain.vo.SkuTaskVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 亚马逊任务主表Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Mapper
public interface AmzTaskMainMapper {
    /**
     * 查询亚马逊任务主表
     *
     * @param taskId 亚马逊任务主表主键
     * @return 亚马逊任务主表
     */
    public AmzTaskMain selectAmzTaskMainByTaskId(Long taskId);

    /**
     * 查询亚马逊任务主表列表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 亚马逊任务主表集合
     */
    public List<AmzTaskMain> selectAmzTaskMainList(AmzTaskMain amzTaskMain);

    /**
     * 新增亚马逊任务主表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 结果
     */
    public int insertAmzTaskMain(AmzTaskMain amzTaskMain);

    /**
     * 修改亚马逊任务主表
     *
     * @param amzTaskMain 亚马逊任务主表
     * @return 结果
     */
    public int updateAmzTaskMain(AmzTaskMain amzTaskMain);

    /**
     * 删除亚马逊任务主表
     *
     * @param taskId 亚马逊任务主表主键
     * @return 结果
     */
    public int deleteAmzTaskMainByTaskId(Long taskId);

    /**
     * 批量删除亚马逊任务主表
     *
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskMainByTaskIds(Long[] taskIds);

    /**
     * 按SKU维度查询任务列表
     */
    List<SkuTaskVO> selectTaskGroupBySku(AmzTaskMain query);
}
