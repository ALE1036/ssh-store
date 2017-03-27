package com.lee.store.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lee.store.entity.Seller;

public class SellerDaoImpl extends HibernateDaoSupport implements SellerDao {

	public int findCount() {
		String hql = "select count(*) from Seller";
		List<Long> list= this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Seller> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Seller.class);
		List<Seller> list =this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	public void save(Seller seller) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(seller);
	}

	public Seller findById(Integer sid) {
		
		return this.getHibernateTemplate().get(Seller.class,sid);
	}

	public void updata(Seller seller) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(seller);
	}

	public void delete(Seller seller) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(seller);
	}

	public List<Seller> findAll() {
		
		return this.getHibernateTemplate().find("from Seller ");
	}
	
	
	
}
