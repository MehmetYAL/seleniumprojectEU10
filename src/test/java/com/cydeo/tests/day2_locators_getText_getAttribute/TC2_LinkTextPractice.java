package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_LinkTextPractice {
    public static void main(String[] args) {


        //TC #2: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");
        //3- Click to A/B Testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement ABTestLink=driver.findElement(By.linkText("A/B Testing"));
        ABTestLink.click();
        //4- Verify title is:
        //Expected: No A/B Test

        String expected="No A/B Test";
        String actual= driver.getTitle();
        if (actual.equals(expected)){
            System.out.println("Title verification PASS");
        }else {
            System.out.println("Title verification FAILED!!!");
        }
        //5- Go back to home page by using the .back();

        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Practice
        String expectedTitle1="Practice";
        actual= driver.getTitle();
        if (actual.equals(expectedTitle1)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED!!!");
        }
        driver.close();

    }
}
