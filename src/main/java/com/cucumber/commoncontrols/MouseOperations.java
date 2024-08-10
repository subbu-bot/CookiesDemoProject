package com.cucumber.commoncontrols;


import com.cucumber.commonBase.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOperations extends Base {
    Actions actions = new Actions(driver);

    /** This function will hover Mouse On WebElement*/
    public void hoverMouseOnWebElement(WebDriver driver, By by) {
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /**This function will double click on WebElement*/
    public void doubleClickOnWebElement(WebDriver driver,  By by) {
        actions.doubleClick(driver.findElement(by)).build().perform();
    }

    /**this function will right click on WebElement */
    public void rightClickOnWebElement(WebDriver driver,  By by) {
        actions.contextClick(driver.findElement(by)).build().perform();
    }

    /** This function will multiple click on WebElement*/
    public void multipleActions(WebDriver driver, By by, Keys key1, Keys key2, Keys key3, Keys key4, Keys key5 ){
        actions.click(driver.findElement(by)).sendKeys(key1).keyDown(key2).sendKeys(key3).keyUp(key4).sendKeys(key5).perform();
    }

    /** this method used for action class and it move to mouse curser on web element and click on that web element*/
    public void curserMoveToOnWebElement(WebDriver driver, By by) {
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    /**This function use for Click Event */
    public void singleClick(WebDriver driver,By by) {
        driver.findElement(by).click();
    }


    /**This function use for click on escape*/
    public void escapeOnWebElement() {
        actions.sendKeys(Keys.ESCAPE).build().perform();
    }
}
