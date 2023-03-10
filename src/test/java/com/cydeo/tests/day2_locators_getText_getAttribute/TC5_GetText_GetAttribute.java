package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_GetText_GetAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        //3- Verify header text is as expected:

        WebElement headerText= driver.findElement(By.tagName("h2"));
        //Expected: Registration form
        String expectedHeaderText= "Registration form";
        String actualHeaderText=headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verificitaion Passed");
        }else {
            System.out.println("Header text verificitaion Failed");
        }
        //4- Locate “firstname” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value
        //WebElement firstnameInput= driver.findElement(By.name("firstname"));
        WebElement firstNameInput = driver.findElement(By.className("form-control"));


        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
        String expectedPlaceHolder="first name";
        String actualPlaceHolder= firstNameInput.getAttribute("placeholder");
        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED");
        }else {
            System.out.println("Placeholder text verification PASSED");
        }
        driver.close();
    }
}
