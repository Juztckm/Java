package com.virtusa.hibernate.association.onetoone.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport")
//@Inheritance(strategy = InheritanceType.JOINED)
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
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Person person;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", name=" + name
				+ ", person=" + person + "]";
	}

}
