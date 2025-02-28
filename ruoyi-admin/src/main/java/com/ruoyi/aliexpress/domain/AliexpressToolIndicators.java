package com.ruoyi.aliexpress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工具指标对象 aliexpress_tool_indicators
 * 
 * @author ruoyi
 * @date 2025-02-17
 */
public class AliexpressToolIndicators extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 店铺 */
    @Excel(name = "店铺")
    private String shopName;

    /** 店铺负责人 */
    @Excel(name = "店铺负责人")
    private String shopPerson;

    /** 违背发货承诺订单数 */
    @Excel(name = "违背发货承诺订单数")
    private String contraryOrderNum;

    /** 违规侵权 */
    @Excel(name = "违规侵权")
    private String illegalInfringement;

    /** jit入库超时 */
    @Excel(name = "jit入库超时")
    private String warehousTimeoutJit;

    /** 件重尺纠纷 */
    @Excel(name = "件重尺纠纷")
    private String heavyRulerDispute;

    /** 超过24小时未发货订单数 */
    @Excel(name = "超过24小时未发货订单数")
    private String unshippedOrders24;

    /** jit订单异常 */
    @Excel(name = "jit订单异常")
    private String orderExceptionJit;

    /** jit订单异常 */
    @Excel(name = "售罄刊登数")
    private String soldOut;

    public String getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(String soldOut) {
        this.soldOut = soldOut;
    }

    /** $column.columnComment */
    private Long sId;

    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }
    public void setShopPerson(String shopPerson) 
    {
        this.shopPerson = shopPerson;
    }

    public String getShopPerson() 
    {
        return shopPerson;
    }
    public void setContraryOrderNum(String contraryOrderNum) 
    {
        this.contraryOrderNum = contraryOrderNum;
    }

    public String getContraryOrderNum() 
    {
        return contraryOrderNum;
    }
    public void setIllegalInfringement(String illegalInfringement) 
    {
        this.illegalInfringement = illegalInfringement;
    }

    public String getIllegalInfringement() 
    {
        return illegalInfringement;
    }
    public void setWarehousTimeoutJit(String warehousTimeoutJit) 
    {
        this.warehousTimeoutJit = warehousTimeoutJit;
    }

    public String getWarehousTimeoutJit() 
    {
        return warehousTimeoutJit;
    }
    public void setHeavyRulerDispute(String heavyRulerDispute) 
    {
        this.heavyRulerDispute = heavyRulerDispute;
    }

    public String getHeavyRulerDispute() 
    {
        return heavyRulerDispute;
    }
    public void setUnshippedOrders24(String unshippedOrders24) 
    {
        this.unshippedOrders24 = unshippedOrders24;
    }

    public String getUnshippedOrders24() 
    {
        return unshippedOrders24;
    }
    public void setOrderExceptionJit(String orderExceptionJit) 
    {
        this.orderExceptionJit = orderExceptionJit;
    }

    public String getOrderExceptionJit() 
    {
        return orderExceptionJit;
    }
    public void setsId(Long sId) 
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("shopName", getShopName())
            .append("shopPerson", getShopPerson())
            .append("contraryOrderNum", getContraryOrderNum())
            .append("illegalInfringement", getIllegalInfringement())
            .append("warehousTimeoutJit", getWarehousTimeoutJit())
            .append("heavyRulerDispute", getHeavyRulerDispute())
            .append("unshippedOrders24", getUnshippedOrders24())
            .append("orderExceptionJit", getOrderExceptionJit())
            .append("sId", getsId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
