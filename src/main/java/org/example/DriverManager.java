package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverManager extends Utils{

    public static final String USERNAME = LoadPro.getProperty("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = LoadPro.getProperty("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    String browserName = LoadPro.getProperty("browser");
    //    String browserName = System.getProperty("browser");
    boolean runIncloud = Boolean.parseBoolean(LoadPro.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();


    public void openBrowser(){

        if (runIncloud) {
            System.out.println("Running in the cloud");
            //connect to cloud
            if (browserName.equalsIgnoreCase("Edge")) {
                ///connect with browserstack
                capabilities.setCapability("browserName", "Edge");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);

            } else if (browserName.equalsIgnoreCase("Firefox")) {
                ///connect with browserstack
                capabilities.setCapability("browserName", "firefox");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);
            } else {
                System.out.println("Your browser name is wrong or missing implementation:" + browserName);
            }
            try {
                driver = new RemoteWebDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

        } else {
            //run in locally
        }
        WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      driver.manage().window().maximize();

      driver.get(LoadPro.getProperty("url"));
    }

   // public void closeBrowser(){
      //  driver.quit();
    //}

}
