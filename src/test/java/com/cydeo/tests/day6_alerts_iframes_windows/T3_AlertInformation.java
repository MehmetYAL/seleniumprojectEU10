package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_AlertInformation {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertInformation(){
        //3. Click to “Click for JS Prompt” button
        WebElement clickJSPROMPT = driver.findElement(By.xpath("//button[contains(@contains,jsPrompt)]"));
        clickJSPROMPT.click();
        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //alert.sendKeys("Hello");


        //5. Click to OK button from the alert
        //6. Verify “You entered: hello” text is displayed
        /////send text will be searching
    }
}
