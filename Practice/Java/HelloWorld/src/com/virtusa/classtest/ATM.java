package com.virtusa.classtest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.virtusa.service.AccountServices;

public class ATM {

	/**
	 * @param args
	 * search an account by id or by name
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountServices accountServices = new AccountServices();
		Scanner scanner = new Scanner(System.in);
		
		Account[] account = new Account[10];
		List<Account> a = new ArrayList<Account>();
		
		account[0] = new Account(101,"Chandan1",1000);
		account[1] = new Account(102,"Chandan2",2000);
		account[2] = new Account(103,"Chandan3",3000);
		account[3] = new Account(104,"Chandan4",4000);
		account[4] = new Account(105,"Chandan5",5000);
		
		
//		for(int i = 0;i<account.length;i++){
//			accountServices.getAccountDetail(account[i]);
//		}
		
//		for(int i = 0;i<5;i++){
//			
//			 System.out.println("Enter ID : ");
//			 int id = scanner.nextInt();
//			 System.out.println("Enter Name : ");
//			 String accHName = scanner.next();
//			 System.out.println("Enter Amount : ");
//			 double bal = scanner.nextDouble();
//			 account[i] = new Account(id,accHName,bal);
//			
//		}
		
//		System.out.print("Enter ID to search : ");
//		int id = scanner.nextInt();
//		accountServices.searchAccountById(account, id);
//		accountServices.searchAccountByName(account, "Chandan1");

//		account1 = accountServices.createAccount(1001, "C1", 100000);
//		account2 = accountServices.createAccount(1002, "C2", 100000);
//
//		accountServices.deposit(account1, 5000);
//		// accountServices.withdraw(account1, 1234);
//		accountServices.getAccountDetail(account1);
//		accountServices.deposit(account2, 15000);
//		// accountServices.withdraw(account2, 125.39);
//		accountServices.getAccountDetail(account2);
//
//		accountServices.transferMoney(account1, account2, 200.5);
//		System.out.println();
//		System.out.println();
//		accountServices.getAccountDetail(account1);
//		System.out.println();
//		System.out.println();
//		accountServices.getAccountDetail(account2);

		// char character = 'y';
		// int caseChoice;
		// Scanner scanner = new Scanner(System.in);
		// do {
		// System.out.println("*******Welcome to JUZT Bank*******");
		// System.out
		// .println("1.Deposit\n2.Withdraw\n3.Fund Transfer\n\nEnter Choice : ");
		// caseChoice = scanner.nextInt();
		// switch (caseChoice) {
		// case 1:
		// System.out.println("Select Acc : \n1.Acc1\n2.Acc2\nEnter Choice : ");
		// Account a;
		// System.out.println("Enter ID : ");
		// int id = scanner.nextInt();
		// System.out.println("Enter Name : ");
		// String accHName = scanner.next();
		// System.out.println("Enter Amount : ");
		// double bal = scanner.nextDouble();
		// //Account account1 = new Account();
		// accountServices.createAccount(account1, id, accHName, bal);
		// accountServices.getAccountDetail(account1);
		// break;
		// case 2:
		// System.out.println("Enter Amount : ");
		// double amount = scanner.nextDouble();
		// accountServices.deposit(account1, amount);
		// break;
		// case 3:
		// System.out.println("Enter Amount : ");
		// double amount = scanner.nextDouble();
		// accountServices.withdraw(account1, amount);
		// break;
		// case 4:
		// System.out.println();
		// }
		// System.out.println("Enter Choice[y/n] : ");
		// character = scanner.next().charAt(0);
		// } while (character != 'n');

		// account.createAccount(1001, "C1", 100000);
		//
		// Account account2 = new Account();
		// account2.createAccount(1002, "C2", 100000);
		//
		// //account.deposite(5000);
		// //account2.deposite(6000);
		//
		//
		// account.getAccountDetail();
		// System.out.println();
		// account2.getAccountDetail();
		//
		// if(account2.transferMoney(account,100000)){
		// System.out.println("Successfull");
		// }else{
		// System.out.println("Transfer Unsuccessfull");
		// }
		// account.getAccountDetail();
		// System.out.println();
		// account2.getAccountDetail();

	}
}