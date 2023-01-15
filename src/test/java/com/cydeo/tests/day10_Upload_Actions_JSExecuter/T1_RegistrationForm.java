package com.cydeo.tests.day10_Upload_Actions_JSExecuter;

import com.cydeo.utulities.ConfigurationReader;
import com.cydeo.utulities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_RegistrationForm {
    @Test
    public void registirationForm(){
       // 1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver()----> driver.get
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        Faker faker= new Faker();

        //3. Enter first name
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.bothify("helpdesk####"));

        //6. Enter email address
        WebElement emailAdress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAdress.sendKeys(faker.bothify("?helpdesk####@???.com"));

        //7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.bothify("##??##/##"));

        //8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement genderButton=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        genderButton.click();

        //10.Enter date of birth
        WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        dateOfBirth.sendKeys("01/01/1999");

        //11.Select Department/Office
        Select department=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByVisibleText("Tourism Office");

        //12.Select Job Title
        Select jobTitle=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(5);

        //13.Select programming language from checkboxes
        WebElement programmingLanguage=Driver.getDriver().findElement(By.cssSelector("label[for=inlineCheckbox2]"));
        programmingLanguage.click();

        //14.Click to sign up button

        WebElement signUpButton=Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpButton.click();

 //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.

        WebElement succesMessage=Driver.getDriver().findElement(By.xpath("//p"));
        String actualMessage=succesMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        String expectedMessage="You've successfully completed registration!";

        Assert.assertEquals(actualMessage,expectedMessage);




    }
}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
 */