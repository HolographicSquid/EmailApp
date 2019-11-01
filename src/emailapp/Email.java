package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;

    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength;

    // Constructor to relive the fist name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Calls a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that reruns a random password
        this.password = randomPassword(defaultPasswordLength);
    }

    // Ask for the department
    private String setDepartment() {
        // ask the User what department they want
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting \n0 for noon");

        // gets there chose
        Scanner in = new Scanner(System.in);

        int depChoice;
        depChoice = in.nextInt();

        // Takes the user to the Department form there section
        if (depChoice == 1) {
            return "Sales";}
        else if (depChoice == 2) {
            return  "Development";
        }
        else if (depChoice == 3) {
            return "Accounting";
        }
        else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
