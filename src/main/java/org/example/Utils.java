package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage{

    public static void clickOnElement(By by){driver.findElement(by).click();}

    public void typeText(By by, String text){driver.findElement(by).sendKeys(text);}
    public void sendText(By by, String name){driver.findElement(by).sendKeys(name);}
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddss").format(new java.util.Date());
        return timeStamp;   }

    public static void selectFromDropdownByVisibleText(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropDownByValue(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);

    }
    public static void selectFromDropDownByIndex(By by, int num){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }
    public void WaitForElementToBeClickable(By by, int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public void WaitForElementToBeVisible(By by, int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void WaitForUrlTobe(String url,int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void hover(By xpath)
    {
        //Method to hover actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Obj to call an inbuild class(JavascriptExecutor) :- for hovering mouse

        js.executeScript("window.scrollBy(0,370)", "");
    }
    public void captureScreenshot(String screenShortName)
    {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File("src/ScreenShorts"+screenShortName+getTimeStamp()+".jpg");
        //Copy file at destination
        try
        {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
    public void clickOkOnAlert()
    {
        //Method to click on OK Alert
        driver.switchTo().alert().accept();
    }


    public void clickCancelOnAlert()
    {
        //Method to click on Cancel Alert
        driver.switchTo().alert().dismiss();
    }


    String getTextFromAlert()
    {
        //Method to Get text form Alert
        String displayMessage= driver.switchTo().alert().getText();
        System.out.println(displayMessage);
        return displayMessage;
        //Return value

    }

    public boolean isAlertPresent()
    {
        //Method to check if Alert is present or not
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
    }   // isAlertPresent()

    public static void assertCurrentURL(String categoryLink){
        Assert.assertTrue(driver.getCurrentUrl().contains(categoryLink));
    }

    public void hoverAction(By xpath)
    {
        //Method to hover actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Obj to call an inbuild class(JavascriptExecutor) :- for hovering mouse

        js.executeScript("window.scrollBy(0,370)", "");
    }


    public void hoverAction2(By by){
        WebElement ele = driver.findElement(by);

//Creating object of an Actions class
        Actions action = new Actions(driver);

//Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
    }
    public void toVerifyColourByCss(By by)
    {
        //WebElement t = driver.findElement(By.tagName("h1"));
        WebElement t = driver.findElement(by);

        //obtain color in rgba
        String s = t.getCssValue("color");
        // convert rgba to hex
        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + c);

    }
    }