package com.ruoyi.aliexpress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 竞对信息对象 aliexpress_competition_information
 * 
 * @author ruoyi
 * @date 2025-01-16
 */
public class AliexpressCompetitionInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** sku */
    @Excel(name = "sku")
    private String sku;

    /** 渠道类型 */
    @Excel(name = "渠道类型")
    private String orderType;

    /** 刊登ID */
    @Excel(name = "刊登ID")
    private String publicationId;

    /** 店铺 */
    @Excel(name = "店铺")
    private String shops;

    /** 店铺类型 */
    @Excel(name = "店铺类型")
    private String shopsType;

    /** 链接类型 */
    @Excel(name = "链接类型")
    private String linkType;

    /** 7日订单日均量 */
    @Excel(name = "7日订单日均量")
    private Long averageDailyOrder7;

    /** 评分 */
    @Excel(name = "评分")
    private String score;

    /** 180天订单数 */
    @Excel(name = "180天订单数")
    private String orderNumber180;

    /** 首次发现时间 */
    @Excel(name = "首次发现时间")
    private String firstDiscoveryTime;

    /** 包裹重量 */
    @Excel(name = "包裹重量")
    private String packageWeight;

    /** TOP3国家分布 */
    @Excel(name = "TOP3国家分布")
    private String hotCountries;

    /** 包裹尺寸 */
    @Excel(name = "包裹尺寸")
    private String packageSize;

    /** 属性 */
    @Excel(name = "属性")
    private String attribute;

    /** 价格 */
    @Excel(name = "价格")
    private String price;

    /** 运费 */
    @Excel(name = "运费")
    private String freight;

    /** 国家 */
    @Excel(name = "国家")
    private String countries;


    /** 国家 */
    @Excel(name = "货币类型")
    private String monetaryType;


    /** 是否更新 */
    private String ifUpdate;

    /** 图片 */
    private String picture;

    /** sku负责人 */
    @Excel(name = "负责人")
    private String skuPerson;

    /** 市场容量 */
    @Excel(name = "市场容量")
    private String marketCapacity;

    @Excel(name = "我们刊登ID")
    private String selfPublicationId;

    /** sku负责人 */
    @Excel(name = "我们价格")
    private String selfPrice;
    /** sku负责人 */
    private String selfFreight;

    /** sku负责人 */
    private String publicTitle;

    public String getPublicTitle() {
        return publicTitle;
    }

    public void setPublicTitle(String publicTitle) {
        this.publicTitle = publicTitle;
    }

    public String getSelfFreight() {
        return selfFreight;
    }

    public void setSelfFreight(String selfFreight) {
        this.selfFreight = selfFreight;
    }

    public String getSelfPublicationId() {
        return selfPublicationId;
    }

    public void setSelfPublicationId(String selfPublicationId) {
        this.selfPublicationId = selfPublicationId;
    }

    public String getSelfPrice() {
        return selfPrice;
    }

    public void setSelfPrice(String selfPrice) {
        this.selfPrice = selfPrice;
    }

    public String getMarketCapacity() {
        return marketCapacity;
    }

    public void setMarketCapacity(String marketCapacity) {
        this.marketCapacity = marketCapacity;
    }

    public String getSkuPerson() {
        return skuPerson;
    }

    public void setSkuPerson(String skuPerson) {
        this.skuPerson = skuPerson;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getMonetaryType() {
        return monetaryType;
    }

    public void setMonetaryType(String monetaryType) {
        this.monetaryType = monetaryType;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setOrderType(String orderType) 
    {
        this.orderType = orderType;
    }

    public String getOrderType() 
    {
        return orderType;
    }
    public void setPublicationId(String publicationId) 
    {
        this.publicationId = publicationId;
    }

    public String getPublicationId() 
    {
        return publicationId;
    }
    public void setShops(String shops) 
    {
        this.shops = shops;
    }

    public String getShops() 
    {
        return shops;
    }
    public void setShopsType(String shopsType) 
    {
        this.shopsType = shopsType;
    }

    public String getShopsType() 
    {
        return shopsType;
    }
    public void setLinkType(String linkType) 
    {
        this.linkType = linkType;
    }

    public String getLinkType() 
    {
        return linkType;
    }
    public void setAverageDailyOrder7(Long averageDailyOrder7) 
    {
        this.averageDailyOrder7 = averageDailyOrder7;
    }

    public Long getAverageDailyOrder7() 
    {
        return averageDailyOrder7;
    }
    public void setScore(String score) 
    {
        this.score = score;
    }

    public String getScore() 
    {
        return score;
    }
    public void setOrderNumber180(String orderNumber180) 
    {
        this.orderNumber180 = orderNumber180;
    }

    public String getOrderNumber180() 
    {
        return orderNumber180;
    }
    public void setFirstDiscoveryTime(String firstDiscoveryTime) 
    {
        this.firstDiscoveryTime = firstDiscoveryTime;
    }

    public String getFirstDiscoveryTime() 
    {
        return firstDiscoveryTime;
    }
    public void setPackageWeight(String packageWeight) 
    {
        this.packageWeight = packageWeight;
    }

    public String getPackageWeight() 
    {
        return packageWeight;
    }
    public void setHotCountries(String hotCountries) 
    {
        this.hotCountries = hotCountries;
    }

    public String getHotCountries() 
    {
        return hotCountries;
    }
    public void setPackageSize(String packageSize) 
    {
        this.packageSize = packageSize;
    }

    public String getPackageSize() 
    {
        return packageSize;
    }
    public void setIfUpdate(String ifUpdate) 
    {
        this.ifUpdate = ifUpdate;
    }

    public String getIfUpdate() 
    {
        return ifUpdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sku", getSku())
            .append("orderType", getOrderType())
            .append("publicationId", getPublicationId())
            .append("shops", getShops())
            .append("shopsType", getShopsType())
            .append("linkType", getLinkType())
            .append("averageDailyOrder7", getAverageDailyOrder7())
            .append("score", getScore())
            .append("orderNumber180", getOrderNumber180())
            .append("firstDiscoveryTime", getFirstDiscoveryTime())
            .append("packageWeight", getPackageWeight())
            .append("hotCountries", getHotCountries())
            .append("packageSize", getPackageSize())
            .append("createTime", getCreateTime())
            .append("ifUpdate", getIfUpdate())
            .toString();
    }
}
