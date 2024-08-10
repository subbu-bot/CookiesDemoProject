package com.cucumber.commoncontrols;

import com.cucumber.commonBase.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class WebDropdown extends Base {
    /**
     * Select option by visible text.
     *
     * @param by the element
     * @return
     */

    public String selectOptionByVisibleText(WebDriver driver, By by, String optionToSelect) {
        Select option = new Select(driver.findElement(by));
        option.selectByVisibleText(optionToSelect);
        return optionToSelect;
    }

    /**
     * Select option by index.
     *
     * @param by      the element
     * @param indexNo the index no
     */

    public void selectOptionByIndex(WebDriver driver, By by, int indexNo) {
        Select option = new Select(driver.findElement(by));
        option.selectByIndex(indexNo);
    }

    /**
     * Select option by value.
     *
     * @param by    the element
     * @param value the value
     */
    public void selectOptionByValue(WebDriver driver, By by, String value) {
        Select option = new Select(driver.findElement(by));
        option.selectByValue(value);
    }

    /**
     * Get selected option.
     *
     * @param by the element
     */
    public String getCurrentSelectdOption(WebDriver driver, By by) {
        Select option = new Select(driver.findElement(by));
        return option.getFirstSelectedOption().getText().trim();
    }

    /**
     * Get options
     */
    public List<WebElement> getOptions(WebDriver driver, By by) {
        Select option = new Select(driver.findElement(by));
        return option.getOptions();
    }

    /**
     * Get first selected option
     */
    public WebElement firstSelectedOption(WebDriver driver, By by) {
        Select option = new Select(driver.findElement(by));
        return option.getFirstSelectedOption();
    }

    /**
     * For Each Loop Drop Down
     */
    public void listDropDownVisibleText(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByVisibleText(value);
    }


}