package com.ruoyi.kingdee.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金蝶商品信息对象 kingdee_product_info
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public class KingdeeProductInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 行号 */
    @Excel(name = "行号")
    private Long rk;

    /** 序号 */
    @Excel(name = "序号")
    private Long fseq;

    /** 条形码 */
    private String barcode;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String url;

    /** 商品编码 */
    @Excel(name = "商品编码")
    private String number;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String name;

    /** 参考成本 */
    @Excel(name = "参考成本")
    private BigDecimal costprice;

    /** 采购价 */
    @Excel(name = "采购价")
    private BigDecimal purchaseprice;

    /** 零售价 */
    @Excel(name = "零售价")
    private BigDecimal retailprice;

    /** 销售价格4 */
    private BigDecimal saleprice4;

    /** 销售价格5 */
    private BigDecimal saleprice5;

    /** 销售价格6 */
    private BigDecimal saleprice6;

    /** 销售价格7 */
    private BigDecimal saleprice7;

    /** 销售价格8 */
    private BigDecimal saleprice8;

    /** 销售价格9 */
    private BigDecimal saleprice9;

    /** 销售价格10 */
    private BigDecimal saleprice10;

    /** 可用库存 */
    @Excel(name = "可用库存")
    private BigDecimal qtyinv;

    /** 是否采购 */
    private Integer ispurchase;

    /** 是否销售 */
    private Integer issale;

    /** 是否组装 */
    private Integer isassembly;

    /** 是否反冲 */
    private Integer isbackflushed;

    /** 是否外包 */
    private Integer isoutsource;

    /** 是否自我约束 */
    private Integer isselfrestraint;

    /** 是否子部件 */
    private Integer issubpart;

    /** 是否称重 */
    private Integer isweight;

    /** 最高采购价格 */
    private BigDecimal maxpurchaseprice;

    /** 成本方法 */
    private String costmethod;

    /** 内部税率 */
    private BigDecimal intaxrate;

    /** 属性 */
    private String cprop;

    /** 商品分类 */
    @Excel(name = "商品分类")
    private String parentName;

    /** 反冲空间ID名称 */
    private String backflushedSpaceidName;

    /** 反冲库存ID名称 */
    private String backflushedStockidName;

    /** 空间ID名称 */
    private String spaceidName;

    /** 状态 */
    private Long s;

    /** 创建时间 */
    private Date createdAt;

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
    public void setBarcode(String barcode) 
    {
        this.barcode = barcode;
    }

    public String getBarcode() 
    {
        return barcode;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
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
    public void setCostprice(BigDecimal costprice) 
    {
        this.costprice = costprice;
    }

    public BigDecimal getCostprice() 
    {
        return costprice;
    }
    public void setPurchaseprice(BigDecimal purchaseprice) 
    {
        this.purchaseprice = purchaseprice;
    }

    public BigDecimal getPurchaseprice() 
    {
        return purchaseprice;
    }
    public void setRetailprice(BigDecimal retailprice) 
    {
        this.retailprice = retailprice;
    }

    public BigDecimal getRetailprice() 
    {
        return retailprice;
    }
    public void setSaleprice4(BigDecimal saleprice4) 
    {
        this.saleprice4 = saleprice4;
    }

    public BigDecimal getSaleprice4() 
    {
        return saleprice4;
    }
    public void setSaleprice5(BigDecimal saleprice5) 
    {
        this.saleprice5 = saleprice5;
    }

    public BigDecimal getSaleprice5() 
    {
        return saleprice5;
    }
    public void setSaleprice6(BigDecimal saleprice6) 
    {
        this.saleprice6 = saleprice6;
    }

    public BigDecimal getSaleprice6() 
    {
        return saleprice6;
    }
    public void setSaleprice7(BigDecimal saleprice7) 
    {
        this.saleprice7 = saleprice7;
    }

    public BigDecimal getSaleprice7() 
    {
        return saleprice7;
    }
    public void setSaleprice8(BigDecimal saleprice8) 
    {
        this.saleprice8 = saleprice8;
    }

    public BigDecimal getSaleprice8() 
    {
        return saleprice8;
    }
    public void setSaleprice9(BigDecimal saleprice9) 
    {
        this.saleprice9 = saleprice9;
    }

    public BigDecimal getSaleprice9() 
    {
        return saleprice9;
    }
    public void setSaleprice10(BigDecimal saleprice10) 
    {
        this.saleprice10 = saleprice10;
    }

    public BigDecimal getSaleprice10() 
    {
        return saleprice10;
    }
    public void setQtyinv(BigDecimal qtyinv) 
    {
        this.qtyinv = qtyinv;
    }

    public BigDecimal getQtyinv() 
    {
        return qtyinv;
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
    public void setIsassembly(Integer isassembly) 
    {
        this.isassembly = isassembly;
    }

    public Integer getIsassembly() 
    {
        return isassembly;
    }
    public void setIsbackflushed(Integer isbackflushed) 
    {
        this.isbackflushed = isbackflushed;
    }

    public Integer getIsbackflushed() 
    {
        return isbackflushed;
    }
    public void setIsoutsource(Integer isoutsource) 
    {
        this.isoutsource = isoutsource;
    }

    public Integer getIsoutsource() 
    {
        return isoutsource;
    }
    public void setIsselfrestraint(Integer isselfrestraint) 
    {
        this.isselfrestraint = isselfrestraint;
    }

    public Integer getIsselfrestraint() 
    {
        return isselfrestraint;
    }
    public void setIssubpart(Integer issubpart) 
    {
        this.issubpart = issubpart;
    }

    public Integer getIssubpart() 
    {
        return issubpart;
    }
    public void setIsweight(Integer isweight) 
    {
        this.isweight = isweight;
    }

    public Integer getIsweight() 
    {
        return isweight;
    }
    public void setMaxpurchaseprice(BigDecimal maxpurchaseprice) 
    {
        this.maxpurchaseprice = maxpurchaseprice;
    }

    public BigDecimal getMaxpurchaseprice() 
    {
        return maxpurchaseprice;
    }
    public void setCostmethod(String costmethod) 
    {
        this.costmethod = costmethod;
    }

    public String getCostmethod() 
    {
        return costmethod;
    }
    public void setIntaxrate(BigDecimal intaxrate) 
    {
        this.intaxrate = intaxrate;
    }

    public BigDecimal getIntaxrate() 
    {
        return intaxrate;
    }
    public void setCprop(String cprop) 
    {
        this.cprop = cprop;
    }

    public String getCprop() 
    {
        return cprop;
    }
    public void setParentName(String parentName) 
    {
        this.parentName = parentName;
    }

    public String getParentName() 
    {
        return parentName;
    }
    public void setBackflushedSpaceidName(String backflushedSpaceidName) 
    {
        this.backflushedSpaceidName = backflushedSpaceidName;
    }

    public String getBackflushedSpaceidName() 
    {
        return backflushedSpaceidName;
    }
    public void setBackflushedStockidName(String backflushedStockidName) 
    {
        this.backflushedStockidName = backflushedStockidName;
    }

    public String getBackflushedStockidName() 
    {
        return backflushedStockidName;
    }
    public void setSpaceidName(String spaceidName) 
    {
        this.spaceidName = spaceidName;
    }

    public String getSpaceidName() 
    {
        return spaceidName;
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
            .append("barcode", getBarcode())
            .append("url", getUrl())
            .append("number", getNumber())
            .append("name", getName())
            .append("costprice", getCostprice())
            .append("purchaseprice", getPurchaseprice())
            .append("retailprice", getRetailprice())
            .append("saleprice4", getSaleprice4())
            .append("saleprice5", getSaleprice5())
            .append("saleprice6", getSaleprice6())
            .append("saleprice7", getSaleprice7())
            .append("saleprice8", getSaleprice8())
            .append("saleprice9", getSaleprice9())
            .append("saleprice10", getSaleprice10())
            .append("qtyinv", getQtyinv())
            .append("ispurchase", getIspurchase())
            .append("issale", getIssale())
            .append("isassembly", getIsassembly())
            .append("isbackflushed", getIsbackflushed())
            .append("isoutsource", getIsoutsource())
            .append("isselfrestraint", getIsselfrestraint())
            .append("issubpart", getIssubpart())
            .append("isweight", getIsweight())
            .append("maxpurchaseprice", getMaxpurchaseprice())
            .append("costmethod", getCostmethod())
            .append("intaxrate", getIntaxrate())
            .append("cprop", getCprop())
            .append("parentName", getParentName())
            .append("backflushedSpaceidName", getBackflushedSpaceidName())
            .append("backflushedStockidName", getBackflushedStockidName())
            .append("spaceidName", getSpaceidName())
            .append("s", getS())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
