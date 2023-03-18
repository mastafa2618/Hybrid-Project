package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void openBrowser(){
        driverManager.openBrowser();
    }

   // @AfterMethod
   // public void teardown(ITestResult result) {
        //If statement is use for to Capture ScreenShot when any class fail
       // if (!result.isSuccess()) {
          //  captureScreenshot(result.getName());
        //}
        // to close the browser
      //  driver.quit();

  //  }
}
