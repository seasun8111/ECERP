package com.trueland.ecerp.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.trueland.ecerp.domain.Product;
import com.trueland.ecerp.service.PageFilter;
import com.trueland.ecerp.service.product.ProductPageFilter;

@Repository
public class ProductDao extends BaseDao<Product>{
    
    private static final String HQL = "from Product where brandName = ?";
    
    /**
     * 根据brandName 返回PRODUCT对象列表.
     * @param brandName
     * @return 
     */
    public  List<Product> findProductsByBrandName(String brandName){
        return this.find(HQL, brandName);
    }

    @Override
    public Page pagedQuery(PageFilter filter) {
        //首先把filter的条件转换成 criterion 列表
        //（条件列表 ，换句话说就是SQL的WHERE部分）
        enhanceFilter(filter);
        return super.pagedQuery(filter);
    }

    /**
     * 把filter的条件转换成 criterion 列表
                （条件列表 ，换句话说就是SQL的WHERE部分）
     * @param filter
     */
    private void enhanceFilter(PageFilter filter) {
        ProductPageFilter filter_ = (ProductPageFilter) filter; 
        List<Criterion> restrictionsList = new ArrayList<Criterion>();
        if(StringUtils.isNotBlank(filter_.getName()))
            restrictionsList.add(Restrictions.eq("name", filter_.getName()  ));
        if(StringUtils.isNotBlank(filter_.getBrandName()))
            restrictionsList.add(Restrictions.eq("brandName", filter_.getBrandName()));
        if( filter_.getPriceLessThan()!=null && filter_.getPriceMoreThan()!=null && 
                filter_.getPriceLessThan() < filter_.getPriceMoreThan())
            restrictionsList.add(Restrictions.between("price", filter_.getPriceLessThan(), filter_.getPriceMoreThan()));
        filter.setCriterions(restrictionsList);
    }
    
    
    
}
