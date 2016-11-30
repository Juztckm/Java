package com.virtusa.inher;

public class SysMain {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Developer developer = new Developer();
		Tester tester = new Tester();
		JavaDeveloper javaDeveloper = new JavaDeveloper();
		Employee e1 = new Developer();
		Tester d =  (Tester) e1;
	}

}
