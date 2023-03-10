package com.cydeo.tests.day10_Upload_Actions_JSExecuter;

import com.cydeo.utulities.BrowserUtils;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavaScriptExecuter {

    @Test
    public void javascript_executer_test1(){
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        //3- Use below JavaScript method and scroll

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //a. 750 pixels down 10 times.
        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }

        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }



        //b. 750 pixels up 10 times
        //JavaScript method to use : window.scrollBy(0,0
    }
}
