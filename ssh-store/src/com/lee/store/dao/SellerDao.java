package com.lee.store.dao;

import java.util.List;

import com.lee.store.entity.Seller;

public interface SellerDao {

	int findCount();

	List<Seller> findByPage(int begin, int pageSize);

	void save(Seller seller);

	Seller findById(Integer sid);

	void updata(Seller seller);

	void delete(Seller seller);

	List<Seller> findAll();

}
