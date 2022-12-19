package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_CydeoPracticeToolVerifications {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        //make a stup
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");// or can use also driver.navigate().to("cydeo");

        //3. Verify URL contains
        //Expected: cydeo
         String expectedURL="cydeo";
         String actualURL=driver.getCurrentUrl();
         if (actualURL.contains(expectedURL)){
             System.out.println(" Actual URl is contains s expected URL");
         }else {
             System.out.println("Actual URL is not contains expected URL");
         }

        //4. Verify title:
        // Expected: Practic

        String expectedTitle="Practice";
         String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println(" Expected title is PASSED");
        }else {System.out.println("Expected title is FAILED");}

        driver.close();
    }
}
