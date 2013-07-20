package com.trueland.ecerp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.stereotype.Component;

// Generated 2013-6-27 23:56:21 by Hibernate Tools 3.4.0.CR1

/**
 * Product generated by hbm2java
 */
@Component
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "ecerp_product")
public class Product extends BaseDomain implements java.io.Serializable {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Double cost;
    @Column
    private Double price;
    @Column
    private Integer storage;
    @Column
    private String brandName;
    @Column
    private Integer brandId;
    @Column
    private String productTypeName;
    @Column
    private Integer productTypeId;
    
    
    public Brand getBrand(){
        return null;
    }
    
    public Double getTotalCost(){
        return cost * storage;
    }
    
    public Double getTotalPrice(){
        return price * storage;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStorage() {
        return this.storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getProductTypeName() {
        return this.productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public Integer getProductTypeId() {
        return this.productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

}