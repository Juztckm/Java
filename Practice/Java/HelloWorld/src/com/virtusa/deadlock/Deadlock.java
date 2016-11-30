package com.virtusa.deadlock;

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();

	// Constructor
	Deadlock() {
		Thread t = new Thread(this);
		t.start();
		a.methodA(b);
	}

	public void run() {
		b.methodB(a);
	}

	public static void main(String args[]) {
		new Deadlock();
	}
}