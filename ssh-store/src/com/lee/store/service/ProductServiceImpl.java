package com.lee.store.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.lee.store.dao.ProductDao;
import com.lee.store.dao.ProductDaoImpl;
import com.lee.store.entity.PageBean;
import com.lee.store.entity.Product;

@Transactional
public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public PageBean<Product> findByPage(Integer currPage) {
		PageBean<Product> page = new PageBean<Product>();
		page.setCurrPage(currPage);
		int pageSize = 3; 
		page.setPageSize(pageSize);
		int totalCount = productDao.findCount();
		page.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		page.setTotalPage(num.intValue());
		int begin = (currPage -1) * pageSize;
		List<Product> list = productDao.findByPage(begin,pageSize);
		page.setList(list);
		return page;
	}

	public void save(Product product) {
		//System.out.println(product.getPname());
		 productDao.save(product);
	}

	public Product findById(Integer pid) {
		
		return productDao.findById(pid);
	}

	public void updata(Product product) {
		productDao.updata(product);
	}

	public void delete(Product product) {
		productDao.delete(product);
	}
	
	
	
}
