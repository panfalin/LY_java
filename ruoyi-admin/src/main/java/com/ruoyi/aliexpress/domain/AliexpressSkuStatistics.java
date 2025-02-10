package com.ruoyi.aliexpress.domain;

public class AliexpressSkuStatistics {
    private int skuTotal;
    private String totalWarehouse;
    private String totalWarehouseCost;

    public AliexpressSkuStatistics() {
    }

    public AliexpressSkuStatistics(int skuTotal, String totalWarehouse, String totalWarehouseCost) {
        this.skuTotal = skuTotal;
        this.totalWarehouse = totalWarehouse;
        this.totalWarehouseCost = totalWarehouseCost;
    }

    public int getSkuTotal() {
        return skuTotal;
    }

    public void setSkuTotal(int skuTotal) {
        this.skuTotal = skuTotal;
    }

    public String getTotalWarehouse() {
        return totalWarehouse;
    }

    public void setTotalWarehouse(String totalWarehouse) {
        this.totalWarehouse = totalWarehouse;
    }

    public String getTotalWarehouseCost() {
        return totalWarehouseCost;
    }

    public void setTotalWarehouseCost(String totalWarehouseCost) {
        this.totalWarehouseCost = totalWarehouseCost;
    }
}
