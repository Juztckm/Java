package com.virtusa.spring.cointainer;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SuppressWarnings("rawtypes")
public class UserBean {

	private int id;
	private String name;
	private char gender;
	private boolean mStatus;
	private long phoneNumber;

	private Date date;
	// @Autowired
	private Address address;

	private List<String> countryVisitedList;
	private Set countryVisitedSet;
	private Map countryVisitedMap;
	private Properties countryVisitedProp;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set getCountryVisitedSet() {
		return countryVisitedSet;
	}

	public void setCountryVisitedSet(Set countryVisitedSet) {
		this.countryVisitedSet = countryVisitedSet;
	}

	public Map getCountryVisitedMap() {
		return countryVisitedMap;
	}

	public void setCountryVisitedMap(Map countryVisitedMap) {
		this.countryVisitedMap = countryVisitedMap;
	}

	public Properties getCountryVisitedProp() {
		return countryVisitedProp;
	}

	public void setCountryVisitedProp(Properties countryVisitedProp) {
		this.countryVisitedProp = countryVisitedProp;
	}

	public List<String> getCountryVisitedList() {
		return countryVisitedList;
	}

	public void setCountryVisitedList(List<String> countryVisitedList) {
		this.countryVisitedList = countryVisitedList;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean ismStatus() {
		return mStatus;
	}

	public void setmStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", mStatus=" + mStatus + ", phoneNumber=" + phoneNumber
				+ ", \ndate=" + date + ", \naddress=" + address
				+ ", \ncountryVisitedList=" + countryVisitedList
				+ ", \ncountryVisitedSet=" + countryVisitedSet
				+ ", \ncountryVisitedMap=" + countryVisitedMap
				+ ", \ncountryVisitedProp=" + countryVisitedProp + "]";
	}

	@PostConstruct
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("After object created");
	}

	@PreDestroy
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Before OBJ destroyed");
	}
}
