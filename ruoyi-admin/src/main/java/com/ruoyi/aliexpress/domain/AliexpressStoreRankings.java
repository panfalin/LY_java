package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 速卖通工具-店铺排名对象 aliexpress_store_rankings
 * 
 * @author ruoyi
 * @date 2025-02-27
 */
public class AliexpressStoreRankings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 店铺 */
    @Excel(name = "店铺")
    private String shops;

    /** 负责人 */
    @Excel(name = "负责人")
    private String personName;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shopDate;

    /** 主营类目 */
    @Excel(name = "主营类目")
    private String mainCategory;

    /** 层级 */
    @Excel(name = "层级")
    private String level;

    /** 排名 */
    @Excel(name = "排名")
    private String ranking;

    /** 补贴金额 */
    @Excel(name = "近30天支付金额")
    private BigDecimal amountPaid;

    @Excel(name = "访客")
    private int visitors;


    @Excel(name = "店铺刊登数量")
    private int storesPublished;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;

    public int getStoresPublished() {
        return storesPublished;
    }

    public void setStoresPublished(int storesPublished) {
        this.storesPublished = storesPublished;
    }

    public LocalDate getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDate beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public void setShops(String shops)
    {
        this.shops = shops;
    }

    public String getShops() 
    {
        return shops;
    }
    public void setPersonName(String personName) 
    {
        this.personName = personName;
    }

    public String getPersonName() 
    {
        return personName;
    }
    public void setShopDate(Date shopDate) 
    {
        this.shopDate = shopDate;
    }

    public Date getShopDate() 
    {
        return shopDate;
    }
    public void setMainCategory(String mainCategory) 
    {
        this.mainCategory = mainCategory;
    }

    public String getMainCategory() 
    {
        return mainCategory;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setRanking(String ranking) 
    {
        this.ranking = ranking;
    }

    public String getRanking() 
    {
        return ranking;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("shops", getShops())
            .append("personName", getPersonName())
            .append("shopDate", getShopDate())
            .append("mainCategory", getMainCategory())
            .append("level", getLevel())
            .append("ranking", getRanking())
            .toString();
    }
}
