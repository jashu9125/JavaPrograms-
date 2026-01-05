package com.LanguageFundementals.Method;

class Bank {
	double balance;  //instance Variable
	
	  double deposit(double amount) {
	        balance += amount;
	        return balance;
	    }
	  double withdraw(double amount) {
	        balance -= amount;
	        return balance;
	    }
	   static double balanceEnquiry(Bank acc) {
           return acc.balance;
   }
}
public class BankAccount {

	public static void main(String[] args) {
		 // creating object
        Bank account = new Bank();
        double depositamount=account.deposit(2000);
        // calling instance methods
        System.out.println("After Deposit: " + depositamount);
        double withdrawamount=account.withdraw(500);
        System.out.println("After Withdrawal: " + withdrawamount);

        // calling static method using class name
        System.out.println("Current Balance: " +
                Bank.balanceEnquiry(account));

	}

}
