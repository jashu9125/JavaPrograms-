package com.javaLab;

import java.math.*;

public class Company {
	BigDecimal salary = new BigDecimal("5000");
	BigDecimal da = new BigDecimal("0.08");
	BigDecimal pf = new BigDecimal("0.03");
	BigDecimal cgst = new BigDecimal("0.07");
	BigDecimal net;
	BigDecimal annual = new BigDecimal("12"); 

		{
			System.out.println("Salary without allowances detucting pf and cgst");
			net = salary.subtract(pf).subtract(cgst).add(da).multiply(annual);
			System.out.println("Annual salary : " +net);
			
			System.out.println("-------------------------------------------");
			da = salary.multiply(da);
			System.out.println("Daily Allowance : " +da);
			net = salary.add(da);
			System.out.println("Net Monthly Salary : " +net);
			
			pf = net.multiply(pf,new MathContext(3));
			System.out.println("PF Amount : " +pf);
			net = net.subtract(pf);
			System.out.println("Net Monthly Salary : " +net);
			
			cgst = net.multiply(cgst,new MathContext(3));
			System.out.println("CGST Amount : " +cgst);
			net = net.subtract(cgst);
			System.out.println("Net Monthly Salary : " +net);
			net = net.multiply(annual);
			System.out.println("Net Annual Salary : " +net);
			
			System.out.println("Salary without allowances detucting pf and cgst");
			net = salary.subtract(pf).subtract(cgst).add(da).multiply(annual);
			System.out.println("Annual salary : " +net);
		}
	public static void main(String[] args) {
		Company c = new Company();
	}

}
