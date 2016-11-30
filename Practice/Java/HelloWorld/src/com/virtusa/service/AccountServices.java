package com.virtusa.service;

import com.virtusa.classtest.Account;

public class AccountServices {

	public void searchAccountById(Account[] a, int id) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getAccountId()) {
				getAccountDetail(a[i]);
				break;
			}
		}
	}
	public void searchAccountByName(Account[] a, String nameSearch) {
		for (int i = 0; i < a.length; i++) {
			if (nameSearch == a[i].getAccoutnHName()) {
				getAccountDetail(a[i]);
				break;
			}
		}
	}

	public Account createAccount(int id, String name, double bal) {
		// TODO Auto-generated method stub
		Account a = new Account(id, name, bal);
		return a;
	}

	public void deposit(Account account, double amount) {
		double currentBalance = account.getBalance();
		double updatedBalance = currentBalance + amount;
		account.setBalance(updatedBalance);
	}

	public boolean withdraw(Account a, double amount) {
		// TODO Auto-generated method stub
		double balance;
		if (a.getBalance() >= amount) {
			balance = a.getBalance() - amount;
			a.setBalance(balance);
			return true;
		} else {
			return false;
		}
	}

	public void transferMoney(Account fromAcc, Account toAcc, double amount) {
		withdraw(fromAcc, amount);
		deposit(toAcc, amount);
	}

	public void getAccountDetail(Account a) {
		// TODO Auto-generated method stub
		System.out.println("Account ID: " + a.getAccountId());
		System.out.println("Acc H Name: " + a.getAccoutnHName());
		System.out.println("Balance: " + a.getBalance());
	}
}
