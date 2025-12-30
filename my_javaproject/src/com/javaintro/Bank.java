package com.javaintro;

public class Bank {

	static int Account_No = 12031;
	int accountNumber;
	String Holder_Name;
	Double balance;

	void display() {
		System.out.println("Account Number : " + Account_No);
		System.out.println("Holder Name : " + Holder_Name);
		System.out.println("Balance : " + balance);
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		System.out.println("Bank Details : ");
		Bank b = new Bank();
		b.Holder_Name = "Krishna";
		b.balance = 100000d;
		b.display();
		
		
		Account_No++;
		b.accountNumber=Account_No;
		b.Holder_Name = "Radha";
		b.balance = 200000.0;
		b.display();
		
		Account_No++;
		b.accountNumber=Account_No;
		b.Holder_Name = "BalRam";
		b.balance = 300000d;
		b.display();
//		System.out.println(b);

	}

}
