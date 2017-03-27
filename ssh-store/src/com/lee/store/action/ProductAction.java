package com.lee.store.action;

import java.util.List;
import com.lee.store.entity.PageBean;
import com.lee.store.entity.Product;
import com.lee.store.entity.Seller;
import com.lee.store.service.ProductService;
import com.lee.store.service.SellerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4166196532972304495L;
	
	private Product product = new Product();

	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String findAll(){
		PageBean<Product> pageBean = productService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);	
		return "findAll";
	}
	
	private SellerService sellerService;

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}
	
	public String saveUI(){
		List<Seller> list = sellerService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}
	
	public String save(){
		//System.out.println(product.getPname());
		productService.save(product);
		return "saveSuccess";
	}

	public String edit(){
		product = productService.findById(product.getPid());
		List<Seller> list = sellerService.findAll();
		ActionContext.getContext().getValueStack().set("list",list);
		return "editSuccess";
	}
	
	public String updata(){
		productService.updata(product);
		return "updataSuceess";
	}
	
	public String delete(){
		product =productService.findById(product.getPid());
		productService.delete(product);
		return "deleteSuccess";
	}
	
}
