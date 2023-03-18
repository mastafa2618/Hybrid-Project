package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registration=By.linkText("Register");
    private By _vouchers =By.xpath("//a[@href=\"/vouchers-coupons/b/?ie=UTF8&node=5522783031&ref_=sv_uk_5\"]");
    public void clickOnRegistration(){
        clickOnElement(_registration);
    }

    public void clickOnvouchers(){clickOnElement(_vouchers);}


}
