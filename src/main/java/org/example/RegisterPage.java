package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{

    private By _gender=By.id("gender-male");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _firstName=By.id("FirstName");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _lastName=By.id( "LastName" );
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _date=By.name( "DateOfBirthDay" );
    //Making the private variable and storing the command of selenium to get Locator by "name"

    private By _month=By.name("DateOfBirthMonth");
    //Making the private variable and storing the command of selenium to get Locator by "name"

    private By _year=By.name("DateOfBirthYear");
    //Making the private variable and storing the command of selenium to get Locator by "name"

    private By _eMail=By.id("Email");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _companyName=By.id("Company");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _password=By.id("Password");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _confirmPassword=By.id("ConfirmPassword");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _registerButton=By.id("register-button");
    //Making the private variable and storing the command of selenium to get Locator by "id"
    public void registerDetails()
    {
        //Method to calling all useful functions from "Utils" class
        clickOnElement(_gender);
        //click function to click on locator
        sendText(_firstName,LoadPro.getProperty("FirstName"));


        //sentText function to write on website

        sendText(_lastName, LoadPro.getProperty("LastName"));
        //sentText function to write on website

        selectFromDropDownByIndex(_date,7);
        //select function to select the "date" "locator" from dropdown with help of Index

        selectFromDropDownByValue(_month,"12");
        //select function to select the "month" "locator" from dropdown with help of Value

        selectFromDropDownByValue(_year,"1985");
        //select function to select the "year" "locator" from dropdown with help of Value

        sendText(_eMail,"mast1"+getTimeStamp()+"@gmail.com");
        //sentText function to write on website

        sendText(_companyName,"Mdex");
        //sentText function to write on website

        sendText(_password,"mm1245");
        //sentText function to write on website

        sendText(_confirmPassword,"mm1245");
        //sentText function to write on website

        clickOnElement(_registerButton);
        //click function to click on locator

    }

}
