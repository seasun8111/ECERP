package com.trueland.ecerp.domain;

// Generated 2013-6-27 23:34:30 by Hibernate Tools 3.4.0.CR1

/**
 * EcerpBrand generated by hbm2java
 */
public class EcerpBrand implements java.io.Serializable {

    private int id;
    private String brandName;
    private String providerName;
    private String brandTypeName;

    public EcerpBrand() {
    }

    public EcerpBrand(int id) {
        this.id = id;
    }

    public EcerpBrand(int id, String brandName, String providerName,
            String brandTypeName) {
        this.id = id;
        this.brandName = brandName;
        this.providerName = providerName;
        this.brandTypeName = brandTypeName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getBrandTypeName() {
        return this.brandTypeName;
    }

    public void setBrandTypeName(String brandTypeName) {
        this.brandTypeName = brandTypeName;
    }

}
