package com.virtusa.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.spring.mvc.UserBean;

@Repository
public class UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser(UserBean bean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(bean);
	}

}
