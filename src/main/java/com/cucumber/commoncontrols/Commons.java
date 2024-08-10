package com.cucumber.commoncontrols;


import com.cucumber.commonBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Commons extends Base {

    public void clickOnButton(WebDriver driver, By by){
        driver.findElement(by).click();
    }
    public void enterTextInTextBox(WebDriver driver, By by, String value){
        driver.findElement(by).sendKeys(value);
    }
}
