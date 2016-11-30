package com.virtusa.hibernate.embeddedtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTableCreateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employee employee1 = new Employee();
		 employee1.setEmployeeId(1002);
		 employee1.setEmployeeName("asdf");
		 employee1.setSalary(1002.00);
		 employee1.setPhoneNumber(909999);
		 employee1.setDate(new Date());
		 
		 Address address = new Address();
		 address.setCity("HYD");
		 address.setHouseNumber(123);
		 address.setPin(99999);
		 address.setStreet("SE");
		 
		 TemporaryAddress temporaryAddress = new TemporaryAddress();
		 temporaryAddress.setCity("BLGR");
		 temporaryAddress.setHouseNumber(111);
		 temporaryAddress.setPin(9090);
		 temporaryAddress.setStreet("S1");
		 
		 Set<Long> phNoSet = new HashSet<>();
		 phNoSet.add(99939l);
		 phNoSet.add(99929l);
		 phNoSet.add(99919l);
		 
		 
		 employee1.setSetOfPhNo(phNoSet);
		 employee1.setEmployeeAddress(address);
		 employee1.setTemporaryAddress(temporaryAddress);

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		// configuration.addAnnotatedClass(Employee.class);
		// new SchemaExport(configuration).create(true, true);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//session.save(employee1);//insert employee
		Employee emp = (Employee) session.load(Employee.class, 1002);
		System.out.println(emp);

		// Employee emp = (Employee) session.load(Employee.class, 1001);
		// System.out.println("Employee object loaded. " + emp);
		// emp.setEmployeeName("new name");
		// session.update(emp);
		// emp.setEmployeeName("Final");

		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}






// /http://www.concretepage.com/hibernate/secondarytables_hibernate_annotation
// http://www.concretepage.com/hibernate/example-embeddable-embedded-hibernate-annotation
// https://docs.jboss.org/hibernate/orm/4.2/manual/en-US/html_single/#tutorial-firstapp-configuration
// https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/tutorial.html#tutorial-firstapp-configuration