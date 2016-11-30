package com.virtusa.hibernate.inheritance;

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

		Employee employee = new Employee();
		Developer developer = new Developer();
		Tester tester = new Tester();
		
		developer.setDesig("DEV");
		//developer.setEmployeeId(1001);
		developer.setName("Juzt");
		developer.setSalary(12012.00);
		developer.setNoOfLineOfCode(5000);
		developer.setNoOfMethods(500);
		
		tester.setDesig("TES");
		//tester.setEmployeeId(1002);
		tester.setName("Chandan");
		tester.setSalary(12012.00);
		tester.setNoOfBugsIdentified(1000);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//session.save(employee);
		session.save(developer);
		session.save(tester);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
