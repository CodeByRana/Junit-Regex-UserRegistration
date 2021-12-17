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
}
