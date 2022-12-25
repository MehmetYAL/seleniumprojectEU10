package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_locators_getText_getAttribute {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //tagName[attribute='value']
        //input[class='login-btn']

        // using for cssSelector different attribute below
       // WebElement signInButton= driver.findElement(By.className("login-btn"));
       // WebElement signInButton= driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement signInButton= driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton= driver.findElement(By.cssSelector("input[value='Log In']"));
        String expectedButtonText="Log In";
        //getting the value of the attribute Log in button
        String actualButtonText=signInButton.getAttribute("value");
        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log in button text verification passed");
        }else{System.out.println("Log in button text verification failed");}

        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
