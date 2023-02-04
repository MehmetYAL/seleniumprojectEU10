package com.cydeo.tests.day10_Upload_Actions_JSExecuter;

import com.cydeo.utulities.BrowserUtils;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JavaExecutor {
    @Test
    public void ScrollUsing_J_Executor(){
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large

        Driver.getDriver().get("https://practice.cydeo.com/large");
        //3- Scroll down to “Cydeo” link
        WebElement scrollCydeo=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement scrollHome=Driver.getDriver().findElement(By.linkText("Home"));


       // scrollCydeo.click();
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",scrollCydeo);
       // js.executeScript("arguments[0].scrollIntoView(true);",scrollCydeo);
        BrowserUtils.sleep(2);
        //4- Scroll up to “Home” link
        js.executeScript("arguments[0].scrollIntoView(true)",scrollHome);
        //5- Use below provided JS method only
        // instead of two different line we could use one line with index 2
      //  js.executeScr
        //  ipt("arguments[1].scrollIntoView(true)",scrollCydeo,scrollHome)
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }
}
