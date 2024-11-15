package com.ruoyi.orders.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 速卖通分析-店铺信息对象 stores
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
public class Stores extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 负责人 */
    @Excel(name = "负责人")
    private String storeManager;

    /** 店铺 */
    @Excel(name = "店铺")
    private String storeName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStoreManager(String storeManager) 
    {
        this.storeManager = storeManager;
    }

    public String getStoreManager() 
    {
        return storeManager;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("storeManager", getStoreManager())
            .append("storeName", getStoreName())
            .toString();
    }
}
