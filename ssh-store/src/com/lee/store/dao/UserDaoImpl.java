package com.lee.store.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lee.store.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User findByUsernameAndPassword(User user) {
		String hql= "from User where username = ? and password = ?";
		List<User> list =  this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}
}
