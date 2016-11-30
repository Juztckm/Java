package com.virtusa.hibernate.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernate.pojo.Employee;

public class EmployeeTableCreatemain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee employee1 = new Employee();
//		employee1.setEmployeeId(1002);
//		employee1.setEmployeeName("asdf");
//		employee1.setSalary(1002.00);
//		employee1.setPhoneNumber(909999);
//		employee1.setDate(new Date());

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		// configuration.addAnnotatedClass(Employee.class);
		// new SchemaExport(configuration).create(true, true);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//session.save(employee1);//insert employee

//		Employee emp = (Employee) session.load(Employee.class, 1001);
//		System.out.println("Employee object loaded. " + emp);
//		emp.setEmployeeName("new name");
//		session.update(emp);
		//emp.setEmployeeName("Final");

		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}






///http://www.concretepage.com/hibernate/secondarytables_hibernate_annotation
//http://www.concretepage.com/hibernate/example-embeddable-embedded-hibernate-annotation
//https://docs.jboss.org/hibernate/orm/4.2/manual/en-US/html_single/#tutorial-firstapp-configuration
//https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/tutorial.html#tutorial-firstapp-configuration