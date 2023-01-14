package com.cydeo.tests.day7_Webtables_Utuluties_Javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utulities.BrowserUtils;
import com.cydeo.utulities.CRM_Utulities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {


    @Test
    public void crm_loginTest(){
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3. Enter valid username
        WebElement validUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        validUserName.sendKeys("helpdesk2@cybertekschool.com");
        //4. Enter valid password
        WebElement validPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        validPassword.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInBtn.click();
        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"Portal");


    }

    @Test
    public void crm_loginTest2(){
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //calling my utulity method to login helpdesk
        CRM_Utulities.crm_login(driver);
        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"Portal");


    }
    @Test
    public void crm_loginTest3(){
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //calling my utulity method to login helpdesk
        CRM_Utulities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");
        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"(1) Portal");


    }
}
/*
TC #3: Login scenario
1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal
USERNAME PASSWORD
helpdesk1@cybertekschool.com UserUser
Helpdesk2@cybertekschool.com UserUser
 */