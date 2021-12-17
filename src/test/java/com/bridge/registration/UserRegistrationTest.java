package com.bridge.registration;

import com.bridge.user.RegexClass;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
        //First Test Case for First Name
        @Test
        public void givenFirstNameCaseOneWhenTestCaseShouldReturnValid(){

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("Deepak"));
        }
        @Test
        public void givenFirstNameCaseTwoWhenTestCaseShouldReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("deepak"));
        }
        @Test
        public void givenFirstNameCaseThreeWhenTestCaseShouldReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("Dee"));
        }
        @Test
        public void givenFirstNameCaseFourWhenTestCaseShouldReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("de"));
        }
}
