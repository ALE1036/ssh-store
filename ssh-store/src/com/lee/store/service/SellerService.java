package com.lee.store.service;

import java.util.List;

import com.lee.store.entity.PageBean;
import com.lee.store.entity.Seller;

public interface SellerService {

	PageBean<Seller> findByPage(Integer currPage);

	void save(Seller seller);

	Seller findById(Integer sid);

	void updata(Seller seller);

	void delete(Seller seller);

	List<Seller> findAll();


}
