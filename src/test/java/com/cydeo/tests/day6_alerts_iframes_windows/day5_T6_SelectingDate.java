package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day5_T6_SelectingDate {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
       //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

         driver= WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void selectDateDrowpdown() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
       Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
       Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
       Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));
        //select[@id="days"]/


        //3. Select “December 1st, 1923” and verify it is selected.
        yearDropdown.selectByVisibleText("1924");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);
        //Select year using : visible text
        //Select month using : value attribute
        //Select day using : index number
        //creating expected value
        String expectedYear="1924";
        String expectedMonth="December";
        String expectedDay="1";

        //getting actual value from browser
        String actualYear=yearDropdown.getFirstSelectedOption().getText();
        String actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String actualDay=dayDropdown.getFirstSelectedOption().getText();
        Thread.sleep(5000);
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));
    }
@AfterMethod
    public void tearDown(){
        driver.quit();
}




}
