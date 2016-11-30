package com.virtusa.spring.mvc;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="USERBEAN")
public class UserBean {
	
	@Id
	@GeneratedValue
	private int userId;
	@NotEmpty(message="Please enter the first name")
	private String firstname;
	private String lastname;
	@Email
	private String email;
	private String passwd;
	@Range(min=10,max=60,message="Age should be in between 10 to 60")
	private int age;
//	List<String> gender;
//	List<String> desg;
//	List<String> city;
//	List<String> tech;
//	List<String> area;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public List<String> getGender() {
//		return gender;
//	}
//	public void setGender(List<String> gender) {
//		this.gender = gender;
//	}
//	public List<String> getDesg() {
//		return desg;
//	}
//	public void setDesg(List<String> desg) {
//		this.desg = desg;
//	}
//	public List<String> getCity() {
//		return city;
//	}
//	public void setCity(List<String> city) {
//		this.city = city;
//	}
//	public List<String> getTech() {
//		return tech;
//	}
//	public void setTech(List<String> tech) {
//		this.tech = tech;
//	}
//	public List<String> getArea() {
//		return area;
//	}
//	public void setArea(List<String> area) {
//		this.area = area;
//	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", passwd="
				+ passwd + ", age=" + age + "]";
	}
	
}
