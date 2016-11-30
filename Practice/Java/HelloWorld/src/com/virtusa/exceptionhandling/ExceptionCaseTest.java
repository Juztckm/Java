package com.virtusa.exceptionhandling;

public class ExceptionCaseTest {
	
	public static void main(String args[]) {
		try {
			checkFuel(1500);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}

	static void checkFuel(int fuel) throws LessFuelException {
		if (fuel < 1000)
			throw new LessFuelException("Low Fuel");
		else
			System.out.println("Continue Ride");
	}
}
