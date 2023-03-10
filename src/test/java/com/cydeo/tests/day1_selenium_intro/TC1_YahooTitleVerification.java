package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
       WebDriver driver=new ChromeDriver();
       //make our page fullscreen
        driver.manage().window().maximize();
        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        //3.Verify title:
        String expectedValue="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
//actual title comes from browser
        String actualValue= driver.getTitle();


        if (expectedValue.equals(actualValue)){
            System.out.println("Expected value is passed");
        }else {
            System.out.println("Expected value is failed");
        }

        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos

    }
}
