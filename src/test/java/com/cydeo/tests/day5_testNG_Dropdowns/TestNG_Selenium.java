package com.cydeo.tests.day5_testNG_Dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;// when we write over all the WebDriver han is going to be common for rest

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
            public void tearDownn(){
        driver.close();
    }


@Test
    public void selenium_test(){
        //Do browser driver setup
        //Open browser
        driver= WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // //Get "https://google.com"
                driver.get("https://google.com");
      //Assert: title is "Google"
   // Assert.assertEquals(driver.getTitle(),"Google");

    String expected="Googlee";
    String actualTitle= driver.getTitle();
    Assert.assertEquals(expected,actualTitle," title is not matching");
// after two condition if we write failure message. when test passes message dotn display if test failde than message will display

    }
}
