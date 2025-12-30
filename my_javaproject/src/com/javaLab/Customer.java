package com.javaLab;

public class Customer {
	int cid;
	String cname;
	Customer cu;

	void welcome() {
		System.out.println("welcome started ");
		Customer c = new Customer();
		System.out.println("welcome ended ");
	}

	@Override
		protected void finalize() {
		System.out.println("finalize called !!");
	}
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		// In How many ways Objects are eligible for Garbage.
		// 1) NUllifying the object
		// c1 = null;
		// c2 = null;
		 c3 = null;
		// 2) Re-assigining the objects
		// Customer c4 = new Customer();
		 c1 = c4;
		// 3) Objects inside the methods
		// c1.welcome();
		// 4) Anonymous Objects
		// new Customer();
		c1.cu = c2;
		c2.cu = c1;
		System.out.println(c1);
		System.gc();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}