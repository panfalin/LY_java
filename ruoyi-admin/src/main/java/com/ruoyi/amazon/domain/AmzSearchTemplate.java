package com.ruoyi.amazon.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 搜索模板对象 amz_search_template
 * 
 * @author panfalin
 * @date 2025-04-02
 */
public class AmzSearchTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String templateName;

    /** 模板内容(JSON格式存储搜索条件) */
    @Excel(name = "模板内容(JSON格式存储搜索条件)")
    private String templateContent;

    /** 删除标志(0存在 1删除) */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTemplateName(String templateName) 
    {
        this.templateName = templateName;
    }

    public String getTemplateName() 
    {
        return templateName;
    }
    public void setTemplateContent(String templateContent) 
    {
        this.templateContent = templateContent;
    }

    public String getTemplateContent() 
    {
        return templateContent;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("templateName", getTemplateName())
            .append("templateContent", getTemplateContent())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
