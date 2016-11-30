package com.virtusa.hibernate.hql;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("abc");
		
		Employee employee1 = new Employee();
		employee1.setEmpId(102);
		employee1.setEmpName("abcd");
		
		Employee employee2 = new Employee();
		employee2.setEmpId(103);
		employee2.setEmpName("abcd");
		
		Employee employee3 = new Employee();
		employee3.setEmpId(104);
		employee3.setEmpName("abcd");
		
		Employee employee4 = new Employee();
		employee4.setEmpId(105);
		employee4.setEmpName("abcd");
		
		int id;
		String name;
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter Id : ");
//		id = scanner.nextInt();
//		System.out.println("Enter Name : ");
//		name = scanner.next();
		

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		
		
		Employee emp = (Employee) session.get(Employee.class, 101);
		Employee emp1 = (Employee) session.get(Employee.class, 102);
		
		session.close();
		
		Session session2 = sessionFactory.openSession();
		Employee emp2 = (Employee) session2.get(Employee.class, 101);
		Employee emp3 = (Employee) session2.get(Employee.class, 102);
		session2.close();
		
//		session.save(employee);
//		session.save(employee1);
//		session.save(employee2);
//		session.save(employee3);
//		session.save(employee4);
		
//		Query query = session.createQuery("select emp from Employee emp where emp.empId = ?");
//		Query query = session.createQuery("select emp from Employee emp where emp.empId = :empid");
//		Query query = session.createQuery("select count(emp) from Employee emp");
//		Query query = session.getNamedQuery("countRow");
//		query.setInteger("empid", id);
//		Query query = session.createQuery("select emp.empId,emp.empName from Employee emp order by emp.empId desc");
//		List<Integer> empList= query.list();
//		System.out.println(empList.get(0));
//		Iterator e = query.iterate();
//		System.out.println(query.iterate());
//		for(Object obj:empList){
//			Object[] r = (Object[]) obj;
//			System.out.println(r[0]);
//		}
		
//		for(Employee e:empList){
//			System.out.println(e.getEmpId() + " " + e.getEmpName());
//		}
		
		//transaction.commit();
		//session.close();
		sessionFactory.close();
	}

}
