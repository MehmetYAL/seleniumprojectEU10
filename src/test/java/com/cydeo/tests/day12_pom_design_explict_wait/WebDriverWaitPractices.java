package com.cydeo.tests.day12_pom_design_explict_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {

    @Test
    public void dynamic_load_7_test(){
        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        //2. Wait until title is “Dynamic title”
        //--creating the wait object to be to create certain condition to wait
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        DynamicLoad7Page dynamicLoad7Page=new DynamicLoad7Page();
        //3. Assert: Message “Done” is displayed.

        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        //4. Assert: Image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void dynamically_Loaded_Page_Elements1(){

        //TC#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        //2. Click to start
        DynamicLoad1Page dynamicLoad1Page=new DynamicLoad1Page();
        dynamicLoad1Page.startButton.click();
        //3. Wait until loading bar disappears
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        dynamicLoad1Page.userName.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
        dynamicLoad1Page.password.sendKeys("incorrectpassword");
        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();
        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.invalidPasswordFlash.isDisplayed());

        Driver.closeDriver();


    }


}
