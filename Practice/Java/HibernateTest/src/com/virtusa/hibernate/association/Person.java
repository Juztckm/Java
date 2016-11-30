package com.virtusa.hibernate.association;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "EmployeeInheritanceDeveloper")
public class Person implements Serializable{
	
	@Id
	@GeneratedValue
	private int addressId;
	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Passport getEmployee() {
		return passport;
	}
	public void setEmployee(Passport employee) {
		this.passport = employee;
	}
	
}
