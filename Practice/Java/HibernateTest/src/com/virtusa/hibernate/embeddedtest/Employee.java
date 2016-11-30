package com.virtusa.hibernate.embeddedtest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EmployeeTable")
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
	@ElementCollection
    private Set<Long> setOfPhNo;
	
	
	public Set<Long> getSetOfPhNo() {
		return setOfPhNo;
	}
	public void setSetOfPhNo(Set<Long> setOfPhNo) {
		this.setOfPhNo = setOfPhNo;
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
				+ phoneNumber + ", passwd=" + passwd + ", date=" + date
				+ ", setOfPhNo=" + setOfPhNo + ", employeeAddress="
				+ employeeAddress + ", temporaryAddress=" + temporaryAddress
				+ "]";
	}



	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name ="street",column = @Column(name = "pStreet") ),
		@AttributeOverride(name ="houseNumber",column = @Column(name = "pHouseNumber") ),
		@AttributeOverride(name ="city",column = @Column(name = "pCity") ),
		@AttributeOverride(name ="pin",column = @Column(name = "pPin") )
	})
	private Address employeeAddress;
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name ="street",column = @Column(name = "tStreet") ),
		@AttributeOverride(name ="houseNumber",column = @Column(name = "tHhouseNumber") ),
		@AttributeOverride(name ="city",column = @Column(name = "tCity") ),
		@AttributeOverride(name ="pin",column = @Column(name = "tPin") )
	})
	private TemporaryAddress temporaryAddress;

	public TemporaryAddress getTemporaryAddress() {
		return temporaryAddress;
	}
	public void setTemporaryAddress(TemporaryAddress temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	

}
