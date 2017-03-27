package com.lee.store.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.lee.store.entity.User;
import com.lee.store.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> ,SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6930225524152129489L;

	private User user = new User();

	
	public void setUser(User user) {
		this.user = user;
	}


	public User getModel() {
		return user;
	}
	
	private UserService userService; 
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String login(){
		//System.out.println("login..");
		User us =userService.login(user);
		
		if(us== null){
			this.addActionError("”√ªßªÚ√‹¬Î¥ÌŒÛ");
			return INPUT;
		}else{
			
			ActionContext.getContext().getSession().put("user",us);
			ActionContext.getContext().getValueStack().push(us);
			return SUCCESS;
		}
		
	}

	public String logout(){
		ActionContext.getContext().getSession().remove("user");
		return "logout";
	}
	
	public String out(){
		return "out";
	}
	
	
}
