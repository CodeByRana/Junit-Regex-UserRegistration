package com.bridge.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassValidation {

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

    //Check RegexClass for first name validation
    public static boolean RegexFunctionMobileNo(String mobileNo) {

        String regex = "^[0-9]{2}\\s?[0-9]{10}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);

        return matcher.matches();
    }

    ////Enter the Password - should be minimum 8 Character
    public static boolean validationForPassword(String password){

        String regex="(?=.*[A-Z])([@#$%])$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);

        return matcher.matches();
    }
}
