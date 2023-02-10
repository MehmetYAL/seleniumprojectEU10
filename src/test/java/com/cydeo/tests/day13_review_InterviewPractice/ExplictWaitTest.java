package com.cydeo.tests.day13_review_InterviewPractice;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utulities.BrowserUtils;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingGif));

        BrowserUtils.waitForInvisibilityOfF(dynamicControlsPage.loadingGif);
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

    @Test
    public void explict_Wait_EnableMessage(){
//TC #3: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
//3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();
//4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOfF(dynamicControlsPage.loadingBar);
//5- Verify:
//a. Input box is enabled.
//b. “It’s enabled!” message is displayed.
        String actualMessage=dynamicControlsPage.enableMessage.getText();
        Assert.assertEquals(actualMessage,"It's enabled!");


    }

@AfterMethod
public void close(){

        Driver.closeDriver();
}

}
