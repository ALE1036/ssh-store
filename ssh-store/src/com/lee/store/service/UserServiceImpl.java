package com.lee.store.service;

import com.lee.store.dao.UserDao;
import com.lee.store.entity.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public User login(User user) {
		User us =userDao.findByUsernameAndPassword(user); 
		return us;
	}

}
