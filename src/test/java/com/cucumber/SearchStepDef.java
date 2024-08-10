package com.cucumber;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.cucumber.commonBase.Base;
import com.cucumber.pages.SearchPage;
import com.cucumber.commonServices.ScreenshotServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.cucumber.pages.HomePage;

import com.cucumber.commonValidation.ComValidation;
import org.testng.Assert;

public class SearchStepDef extends Base {

    WebDriver driver;
    HomePage home;
    SearchPage search;
    SearchPage login;
    ScreenshotServices services;
    //ScreenshotService screenshot = new ScreenshotService();

    public SearchStepDef() {
        driver = Hooks.driver;
        home = new HomePage();
        search = new SearchPage();
        services = new ScreenshotServices();


    }

    @When("I login with the website")
    public void iLoginWithTheWebsite() {
        try {
            home.openWebsite();
            //home.clickAccount();
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            //scenario.attach(ScreenshotService.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        }

    }

    @Then("I should see dashboard")
    public void iShouldSeeDashboard() {

        try {
            System.out.println("Dashboard");
            //home.clickAccount();
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            scenario.attach(services.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        }
    }

    @And("Attach Screenshot")
    public void attachScreenshot() {
        try {
            //screenshot.takeScreenshots();
            //scenario.attach(ScreenshotService.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            scenario.attach(services.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        }
    }

    @Then("I should see Results")
    public void iShouldSeeResults() {

        try
        {
            String actualValue = search.getText();

            Assert.assertEquals(actualValue,"`sealed With A Kiss `java Lip Chocolates With Single Rose" );


        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            scenario.attach(services.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        }
    }

    @When("I enter text to Search and click on Search button")
    public void iEnterTextToSearchAndClickOnSearchButton() {
        try {
            search.enterValidText();

            search.clickSearch();

        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());

        }
    }

    @When("I enter invalid text to Search and click on Search button")
    public void iEnterInvalidTextToSearchAndClickOnSearchButton() {
        try {
            search.enterInValidText();

            search.clickSearch();

        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());

        }
    }

    @Then("I should not see Results")
    public void iShouldNotSeeResults() {
        try {
            int i = search.getInvalidText();
            Assert.assertEquals(i,0 );
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());

        }
    }

    @When("I click on Next")
    public void iClickOnNext() {
        try {
            search.clickNext();
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
        }
    }

    @Then("I should see Results on Second Page")
    public void iShouldSeeResultsOnSecondPage() {
        try {

            String actualValue = search.getTextOnPage2();
            Assert.assertEquals(actualValue, "Java Love Filled Chocolate Box" );
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());

        }
    }



}
