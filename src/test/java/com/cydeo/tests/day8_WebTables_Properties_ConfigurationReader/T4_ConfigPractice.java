package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_ConfigPractice {

   /* WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //We are getting the browserTypedynmaclly from our configuration.properties file
        String browserType = ConfigurationReader.getProperty("browser");
        driver=WebDriverFactory.getDriver(browserType);

       // driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }*/



    @Test
    public void google_search_test(){

     Driver.getDriver().get("https://www.google.com");

      //  3- Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("apple", Keys.ENTER);
        //  4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle="apple - Google Search";
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
/*
TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search
Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
 */