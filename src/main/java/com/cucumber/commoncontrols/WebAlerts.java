package com.cucumber.commoncontrols;


import com.cucumber.commonBase.Base;
import org.openqa.selenium.WebDriver;


public class WebAlerts extends Base {

    /** This function use To Get Text from alert   */
    public String alertGetText(WebDriver driver) {
        return driver.switchTo().alert().getText();
    }

    /** This function use To accept alert*/
    public void alertAccept(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    /** This function use To dismiss alert*/
    public static void alertDismiss(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }
}
