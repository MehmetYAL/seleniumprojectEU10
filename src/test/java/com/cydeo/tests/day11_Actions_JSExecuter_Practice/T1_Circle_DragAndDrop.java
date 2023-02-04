package com.cydeo.tests.day11_Actions_JSExecuter_Practice;

import com.cydeo.utulities.BrowserUtils;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_DragAndDrop {
    @Test
    public void dragAndDrop_Test (){

        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement alertcookies=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        alertcookies.click();
        BrowserUtils.sleep(4);

        //2. Drag and drop the small circle to bigger circle.
        WebElement drogable=Driver.getDriver().findElement(By.id("draggable"));
        WebElement targetDrop=Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN);

       // actions.dragAndDrop(drogable,targetDrop);
        actions.clickAndHold(drogable).moveToElement(targetDrop).release().perform();




        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String expectedText="You did great!";
        String actualttext=targetDrop.getText();

        Assert.assertEquals(expectedText,actualttext);

    }
}
