package com.lee.store.entity;

import java.util.HashSet;
import java.util.Set;

public class Seller {
	
	private Integer sid;
	
	private String sname;
	
	private String address;
	
	private String phone;
	
	//卖家的商品集合
	private Set<Product> pro = new HashSet<Product>();
	

	public Set<Product> getPro() {
		return pro;
	}

	public void setPro(Set<Product> pro) {
		this.pro = pro;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
