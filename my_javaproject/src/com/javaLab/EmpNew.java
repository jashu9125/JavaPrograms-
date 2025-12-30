package com.javaLab;

public class EmpNew {
	int salary = 10000;
	float al = 0.12f;
	float ia = 0.03f;
	float id = 0.02f;
	int sum;
	int add;
	int num;
	int sum1;

	static void dis(EmpNew en) {
//		EmpNew en = new EmpNew();
		en.sum = (int) (en.salary * en.al);
		System.out.println("Travel allowances : " + en.sum);
		en.add = (int) (en.salary * en.ia);
		System.out.println("Internet allowances : " + en.add);
		en.num = (int) (en.salary + en.sum + en.add);
		System.out.println("Adding Travel Allowance and Internet Allowance : " + en.num);

	}

	void hii() {
		sum1 = (int) (salary * id);
		System.out.println("Insurance detcuting : " + sum1);
	}

	void hi() {
		hii();
		dis(this);
		add = num - sum1;
		System.out.println("Total : " + add);

	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		EmpNew en1 = new EmpNew();
//		en.sum = en.salary*(int)(en.al*en.ia);
//		System.out.println(en.sum);
//		en.dis();
//		en.hii();
		en1.hi();

	}

}
