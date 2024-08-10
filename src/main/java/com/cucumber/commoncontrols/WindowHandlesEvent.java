package com.cucumber.commoncontrols;


import com.cucumber.commonBase.Base;
import org.openqa.selenium.WebDriver;


public class WindowHandlesEvent extends Base {

    // change to new tab and navigate back to original window
    /** This function will use change to new tab and navigate back to original window */
    public void tabChange(WebDriver driver) {
        String originalHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    driver.close();
            }
        }
        driver.switchTo().window(originalHandle);
    }

    //Switch To Another Frame
    /** This function will use Switch To Another Frame*/
    public void switchFrame(WebDriver driver) {
        try {
            driver.switchTo().frame(0);
        }catch(Exception e) {
            System.out.println("Not Switching on Another Frame");
            e.printStackTrace();
        }
    }
}
