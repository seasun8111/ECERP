package com.trueland.ecerp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBean;

import com.trueland.ecerp.dao.Page;
import com.trueland.ecerp.domain.Product;
import com.trueland.ecerp.service.product.ProductPageFilter;
import com.trueland.ecerp.service.product.ProductService;
import com.trueland.ecerp.vo.ProductVO;

public class ProductServiceTest extends BaseServiceTest {

    @SpringBean("productService")
    private ProductService productService;
    
    
    @Before
    public void init(){
        
        
    }
    
    @Test
    @DataSet("../dao/Product.xls")
    public void testPageProduct(){
        
        ProductPageFilter productPageFilter = new ProductPageFilter();
        productPageFilter.setPageSize(100);
        Page pageOfProduct = null;
        pageOfProduct = productService.getPageProduct(productPageFilter);
        List result = pageOfProduct.getResult();
        List VOList = new ArrayList();
        
        for (Object object : result) {
            Product product = (Product)object;
            ProductVO vo =  new ProductVO();
            vo.setDomainObject(product);
            try {
                vo.convertFromDomain();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            VOList.add(vo);
        };
        
        assertNotNull("Page Product is null",pageOfProduct);
        assertEquals(8,pageOfProduct.getResult().size());
        
    }
    public static void main(String[] args){
        
        System.out.println("jdsklf");
    }
}
