package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // setting up driver manager

        WebDriverManager.chromedriver().setup();

        //Create instance of the chrome driver

        WebDriver driver=new ChromeDriver();

        //3-Test if driver is working
        driver.get("https://www.facebook.com");


    }
}
