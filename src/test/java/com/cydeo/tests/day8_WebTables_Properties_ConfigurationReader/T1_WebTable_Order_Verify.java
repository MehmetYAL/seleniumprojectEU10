package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utulities.WebDriverFactory;
import com.cydeo.utulities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void orderNameVerify(){
        //driver.get("https://practice.cydeo.com/web-tables");
//2. Verify Bob’s name is listed as expected.
   WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        //Expected: “Bob Martin”
        String expectedBobName="Bob Martin";
        String actualBobName=bobMartinCell.getText();
        Assert.assertEquals(expectedBobName,actualBobName);
        //3. Verify Bob Martin’s order date is as expected
     WebElement   orderDate=
             driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
     String ecpextedOrderDate="12/31/2021";
     String actualOrderDate=orderDate.getText();
        //Expected: 12/31/2021
        Assert.assertTrue(ecpextedOrderDate.equals(actualOrderDate));
        driver.close();
    }
    //TC #1: Web table practice
    //1. Go to: https://practice.cydeo.com/web-tables
    //2. Verify Bob’s name is listed as expected.
    //Expected: “Bob Martin”
    //3. Verify Bob Martin’s order date is as expected
    //Expected: 12/31/2021
@Test
    public void orderVeridyTest2(){
     String customerOrderDate2=   WebTablesUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);

    }
    @Test
    public void orderVerifyDateTest3(){
        WebTablesUtils.orderVerify(driver,"Bart Fisher","01/16/2021");

    }
    @AfterMethod
            public void tearDrop(){
        driver.quit();
    }
}
/*
TC #1: Web table practice
1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021
 */