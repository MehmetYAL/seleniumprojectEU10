package com.cydeo.tests.day4_finadElements_checkBox_radioButton;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3xpathPractice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        //4. Verify text displayed is as expected:
        WebElement buttonText1 = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));
        //Expected: “Clicked on button one!”
        String expectedtext = "Clicked on button one!";
        String actualText = buttonText1.getText();
        if (expectedtext.equals(actualText)){
            System.out.println("Text displayed is as expected");
        }else {
            System.out.println("Text displayed is NOT MATCED");
        }
        driver.close();
    }
}