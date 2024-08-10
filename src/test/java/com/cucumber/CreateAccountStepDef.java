package com.cucumber;

import com.cucumber.commonServices.ScreenshotServices;
import com.cucumber.pages.CreateAccountPage;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CreateAccountStepDef {

    WebDriver driver;
    HomePage home;
    SearchPage search;
    SearchPage login;
    ScreenshotServices services;
    CreateAccountPage createAccount;

    public CreateAccountStepDef()
    {
        driver = Hooks.driver;
        home = new HomePage();
        search = new SearchPage();
        services = new ScreenshotServices();
        createAccount = new CreateAccountPage();


    }
    @When("I click on Create Account")
    public void iClickOnCreateAccount() throws InterruptedException {
        createAccount.clickCreateAccount();
    }

    @Then("enter details in required fields")
    public void enterDetailsInRequiredFields() throws InterruptedException {
        createAccount.enterFirstName();
        createAccount.enterLastName();
        createAccount.enterEmailAddress();
        createAccount.enterPassword();
        createAccount.enterConfirmPassword();
        Thread.sleep(10000);
    }
}
