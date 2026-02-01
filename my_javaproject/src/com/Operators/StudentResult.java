package com.Operators;

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Result Status using ternary operator
        String result = (marks >= 40) ? "Pass" : "Fail";

        // Grade calculation using ternary operator
        String grade = (marks >= 90) ? "A" :
                       (marks >= 75) ? "B" :
                       (marks >= 60) ? "C" :
                       (marks >= 40) ? "D" : "F";

        // Scholarship eligibility
        String scholarship = (marks >= 75) ? "Eligible for Scholarship"
                                           : "Not Eligible for Scholarship";

        // Display output
        System.out.println("\n--- Student Result ---");
        System.out.println("Marks       : " + marks);
        System.out.println("Result      : " + result);
        System.out.println("Grade       : " + grade);
        System.out.println("Scholarship : " + scholarship);

        sc.close();
    }
}
