package com.cucumber.pages;

import com.cucumber.commonBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SearchPage extends Base {

    WebDriverWait wait;
    public SearchPage()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(120));

    }

    public void enterSearch()
    {
        driver.findElement(By.xpath("//input[@id='search_bar_id']")).click(); //using Selenium click button method
    }
    public void clickSearch()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("search_btn")));


        WebElement clickSearch = driver.findElement(By.id("search_btn"));


        clickSearch.click();
    }
    public void enterValidText()
    {
        WebElement enterText = driver.findElement(By.xpath("//input[@id='search_bar_id']"));
        enterText.sendKeys("chocolates");
    }
    public void enterInValidText()
    {
        WebElement enterText = driver.findElement(By.xpath("//input[@id='search_bar_id']"));
        enterText.sendKeys("#$%^&");
    }
    public String getText()
    {
        String getChocolateText = driver.findElement(By.xpath("//div[text()='`sealed With A Kiss `java Lip Chocolates With Single Rose']")).getText();
        return getChocolateText;
    }

    public int getInvalidText()
    {
        List<WebElement> text = driver.findElements(By.xpath("//h1//span"));
        return text.size();

    }

    public void clickNext()
    {
        WebElement clickNext = driver.findElement(By.xpath("//a[normalize-space()='2']"));
        clickNext.click();

    }

    public String getTextOnPage2() throws InterruptedException {
        //Thread.sleep(10000);
        String getChocolateTextOnPage2 = driver.findElement(By.xpath("//div[text()='Java Love Filled Chocolate Box']")).getText();
        return getChocolateTextOnPage2;
    }
}
