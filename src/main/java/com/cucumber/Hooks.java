package com.cucumber;

import com.cucumber.commonBase.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class Hooks extends Base

{
    public static WebDriver driver;
    public static Scenario scenario;

    @Before
    public void setUp(Scenario scenario) throws IOException {
        Hooks.scenario = scenario;
        String browserIs = readPropertiesFile("browser");
        System.out.println("Browser Name: "+browserIs);
        driver = browserLaunch(browserIs);
        driver.manage().window().maximize();


    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir");
        }
        driver.close();
        driver.quit();
    }


}
