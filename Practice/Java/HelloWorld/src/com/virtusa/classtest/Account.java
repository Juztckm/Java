package com.virtusa.classtest;

public class Account {

	private int accountId;
	private String accountHName;
	private double balance;

	public Account(){
		this(0,null,0);
	}
	
	public Account(int id){
		this(id,null,0);
	}
	
	public Account(String name){
		this(0,name,0);
	}
	
	public Account(int id,String name){
		this(id,name,0);
	}
	
	public Account(int accountId,String accountHName,double balance){
		this.accountId = accountId;
		this.accountHName = accountHName;
		this.balance = balance;
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccoutnHName() {
		return accountHName;
	}

	public void setAccoutnHName(String accoutnHName) {
		this.accountHName = accoutnHName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
