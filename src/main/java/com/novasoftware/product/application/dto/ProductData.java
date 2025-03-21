package com.novasoftware.product.application.dto;

import com.novasoftware.Supplier.domain.model.Supplier;
import com.novasoftware.brand.domain.model.Brand;
import com.novasoftware.category.domain.model.Category;

import java.util.Date;
import java.util.List;

public class ProductData {
    private String name;
    private String sku;
    private String variationSku;
    private String ean;
    private Integer quantity;
    private Double salePrice;
    private Category category;
    private Date expiryDate;
    private Supplier supplier;
    private Double weight;
    private List<String> images;
    private Date creationDate;
    private Date lastUpdatedDate;
    private String error;
    private Brand brand;
    private String description;

    public ProductData(String name, String sku, String variationSku, String ean, Integer quantity, Double salePrice,
                       Category category, Date expiryDate, Supplier supplier, Double weight, List<String> images,
                       Date creationDate, Date lastUpdatedDate, String error, Brand brand, String description) {
        this.name = name;
        this.sku = sku;
        this.variationSku = variationSku;
        this.ean = ean;
        this.quantity = quantity;
        this.salePrice = salePrice;
        this.category = category;
        this.expiryDate = expiryDate;
        this.supplier = supplier;
        this.weight = weight;
        this.images = images;
        this.creationDate = creationDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.error = error;
        this.brand = brand;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getVariationSku() {
        return variationSku;
    }

    public void setVariationSku(String variationSku) {
        this.variationSku = variationSku;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
