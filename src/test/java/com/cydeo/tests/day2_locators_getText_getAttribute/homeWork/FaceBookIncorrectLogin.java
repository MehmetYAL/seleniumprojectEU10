package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookIncorrectLogin {
    /*
    TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
     */
    public static void main(String[] args) {


    //TC #2: Facebook incorrect login title verification
    //1. Open Chrome browser
    WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();






    //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com");
    //3. Enter incorrect username
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("1456");
    //4. Enter incorrect password
       WebElement password=driver.findElement(By.id("pass"));
        driver.findElement(By.name("login"));
       password.sendKeys("11"+ Keys.ENTER);
       //driver.findElement(By.name("login"));
       //password.click();
    //5. Verify title changed to:
    //Expected: “Log into Facebook”
}
}
