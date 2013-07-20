package com.trueland.ecerp.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBean;

import com.trueland.ecerp.domain.Product;

import edu.emory.mathcs.backport.java.util.Arrays;

public class ProductDaoTest extends BaseDaoTest {

    @SpringBean("productDao")
    private ProductDao productDao;
    private List<String> brandNameList = Arrays.asList(
            new String[] { "SONY", "SUMSUNG" });

    /**
     * 测试按品牌名取商品列表
     * 
     * @throws Exception
     */
    @Test
    @DataSet("Product.xls")
    // 准备数据4个SONY ,4 个SUMSUNG
    public void findProductsByBrandName() throws Exception {
        for (String brandName : brandNameList) {
            List<Product> list = productDao.findProductsByBrandName(brandName);
            // 不可为NULL
            Assert.assertNotNull("Get products faild for " + brandName, list);
            // 每个列表里有4个
            Assert.assertEquals("Can not get all of products of " + brandName,
                    list.size(), 4);
        }
    }

    /**
     * 测试返回值是否为NULL。期望不为null.
     */
    @Test
    @DataSet("Product.xls")
    // 准备数据4个SONY ,4 个SUMSUNG
    public void testResponseEmptyList() {
        List<Product> list = productDao
                .findProductsByBrandName("ThisBrandNotExist");
        // 返回的列表不可以为NULL
        assertNotNull(list);
        // 返回的列表size要为0
        assertEquals(list.size(), 0);
    }

    /**
     * @param productDao
     *            the productDao to set
     */
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    /**
     * @return the productDao
     */
    public ProductDao getProductDao() {
        return productDao;
    }

    /**
     * @param brandNameList
     *            the brandNameList to set
     */
    public void setBrandNameList(List<String> brandNameList) {
        this.brandNameList = brandNameList;
    }

    /**
     * @return the brandNameList
     */
    public List<String> getBrandNameList() {
        return brandNameList;
    }
}
