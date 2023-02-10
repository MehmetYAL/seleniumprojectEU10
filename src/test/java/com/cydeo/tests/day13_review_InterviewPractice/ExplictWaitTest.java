package com.cydeo.tests.day13_review_InterviewPractice;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplictWaitTest {
   DynamicControlsPage dynamicControlsPage;
    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage=new DynamicControlsPage();
    }
    @Test

    public void remove_Button(){
        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();
        //4- Wait until “loading bar disappears”

        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingGif));
        //5- Verify:
        //a. Checkbox is not displayed

        try{Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        Assert.assertTrue(dynamicControlsPage.disappearMessage.isDisplayed());

        //b. “It’s gone!” message is displayed.

        String actualMessage=dynamicControlsPage.disappearMessage.getText();
        Assert.assertEquals(actualMessage,"It's gone!");

    }

}
