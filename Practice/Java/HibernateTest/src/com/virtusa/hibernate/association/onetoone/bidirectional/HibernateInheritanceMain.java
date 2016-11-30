package com.virtusa.hibernate.association.onetoone.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateInheritanceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Passport passport = new Passport();
		Person person = new Person();
		Tester tester = new Tester();
		
//		developer.setDesig("DEV");
//		developer.setEmployeeId(1001);
//		developer.setName("Juzt");
//		developer.setSalary(12012.00);
//		developer.setNoOfLineOfCode(5000);
//		developer.setNoOfMethods(500);
//		
//		tester.setDesig("TES");
//		tester.setEmployeeId(1002);
//		tester.setName("Chandan");
//		tester.setSalary(12012.00);
//		tester.setNoOfBugsIdentified(1000);
		
//		employee.setDesig("HYD");
//		employee.setEmployeeId(111);
//		employee.setName("asdf");
//		employee.setSalary(120.0);
//		
//		developer.setNoOfLineOfCode(120);
//		developer.setNoOfMethods(234);
		
//		developer.setNoOfLineOfCode(1010);
//		developer.setNoOfMethods(123);
//		
//		employee.setDesig("asdf");
//		employee.setEmployeeId(1010);
//		employee.setName("asdfasd");
//		employee.setSalary(123.123);
//
//		employee.setDeveloper(developer);
//		developer.setEmployee(employee);
		
		person.setAddressId(101);
		passport.setName("ASDF");
		passport.setPassportNo(1010);
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//session.save(employee);
		//session.save(developer);
		//session.save(tester);
		System.out.println(passport);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
