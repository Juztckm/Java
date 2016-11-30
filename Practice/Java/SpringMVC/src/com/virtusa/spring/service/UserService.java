package com.virtusa.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.spring.dao.UserDAO;
import com.virtusa.spring.mvc.UserBean;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public void registerUser(UserBean bean) {
		// TODO Auto-generated method stub
		userDAO.registerUser(bean);
	}

}
