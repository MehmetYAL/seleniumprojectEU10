package com.cydeo.tests.day5_testNG_Dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDown {

    WebDriver driver;
    @BeforeMethod
    public void setupmethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDownTest(){
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentSelectedOption=simpleDropdown.getFirstSelectedOption();
        String expectedTextDropDown="Please select an option";
        String actualTextDropDown=currentSelectedOption.getText();
        //System.out.println(actualTextDropDown);        /
        // /Expected: “Please select an option”
        Assert.assertEquals(actualTextDropDown,expectedTextDropDown);
        //4. Verify “State selection” default selected value is correct
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Expected: “Select a State”
        String expextedStateDropdownText="Select a State";
        WebElement stateDropdownText= stateDropdown.getFirstSelectedOption();
        String actualstateDropDowntext=stateDropdownText.getText();
        //System.out.println(actualstateDropDowntext);
        Assert.assertEquals(expextedStateDropdownText,actualstateDropDowntext);
    }
}
