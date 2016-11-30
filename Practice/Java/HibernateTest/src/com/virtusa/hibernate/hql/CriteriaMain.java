package com.virtusa.hibernate.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

public class CriteriaMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();		
		
		Criteria criteria = session.createCriteria(Employee.class);
		SimpleExpression simpleExpression1 = Restrictions.gt("empId", 101);
		SimpleExpression simpleExpression2 = Restrictions.lt("empId", 105);
		
		LogicalExpression logicalExpression = Restrictions.and(simpleExpression1, simpleExpression2);
		
		criteria.add(logicalExpression);
		criteria.addOrder(Order.desc("empId"));
		
		ProjectionList p1=Projections.projectionList();
        p1.add(Projections.property("empId"));
        p1.add(Projections.property("empName"));
        
        criteria.setProjection(p1);
//		PropertyProjection propertyProjection = Projections.property("empId");
//		criteria.setProjection(propertyProjection);
//		criteria.add(simpleExpression2);
		List<Object> empList = criteria.list();
		
		for(Object e:empList){
			Object[] r = (Object[]) e;
			System.out.println(r[0] + " " + r[1]);
		}
		
		session.close();
		sessionFactory.close();
	}

}
