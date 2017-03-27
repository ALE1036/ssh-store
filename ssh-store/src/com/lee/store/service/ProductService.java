package com.lee.store.service;

import com.lee.store.entity.PageBean;
import com.lee.store.entity.Product;
import com.lee.store.entity.User;

public interface ProductService {

	PageBean<Product> findByPage(Integer currPage);

	void save(Product product);

	Product findById(Integer pid);

	void updata(Product product);

	void delete(Product product);

}
