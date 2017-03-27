package com.lee.store.dao;

import com.lee.store.entity.User;

public interface UserDao {

	User findByUsernameAndPassword(User user);

}
