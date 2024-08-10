package com.cucumber;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.cucumber.commonBase.Base;

import com.cucumber.commonValidation.ComValidation;
import com.cucumber.pages.UploadFile;
import com.cucumber.commonServices.ScreenshotServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class UploadStepDef extends Base {
    WebDriver driver;
    UploadFile uploadFile;
    ScreenshotServices services;



    public UploadStepDef() {
        driver = Hooks.driver;
        uploadFile = new UploadFile();
        services = new ScreenshotServices();



    }

    @When("I launch uploadfile website")
    public void iLaunchUploadFileWebsite() {
        try {
            uploadFile.launchWebsite();
            Thread.sleep(10000);
            uploadFile.takescreenshot();

        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            scenario.attach(services.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        }
    }

    @Then("I should see uploadfile option and click on Radio Option")
    public void iShouldSeeUploadfileOptionAndClickOnRadioOption()
    {
        try {
            uploadFile.clickRadioOptionImage();
            uploadFile.clickChooseFile();


        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            scenario.attach(services.getScreenshot(), ComValidation.IMAGEPNG,scenario.getName());
        }
    }


    @Then("I should see and click frame")
    public void iShouldSeeAndClickFrame()
    {
        uploadFile.switchToFrame();
        uploadFile.selectOptionInSameFrame();
        uploadFile.selectOptionInDifferentFrame();

    }
}