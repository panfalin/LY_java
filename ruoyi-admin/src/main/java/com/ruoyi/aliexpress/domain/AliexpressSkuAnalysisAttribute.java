package com.ruoyi.aliexpress.domain;

import java.util.Objects;

public class AliexpressSkuAnalysisAttribute {
    private String sku;
    private String publicationId;
    private String attribute;
    private String price;
    private String freight;
    private String monetaryType;
    private String countries;

    public AliexpressSkuAnalysisAttribute(String sku, String publicationId, String attribute, String price, String monetaryType, String freight, String countries) {
        this.sku = sku;
        this.publicationId = publicationId;
        this.attribute = attribute;
        this.price = price;
        this.monetaryType = monetaryType;
        this.freight = freight;
        this.countries = countries;
    }

    public AliexpressSkuAnalysisAttribute() {
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
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

    public String getMonetaryType() {
        return monetaryType;
    }

    public void setMonetaryType(String monetaryType) {
        this.monetaryType = monetaryType;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AliexpressSkuAnalysisAttribute that = (AliexpressSkuAnalysisAttribute) o;
        return Objects.equals(sku, that.sku) && Objects.equals(publicationId, that.publicationId) && Objects.equals(attribute, that.attribute) && Objects.equals(price, that.price) && Objects.equals(freight, that.freight) && Objects.equals(monetaryType, that.monetaryType) && Objects.equals(countries, that.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, publicationId, attribute, price, freight, monetaryType, countries);
    }
}
