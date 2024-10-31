package com.ruoyi.categories.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 速卖通分析-分类对象 categories
 * 
 * @author ruoyi
 * @date 2024-10-26
 */
public class Categories extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分类ID */
    private Long categoryId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String categoryNameCn;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String categoryNameEn;

    /** 父分类ID */
    @Excel(name = "父分类ID")
    private Long parentId;

    /** 分类层级 */
    @Excel(name = "分类层级")
    private Long categoryLevel;

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setCategoryNameCn(String categoryNameCn) 
    {
        this.categoryNameCn = categoryNameCn;
    }

    public String getCategoryNameCn() 
    {
        return categoryNameCn;
    }
    public void setCategoryNameEn(String categoryNameEn) 
    {
        this.categoryNameEn = categoryNameEn;
    }

    public String getCategoryNameEn() 
    {
        return categoryNameEn;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setCategoryLevel(Long categoryLevel) 
    {
        this.categoryLevel = categoryLevel;
    }

    public Long getCategoryLevel() 
    {
        return categoryLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("categoryId", getCategoryId())
            .append("categoryNameCn", getCategoryNameCn())
            .append("categoryNameEn", getCategoryNameEn())
            .append("parentId", getParentId())
            .append("categoryLevel", getCategoryLevel())
            .toString();
    }
}
