package com.cucumber.pages;

import com.cucumber.commonBase.Base;
import com.cucumber.commoncontrols.MouseOperations;
import com.cucumber.commoncontrols.WebTextbox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends Base

{
    MouseOperations mouse = new MouseOperations();
    WebTextbox textbox = new WebTextbox();
    private final By createAccount =By.xpath("//button[text()='Create Account']");
    private final By firstName = By.xpath("//input[@name='firstName']");
    private final By lastName = By.xpath("//input[@name='lastName']");
    private final By emailAddress = By.xpath("//input[@name='email']");
    private final By password = By.xpath("//input[@name='password']");
    private final By confirmPassword = By.xpath("//input[@name='passwordReConfirm']");



    public void clickCreateAccount() throws InterruptedException {

        mouse.singleClick(driver, createAccount); //using Selenium click button method


    }
    public void enterFirstName()  {

        textbox.sendTextToWebInput(driver, firstName , "testRDFirstName");

    }
    public void enterLastName() throws InterruptedException {

        textbox.sendTextToWebInput(driver, lastName , "testRDFirstName"); //using Selenium click button method

    }
    public void enterEmailAddress() throws InterruptedException {

        textbox.sendTextToWebInput(driver, emailAddress, "testRDEmailAddress@gmail.com"); //using Selenium click button method

    }
    public void enterPassword() throws InterruptedException {

        textbox.sendTextToWebInput(driver, password, "testRDPassword"); //using Selenium click button method

    }
    public void enterConfirmPassword() throws InterruptedException {

        textbox.sendTextToWebInput(driver, confirmPassword, "testRDPassword"); //using Selenium click button method

    }
}
