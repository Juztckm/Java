package com.virtusa.calc;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(12, 13);
		calculator.sub(13, 12);
		int a=10;
		calculator.inc(a);//pass values
		System.out.println(a);
	}

}
