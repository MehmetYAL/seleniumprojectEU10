package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_ConfirmationAlert {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
            }

            @Test
    public void alertConfirmation(){

        //3. Click to “Click for JS Confirm” button
           WebElement clickJSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
           clickJSConfirm.click();
                //4. Click to OK button from the alert
                Alert alert = driver.switchTo().alert();
                alert.accept();
                // 5. Verify “You clicked: Ok” text is displayed.
                WebElement alertClickedTest = driver.findElement(By.cssSelector("p[id='result']"));
                String actualText=alertClickedTest.getText();
                String expectedText="You clicked: Ok";

                Assert.assertEquals(actualText,expectedText, "test didint passed");
driver.close();

            }
}
