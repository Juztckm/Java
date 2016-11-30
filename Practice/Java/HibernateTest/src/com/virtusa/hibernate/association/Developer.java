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
public class Developer implements Serializable{
	
	@Id
	@GeneratedValue
	private int addressId;
	private int noOfLineOfCode;
	private int noOfMethods;
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
	public int getNoOfLineOfCode() {
		return noOfLineOfCode;
	}
	public void setNoOfLineOfCode(int noOfLineOfCode) {
		this.noOfLineOfCode = noOfLineOfCode;
	}
	public int getNoOfMethods() {
		return noOfMethods;
	}
	public void setNoOfMethods(int noOfMethods) {
		this.noOfMethods = noOfMethods;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
