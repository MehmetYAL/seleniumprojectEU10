package com.cydeo.tests.day10_Upload_Actions_JSExecuter;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_5_ScrollPractice1 {
    @Test
    public void scrollPractice() throws InterruptedException {
        //TC #4: Scroll practice
        //1- Open a chrome browser
        Driver.getDriver().get("https://practice.cydeo.com/");
        //2- Go to: https://practice.cydeo.com/
        //3- Scroll down to “Powered by CYDEO”
        Thread.sleep(2000);
    WebElement scrolltoCydeo=Driver.getDriver().findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        Actions actions=new Actions(Driver.getDriver());
        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(scrolltoCydeo).perform();

        Thread.sleep(2000);


        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        WebElement scrollToHome=Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));

        actions.moveToElement(scrollToHome).perform();

        //actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);



        Driver.closeDriver();
    }

    @Test
    public void testPraxtice(){
        Driver.getDriver().get("https://practice.cydeo.com/");
    }
}
