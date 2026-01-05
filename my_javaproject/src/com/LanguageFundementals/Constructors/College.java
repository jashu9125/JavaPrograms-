package com.LanguageFundementals.Constructors;

public class College {

    // Instance variables
    int cid;
    String cname;
    int students;

    // Constructor
    College(int cid, String cname, int students) {
        System.out.println("Constructor called");
        this.cid = cid;
        this.cname = cname;
        this.students = students;
    }

    // Static method
    static void showCollege() {
        System.out.println("\nStatic method started");

        // Creating object to access instance variables
        College c = new College(701, "ABC Engineering College", 1200);

        System.out.println("College ID: " + c.cid);
        System.out.println("College Name: " + c.cname);
        System.out.println("Total Students: " + c.students);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Calling static method
        College.showCollege();
    }
}
