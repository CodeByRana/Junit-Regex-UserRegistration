package com.bridge.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    //Check RegexClass for first name validation
    public static boolean RegexFunctionFirstname(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }
    //Check RegexClass for first name validation
    public static boolean RegexFunctionLastname(String lastName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }
    //Check RegexClass for first name validation
    public static boolean RegexFunctionEmailId(String emailId) {

        String regex = "^[a-z0-9]{3,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);

        return matcher.matches();
    }
}
