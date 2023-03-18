package org.example;

import org.testng.annotations.Test;

public class Testsuite extends BaseTest{

    HomePage homePage = new HomePage();


    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();


    @Test

    public void toVerifyUserShouldRegisterSuccessfully(){
        homePage.clickOnRegistration();
        registerPage.registerDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();


}
@Test

      public void toVeryVouchers(){
        homePage.clickOnvouchers();

      }
    }
