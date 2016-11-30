package com.virtusa.hibernate.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EmployeeTable1")
@SecondaryTable(name = "EmployeeDetails")
public class Employee implements Serializable {

	@Id
	@Column(name = "E_ID", length = 10)
	private int employeeId;
	@Column(name = "Emp_Name", length = 10)
	private String employeeName;
	@Column(name = "sal", length = 10)
	private double salary;
	@Basic
	private long phoneNumber;
	@Transient
	private String passwd;
	@Temporal(TemporalType.DATE)
	@Column(name = "Hire_Date")
	private Date date;

	
	@Column(table = "EmployeeDetails")
	private String employeeAddress;
	@Column(table = "EmployeeDetails")
	private int houseNumber;
	@Column(table = "EmployeeDetails")
	private String city;
	@Column(name = "pin",table = "EmployeeDetails")
	private long pin;

	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
