package com.lee.store.dao;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.lee.store.entity.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	public int findCount() {
		String hql = "select count(*) from Product";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Product> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Product.class);
		List<Product> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	public void save(Product product) {
		this.getHibernateTemplate().save(product);
		//System.out.println(product.getPname());
	}

	public Product findById(Integer pid) {
		return this.getHibernateTemplate().get(Product.class, pid);
	}

	public void updata(Product product) {
		this.getHibernateTemplate().update(product);
	}

	public void delete(Product product) {
		this.getHibernateTemplate().delete(product);
	}

}
