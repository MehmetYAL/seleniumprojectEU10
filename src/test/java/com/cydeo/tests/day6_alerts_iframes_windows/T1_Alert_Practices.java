package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void alertPracticeTest(){
        driver.get("http://practice.cydeo.com/javascript_alerts");

        WebElement alertButton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alertButton.click();
        //3. Click to “Click for JS Alert” button

        //4. Click to OK button from the alert
        //to be able to click to Alert OK button we need to switch driver to Alert itself
        Alert alert=driver.switchTo().alert();
        alert.accept();


        //5. Verify “You successfully clicked an alert” text is displayed
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText="You successfully clicked an alert";
        String actualText= resultText.getText();
        Assert.assertTrue(actualText.equals(expectedText));
        //Assert.assertTrue(resultText.isDisplayed()," result text is not displyaed");
        Assert.assertEquals(actualText,expectedText," result text is not displayed");
    }

    @AfterMethod
    public void thearDown(){
        driver.close();
    }
}
