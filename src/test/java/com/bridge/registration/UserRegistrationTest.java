package com.bridge.registration;

import com.bridge.user.RegexClass;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
        //Test Case for First Name
        @Test
        public void givenFirstName_CaseOne_WhenTestCaseShould_ReturnValid(){

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("Deepak"));
        }
        @Test
        public void givenFirstName_CaseTwo_WhenTestCaseShould_ReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("deepak"));
        }
        @Test
        public void givenFirstName_CaseThree_WhenTestCaseShould_ReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("Dee"));
        }
        @Test
        public void givenFirstName_CaseFour_WhenTestCaseShould_ReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("de"));
        }
        //Test Case for Last Name
        @Test
        public void givenLastName_CaseOne_WhenTestCaseShould_ReturnValid(){

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("Rana"));
        }
        @Test
        public void givenLastName_CaseTwo_WhenTestCaseShould_ReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("rana"));
        }
        @Test
        public void givenLastName_CaseThree_WhenTestCaseShould_ReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("Ran"));
        }
        @Test
        public void givenLastName_CaseFour_WhenTestCaseShould_ReturnValid() {

                Assert.assertTrue(RegexClass.RegexFunctionFirstname("ra"));
        }
}
