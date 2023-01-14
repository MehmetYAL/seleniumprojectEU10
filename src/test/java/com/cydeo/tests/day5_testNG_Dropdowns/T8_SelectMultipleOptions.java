package com.cydeo.tests.day5_testNG_Dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_SelectMultipleOptions {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome"  );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @org.testng.annotations.Test
    public void allSelectTest() {
        //List<WebElement> select1 = driver.findElements(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        //int value = 0;
//        select.selectByIndex(value++);
//        select.selectByIndex(value++);
//        select.selectByIndex(value++);
//        select.selectByIndex(value++);
//        select.selectByIndex(value++);
//        select.selectByIndex(value++);
        List<WebElement> options = select.getOptions();
        for (WebElement element : options) {
            //select.selectByIndex(value++);
            //String value1 = element.getAttribute("value");
            //select.selectByValue(value1);
            String text = element.getText();
            select.selectByVisibleText(text);
            System.out.println(text);

        }
        select.deselectAll();



    }
}
