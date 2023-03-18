package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Given("I am on register page")
    public void i_am_on_register_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I enter user registration details")
    public void i_enter_user_registration_details() {
        // Write code here that turns the phrase above into concrete actions

    }
    @And("I clock on Register button")
    public void i_clock_on_register_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }


}
