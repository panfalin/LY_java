package com.ruoyi.kingdee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金蝶生产任务订单列对象 kingdee_production_task_order
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public class KingdeeProductionTaskOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 行号 */
    private Long rk;

    /** 序号 */
    @Excel(name = "序号")
    private Long fseq;

    /** 单据日期 */
    @Excel(name = "单据日期")
    private String billdate;

    /** 单据编号 */
    @Excel(name = "单据编号")
    private String billno;

    /** 单据审核状态 */
    @Excel(name = "单据审核状态")
    private String billstatus;

    /** 完工状态 */
    @Excel(name = "完工状态")
    private String billclosestate;

    /** BOM编号 */
    @Excel(name = "BOM编号")
    private String bomidNumber;

    /** 关闭状态 */
    @Excel(name = "关闭状态")
    private String closestate;

    /** 属性 */
    @Excel(name = "属性")
    private String cprop;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptidName;

    /** 行完工时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "行完工时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entryautoclosetime;

    /** 进出状态 */
    @Excel(name = "进出状态")
    private String entryiostatus;

    /** 实际状态 */
    @Excel(name = "实际状态")
    private String entryrealiostatus;

    /** 是否委托处理 */
    @Excel(name = "是否委托处理")
    private Integer isentrustprocess;

    /** 商品实体ID */
    @Excel(name = "商品实体ID")
    private String materialEntityId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String materialidName;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String materialidNumber;

    /** 生产任务单号 */
    @Excel(name = "生产任务单号")
    private String moTaskBillId;

    /** 多单标签名称 */
    @Excel(name = "多单标签名称")
    private String mulbilllabelName;

    /** 多订单号 */
    @Excel(name = "多订单号")
    private String multiorderno;

    /** 出库状态 */
    @Excel(name = "出库状态")
    private String outstockstatus;

    /** 已拣货数量 */
    @Excel(name = "已拣货数量")
    private Long pickedqty;

    /** 计划提交日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划提交日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plancommitdate;

    /** 计划完成日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planfinishdate;

    /** 数量 */
    @Excel(name = "数量")
    private Long qty;

    /** 实际出库状态 */
    @Excel(name = "实际出库状态")
    private String realoutstockstatus;

    /** 状态 */
    @Excel(name = "状态")
    private String s;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String unitName;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setBilldate(String billdate) 
    {
        this.billdate = billdate;
    }

    public String getBilldate() 
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
    public void setBillclosestate(String billclosestate) 
    {
        this.billclosestate = billclosestate;
    }

    public String getBillclosestate() 
    {
        return billclosestate;
    }
    public void setBomidNumber(String bomidNumber) 
    {
        this.bomidNumber = bomidNumber;
    }

    public String getBomidNumber() 
    {
        return bomidNumber;
    }
    public void setClosestate(String closestate) 
    {
        this.closestate = closestate;
    }

    public String getClosestate() 
    {
        return closestate;
    }
    public void setCprop(String cprop) 
    {
        this.cprop = cprop;
    }

    public String getCprop() 
    {
        return cprop;
    }
    public void setDeptidName(String deptidName) 
    {
        this.deptidName = deptidName;
    }

    public String getDeptidName() 
    {
        return deptidName;
    }
    public void setEntryautoclosetime(Date entryautoclosetime) 
    {
        this.entryautoclosetime = entryautoclosetime;
    }

    public Date getEntryautoclosetime() 
    {
        return entryautoclosetime;
    }
    public void setEntryiostatus(String entryiostatus) 
    {
        this.entryiostatus = entryiostatus;
    }

    public String getEntryiostatus() 
    {
        return entryiostatus;
    }
    public void setEntryrealiostatus(String entryrealiostatus) 
    {
        this.entryrealiostatus = entryrealiostatus;
    }

    public String getEntryrealiostatus() 
    {
        return entryrealiostatus;
    }
    public void setIsentrustprocess(Integer isentrustprocess) 
    {
        this.isentrustprocess = isentrustprocess;
    }

    public Integer getIsentrustprocess() 
    {
        return isentrustprocess;
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
    public void setMoTaskBillId(String moTaskBillId) 
    {
        this.moTaskBillId = moTaskBillId;
    }

    public String getMoTaskBillId() 
    {
        return moTaskBillId;
    }
    public void setMulbilllabelName(String mulbilllabelName) 
    {
        this.mulbilllabelName = mulbilllabelName;
    }

    public String getMulbilllabelName() 
    {
        return mulbilllabelName;
    }
    public void setMultiorderno(String multiorderno) 
    {
        this.multiorderno = multiorderno;
    }

    public String getMultiorderno() 
    {
        return multiorderno;
    }
    public void setOutstockstatus(String outstockstatus) 
    {
        this.outstockstatus = outstockstatus;
    }

    public String getOutstockstatus() 
    {
        return outstockstatus;
    }
    public void setPickedqty(Long pickedqty) 
    {
        this.pickedqty = pickedqty;
    }

    public Long getPickedqty() 
    {
        return pickedqty;
    }
    public void setPlancommitdate(Date plancommitdate) 
    {
        this.plancommitdate = plancommitdate;
    }

    public Date getPlancommitdate() 
    {
        return plancommitdate;
    }
    public void setPlanfinishdate(Date planfinishdate) 
    {
        this.planfinishdate = planfinishdate;
    }

    public Date getPlanfinishdate() 
    {
        return planfinishdate;
    }
    public void setQty(Long qty) 
    {
        this.qty = qty;
    }

    public Long getQty() 
    {
        return qty;
    }
    public void setRealoutstockstatus(String realoutstockstatus) 
    {
        this.realoutstockstatus = realoutstockstatus;
    }

    public String getRealoutstockstatus() 
    {
        return realoutstockstatus;
    }
    public void setS(String s) 
    {
        this.s = s;
    }

    public String getS() 
    {
        return s;
    }
    public void setUnitName(String unitName) 
    {
        this.unitName = unitName;
    }

    public String getUnitName() 
    {
        return unitName;
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
            .append("billclosestate", getBillclosestate())
            .append("bomidNumber", getBomidNumber())
            .append("closestate", getClosestate())
            .append("cprop", getCprop())
            .append("deptidName", getDeptidName())
            .append("entryautoclosetime", getEntryautoclosetime())
            .append("entryiostatus", getEntryiostatus())
            .append("entryrealiostatus", getEntryrealiostatus())
            .append("isentrustprocess", getIsentrustprocess())
            .append("materialEntityId", getMaterialEntityId())
            .append("materialidName", getMaterialidName())
            .append("materialidNumber", getMaterialidNumber())
            .append("moTaskBillId", getMoTaskBillId())
            .append("mulbilllabelName", getMulbilllabelName())
            .append("multiorderno", getMultiorderno())
            .append("outstockstatus", getOutstockstatus())
            .append("pickedqty", getPickedqty())
            .append("plancommitdate", getPlancommitdate())
            .append("planfinishdate", getPlanfinishdate())
            .append("qty", getQty())
            .append("realoutstockstatus", getRealoutstockstatus())
            .append("remark", getRemark())
            .append("s", getS())
            .append("unitName", getUnitName())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
