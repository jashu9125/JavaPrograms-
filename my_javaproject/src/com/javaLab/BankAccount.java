package com.javaLab;

import java.util.Scanner;

class Bank {
	String accountHolderName;
	long accountNumber;
	String password;
	double balance;

	void createAccount(String name, long accNo, String pwd, double bal) {
		accountHolderName = name;
		accountNumber = accNo;
		password = pwd;
		balance = bal;

		System.out.println("Account Created successfully ");
		display();
	}

	void display() {
		System.out.println("AccountHolderName : " + accountHolderName);
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("Password : " + password);
		System.out.println("Balance : " + balance);
	}

	double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	double withDraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	static void balanceEnquiry(Bank bk) {
		System.out.println("Final Balance : " + bk.balance);

	}
}

public class BankAccount {
	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Account Holder Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Account Number : ");
		long accNo = sc.nextLong();
		System.out.println("Enter password : ");
		String pwd = sc.next();
		System.out.println("Enter balance : ");
		double bal = sc.nextDouble();

		b.createAccount(name, accNo, pwd, bal);

		System.out.println("Enter Amount to Deposit : ");
		double amount = sc.nextDouble();
		double balance1 = b.deposit(amount);
		System.out.println("Deposited Successfully ");
		System.out.println("balance : " + balance1);

		b.display();

		System.out.println("Enter Amount to Withdraw : ");
		double amount1 = sc.nextDouble();
		double balance2 = b.withDraw(amount1);
		System.out.println("WithDraw Successfully ");
		System.out.println("balance : " + balance2);

		b.display();

		Bank.balanceEnquiry(b);
		sc.close();

	}
}
