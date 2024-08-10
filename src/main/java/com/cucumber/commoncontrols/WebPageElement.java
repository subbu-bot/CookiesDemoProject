package com.cucumber.commoncontrols;

import com.cucumber.commonBase.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class WebPageElement extends Base {

    /**This function will return web element size.*/
    public int webElementsSize(WebDriver driver, By by) {
        int size =0;
        try {
            size =driver.findElements(by).size();
        }catch(Exception e) {
            System.out.println("Web element size is not working");
            e.printStackTrace();
        }
        return size;
    }

    /**This function will get list of web element is displayed or not.*/
    public void getListWebElementDisplayed(WebDriver driver, WebElement element) {
        try {
            element.isDisplayed();
        }catch(Exception e) {
            System.out.println("Get list of web element is not displayed");
            e.printStackTrace();
        }
    }

    /**
     * Element is Selected Or Not.
     *
     * @param by the element
     */
    public boolean webElementIsSelected(WebDriver driver,By by) {
        return driver.findElement(by).isSelected();
    }

    /**
     * Element is Enabled Or Not.
     *
     * @param by the element
     */
    public boolean webElementIsEnabled(WebDriver driver,By by) {
        return driver.findElement(by).isEnabled();
    }

    /**
     * Element is Displayed Or Not.
     *
     * @param by the element
     */
    public boolean WebElementIsDisplayed(WebDriver driver, By by) {
        return driver.findElement(by).isDisplayed();
    }

    public boolean isWebElementDisplayed(WebDriver driver, By by) {

        boolean isDisplayed = driver.findElements(by).size() > 0;

//        if(isDisplayed){
//            softAssert.assertTrue(true, "Element is displayed");
//            return true;
//        }else{
//            softAssert.fail("Element is not displayed");
//            return false;
//        }
        return isDisplayed;
    }

    /**
     * get web toast message
     *
     * @param by the element
     *
     */
    /** This function use for getting text from WebElement */
    public String getTextFromElement(WebDriver driver, By by) {
        String text = null;
        try {
            text = driver.findElement(by).getText();
        }catch(Exception e) {
            System.out.println("Not Getting Text From WebElement");
            e.printStackTrace();
        }
        return text;
    }

    /** This function use for getting text from WebElement */
    public String getTextFromElement(WebDriver driver, WebElement element) {
        String text = null;
        try {
            text = element.getText();
        }catch(Exception e) {
            System.out.println("Not Getting Text From WebElement");
            e.printStackTrace();
        }
        return text;
    }

    /** This function will verify Attribute Value Is Empty Or Not */
    public boolean getAttributeValueIsEmpty(WebDriver driver, By by,String value){
        boolean isEmpty=false;
        try {
            isEmpty=driver.findElement(by).getAttribute(value).isEmpty();
        }catch(Exception e) {
            System.out.println("Not Getting Empty Atribute Value");
            e.printStackTrace();
            return false;
        }
        return isEmpty;
    }

    /** this method return list of size created by Pratap Goraniya for Project Information page*/
    public int listOfWebElementSize(WebDriver driver,By by) {
        int maxSize=0;
        try {
            List<WebElement> size =  driver.findElements(by);
            maxSize = size.size();
        }catch(Exception e) {
            System.out.println("List of web element size is not working");
            e.printStackTrace();
        }
        return maxSize;
    }

    /** this method return list of web element created by Pratap Goraniya for Project Information page*/
    public List<WebElement> listOfWebElement(WebDriver driver,By by) {
        List<WebElement> listOfWebElement = null;
        try {
            listOfWebElement  =driver.findElements(by);
        }catch(Exception e) {
            System.out.println("Not Getting List Of WebElement");
            e.printStackTrace();
        }
        return listOfWebElement;
    }

    /** This function will  get attribute value of element*/
    public String getAttributeValue(WebDriver driver,By by) {
        String defaultValue = null;
        try {
            defaultValue =driver.findElement(by).getAttribute("value");
        }catch(Exception e) {
            System.out.println("Not Getting WebElement Attribute value");
            e.printStackTrace();
        }
        return defaultValue;
    }

    /** This function will verify Attribute Value Is Blank Or Not */
    public boolean getAttributeValueIsBlank(WebDriver driver, By by,String value){
        boolean isBlank=false;
        try {
            isBlank=driver.findElement(by).getAttribute(value).isBlank();
        }catch(Exception e) {
            System.out.println("Not Getting Blank Atribute Value");
            e.printStackTrace();
            return false;
        }
        return isBlank;
    }

    /** This function will verify Attribute Value Is Blank Or Not */
    public String getListWebToastMessage(WebDriver driver, WebElement element)
    {
        String text = null;
        try {
            text =element.getText();
        }catch(Exception e) {
            System.out.println("Not Getting list of Web Tost Message");
            e.printStackTrace();
        }
        return text;
    }

    /** This function will get DomProperty value */
    public String getDomProperty(WebDriver driver,By by) {
        String defaultValue = null;
        try {
            defaultValue =driver.findElement(by).getDomProperty("value");
        }catch(Exception e) {
            System.out.println("Not Getting DomProperty Value");
            e.printStackTrace();
        }
        return defaultValue;
    }

    /** This function will get DomProperty value */
    public String getDomTheProperty(WebDriver driver,By by, String propertyName) {
        String defaultValue = null;
        try {
            defaultValue =driver.findElement(by).getDomProperty(propertyName);
        }catch(Exception e) {
            System.out.println("Not Getting DomProperty Value");
            e.printStackTrace();
        }
        return defaultValue;
    }

    /** This function will get DomProperty value */
    public String getCSSSelector(WebDriver driver,By by) {
        String defaultvalue = null;
        try {
            defaultvalue =driver.findElement(by).getCssValue("value");
        }catch(Exception e) {
            System.out.println("Not Getting CSSSelector Value");
            e.printStackTrace();
        }
        return defaultvalue;
    }

    /** This function will  get attribute value of element_Kunal*/
    public String getAttributeTitle(WebDriver driver,By by) {
        String defaultvalue = null;
        try {
            defaultvalue =driver.findElement(by).getAttribute("title");
        }catch(Exception e) {
            System.out.println("Not Getting WebElement Attribute title");
            e.printStackTrace();
        }
        return defaultvalue;
    }

    /** This function will get water mark of WebElement-Amir*/
    public String getWaterMarkText(WebDriver driver,By by) {
        String defaultWaterMarkValue = null;
        try {
            defaultWaterMarkValue =driver.findElement(by).getAttribute("placeholder");
        }catch(Exception e) {
            System.out.println("Not Getting watermark attribute placeholder");
            e.printStackTrace();
        }
        return defaultWaterMarkValue;
    }

    /** This function will get TagName of WebElement-Amir*/
    public String getTagName(WebDriver driver,By by) {
        String defaultTagName = null;
        try {
            defaultTagName =driver.findElement(by).getTagName();
        }catch(Exception e) {
            System.out.println("Not Getting Default TagName Of WebElement");
            e.printStackTrace();
        }
        return defaultTagName;
    }

    /** This function will compare actual and expected result-Amir*/
    public String assertEqualResult(WebDriver driver,By by,String expected,String assertMessage) {
        String defaultName = null;
        String expectedResult=expected.trim();
        String actualResult = driver.findElement(by).getText().trim();
        softAssert.assertEquals(actualResult, expectedResult,assertMessage);
        softAssert.assertAll();
        return defaultName;
    }

    /** This function will  watermark of WebElement-akshay*/
    public String verifyWatermark(WebDriver driver,By by,String expected,String assertMessage) {
        String defaultName = null;
        String expectedResult=expected;
        String actualResult = driver.findElement(by).getAttribute("placeholder");
        softAssert.assertEquals(actualResult, expectedResult,assertMessage);
        softAssert.assertAll();
        return defaultName;
    }
    /** This function will verify disabled Attribute Value Is Blank Or Not */
    public static boolean getAttributeDisabledValueIsBlank(WebDriver driver, By by,String value){
        String stringValue=null;
        boolean isEmpty=false;
        try {
            stringValue=driver.findElement(by).getAttribute(value);
            System.out.print(stringValue);
            if(stringValue==null)
            {
                isEmpty= true;
            }
            else
            {
                isEmpty= false;
            }

        }catch(Exception e) {
            System.out.println("Not Getting Blank Atribute Value");
            e.printStackTrace();
            return false;
        }
        return isEmpty;
    }

    /** This function will verify TextBox Default Value of WebElement-Mukesh*/
    public String verifyDefaultValue(WebDriver driver,By by,String expected,String assertMessage) {
        String defaultValue = null;
        String expectedResult=expected;
        String actualResult = driver.findElement(by).getAttribute("value");
        softAssert.assertEquals(actualResult, expectedResult,assertMessage);
        softAssert.assertAll();
        return defaultValue;
    }


}
