package com.cydeo.tests.day4_finadElements_checkBox_radioButton;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementreRerenceException {
    public static void main(String[] args) {
        //TC #6: StaleElementReferenceException Task
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate “CYDEO” link, verify it is displayed.
       // WebElement cydeoLink= driver.findElement(By.linkText("CYDEO"));
        WebElement cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        //4- Refresh the page.
        driver.navigate().refresh();
        //after refresh if  we have exception like StaleElementException
        //than we re-assign webelement to re-locate the element

        cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        //5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it.
        driver.close();
    }
}
