package com.virtusa.hibernate.association.onetoone.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Person")
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
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
//	@Override
//	public String toString() {
//		return "Person [addressId=" + addressId + ", passport=" + passport
//				+ "]";
//	}
	
}
