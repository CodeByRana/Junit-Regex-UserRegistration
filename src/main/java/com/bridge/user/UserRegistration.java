package com.bridge.user;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        //simple print welcome
        System.out.println("Welcome To Junit User Registration Problem");

        //Taking scanner
        Scanner sc = new Scanner(System.in);
        RegexClass Regex = new RegexClass();

        //Enter first name
        System.out.println("Please Enter the first name : ");
        String firstName = sc.next();
        if (RegexClass.RegexFunctionFirstname(firstName)){
            System.out.println("Valid First name");
        }else {
            System.out.println("InValid First name");
        }
        //Enter last name
        System.out.println("Please Enter the last name : ");
        String lastName = sc.next();
        if (RegexClass.RegexFunctionFirstname(lastName)){
            System.out.println("Valid last name");
        }else {
            System.out.println("InValid last name");
        }
        //Enter Valid Email ID
        System.out.println("Please Enter the email Id : ");
        String emailId = sc.next();
        if (RegexClass.RegexFunctionEmailId(emailId)){
            System.out.println("Valid email");
        }else {
            System.out.println("InValid email");
        }
    }
}
