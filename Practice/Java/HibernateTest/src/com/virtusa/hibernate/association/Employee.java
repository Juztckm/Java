package com.virtusa.hibernate.association;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeInheritance")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee implements Serializable {

	@Id
	@Column(nullable = false)
//	@GenericGenerator(
//			name = "sequence", 
//			strategy = "sequence", 
//			parameters = {@org.hibernate.annotations.Parameter(name = "sequence", value = "hibernate_seq")
//	})
	//@GeneratedValue(generator = "sequence")
	//@SequenceGenerator(name = "sequence",sequenceName = "hibernate_seq")	//@GenericGenerator(name = "generator", strategy = "sequence-identity", parameters = @Parameter(name = "sequence", value = "USER_SEQ"))
	private int employeeId;
	private String name;
	private double salary;
	private String desig;
	@OneToOne(cascade = CascadeType.ALL)
	private Developer developer;

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	

}
