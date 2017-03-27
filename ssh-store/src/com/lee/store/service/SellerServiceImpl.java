package com.lee.store.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lee.store.dao.SellerDao;
import com.lee.store.entity.PageBean;
import com.lee.store.entity.Seller;

@Transactional
public class SellerServiceImpl implements SellerService {

	private SellerDao sellerDao;

	public void setSellerDao(SellerDao sellerDao) {
		this.sellerDao = sellerDao;
	}

	public PageBean<Seller> findByPage(Integer currpage) {
		// TODO Auto-generated method stub
		PageBean<Seller> page = new PageBean<Seller>();
		page.setCurrPage(currpage);
		int pageSize =3;
		page.setPageSize(pageSize);
		
		int totalCount = sellerDao.findCount();
		page.setTotalCount(totalCount);
		
		double tlc = totalCount;
		Double num =  Math.ceil(tlc / pageSize);
		
		page.setTotalPage(num.intValue());
		int begin = (currpage -1)* pageSize;
		
		List<Seller> list = sellerDao.findByPage(begin,pageSize);
		page.setList(list);
		return page;
	}

	public void save(Seller seller) {
		// TODO Auto-generated method stub
		sellerDao.save(seller);
	}

	public Seller findById(Integer sid) {
		
		return sellerDao.findById(sid);
	}

	public void updata(Seller seller) {
		// TODO Auto-generated method stub
		sellerDao.updata(seller);
	}

	public void delete(Seller seller) {
		// TODO Auto-generated method stub
		sellerDao.delete(seller);
	}

	public List<Seller> findAll() {
		
		return sellerDao.findAll();
	}
	
	
	
}
