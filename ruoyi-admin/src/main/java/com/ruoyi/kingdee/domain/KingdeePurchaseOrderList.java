package com.ruoyi.kingdee.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金蝶采购订单列表对象 kingdee_purchase_order_list
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public class KingdeePurchaseOrderList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 行号 */
    private Long rk;

    /** 行号 */
    @Excel(name = "行号")
    private Long fseq;

    /** 单据日期 */
    @Excel(name = "单据日期")
    private Date billdate;

    /** 单据编号 */
    @Excel(name = "单据编号")
    private String billno;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String billstatus;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplieridName;

    /** 员工名称 */
    @Excel(name = "员工名称")
    private String empidName;

    /** 总结算金额 */
    @Excel(name = "总结算金额")
    private BigDecimal totalsettleamount;

    /** 总未结算金额 */
    @Excel(name = "总未结算金额")
    private BigDecimal totalunsettleamount;

    /** 税额 */
    @Excel(name = "税额")
    private BigDecimal taxamount;

    /** 税价 */
    @Excel(name = "税价")
    private BigDecimal taxprice;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 数量 */
    @Excel(name = "数量")
    private BigDecimal qty;

    /** 应收金额 */
    @Excel(name = "应收金额")
    private BigDecimal entryivcallamount;

    /** 应收状态 */
    @Excel(name = "应收状态")
    private Long entryivcstatus;

    /** 实际状态 */
    @Excel(name = "实际状态")
    private String entryrealiostatus;

    /** 预付款单号 */
    @Excel(name = "预付款单号")
    private Long apPrepayBillid;

    /** 辅助单位类型 */
    @Excel(name = "辅助单位类型")
    private Long auxunittype;

    /** 单据处理金额 */
    @Excel(name = "单据处理金额")
    private BigDecimal billDealAmount;

    /** 关闭状态 */
    @Excel(name = "关闭状态")
    private Long closestate;

    /** 系数 */
    @Excel(name = "系数")
    private BigDecimal coefficient;

    /** 属性 */
    private String cprop;

    /** 自定义字段 */
    private String customField24sbnx21t01sp;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptidName;

    /** 拣货状态 */
    @Excel(name = "拣货状态")
    private Long entryPickStatus;

    /** 进出状态 */
    @Excel(name = "进出状态")
    private String entryiostatus;

    /** 应收金额（外币） */
    @Excel(name = "应收金额", readConverterExp = "外=币")
    private BigDecimal entryivcallamountfor;

    /** 应收基本数量 */
    @Excel(name = "应收基本数量")
    private BigDecimal entryivcbaseqty;

    /** 应收数量 */
    @Excel(name = "应收数量")
    private BigDecimal entryivcqty;

    /** 应收结算状态 */
    @Excel(name = "应收结算状态")
    private String entryivcsettlestatus;

    /** 应收未结基本数量 */
    @Excel(name = "应收未结基本数量")
    private BigDecimal entryunivcbaseqty;

    /** 应收未结数量 */
    @Excel(name = "应收未结数量")
    private BigDecimal entryunivcqty;

    /** 物料实体ID */
    @Excel(name = "物料实体ID")
    private String materialEntityId;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String materialidName;

    /** 物料编号 */
    @Excel(name = "物料编号")
    private String materialidNumber;

    /** 拣货基本数量 */
    @Excel(name = "拣货基本数量")
    private BigDecimal pickBaseqty;

    /** 入库基本数量 */
    @Excel(name = "入库基本数量")
    private BigDecimal pickInBaseqty;

    /** 入库数量 */
    @Excel(name = "入库数量")
    private BigDecimal pickInQty;

    /** 拣货数量 */
    @Excel(name = "拣货数量")
    private BigDecimal pickQty;

    /** 拣货状态 */
    @Excel(name = "拣货状态")
    private Long pickStatus;

    /** 未拣货基本数量 */
    @Excel(name = "未拣货基本数量")
    private BigDecimal unPickBaseqty;

    /** 未拣货数量 */
    @Excel(name = "未拣货数量")
    private BigDecimal unPickQty;

    /** 未入数量 */
    @Excel(name = "未入数量")
    private BigDecimal uninqty;

    /** 进出金额 */
    @Excel(name = "进出金额")
    private BigDecimal ioamount;

    /** 应收金额 */
    @Excel(name = "应收金额")
    private BigDecimal ivcallamount;

    /** 应收金额（外币） */
    @Excel(name = "应收金额", readConverterExp = "外=币")
    private BigDecimal ivcallamountfor;

    /** 应收结算金额 */
    @Excel(name = "应收结算金额")
    private BigDecimal ivcsettleamount;

    /** 应收结算金额（外币） */
    @Excel(name = "应收结算金额", readConverterExp = "外=币")
    private BigDecimal ivcsettleamountfor;

    /** 应收结算状态 */
    @Excel(name = "应收结算状态")
    private String ivcsettlestatus;

    /** 应收状态 */
    @Excel(name = "应收状态")
    private Long ivcstatus;

    /** 应收总结算金额 */
    @Excel(name = "应收总结算金额")
    private BigDecimal ivctotalsettleamount;

    /** 应收总结算金额（外币） */
    @Excel(name = "应收总结算金额", readConverterExp = "外=币")
    private BigDecimal ivctotalsettleamountfor;

    /** 应收总未结算金额 */
    @Excel(name = "应收总未结算金额")
    private BigDecimal ivctotalunsettleamount;

    /** 应收总未结算金额（外币） */
    @Excel(name = "应收总未结算金额", readConverterExp = "外=币")
    private BigDecimal ivctotalunsettleamountfor;

    /** 应收类型 */
    @Excel(name = "应收类型")
    private Long ivctype;

    /** 工作流当前节点 */
    @Excel(name = "工作流当前节点")
    private Long wfCurrentnode;

    /** 工作流参与者名称 */
    @Excel(name = "工作流参与者名称")
    private String wfParticipantname;

    /** 工作流上一个处理人 */
    @Excel(name = "工作流上一个处理人")
    private String wfPrevioushandler;

    /** 供应商联系电话 */
    private String contactPhone;

    /** 供应商联系人 */
    private String contactLinkman;

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactLinkman() {
        return contactLinkman;
    }

    public void setContactLinkman(String contactLinkman) {
        this.contactLinkman = contactLinkman;
    }

    /** 工作流进度 */
    @Excel(name = "工作流进度")
    private Long wfProgress;

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
    public void setBilldate(Date billdate)
    {
        this.billdate = billdate;
    }

    public Date getBilldate()
    {
        return billdate;
    }
    public void setBillno(String billno) 
    {
        this.billno = billno;
    }

    public String getBillno() 
    {
        return billno;
    }
    public void setBillstatus(String billstatus) 
    {
        this.billstatus = billstatus;
    }

    public String getBillstatus() 
    {
        return billstatus;
    }
    public void setSupplieridName(String supplieridName) 
    {
        this.supplieridName = supplieridName;
    }

    public String getSupplieridName() 
    {
        return supplieridName;
    }
    public void setEmpidName(String empidName) 
    {
        this.empidName = empidName;
    }

    public String getEmpidName() 
    {
        return empidName;
    }
    public void setTotalsettleamount(BigDecimal totalsettleamount) 
    {
        this.totalsettleamount = totalsettleamount;
    }

    public BigDecimal getTotalsettleamount() 
    {
        return totalsettleamount;
    }
    public void setTotalunsettleamount(BigDecimal totalunsettleamount) 
    {
        this.totalunsettleamount = totalunsettleamount;
    }

    public BigDecimal getTotalunsettleamount() 
    {
        return totalunsettleamount;
    }
    public void setTaxamount(BigDecimal taxamount) 
    {
        this.taxamount = taxamount;
    }

    public BigDecimal getTaxamount() 
    {
        return taxamount;
    }
    public void setTaxprice(BigDecimal taxprice) 
    {
        this.taxprice = taxprice;
    }

    public BigDecimal getTaxprice() 
    {
        return taxprice;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setQty(BigDecimal qty) 
    {
        this.qty = qty;
    }

    public BigDecimal getQty() 
    {
        return qty;
    }
    public void setEntryivcallamount(BigDecimal entryivcallamount) 
    {
        this.entryivcallamount = entryivcallamount;
    }

    public BigDecimal getEntryivcallamount() 
    {
        return entryivcallamount;
    }
    public void setEntryivcstatus(Long entryivcstatus) 
    {
        this.entryivcstatus = entryivcstatus;
    }

    public Long getEntryivcstatus() 
    {
        return entryivcstatus;
    }
    public void setEntryrealiostatus(String entryrealiostatus) 
    {
        this.entryrealiostatus = entryrealiostatus;
    }

    public String getEntryrealiostatus() 
    {
        return entryrealiostatus;
    }
    public void setApPrepayBillid(Long apPrepayBillid) 
    {
        this.apPrepayBillid = apPrepayBillid;
    }

    public Long getApPrepayBillid() 
    {
        return apPrepayBillid;
    }
    public void setAuxunittype(Long auxunittype) 
    {
        this.auxunittype = auxunittype;
    }

    public Long getAuxunittype() 
    {
        return auxunittype;
    }
    public void setBillDealAmount(BigDecimal billDealAmount) 
    {
        this.billDealAmount = billDealAmount;
    }

    public BigDecimal getBillDealAmount() 
    {
        return billDealAmount;
    }
    public void setClosestate(Long closestate) 
    {
        this.closestate = closestate;
    }

    public Long getClosestate() 
    {
        return closestate;
    }
    public void setCoefficient(BigDecimal coefficient) 
    {
        this.coefficient = coefficient;
    }

    public BigDecimal getCoefficient() 
    {
        return coefficient;
    }
    public void setCprop(String cprop) 
    {
        this.cprop = cprop;
    }

    public String getCprop() 
    {
        return cprop;
    }
    public void setCustomField24sbnx21t01sp(String customField24sbnx21t01sp) 
    {
        this.customField24sbnx21t01sp = customField24sbnx21t01sp;
    }

    public String getCustomField24sbnx21t01sp() 
    {
        return customField24sbnx21t01sp;
    }
    public void setDeptidName(String deptidName) 
    {
        this.deptidName = deptidName;
    }

    public String getDeptidName() 
    {
        return deptidName;
    }
    public void setEntryPickStatus(Long entryPickStatus) 
    {
        this.entryPickStatus = entryPickStatus;
    }

    public Long getEntryPickStatus() 
    {
        return entryPickStatus;
    }
    public void setEntryiostatus(String entryiostatus) 
    {
        this.entryiostatus = entryiostatus;
    }

    public String getEntryiostatus() 
    {
        return entryiostatus;
    }
    public void setEntryivcallamountfor(BigDecimal entryivcallamountfor) 
    {
        this.entryivcallamountfor = entryivcallamountfor;
    }

    public BigDecimal getEntryivcallamountfor() 
    {
        return entryivcallamountfor;
    }
    public void setEntryivcbaseqty(BigDecimal entryivcbaseqty) 
    {
        this.entryivcbaseqty = entryivcbaseqty;
    }

    public BigDecimal getEntryivcbaseqty() 
    {
        return entryivcbaseqty;
    }
    public void setEntryivcqty(BigDecimal entryivcqty) 
    {
        this.entryivcqty = entryivcqty;
    }

    public BigDecimal getEntryivcqty() 
    {
        return entryivcqty;
    }
    public void setEntryivcsettlestatus(String entryivcsettlestatus) 
    {
        this.entryivcsettlestatus = entryivcsettlestatus;
    }

    public String getEntryivcsettlestatus() 
    {
        return entryivcsettlestatus;
    }
    public void setEntryunivcbaseqty(BigDecimal entryunivcbaseqty) 
    {
        this.entryunivcbaseqty = entryunivcbaseqty;
    }

    public BigDecimal getEntryunivcbaseqty() 
    {
        return entryunivcbaseqty;
    }
    public void setEntryunivcqty(BigDecimal entryunivcqty) 
    {
        this.entryunivcqty = entryunivcqty;
    }

    public BigDecimal getEntryunivcqty() 
    {
        return entryunivcqty;
    }
    public void setMaterialEntityId(String materialEntityId) 
    {
        this.materialEntityId = materialEntityId;
    }

    public String getMaterialEntityId() 
    {
        return materialEntityId;
    }
    public void setMaterialidName(String materialidName) 
    {
        this.materialidName = materialidName;
    }

    public String getMaterialidName() 
    {
        return materialidName;
    }
    public void setMaterialidNumber(String materialidNumber) 
    {
        this.materialidNumber = materialidNumber;
    }

    public String getMaterialidNumber() 
    {
        return materialidNumber;
    }
    public void setPickBaseqty(BigDecimal pickBaseqty) 
    {
        this.pickBaseqty = pickBaseqty;
    }

    public BigDecimal getPickBaseqty() 
    {
        return pickBaseqty;
    }
    public void setPickInBaseqty(BigDecimal pickInBaseqty) 
    {
        this.pickInBaseqty = pickInBaseqty;
    }

    public BigDecimal getPickInBaseqty() 
    {
        return pickInBaseqty;
    }
    public void setPickInQty(BigDecimal pickInQty) 
    {
        this.pickInQty = pickInQty;
    }

    public BigDecimal getPickInQty() 
    {
        return pickInQty;
    }
    public void setPickQty(BigDecimal pickQty) 
    {
        this.pickQty = pickQty;
    }

    public BigDecimal getPickQty() 
    {
        return pickQty;
    }
    public void setPickStatus(Long pickStatus) 
    {
        this.pickStatus = pickStatus;
    }

    public Long getPickStatus() 
    {
        return pickStatus;
    }
    public void setUnPickBaseqty(BigDecimal unPickBaseqty) 
    {
        this.unPickBaseqty = unPickBaseqty;
    }

    public BigDecimal getUnPickBaseqty() 
    {
        return unPickBaseqty;
    }
    public void setUnPickQty(BigDecimal unPickQty) 
    {
        this.unPickQty = unPickQty;
    }

    public BigDecimal getUnPickQty() 
    {
        return unPickQty;
    }
    public void setUninqty(BigDecimal uninqty) 
    {
        this.uninqty = uninqty;
    }

    public BigDecimal getUninqty() 
    {
        return uninqty;
    }
    public void setIoamount(BigDecimal ioamount) 
    {
        this.ioamount = ioamount;
    }

    public BigDecimal getIoamount() 
    {
        return ioamount;
    }
    public void setIvcallamount(BigDecimal ivcallamount) 
    {
        this.ivcallamount = ivcallamount;
    }

    public BigDecimal getIvcallamount() 
    {
        return ivcallamount;
    }
    public void setIvcallamountfor(BigDecimal ivcallamountfor) 
    {
        this.ivcallamountfor = ivcallamountfor;
    }

    public BigDecimal getIvcallamountfor() 
    {
        return ivcallamountfor;
    }
    public void setIvcsettleamount(BigDecimal ivcsettleamount) 
    {
        this.ivcsettleamount = ivcsettleamount;
    }

    public BigDecimal getIvcsettleamount() 
    {
        return ivcsettleamount;
    }
    public void setIvcsettleamountfor(BigDecimal ivcsettleamountfor) 
    {
        this.ivcsettleamountfor = ivcsettleamountfor;
    }

    public BigDecimal getIvcsettleamountfor() 
    {
        return ivcsettleamountfor;
    }
    public void setIvcsettlestatus(String ivcsettlestatus) 
    {
        this.ivcsettlestatus = ivcsettlestatus;
    }

    public String getIvcsettlestatus() 
    {
        return ivcsettlestatus;
    }
    public void setIvcstatus(Long ivcstatus) 
    {
        this.ivcstatus = ivcstatus;
    }

    public Long getIvcstatus() 
    {
        return ivcstatus;
    }
    public void setIvctotalsettleamount(BigDecimal ivctotalsettleamount) 
    {
        this.ivctotalsettleamount = ivctotalsettleamount;
    }

    public BigDecimal getIvctotalsettleamount() 
    {
        return ivctotalsettleamount;
    }
    public void setIvctotalsettleamountfor(BigDecimal ivctotalsettleamountfor) 
    {
        this.ivctotalsettleamountfor = ivctotalsettleamountfor;
    }

    public BigDecimal getIvctotalsettleamountfor() 
    {
        return ivctotalsettleamountfor;
    }
    public void setIvctotalunsettleamount(BigDecimal ivctotalunsettleamount) 
    {
        this.ivctotalunsettleamount = ivctotalunsettleamount;
    }

    public BigDecimal getIvctotalunsettleamount() 
    {
        return ivctotalunsettleamount;
    }
    public void setIvctotalunsettleamountfor(BigDecimal ivctotalunsettleamountfor) 
    {
        this.ivctotalunsettleamountfor = ivctotalunsettleamountfor;
    }

    public BigDecimal getIvctotalunsettleamountfor() 
    {
        return ivctotalunsettleamountfor;
    }
    public void setIvctype(Long ivctype) 
    {
        this.ivctype = ivctype;
    }

    public Long getIvctype() 
    {
        return ivctype;
    }
    public void setWfCurrentnode(Long wfCurrentnode) 
    {
        this.wfCurrentnode = wfCurrentnode;
    }

    public Long getWfCurrentnode() 
    {
        return wfCurrentnode;
    }
    public void setWfParticipantname(String wfParticipantname) 
    {
        this.wfParticipantname = wfParticipantname;
    }

    public String getWfParticipantname() 
    {
        return wfParticipantname;
    }
    public void setWfPrevioushandler(String wfPrevioushandler) 
    {
        this.wfPrevioushandler = wfPrevioushandler;
    }

    public String getWfPrevioushandler() 
    {
        return wfPrevioushandler;
    }
    public void setWfProgress(Long wfProgress) 
    {
        this.wfProgress = wfProgress;
    }

    public Long getWfProgress() 
    {
        return wfProgress;
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
            .append("billdate", getBilldate())
            .append("billno", getBillno())
            .append("billstatus", getBillstatus())
            .append("supplieridName", getSupplieridName())
            .append("empidName", getEmpidName())
            .append("totalsettleamount", getTotalsettleamount())
            .append("totalunsettleamount", getTotalunsettleamount())
            .append("taxamount", getTaxamount())
            .append("taxprice", getTaxprice())
            .append("price", getPrice())
            .append("qty", getQty())
            .append("entryivcallamount", getEntryivcallamount())
            .append("entryivcstatus", getEntryivcstatus())
            .append("entryrealiostatus", getEntryrealiostatus())
            .append("apPrepayBillid", getApPrepayBillid())
            .append("auxunittype", getAuxunittype())
            .append("billDealAmount", getBillDealAmount())
            .append("closestate", getClosestate())
            .append("coefficient", getCoefficient())
            .append("cprop", getCprop())
            .append("customField24sbnx21t01sp", getCustomField24sbnx21t01sp())
            .append("deptidName", getDeptidName())
            .append("entryPickStatus", getEntryPickStatus())
            .append("entryiostatus", getEntryiostatus())
            .append("entryivcallamountfor", getEntryivcallamountfor())
            .append("entryivcbaseqty", getEntryivcbaseqty())
            .append("entryivcqty", getEntryivcqty())
            .append("entryivcsettlestatus", getEntryivcsettlestatus())
            .append("entryunivcbaseqty", getEntryunivcbaseqty())
            .append("entryunivcqty", getEntryunivcqty())
            .append("materialEntityId", getMaterialEntityId())
            .append("materialidName", getMaterialidName())
            .append("materialidNumber", getMaterialidNumber())
            .append("pickBaseqty", getPickBaseqty())
            .append("pickInBaseqty", getPickInBaseqty())
            .append("pickInQty", getPickInQty())
            .append("pickQty", getPickQty())
            .append("pickStatus", getPickStatus())
            .append("unPickBaseqty", getUnPickBaseqty())
            .append("unPickQty", getUnPickQty())
            .append("uninqty", getUninqty())
            .append("ioamount", getIoamount())
            .append("ivcallamount", getIvcallamount())
            .append("ivcallamountfor", getIvcallamountfor())
            .append("ivcsettleamount", getIvcsettleamount())
            .append("ivcsettleamountfor", getIvcsettleamountfor())
            .append("ivcsettlestatus", getIvcsettlestatus())
            .append("ivcstatus", getIvcstatus())
            .append("ivctotalsettleamount", getIvctotalsettleamount())
            .append("ivctotalsettleamountfor", getIvctotalsettleamountfor())
            .append("ivctotalunsettleamount", getIvctotalunsettleamount())
            .append("ivctotalunsettleamountfor", getIvctotalunsettleamountfor())
            .append("ivctype", getIvctype())
            .append("wfCurrentnode", getWfCurrentnode())
            .append("wfParticipantname", getWfParticipantname())
            .append("wfPrevioushandler", getWfPrevioushandler())
            .append("wfProgress", getWfProgress())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
