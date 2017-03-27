package com.lee.store.action;

import com.lee.store.entity.PageBean;
import com.lee.store.entity.Seller;
import com.lee.store.service.SellerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SellerAction extends ActionSupport implements ModelDriven<Seller>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4539281782245134815L;
	
	private Seller seller= new Seller();
	
	public Seller getModel() {

		return seller;
	}
	
	private Integer currPage =1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	private SellerService sellerService;
	
	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}


	public String findAll(){
		PageBean<Seller> page = sellerService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(page);
		return "findAll";
	}
	
	public String saveUI(){
		return "saveUI";
	}
	
	public String save(){
		sellerService.save(seller);
		return "saveSuccess";
	}
	
	public String edit(){
		seller = sellerService.findById(seller.getSid());
		return "editSuccess";
	}

	public String updata(){
		sellerService.updata(seller);
		return "updataSuccess";
	}
	
	public String delete(){
		seller = sellerService.findById(seller.getSid());
		sellerService.delete(seller);
		return "deleteSuccess";
	}
	
}
