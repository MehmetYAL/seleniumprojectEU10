package com.cydeo.tests.day5_testNG_Dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StateElementsRefEx {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //3. Click to “Add Element” button
         WebElement addElementBTN= driver.findElement(By.xpath("//button[.='Add Element']"));
         Thread.sleep(5000);
         addElementBTN.click();
        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBTN= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println("deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());
        //5. Click to “Delete” button.
        deleteBTN.click();
        //6. Verify “Delete” button is NOT displayed after clicking.
        //System.out.println("deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());
        // here delete button first displayed but after clicking delete button is disappeared so it is dynmc thats why
        //we use here exception
try{
    System.out.println("deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());

}catch (StaleElementReferenceException e){
    System.out.println("StaleElementReferenceException exception is thrown");
    System.out.println(" This means the web element is completely deleted from the page");
    System.out.println("delete button.isDisplayed = false");
}
driver.close();
    }        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

}
