package com.bridge.user;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        //simple print welcome
        System.out.println("Welcome To Junit User Registration Problem");

        //Taking scanner
        Scanner sc = new Scanner(System.in);
        RegexClassValidation Regex = new RegexClassValidation();

        //Enter first name
        System.out.println("Please Enter the first name : ");
        String firstName = sc.next();
        if (RegexClassValidation.RegexFunctionFirstname(firstName)){
            System.out.println("Valid First name");
        }else {
            System.out.println("InValid First name");
        }

        //Enter last name
        System.out.println("Please Enter the last name : ");
        String lastName = sc.next();
        if (RegexClassValidation.RegexFunctionFirstname(lastName)){
            System.out.println("Valid last name");
        }else {
            System.out.println("InValid last name");
        }

        //Enter Valid Email ID
        System.out.println("Please Enter the email Id : ");
        String emailId = sc.next();
        if (RegexClassValidation.RegexFunctionEmailId(emailId)){
            System.out.println("Valid email");
        }else {
            System.out.println("InValid email");
        }

        //Enter Mobile No - should be country code and 10 digit numeric num
        System.out.println("Please Enter the Mobile No : ");
        String mobileNo = sc.next();
        if (RegexClassValidation.RegexFunctionMobileNo(mobileNo)){
            System.out.println("Valid Mobile number");
        }else {
            System.out.println("InValid Mobile Number");
        }

        //Enter the Password - should be minimum 8 Character
        String password="";
        RegexClassValidation.validationForPassword("deepak");
    }
}
