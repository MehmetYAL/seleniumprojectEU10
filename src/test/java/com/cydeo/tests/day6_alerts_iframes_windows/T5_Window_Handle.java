package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Window_Handle {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multipleWindowTest(){

        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make set ups
        //3. Go to : https://practice.cydeo.com/windows
        //4. Assert: Title is “Windows”
        //Storing the main page's window handle as string is good practice for future
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("title before click: "+actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereText= driver.findElement(By.linkText("Click Here"));
        clickHereText.click();

        //6. Switch to new Window.
        for (String each: driver.getWindowHandles()) {
        driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());
        }

        //7. Assert: Title is “New Window”
        actualTitle= driver.getTitle();

        System.out.println("title after click: "+actualTitle);
        //if we want to go back to main page, we can use already stored main handle
        //driver.switchTo().window(mainHandle);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
