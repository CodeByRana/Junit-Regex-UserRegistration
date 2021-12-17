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
    }
}
