package com.javaLab;


public class MarketingEmployee {

    // Basic Salary (primitive + literal)
    double basicSalary = 10000;

    // Percentages
    static double fieldAllowanceRate = 0.12;   // 12%
    static double internetAllowanceRate = 0.03; // 3%
    double insuranceRate = 0.02;               // 2%

    // ---------- STATIC METHOD ----------
    // Calculates total allowances
    public static double calculateAllowances(double basic) {

        double fieldAllowance = basic * fieldAllowanceRate;
        double internetAllowance = basic * internetAllowanceRate;

        return fieldAllowance + internetAllowance;
    }

    // ---------- INSTANCE METHOD ----------
    // Calculates total deductions
    public double calculateDeductions(double basic) {

        double insurance = basic * insuranceRate;

        return insurance;
    }

    // ---------- INSTANCE METHOD ----------
    // Calculates net salary (monthly + yearly)
    public void calculateNetSalary() {

        double allowances = calculateAllowances(basicSalary);
        double deductions = calculateDeductions(basicSalary);

        double netMonthlySalary = (basicSalary + allowances) - deductions;
        double netAnnualSalary = netMonthlySalary * 12;

        System.out.println("------ Salary Summary ------");
        System.out.println("Basic Salary       : " + basicSalary);
        System.out.println("Total Allowances   : " + allowances);
        System.out.println("Total Deductions   : " + deductions);
        System.out.println("Net Monthly Salary : " + netMonthlySalary);
        System.out.println("Net Annual Salary  : " + netAnnualSalary);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        MarketingEmployee emp = new MarketingEmployee();

        emp.calculateNetSalary();
    }
}