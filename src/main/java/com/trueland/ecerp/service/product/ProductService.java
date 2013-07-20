package com.trueland.ecerp.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trueland.ecerp.dao.Page;
import com.trueland.ecerp.dao.ProductDao;
import com.trueland.ecerp.domain.Product;
import com.trueland.ecerp.service.BaseService;
import com.trueland.ecerp.service.PageFilter;
import com.trueland.ecerp.vo.ProductVO;

/**
 * @author Vincent
 * 关于商品操作的service类
 * 集中了所有CRUD操作的方法
 */
@Service
public class ProductService extends BaseService {
    
    @Autowired
    private ProductDao productDao;
    
    private ProductVO productVO = null;
    
    /**
     * 根据一个ID返回一个商品
     * @return
     */
    public Product getProdcutById(int prodcutId){
        
        return null;
    }
    
    /**
     * 新建一个商品
     * @param product
     */
    public void addProduct(Product product){
        
    }
    
    /**
     * 根据ID删除一个商品
     * @param productId
     */
    public void removeProduct(int productId){
        
    }
    
    /**
     * 更新商品
     * @param product
     */
    public void updateProduct(Product product){
        
    }    
    
    /**
     * 取得一页商品
     * @param pageNo 页码
     * @param pageSize 页内行数
     * @return
     */
    public Page getPageProduct(PageFilter filter){
        Page page = productDao.pagedQuery(filter);
        return page;
    }
    
    /**
     * 取得所有的商品
     * @return
     */
    public List<Product> getAllProdcut(){
        return null;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductVO getProductVO() {
        return productVO;
    }

    public void setProductVO(ProductVO productVO) {
        this.productVO = productVO;
    }
}
