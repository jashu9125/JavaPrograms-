package com.LanguageFundementals.Constructors;

public class Hospital {

    // Static variable (class-level)
    static String hospitalName = "City Care Hospital";

    // Instance variables
    int patientId;
    String patientName;
    int age;

    // Constructor
    Hospital(int patientId, String patientName, int age) {
        System.out.println("Constructor called");
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    // Static method
    static void showPatientDetails() {
        System.out.println("\nStatic method started");
        System.out.println("Hospital Name: " + hospitalName);

        // Creating object to access instance variables
        Hospital h = new Hospital(901, "Ramesh", 45);

        System.out.println("Patient ID: " + h.patientId);
        System.out.println("Patient Name: " + h.patientName);
        System.out.println("Age: " + h.age);
    }

    // Instance method
    void display() {
        System.out.println(patientId);
        System.out.println(patientName);
        System.out.println(age);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        // Calling static method
        Hospital.showPatientDetails();
    }
}
