package com.trueland.ecerp.service.product;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.trueland.ecerp.service.PageFilter;
import com.trueland.ecerp.vo.IVO;

/**
 * 商品页面的搜索过滤类
 * 也属于一个VO类。采集用户在页面上输入的数据。
 * @author Vincent
 *
 */
public class ProductPageFilter extends PageFilter implements IVO {

    
    
    private String name;
    private String productTypeName;    
    private Double priceMoreThan;
    private Double priceLessThan;
    private String BrandName;
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeName() {
        return productTypeName;
    }
    public void setTypeName(String typeName) {
        this.productTypeName = typeName;
    }
    public Double getPriceMoreThan() {
        return priceMoreThan;
    }
    public void setPriceMoreThan(Double priceMoreThan) {
        this.priceMoreThan = priceMoreThan;
    }
    public Double getPriceLessThan() {
        return priceLessThan;
    }
    public void setPriceLessThan(Double priceLessThan) {
        this.priceLessThan = priceLessThan;
    }
    public String getBrandName() {
        return this.BrandName;
    }
    public String getProductTypeName() {
        return productTypeName;
    }
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }
    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    
}
