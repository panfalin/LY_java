package com.ruoyi.mskulist.mapper;

import java.util.List;
import com.ruoyi.mskulist.domain.Mskulist;

/**
 * mskulistMapper接口
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public interface MskulistMapper 
{
    /**
     * 查询mskulist
     * 
     * @param id mskulist主键
     * @return mskulist
     */
    public Mskulist selectMskulistById(Long id);

    /**
     * 查询mskulist列表
     * 
     * @param mskulist mskulist
     * @return mskulist集合
     */
    public List<Mskulist> selectMskulistList(Mskulist mskulist);

    /**
     * 新增mskulist
     * 
     * @param mskulist mskulist
     * @return 结果
     */
    public int insertMskulist(Mskulist mskulist);

    /**
     * 修改mskulist
     * 
     * @param mskulist mskulist
     * @return 结果
     */
    public int updateMskulist(Mskulist mskulist);

    /**
     * 删除mskulist
     * 
     * @param id mskulist主键
     * @return 结果
     */
    public int deleteMskulistById(Long id);

    /**
     * 批量删除mskulist
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMskulistByIds(Long[] ids);
}
