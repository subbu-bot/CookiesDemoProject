package com.cucumber.commoncontrols;


import com.cucumber.commonBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebButton extends Base {
    /**
     * Web button click.
     *
     * @param driver the driver
     *
     * @param by the element
     */

    /** This function use To Click on webButton */
    /** Click Method by using JAVA Generics (You can use both By or Web element) */
    public <T> void click(WebDriver driver, T elementOrBy) {
        try{
            if (elementOrBy.getClass().getName().contains("By")) {
                driver.findElement((By) elementOrBy).click();
            } else {
                ((WebElement) elementOrBy).click();
            }
        }catch(Exception e){
            System.out.println("Element is not clickable");
        }
    }
}
