package com.ruoyi.mskulist.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mskulist.mapper.MskulistMapper;
import com.ruoyi.mskulist.domain.Mskulist;
import com.ruoyi.mskulist.service.IMskulistService;

/**
 * mskulistService业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@Service
public class MskulistServiceImpl implements IMskulistService 
{
    @Autowired
    private MskulistMapper mskulistMapper;

    /**
     * 查询mskulist
     * 
     * @param id mskulist主键
     * @return mskulist
     */
    @Override
    public Mskulist selectMskulistById(Long id)
    {
        return mskulistMapper.selectMskulistById(id);
    }

    /**
     * 查询mskulist列表
     * 
     * @param mskulist mskulist
     * @return mskulist
     */
    @Override
    public List<Mskulist> selectMskulistList(Mskulist mskulist)
    {
        return mskulistMapper.selectMskulistList(mskulist);
    }

    /**
     * 新增mskulist
     * 
     * @param mskulist mskulist
     * @return 结果
     */
    @Override
    public int insertMskulist(Mskulist mskulist)
    {
        return mskulistMapper.insertMskulist(mskulist);
    }

    /**
     * 修改mskulist
     * 
     * @param mskulist mskulist
     * @return 结果
     */
    @Override
    public int updateMskulist(Mskulist mskulist)
    {
        mskulist.setUpdateTime(DateUtils.getNowDate());
        return mskulistMapper.updateMskulist(mskulist);
    }

    /**
     * 批量删除mskulist
     * 
     * @param ids 需要删除的mskulist主键
     * @return 结果
     */
    @Override
    public int deleteMskulistByIds(Long[] ids)
    {
        return mskulistMapper.deleteMskulistByIds(ids);
    }

    /**
     * 删除mskulist信息
     * 
     * @param id mskulist主键
     * @return 结果
     */
    @Override
    public int deleteMskulistById(Long id)
    {
        return mskulistMapper.deleteMskulistById(id);
    }

    /**
     * 查询mskulist条数
     *
     * @param mskulist mskulist
     * @return mskulist
     */
    @Override
    public int countMskulist(Mskulist mskulist) {
        return mskulistMapper.countMskulist(mskulist);
    }
}
