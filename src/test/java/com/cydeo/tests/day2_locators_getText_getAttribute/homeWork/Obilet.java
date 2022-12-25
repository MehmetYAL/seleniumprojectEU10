package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obilet {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to
        driver.get("https://www.obilet.com");
        WebElement kalkisYeri= driver.findElement(By.id("origin-input"));
     kalkisYeri.click();
     kalkisYeri.sendKeys("Bursa");
     kalkisYeri.click();
    }
}
