package com.virtusa.threaddemo;

public class UserDefinedThreadDemo  extends Thread{


	public void run(){
		for(int  i = 1;i<=100;i++){
			System.out.println("run : " + i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedThreadDemo userDefinedThreadDemo = new UserDefinedThreadDemo();
		userDefinedThreadDemo.start();
		for(int  i = 1;i<=100;i++){
			System.out.println("main : " + i);
		}
	}

}
