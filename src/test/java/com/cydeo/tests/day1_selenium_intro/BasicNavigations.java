package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium Webdriver

        //this is the line opening an empty browser
        WebDriver driver=new ChromeDriver();

        //3- go to tesla.com

        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = "+currentTitle);

        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = "+currentURL);

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium navigate forward
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();


        //use selenium navigate refresh
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

//get the current title after getting the google page
        currentTitle= driver.getTitle();

        //get the title of the page
       // System.out.println("driver.getTitle()="+driver.getTitle());

        System.out.println("currentTitle = "+currentTitle);


        // get the current URL using selenium
        currentURL= driver.getCurrentUrl();

        System.out.println("currentURL = "+currentURL);











    }
}
