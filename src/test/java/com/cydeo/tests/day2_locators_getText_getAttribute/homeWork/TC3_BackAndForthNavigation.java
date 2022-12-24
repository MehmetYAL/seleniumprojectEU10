package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_BackAndForthNavigation {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Click to Gmail from top right.
        WebElement clickGmail= driver.findElement(By.linkText("Gmail"));
        clickGmail.click();
        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitles="Gmail";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedTitles)){
            System.out.println("Expected title verification Passed");
        }else {
            System.out.println("Expected title verification Passed");
        }


        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        String expectedTitlesBackGoogle="Google";
        String actualtTitleGoogle=driver.getTitle();
        if (expectedTitlesBackGoogle.equals(actualtTitleGoogle)){
            System.out.println("Expected Title of gogle verification Passed");
        }else {System.out.println("Expected Title of gogle verification FAILED");}
    }
}
