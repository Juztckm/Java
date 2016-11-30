package com.virtusa.spring.jdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcClient {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myappjdbcconfig.xml");
		EmployeeDAOImpl employeeDAOImpl = applicationContext.getBean("employeeDao",EmployeeDAOImpl.class);
		employeeDAOImpl.insertEmployee();
	}

}
