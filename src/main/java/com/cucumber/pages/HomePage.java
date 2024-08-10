package com.cucumber.pages;


import com.cucumber.commonBase.Base;
import com.cucumber.commoncontrols.MouseOperations;
import com.cucumber.commoncontrols.WebPageElement;
import org.openqa.selenium.By;


public class HomePage extends Base
{

    MouseOperations mouse = new MouseOperations();
private final By yourAccount  = By.xpath("//a[normalize-space()='Your Account']");
private final By catalog = By.xpath("//a[text()='Catalogs']");


    private final By brands = By.xpath("//a[text()='Brands']");
    private final By about = By.xpath("//a[normalize-space()='About Kapruka']");
    private final By contact = By.xpath("//a[@href='https://www.kapruka.com/contactUs/officeLocations.jsp'][normalize-space()='Contact Us']");
WebPageElement webPageElement = new WebPageElement();
    public void openWebsite(){

        driver.get("https://www.kapruka.com/online/chocolates");
    }

    public void clickAccount() {

        mouse.singleClick(driver, yourAccount); //using Selenium click button method
    }

    public void insertUsername()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Your Account']")).click(); //using Selenium click button method
    }

    public String getTextCatalogs()
    {
        return webPageElement.getTextFromElement(driver, catalog);

    }
    public String getTextBrands()
    {
        return webPageElement.getTextFromElement(driver, brands);

    }
    public String getAbout()
    {
        return webPageElement.getTextFromElement(driver, about);

    }
    public String getContactUs()
    {
        return webPageElement.getTextFromElement(driver, contact);

    }
}
