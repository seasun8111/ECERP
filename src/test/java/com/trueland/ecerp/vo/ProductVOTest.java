package com.trueland.ecerp.vo;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

import com.trueland.ecerp.domain.Product;

@SpringApplicationContext({"classpath:/ecerp-domain.xml"})
public class ProductVOTest extends UnitilsJUnit4{
    
    
    @SpringBean("product")
    private Product product;
   
    /*
    @Test
    public void copyPropertyTest(){
        product.setName("xx");
        ProductVO vo = new ProductVO();
        vo.setProduct(product);
        try {
            vo.convertFromDomain();
            assertEquals(vo.getName() ,product.getName() );
            
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
    }*/


}
