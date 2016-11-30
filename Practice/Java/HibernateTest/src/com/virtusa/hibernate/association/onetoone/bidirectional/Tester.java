package com.virtusa.hibernate.association.onetoone.bidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeInheritanceTester")
public class Tester implements Serializable{
	
	private int noOfBugsIdentified;

	public int getNoOfBugsIdentified() {
		return noOfBugsIdentified;
	}

	public void setNoOfBugsIdentified(int noOfBugsIdentified) {
		this.noOfBugsIdentified = noOfBugsIdentified;
	}
	
	

}
