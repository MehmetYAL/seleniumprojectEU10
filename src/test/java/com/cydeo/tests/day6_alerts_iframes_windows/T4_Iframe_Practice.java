package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("https://practice.cydeo.com/iframe");



    }
    //@Ignore if we want the method do not run than we can use/add @Ignore before @Test
    @Test
    public void iframeTest(){
//        4. Assert: “Your content goes here.” Text is displayed.

        //Locate the p tag
        //when the elemeny we looking for is in the IFRAME it will give nosuchelement
        //exception so we have use driver switch to IFRAME to find in iframe
        //option#1- switchTo().frame("mce_0_ifr");
        driver.switchTo().frame("mce_0_ifr");
        //option#2 passing index number of Iframe
        //driver.switchTo().frame(0);
        //option#3 locate as web element and pass in frame() method
        //driver.switchTo().frame(By.ByXPath("//iframe[@id='mce_0_ifr']");
        WebElement textelement = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(textelement.isDisplayed());

//        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //for this we must back to main HTML
        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

//driver.close();
//3:13.........................
    }
}
