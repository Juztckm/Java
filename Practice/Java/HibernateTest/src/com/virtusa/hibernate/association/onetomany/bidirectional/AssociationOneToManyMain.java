package com.virtusa.hibernate.association.onetomany.bidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AssociationOneToManyMain {
	
	public static void main(String[] args) {

		Department department = new Department();
		
		department.setDepartmentId(101l);
		department.setDepartmentName("Sales");
		
		Employee emp1 = new Employee();
		emp1.setCellphone("9999");
		emp1.setEmployeeId(100l);
		emp1.setFirstname("asdf");
		emp1.setLastname("asdf");
		
		Employee emp2 = new Employee();
		emp1.setCellphone("99912");
		emp1.setEmployeeId(101l);
		emp1.setFirstname("asd");
		emp1.setLastname("asd");
//		Employee emp3 = new Employee("Nina", "Mayers", "333");
//		Employee emp4 = new Employee("Tony", "Almeida", "444");
//		Employee emp5 = new Employee("Nina", "Mayers", "555");
//		Employee emp6 = new Employee("Tony", "Almeida", "666");
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
//		employeeList.add(emp3);
//		employeeList.add(emp4);
//		employeeList.add(emp5);
//		employeeList.add(emp6);
		
		//emp1.setDepartment(department);
		//emp2.setDepartment(department);
//		emp3.setDepartment(department);
//		emp4.setDepartment(department);
//		emp5.setDepartment(department);
//		emp6.setDepartment(department);
		
		department.setEmployees(employeeList);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(department);
//		
//		session.save(emp1);
//		session.save(emp2);
//		session.save(emp3);
//		session.save(emp4);
//		session.save(emp5);
//		session.save(emp6);
		//session.save(employee);
		//session.save(developer);
		//session.save(tester);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}



//http://viralpatel.net/blogs/hibernate-one-to-many-annotation-tutorial/