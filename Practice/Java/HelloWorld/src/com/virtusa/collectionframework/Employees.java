package com.virtusa.collectionframework;


public class Employees implements Comparable<Employees>{

	int bal;
	Employees(int bal){
		this.bal = bal;
	}
	
	public int compare(Employees emp1, Employees emp2) {
        if (emp1.bal < emp2.bal)
            return -1;
        else if (emp1.bal < emp2.bal)
            return 1;
        else
            return 0;
    }

	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		System.out.println(this.bal + " " + o.bal);
		
		return (-this.bal+o.bal);
	}
}
