package com.ruoyi.aliexpress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客服问答SKU收集模板对象 kf_answers_template
 * 
 * @author ruoyi
 * @date 2024-11-22
 */
public class KfAnswersTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;
    /** 商品sku */
    @Excel(name = "s_id")
    private int sId;
    /** 商品sku */
    @Excel(name = "商品sku")
    private String sku;

    /** 售前问题 */
    @Excel(name = "售前问题")
    private String preQuestions;

    /** 售前回复 */
    @Excel(name = "售前回复")
    private String preResponse;

    /** 售前询问时间 */
    @Excel(name = "售前询问时间")
    private String preAskTime;

    /** 售后产品问题/纠纷/差评/侵权问题 */
    @Excel(name = "售后产品问题/纠纷/差评/侵权问题")
    private String afterQuestions;

    /** 售后回复 */
    @Excel(name = "售后回复")
    private String afterResponse;

    /** 售后询问时间 */
    @Excel(name = "售后询问时间")
    private String afterAskTime;

    /** 备注（供应商回复） */
    @Excel(name = "备注", readConverterExp = "供=应商回复")
    private String supplierResponse;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 刊登ID */
    @Excel(name = "刊登ID")
    private String listingId;

    /** 店铺 */
    @Excel(name = "店铺")
    private String storeId;

    /** 问题类型（售前/买错/质量问题/车型不匹配/仓库发错/专业问题） */
    @Excel(name = "问题类型", readConverterExp = "售=前/买错/质量问题/车型不匹配/仓库发错/专业问题")
    private String typeQuestion;

    /** 记录人 */
    @Excel(name = "记录人")
    private String recorders;

    /** 期望处理结果 */
    @Excel(name = "期望处理结果")
    private String expectResults;

    /** 期望处理时间 */
    @Excel(name = "期望处理时间")
    private String expectTime;

    /** case处理人 */
    @Excel(name = "case处理人")
    private String processors;

    /** 处理状态 */
    @Excel(name = "处理状态")
    private String proceStatus;

    /** 最终处理方案（重发/退款） */
    @Excel(name = "最终处理方案", readConverterExp = "重=发/退款")
    private String finalTreatment;

    /** 备注1 */
    @Excel(name = "备注1")
    private String remark1;

    /** 备注2 */
    @Excel(name = "备注2")
    private String remark2;

    /** 标准回复 */
    @Excel(name = "标准回复")
    private String standardResponses;

    public void setsId(int sId)
    {
        this.sId = sId;
    }
    public int getsId()
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
    public void setPreQuestions(String preQuestions) 
    {
        this.preQuestions = preQuestions;
    }

    public String getPreQuestions() 
    {
        return preQuestions;
    }
    public void setPreResponse(String preResponse) 
    {
        this.preResponse = preResponse;
    }

    public String getPreResponse() 
    {
        return preResponse;
    }
    public void setPreAskTime(String preAskTime) 
    {
        this.preAskTime = preAskTime;
    }

    public String getPreAskTime() 
    {
        return preAskTime;
    }
    public void setAfterQuestions(String afterQuestions) 
    {
        this.afterQuestions = afterQuestions;
    }

    public String getAfterQuestions() 
    {
        return afterQuestions;
    }
    public void setAfterResponse(String afterResponse) 
    {
        this.afterResponse = afterResponse;
    }

    public String getAfterResponse() 
    {
        return afterResponse;
    }
    public void setAfterAskTime(String afterAskTime) 
    {
        this.afterAskTime = afterAskTime;
    }

    public String getAfterAskTime() 
    {
        return afterAskTime;
    }
    public void setSupplierResponse(String supplierResponse) 
    {
        this.supplierResponse = supplierResponse;
    }

    public String getSupplierResponse() 
    {
        return supplierResponse;
    }
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setListingId(String listingId) 
    {
        this.listingId = listingId;
    }

    public String getListingId() 
    {
        return listingId;
    }
    public void setStoreId(String storeId) 
    {
        this.storeId = storeId;
    }

    public String getStoreId() 
    {
        return storeId;
    }
    public void setTypeQuestion(String typeQuestion) 
    {
        this.typeQuestion = typeQuestion;
    }

    public String getTypeQuestion() 
    {
        return typeQuestion;
    }
    public void setRecorders(String recorders) 
    {
        this.recorders = recorders;
    }

    public String getRecorders() 
    {
        return recorders;
    }
    public void setExpectResults(String expectResults) 
    {
        this.expectResults = expectResults;
    }

    public String getExpectResults() 
    {
        return expectResults;
    }
    public void setExpectTime(String expectTime) 
    {
        this.expectTime = expectTime;
    }

    public String getExpectTime() 
    {
        return expectTime;
    }
    public void setProcessors(String processors) 
    {
        this.processors = processors;
    }

    public String getProcessors() 
    {
        return processors;
    }
    public void setProceStatus(String proceStatus) 
    {
        this.proceStatus = proceStatus;
    }

    public String getProceStatus() 
    {
        return proceStatus;
    }
    public void setFinalTreatment(String finalTreatment) 
    {
        this.finalTreatment = finalTreatment;
    }

    public String getFinalTreatment() 
    {
        return finalTreatment;
    }
    public void setRemark1(String remark1) 
    {
        this.remark1 = remark1;
    }

    public String getRemark1() 
    {
        return remark1;
    }
    public void setRemark2(String remark2) 
    {
        this.remark2 = remark2;
    }

    public String getRemark2() 
    {
        return remark2;
    }
    public void setStandardResponses(String standardResponses) 
    {
        this.standardResponses = standardResponses;
    }

    public String getStandardResponses() 
    {
        return standardResponses;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("sId", getsId())
            .append("sku", getSku())
            .append("preQuestions", getPreQuestions())
            .append("preResponse", getPreResponse())
            .append("preAskTime", getPreAskTime())
            .append("afterQuestions", getAfterQuestions())
            .append("afterResponse", getAfterResponse())
            .append("afterAskTime", getAfterAskTime())
            .append("supplierResponse", getSupplierResponse())
            .append("orderNo", getOrderNo())
            .append("listingId", getListingId())
            .append("storeId", getStoreId())
            .append("typeQuestion", getTypeQuestion())
            .append("recorders", getRecorders())
            .append("expectResults", getExpectResults())
            .append("expectTime", getExpectTime())
            .append("processors", getProcessors())
            .append("proceStatus", getProceStatus())
            .append("finalTreatment", getFinalTreatment())
            .append("remark1", getRemark1())
            .append("remark2", getRemark2())
            .append("standardResponses", getStandardResponses())
            .toString();
    }
}
