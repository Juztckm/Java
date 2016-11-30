package com.virtusa.viral.onetomany.bidirectional;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Department department = new Department();
		department.setDepartmentId(101l);
		department.setDepartmentName("Sales");

		Employee emp1 = new Employee("Nina", "Mayers", "111");
		Employee emp2 = new Employee("Tony", "Almeida", "222");
		emp1.setEmployeeId(100l);
		emp2.setEmployeeId(101l);
		
		department.setEmployees(new ArrayList<Employee>());
		department.getEmployees().add(emp1);
		department.getEmployees().add(emp2);
		
		session.save(department);

		session.getTransaction().commit();
		session.close();
	}
}
