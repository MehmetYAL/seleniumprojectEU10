package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_EtsyTitleVerificitaion {
    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        //3. Search for “wooden spoon”
        WebElement searchForWoodenSpoon= driver.findElement(By.name("search_query"));
        searchForWoodenSpoon.sendKeys("wooden spoon"+ Keys.ENTER);
        //4. Verify title:
        String expectedTitle="Wooden spoon - Etsy";
        String actualTittle= driver.getTitle();

        //Expected: “Wooden spoon - Etsy”

        if (actualTittle.equals(expectedTitle)){
            System.out.println("Title verification PASSED...");
        }else {
            System.out.println("Title verification FAILED");
        }
        //driver.close();
    }
}
