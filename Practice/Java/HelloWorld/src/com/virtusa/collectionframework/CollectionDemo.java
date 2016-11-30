package com.virtusa.collectionframework;

import java.util.Collection;
import java.util.TreeSet;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList arrayList = new ArrayList();
//		arrayList.add("hello");
//		arrayList.add(1);
//		arrayList.add(12.12);
//		arrayList.add("hello");
//		arrayList.add(1);
//		arrayList.add(12.12);
		
		Collection<Employees> collection = new TreeSet<Employees>();
//		Employees emp1 = new Employees(7);
//		Employees emp2 = new Employees(6);
//		Employees emp3 = new Employees(5);
//		Employees emp4 = new Employees(4);
//		Employees emp5 = new Employees(3);
//		Employees emp6 = new Employees(2);
//		Employees emp7 = new Employees(1);
		
		Employees emp1 = new Employees(1);
		Employees emp2 = new Employees(2);
		Employees emp3 = new Employees(3);
		Employees emp4 = new Employees(4);
		Employees emp5 = new Employees(5);
		Employees emp6 = new Employees(6);
		Employees emp7 = new Employees(7);
		
		System.out.println("100 : " + emp1 +"\n40 : "+ emp2 +"\n50 : "+ emp3);
		
		
		
		collection.add(emp1);
		collection.add(emp2);
		collection.add(emp2);
		collection.add(emp3);
		collection.add(emp4);
		collection.add(emp5);
		collection.add(emp6);
		collection.add(emp7);
		
		
		
		System.out.println(collection);
		
		for( Employees e : collection){
			System.out.println(e.bal);
		}
		
		TreeSet treeSet = new TreeSet();
		
		
	}

}
