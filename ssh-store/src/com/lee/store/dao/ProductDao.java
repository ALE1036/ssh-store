package com.lee.store.dao;

import java.util.List;

import com.lee.store.entity.Product;
import com.lee.store.entity.User;

public interface ProductDao {

	int findCount();

	List<Product> findByPage(int begin, int pageSize);

	void save(Product product);

	Product findById(Integer pid);

	void updata(Product product);

	void delete(Product product);

}
