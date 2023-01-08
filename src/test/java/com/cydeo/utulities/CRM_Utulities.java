package com.cydeo.utulities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utulities {
     /*
    This method will log in with helpdesk1@cybertekschool.com
     user when it is called
     */


    public static void crm_login(WebDriver driver){

        //3. Enter valid username
        WebElement validUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        validUserName.sendKeys("helpdesk2@cybertekschool.com");
        //4. Enter valid password
        WebElement validPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        validPassword.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInBtn.click();
    }

    public static void crm_login(WebDriver driver, String userName,String password){

        //3. Enter valid username
        WebElement validUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        validUserName.sendKeys(userName);
        //4. Enter valid password
        WebElement validPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        validPassword.sendKeys(password);
        //5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInBtn.click();
    }


}
/*
TC #4: Create utility method
1. Create a new method for login
2. Create a method to make Task3 logic re-usable
3. When method is called, it should simply login
This method should have at least 2 overloaded versions.
Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password
 */