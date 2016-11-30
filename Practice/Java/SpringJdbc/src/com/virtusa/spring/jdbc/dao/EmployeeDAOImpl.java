package com.virtusa.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void init(){
		if(jdbcTemplate!=null){
			System.out.println("null");
		}
	}
	public void insertEmployee(){
		jdbcTemplate.update("insert into abc values(1,'Chandan')");
		//jdbcTemplate.update("insert into abc values(?,?)",new Object[]{1,"Chandan"});
	}

}
