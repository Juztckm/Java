package com.virtusa.hibernate.association.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AssociationOneToManyMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Department department = new Department();
		
		
		department.setDepartmentName("Sales");
		
		Employee emp1 = new Employee("Nina", "Mayers", "111");
		Employee emp2 = new Employee("Tony", "Almeida", "222");
		
		emp1.setDepartment(department);
		emp2.setDepartment(department);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(department);
		session.save(emp1);
		session.save(emp2);
		//session.save(employee);
		//session.save(developer);
		//session.save(tester);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}



//http://viralpatel.net/blogs/hibernate-one-to-many-annotation-tutorial/