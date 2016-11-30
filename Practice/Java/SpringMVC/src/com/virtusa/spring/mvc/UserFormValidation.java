package com.virtusa.spring.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserFormValidation implements Validator{

	@Override
	public boolean supports(Class<?> object) {
		System.out.println("Object!!!!!!!!!!!");
		return UserBean.class.equals(object);
	}

	@Override
	public void validate(Object object, Errors error) {
		// TODO Auto-generated method stub
		UserBean userBean = (UserBean)object;
		String firstname = userBean.getFirstname();
		if(firstname==null || firstname.isEmpty()){
			error.rejectValue("firstname","firstname","Please fill firstname");
		}
	}
}
