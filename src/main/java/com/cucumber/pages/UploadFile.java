package com.cucumber.pages;

import com.cucumber.commonBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UploadFile extends Base {


    WebElement frame = driver.findElement(By.xpath("//frame[@name='left']"));

    WebElement chooseFile = driver.findElement(By.xpath("//input[@id='fileinput']//parent::div"));

    public void clickChooseFile() throws InterruptedException {
        //WebElement chooseFile = driver.findElement(By.xpath("//input[@id='fileinput']"));
        Thread.sleep(10000);
        chooseFile.click();
        chooseFile.sendKeys("D:/Book1.xlsx");


    }
    public void launchWebsite(){

        //driver.get("https://testpages.eviltester.com/styled/file-upload-test.html");

        //driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

        driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
    }

    public void clickRadioOptionImage()
    {
        driver.findElement(By.id("itsanimage")).click();
    }
    public void clickSubmitButton()
    {
        driver.findElement(By.name("upload"));
    }
    public void takescreenshot() throws IOException {
        WebElement element = driver.findElement(By.name("upload"));
        File elementScreenshot = element.getScreenshotAs(OutputType.FILE);
        String elementScreenshotPath = "D:/element_screenshot.png";
        Files.copy(elementScreenshot.toPath(), Paths.get(elementScreenshotPath));
    }

    public void clickAlertBox()
    {
        driver.findElement(By.id("alertexamples")).click();
    }
    public void switchToFrame()
    {

        driver.switchTo().frame(frame);


    }

    public void selectOptionInSameFrame()
    {
        String text = driver.findElement(By.id("left22")).getText();
        System.out.println(text);

    }
    public void selectOptionInDifferentFrame()
    {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath("//frame[@name='right']"));
        driver.switchTo().frame(frame);
        String text1 = driver.findElement(By.id("right0")).getText();
        System.out.println(text1);

    }
}
