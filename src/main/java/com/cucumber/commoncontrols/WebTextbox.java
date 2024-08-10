package com.cucumber.commoncontrols;

import com.cucumber.commonBase.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebTextbox extends Base {

    /**
     * Send text to web input.
     *
     * @param textToEnter the text to enter
     */
    public void sendTextToWebInput(WebDriver driver, By by, String textToEnter)
    {
        driver.findElement(by).sendKeys(textToEnter);
    }

    /**
     * clear text from web input.
     *
     * @param by the element
     */
    public void clearTextBox(WebDriver driver,By by)
    {
        driver.findElement(by).clear();
    }

    /**
     * get default web input
     *
     * @param by the element
*/
    /** taking default value of web element attribute value by passing string as parameter title, value etc. */
    public String getTextBoxValue(WebDriver driver,By by,String value) {
        return driver.findElement(by).getAttribute(value);
    }

    /** Keys control Keys chord(a) */
    public void sendTextToKeyBoardInput(WebDriver driver,By by, Keys keys,String keysPress)
    {
        driver.findElement(by).sendKeys(keys,keysPress);
    }

    /**  Keys Backspace */
    public void sendTextToKeyBoardBackSpace(WebDriver driver,By by, Keys keys)
    {
        driver.findElement(by).sendKeys(keys);
    }

    /** This function we use for sending value in tabs*/
    public void sendTextToKeysTabs(WebDriver driver,By by, Keys keys)
    {
        driver.findElement(by).sendKeys(keys);
    }

    /** This function will  AttributeValue */
    public void listSendKeys(WebElement element, String value)
    {
        element.sendKeys(value);
    }
}