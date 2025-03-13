package com.ruoyi.kingdee.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金蝶商品分类信息对象 kingdee_product_category
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public class KingdeeProductCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 行号 */
    private Long rk;

    /** 序列号 */
    @Excel(name = "序列号")
    private Long fseq;

    /** 分类编号 */
    @Excel(name = "分类编号")
    private String number;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String name;

    /** 父级分类编号 */
    @Excel(name = "父级分类编号")
    private String parentNumber;

    /** 父级分类名称 */
    @Excel(name = "父级分类名称")
    private String parentName;

    /** 品牌名称 */
    private String brandidName;

    /** 是否启用 */
    private Integer enable;

    /** 检查类型 */
    private Long checktype;

    /** 是否组装 */
    private Integer isassembly;

    /** 是否批次 */
    private Integer isbatch;

    /** 是否序列 */
    private Integer isserial;

    /** 是否外包 */
    private Integer isoutsource;

    /** 是否采购 */
    private Integer ispurchase;

    /** 是否销售 */
    private Integer issale;

    /** 是否自我约束 */
    private Integer isselfrestraint;

    /** 是否称重 */
    private Integer isweight;

    /** 是否反冲 */
    private Integer isbackflushed;

    /** 是否默认开启 */
    private Integer isopendefault;

    /** 是否关键期 */
    private Integer iskfperiod;

    /** 关键期 */
    private Long kfperiod;

    /** 关键期类型 */
    private Long kfperiodtype;

    /** 内部税率 */
    private BigDecimal intaxrate;

    /** 税率 */
    private BigDecimal taxrate;

    /** 空间ID名称 */
    private String spaceidName;

    /** 库存ID名称 */
    private String stockidName;

    /** 生产部门名称 */
    private String producingdepartmentName;

    /** 禁用者名称 */
    private String disablerName;

    /** 禁用日期 */
    private Date disabledate;

    /** 属性 */
    private String cprop;

    /** 多标签名称 */
    private String mullabelName;

    /** 状态 */
    private Long s;

    /** 创建时间 */
    private Date createdAt;

    // 在实体类中添加children字段
    private List<KingdeeProductCategory> children;

    // getter和setter
    public List<KingdeeProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<KingdeeProductCategory> children) {
        this.children = children;
    }

    public void setRk(Long rk) 
    {
        this.rk = rk;
    }

    public Long getRk() 
    {
        return rk;
    }
    public void setFseq(Long fseq) 
    {
        this.fseq = fseq;
    }

    public Long getFseq() 
    {
        return fseq;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setParentNumber(String parentNumber) 
    {
        this.parentNumber = parentNumber;
    }

    public String getParentNumber() 
    {
        return parentNumber;
    }
    public void setParentName(String parentName) 
    {
        this.parentName = parentName;
    }

    public String getParentName() 
    {
        return parentName;
    }
    public void setBrandidName(String brandidName) 
    {
        this.brandidName = brandidName;
    }

    public String getBrandidName() 
    {
        return brandidName;
    }
    public void setEnable(Integer enable) 
    {
        this.enable = enable;
    }

    public Integer getEnable() 
    {
        return enable;
    }
    public void setChecktype(Long checktype) 
    {
        this.checktype = checktype;
    }

    public Long getChecktype() 
    {
        return checktype;
    }
    public void setIsassembly(Integer isassembly) 
    {
        this.isassembly = isassembly;
    }

    public Integer getIsassembly() 
    {
        return isassembly;
    }
    public void setIsbatch(Integer isbatch) 
    {
        this.isbatch = isbatch;
    }

    public Integer getIsbatch() 
    {
        return isbatch;
    }
    public void setIsserial(Integer isserial) 
    {
        this.isserial = isserial;
    }

    public Integer getIsserial() 
    {
        return isserial;
    }
    public void setIsoutsource(Integer isoutsource) 
    {
        this.isoutsource = isoutsource;
    }

    public Integer getIsoutsource() 
    {
        return isoutsource;
    }
    public void setIspurchase(Integer ispurchase) 
    {
        this.ispurchase = ispurchase;
    }

    public Integer getIspurchase() 
    {
        return ispurchase;
    }
    public void setIssale(Integer issale) 
    {
        this.issale = issale;
    }

    public Integer getIssale() 
    {
        return issale;
    }
    public void setIsselfrestraint(Integer isselfrestraint) 
    {
        this.isselfrestraint = isselfrestraint;
    }

    public Integer getIsselfrestraint() 
    {
        return isselfrestraint;
    }
    public void setIsweight(Integer isweight) 
    {
        this.isweight = isweight;
    }

    public Integer getIsweight() 
    {
        return isweight;
    }
    public void setIsbackflushed(Integer isbackflushed) 
    {
        this.isbackflushed = isbackflushed;
    }

    public Integer getIsbackflushed() 
    {
        return isbackflushed;
    }
    public void setIsopendefault(Integer isopendefault) 
    {
        this.isopendefault = isopendefault;
    }

    public Integer getIsopendefault() 
    {
        return isopendefault;
    }
    public void setIskfperiod(Integer iskfperiod) 
    {
        this.iskfperiod = iskfperiod;
    }

    public Integer getIskfperiod() 
    {
        return iskfperiod;
    }
    public void setKfperiod(Long kfperiod) 
    {
        this.kfperiod = kfperiod;
    }

    public Long getKfperiod() 
    {
        return kfperiod;
    }
    public void setKfperiodtype(Long kfperiodtype) 
    {
        this.kfperiodtype = kfperiodtype;
    }

    public Long getKfperiodtype() 
    {
        return kfperiodtype;
    }
    public void setIntaxrate(BigDecimal intaxrate) 
    {
        this.intaxrate = intaxrate;
    }

    public BigDecimal getIntaxrate() 
    {
        return intaxrate;
    }
    public void setTaxrate(BigDecimal taxrate) 
    {
        this.taxrate = taxrate;
    }

    public BigDecimal getTaxrate() 
    {
        return taxrate;
    }
    public void setSpaceidName(String spaceidName) 
    {
        this.spaceidName = spaceidName;
    }

    public String getSpaceidName() 
    {
        return spaceidName;
    }
    public void setStockidName(String stockidName) 
    {
        this.stockidName = stockidName;
    }

    public String getStockidName() 
    {
        return stockidName;
    }
    public void setProducingdepartmentName(String producingdepartmentName) 
    {
        this.producingdepartmentName = producingdepartmentName;
    }

    public String getProducingdepartmentName() 
    {
        return producingdepartmentName;
    }
    public void setDisablerName(String disablerName) 
    {
        this.disablerName = disablerName;
    }

    public String getDisablerName() 
    {
        return disablerName;
    }
    public void setDisabledate(Date disabledate) 
    {
        this.disabledate = disabledate;
    }

    public Date getDisabledate() 
    {
        return disabledate;
    }
    public void setCprop(String cprop) 
    {
        this.cprop = cprop;
    }

    public String getCprop() 
    {
        return cprop;
    }
    public void setMullabelName(String mullabelName) 
    {
        this.mullabelName = mullabelName;
    }

    public String getMullabelName() 
    {
        return mullabelName;
    }
    public void setS(Long s) 
    {
        this.s = s;
    }

    public Long getS() 
    {
        return s;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rk", getRk())
            .append("fseq", getFseq())
            .append("number", getNumber())
            .append("name", getName())
            .append("parentNumber", getParentNumber())
            .append("parentName", getParentName())
            .append("brandidName", getBrandidName())
            .append("enable", getEnable())
            .append("checktype", getChecktype())
            .append("isassembly", getIsassembly())
            .append("isbatch", getIsbatch())
            .append("isserial", getIsserial())
            .append("isoutsource", getIsoutsource())
            .append("ispurchase", getIspurchase())
            .append("issale", getIssale())
            .append("isselfrestraint", getIsselfrestraint())
            .append("isweight", getIsweight())
            .append("isbackflushed", getIsbackflushed())
            .append("isopendefault", getIsopendefault())
            .append("iskfperiod", getIskfperiod())
            .append("kfperiod", getKfperiod())
            .append("kfperiodtype", getKfperiodtype())
            .append("intaxrate", getIntaxrate())
            .append("taxrate", getTaxrate())
            .append("spaceidName", getSpaceidName())
            .append("stockidName", getStockidName())
            .append("producingdepartmentName", getProducingdepartmentName())
            .append("disablerName", getDisablerName())
            .append("disabledate", getDisabledate())
            .append("cprop", getCprop())
            .append("mullabelName", getMullabelName())
            .append("s", getS())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
