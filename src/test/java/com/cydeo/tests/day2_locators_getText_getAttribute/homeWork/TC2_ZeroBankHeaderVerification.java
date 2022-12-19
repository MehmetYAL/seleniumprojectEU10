package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_ZeroBankHeaderVerification {
    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify header text


        WebElement actualHeader= driver.findElement(By.tagName("h3"));

        //Expected: “Log in to ZeroBank”
        String expectedHeader="Log in to ZeroBank";
        String actualHeaderText= actualHeader.getText();
        if (expectedHeader.equals(actualHeaderText)){
            System.out.println("Header verification PASSED");
        }else
        System.out.println("Header verification FAILED");
    }
}
