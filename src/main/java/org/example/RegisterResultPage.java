package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {

    String regMsg = "Your registration completed";

    public void verifyUserRegisteredSuccessfully(){
        // method to check the Url and expected one with the timeout parameter need to be provided the method

        // verifying messages, errors, asserting webelements and many more
        String regMsg = getTextFromElement(By.className("result"));
        Assert.assertEquals(regMsg, regMsg,"Your registration completed");

    }
}
