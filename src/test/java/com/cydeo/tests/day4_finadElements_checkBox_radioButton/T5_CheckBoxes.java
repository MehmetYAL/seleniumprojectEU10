package com.cydeo.tests.day4_finadElements_checkBox_radioButton;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1= driver.findElement(By.cssSelector("input[name='checkbox1']"));
        System.out.println("checkbox1.isDisplayed() = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        //4. Click checkbox #1 to select it.
        //6. Confirm checkbox #1 is SELECTED.
        Thread.sleep(2000);
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //5. Click checkbox #2 to deselect it.
        //7. Confirm checkbox #2 is NOT selected.
        Thread.sleep(2000);
        checkbox2.click();
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());


        driver.close();
    }
}
