package com.virtusa.hibernate.association.onetomany.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AssociationOneToManyMain {
	
	public static void main(String[] args) {

		Department department = new Department();
		Department department2 = new Department();
		
		
		department.setDepartmentName("Sales");
		department2.setDepartmentName("Marketing");
		
		Employee emp1 = new Employee("Nina", "Mayers", "111");
		Employee emp2 = new Employee("Tony", "Almeida", "222");
		Employee emp3 = new Employee("Nina", "Mayers", "333");
		Employee emp4 = new Employee("Tony", "Almeida", "444");
		Employee emp5 = new Employee("Nina", "Mayers", "555");
		Employee emp6 = new Employee("Tony", "Almeida", "666");
		
		emp1.setDepartment(department);
		emp2.setDepartment(department);
		emp3.setDepartment(department);
		emp4.setDepartment(department);
		emp5.setDepartment(department);
		emp6.setDepartment(department);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(department);
		//session.save(department);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		session.save(emp6);
		//session.save(employee);
		//session.save(developer);
		//session.save(tester);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}



//http://viralpatel.net/blogs/hibernate-one-to-many-annotation-tutorial/