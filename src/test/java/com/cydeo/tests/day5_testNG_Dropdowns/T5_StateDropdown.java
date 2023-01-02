package com.cydeo.tests.day5_testNG_Dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class T5_StateDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void selectState() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //3. Select Illinois
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(3000);
        stateDropdown.selectByVisibleText("Illinois");
        //4. Select Virginia
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");
        //stateDropdown.selectByValue("VA");
        //5. Select California
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("California");
        String expectedSelectedOption="California";
        String actualSelectOption=stateDropdown.getFirstSelectedOption().getText();

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
        Assert.assertEquals(expectedSelectedOption,actualSelectOption);
        driver.close();

    }
}
