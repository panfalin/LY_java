package com.ruoyi.aliexpress.domain;

public class SubSkuDTO {
    private String skuId;
    private String skuChildren;
    private String commodityId;
    private String sku;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuChildren() {
        return skuChildren;
    }

    public void setSkuChildren(String skuChildren) {
        this.skuChildren = skuChildren;
    }
}
