package com.cucumber.pages;

import com.cucumber.commonBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends Base {
    public void enterEmail()
    {
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("abc@gmail.com");
    }

    public void clickYourAccount() throws InterruptedException {
//change this line to get error
        driver.findElement(By.xpath("//a[normalize-space()='Your Account']")).click();

    }

    public void selectDropdownByValue() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("(//select)[1]")));
        dropdown.selectByValue("2");

    }

    public void selectDropdownByText() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("(//select)[1]")));
        dropdown.selectByVisibleText("English");

    }

    public String getTextOfTab() throws InterruptedException {
        //Thread.sleep(10000);
        return driver.findElement(By.xpath("//a[normalize-space()='Catalogs']")).getText();
    }
}
