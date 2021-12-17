package com.bridge.registration;

import com.bridge.user.RegexClassValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
        //Test Case for First Name
        @Test
        public void givenFirstName_CaseOne_WhenFirstNameCorrect_ShouldReturnValid(){

                Assert.assertTrue(RegexClassValidation.RegexFunctionFirstname("Deepak"));
        }
        @Test
        public void givenFirstName_CaseTwo_WhenFirstNameCorrect_ShouldReturnValid() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionFirstname("deepak"));
        }
        @Test
        public void givenFirstName_CaseThree_WhenFirstNameCorrect_ShouldReturnValid() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionFirstname("Dee"));
        }
        @Test
        public void givenFirstName_CaseFour_WhenFirstNameCorrect_ShouldReturnValid() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionFirstname("de"));
        }
        //Test Case for Last Name
        @Test
        public void givenLastName_CaseOne_WhenLastNameCorrect_ShouldReturnValid(){

                Assert.assertTrue(RegexClassValidation.RegexFunctionLastname("Rana"));
        }
        @Test
        public void givenLastName_CaseTwo_WhenLastNameCorrect_ShouldReturnValid() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionLastname("rana"));
        }
        @Test
        public void givenLastName_CaseThree_WhenLastNameCorrect_ShouldReturnValid() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionLastname("Ran"));
        }
        @Test
        public void givenLastName_CaseFour_WhenLastNameCorrect_ShouldReturnValid() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionLastname("ra"));
        }

        //Test Case for Email Address
        @Test
        public void givenEmailId_CaseOno_WhenEmailIdCorrect_ShouldReturnValidId() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionEmailId("dipak@gmail.com"));
        }
        @Test
        public void givenEmailId_CaseTwo_WhenEmailIdCorrect_ShouldReturnValidId() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionEmailId("dipak@gmail.com.in"));
        }
        @Test
        public void givenEmailId_CaseThree_WhenEmailIdCorrect_ShouldReturnValidId() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionEmailId("dipak.123@gmail.com"));
        }
        @Test
        public void givenEmailId_CaseFour_WhenEmailIdCorrect_ShouldReturnValidId() {

                Assert.assertTrue(RegexClassValidation.RegexFunctionEmailId("rana.deepak@gmail.com"));
        }
        //Test Case for Mobile Number
        @Test
        public void givenMobileNo_CaseOne_WhenMobileNoCorrect_ShouldReturnValidMobNo(){
                Assert.assertTrue(RegexClassValidation.RegexFunctionEmailId("91 7011133639"));
        }
}
