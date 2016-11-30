package com.virtusa.hibernate.association;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeInheritance")
@Inheritance(strategy = InheritanceType.JOINED)
public class Passport implements Serializable {

	@Id
	@Column(nullable = false)
//	@GenericGenerator(
//			name = "sequence", 
//			strategy = "sequence", 
//			parameters = {@org.hibernate.annotations.Parameter(name = "sequence", value = "hibernate_seq")
//	})
	//@GeneratedValue(generator = "sequence")
	//@SequenceGenerator(name = "sequence",sequenceName = "hibernate_seq")	//@GenericGenerator(name = "generator", strategy = "sequence-identity", parameters = @Parameter(name = "sequence", value = "USER_SEQ"))
	private int passportNo;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Person developer;

	public int getpassportNo() {
		return passportNo;
	}
	public void setpassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person getDeveloper() {
		return developer;
	}
	public void setDeveloper(Person developer) {
		this.developer = developer;
	}
}
