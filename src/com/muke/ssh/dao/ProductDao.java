package com.muke.ssh.dao;

import com.muke.ssh.domain.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by wanganyu on 2017/06/15.
 * 商品管理的Dao类
 */
public class ProductDao extends HibernateDaoSupport{

    public void save(Product product){
      System.out.println("Dao中的save方法执行了.....");
      this.getHibernateTemplate().save(product);
    }

}
