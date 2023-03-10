package com.cydeo.tests.day12_pom_design_explict_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utulities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage=new LibraryLoginPage();

    }

    @Test
    public void reqired_field_error_message_test(){

//TC #1: Required field error message test
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com


//3- Do not enter any information
//4- Click to “Sign in” button

 //libraryLoginPage=new LibraryLoginPage();-- been writing in the before method
   libraryLoginPage.signInButton.click();
//5- Verify expected error is displayed:
//Expected: This field is required
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
//TC #2: Invalid email format error message test
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");-- been writing in the before method
//3- Enter invalid email format
   //libraryLoginPage=new LibraryLoginPage();-- been writing in the before method

        libraryLoginPage.inputUserName.sendKeys("meteyeyye");
        libraryLoginPage.signInButton.click();

//4- Verify expected error is displayed:
        String actualmErorMessage=libraryLoginPage.enterValidEmailErrorMessage.getText();
        String expectedErrorMessage="Please enter a valid email address.";
                Assert.assertEquals(expectedErrorMessage,actualmErorMessage);
//Expected: Please enter a valid email address
        Driver.closeDriver();

    }

    @Test

    public void library_negative_login(){

        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

    //    Driver.getDriver().get("https://library1.cydeo.com");-- been writing in the before method
        //3- Enter incorrect username or incorrect password
  //libraryLoginPage=new LibraryLoginPage();-- been writing in the before method

        libraryLoginPage.inputUserName.sendKeys("memet@html.com");
        libraryLoginPage.inputPassword.sendKeys("12451b");

        libraryLoginPage.signInButton.click();
        //4- Verify title expected error is displayed:
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        //Expected: Sorry, Wrong Email or Password
        Driver.closeDriver();
    }

}
