package com.muke.ssh.service;

import com.muke.ssh.dao.ProductDao;
import com.muke.ssh.domain.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wanganyu on 2017/06/15.
 * 商品管理的业务层类
 */
@Transactional
public class ProductService {
    private ProductDao productDao;
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
    public void save(Product product){
       System.out.println("Service中的save方法执行了....");
       productDao.save(product);
    }


}
