package com.virtusa.hibernate.inheritance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "EmployeeInheritanceDeveloper")
public class Developer extends Employee implements Serializable{
	
	
	private int noOfLineOfCode;
	private int noOfMethods;
	
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
	
	

}
