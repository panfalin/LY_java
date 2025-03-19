package com.ruoyi.aliexpress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工具指标-全托管对象 aliexpress_tool_indicators_auto
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
public class AliexpressToolIndicatorsAuto extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 店铺 */
    @Excel(name = "店铺")
    private String shopName;

    /** 店铺负责人 */
    @Excel(name = "店铺负责人")
    private String shopPerson;

    /** 违背发货承诺订单数 */
    @Excel(name = "质量纠纷")
    private String qualityDisputes;

    /** 违规侵权 */
    @Excel(name = "3PL物流纠纷")
    private String PLLogistics;

    /** jit入库超时 */
    @Excel(name = "待响应JIT入库超时纠纷")
    private String JITWarehousingTimeout;

    /** 理货报告纠纷 */
    @Excel(name = "待响应备货入仓处罚纠纷")
    private String warehouseOverPenalty;

    /** 件重尺纠纷 */
    @Excel(name = "待申述处罚")
    private String pendingAppeal;

    /** 超过24小时未发货订单数 */
    @Excel(name = "已断货")
    private String outStock;

    /** jit订单异常 */
    @Excel(name = "已断码")
    private String brokenSize;

    /** jit订单异常 */
    @Excel(name = "在线刊登")
    private String onlinePublication;

    private String ifUpdate;

    /** $column.columnComment */
    private Long sId;

    public String getOnlinePublication() {
        return onlinePublication;
    }

    public void setOnlinePublication(String onlinePublication) {
        this.onlinePublication = onlinePublication;
    }

    public String getPLLogistics() {
        return PLLogistics;
    }

    public void setPLLogistics(String PLLogistics) {
        this.PLLogistics = PLLogistics;
    }

    public String getJITWarehousingTimeout() {
        return JITWarehousingTimeout;
    }

    public void setJITWarehousingTimeout(String JITWarehousingTimeout) {
        this.JITWarehousingTimeout = JITWarehousingTimeout;
    }

    public String getQualityDisputes() {
        return qualityDisputes;
    }

    public void setQualityDisputes(String qualityDisputes) {
        this.qualityDisputes = qualityDisputes;
    }

    public String getWarehouseOverPenalty() {
        return warehouseOverPenalty;
    }

    public void setWarehouseOverPenalty(String warehouseOverPenalty) {
        this.warehouseOverPenalty = warehouseOverPenalty;
    }

    public String getPendingAppeal() {
        return pendingAppeal;
    }

    public void setPendingAppeal(String pendingAppeal) {
        this.pendingAppeal = pendingAppeal;
    }

    public String getOutStock() {
        return outStock;
    }

    public void setOutStock(String outStock) {
        this.outStock = outStock;
    }

    public String getBrokenSize() {
        return brokenSize;
    }

    public void setBrokenSize(String brokenSize) {
        this.brokenSize = brokenSize;
    }

    public String getIfUpdate() {
        return ifUpdate;
    }

    public void setIfUpdate(String ifUpdate) {
        this.ifUpdate = ifUpdate;
    }

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

    public void setsId(Long sId)
    {
        this.sId = sId;
    }

    public Long getsId()
    {
        return sId;
    }


}
