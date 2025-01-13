package com.ruoyi.aliexpress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 竞对SKU对象 aliexpress_competition_analysis
 * 
 * @author ruoyi
 * @date 2025-01-10
 */
public class AliexpressCompetitionAnalysis extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long sId;

    /** sku */
    @Excel(name = "sku")
    private String sku;

    /** 刊登ID */
    @Excel(name = "刊登ID")
    private String publicationId;

    /** 刊登ID */
    @Excel(name = "sku负责人")
    private String skuPerson;

    /** 刊登ID */
    @Excel(name = "订单类型")
    private String orderType;

    /** 下载链接 */
    @Excel(name = "下载链接")
    private String link;

    /** 爬取状态 */
    @Excel(name = "爬取状态")
    private String crawlStatus;

    /** 刊登ID */
    @Excel(name = "订单类型")
    private String publicationIdPop;

    /** 刊登ID */
    @Excel(name = "订单类型")
    private String publicationIdAll;

    /** 刊登ID */
    @Excel(name = "订单类型")
    private String publicationIdHalf;

    public String getPublicationIdPop() {
        return publicationIdPop;
    }

    public void setPublicationIdPop(String publicationIdPop) {
        this.publicationIdPop = publicationIdPop;
    }

    public String getPublicationIdAll() {
        return publicationIdAll;
    }

    public void setPublicationIdAll(String publicationIdAll) {
        this.publicationIdAll = publicationIdAll;
    }

    public String getPublicationIdHalf() {
        return publicationIdHalf;
    }

    public void setPublicationIdHalf(String publicationIdHalf) {
        this.publicationIdHalf = publicationIdHalf;
    }

    public void setsId(Long sId)
    {
        this.sId = sId;
    }

    public String getSkuPerson() {
        return skuPerson;
    }

    public void setSkuPerson(String skuPerson) {
        this.skuPerson = skuPerson;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Long getsId()
    {
        return sId;
    }
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setPublicationId(String publicationId) 
    {
        this.publicationId = publicationId;
    }

    public String getPublicationId() 
    {
        return publicationId;
    }
    public void setLink(String link) 
    {
        this.link = link;
    }

    public String getLink() 
    {
        return link;
    }
    public void setCrawlStatus(String crawlStatus) 
    {
        this.crawlStatus = crawlStatus;
    }

    public String getCrawlStatus() 
    {
        return crawlStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("sku", getSku())
            .append("publicationId", getPublicationId())
            .append("link", getLink())
            .append("crawlStatus", getCrawlStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
