package com.bridgelabz;

import java.util.Scanner;

/**
 * Program on User Registration Using Regex
 *
 * @author : Ashvini Kanojia
 * @since : 01/04/2022
 * */

public class UserRegistration {
// (?=.*[0-9]) # a digit must occur at least once
        // (?=.*[a-z]) # a lower case letter must occur at least once
        // (?=.*[A-Z]) # an upper case letter must occur at least once
        // (?=.*[@#$%^&+=]) # a special character must occur at least once
        // (?=\S+$) # no whitespace allowed in the entire string
        // .{8,} # anything, at least eight places though

        public void firstName() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name is: ");
            String fname = sc.nextLine();
            String regexFname = "^[A-Z]{1}[a-z]{2,}";

            if (fname.matches(regexFname) == true) {
                System.out.println("The first name " + fname + " is valid.");
            } else {
                System.out.println("The first name " + fname + " is invalid.");
            }
        }

    public void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name is: ");
        String lname = sc.nextLine();
        String regexFname = "^[A-Z]{1}[A-Za-z]{2,}$";

        if (lname.matches(regexFname) == true) {
            System.out.println("The last name " + lname + " is valid.");
        } else {
            System.out.println("The last name " + lname + " is invalid.");
        }
    }

    public void eMail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eMail is: ");
        String email = sc.nextLine();
        String regexFname = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";

        if (email.matches(regexFname) == true) {
            System.out.println("The eMail " + email + " is valid.");
        } else {
            System.out.println("The eMail " + email + " is invalid.");
        }
    }

        public static void main(String[] args) {
            System.out.println("Welcome to the user registration problem");
            UserRegistration regex = new UserRegistration();
            regex.firstName();
            regex.lastName();
            regex.eMail();
        }
}
