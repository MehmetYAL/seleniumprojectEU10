package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_IncorrectUser {
    public static void main(String[] args) throws InterruptedException {
        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Enter incorrect username into login box:
        WebElement loginUserName= driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginUserName.sendKeys("incorrect"+ Keys.ENTER);
        //4- Click to `Reset password` button
        Thread.sleep(3000);
        WebElement clickResetButton=driver.findElement(By.cssSelector("button[value='Reset password']"));
        clickResetButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        String expectedError="Login or E-mail not found";
        WebElement labelError= driver.findElement(By.cssSelector("div[class='errortext']"));
        String actualErrorText= labelError.getText();

        if (actualErrorText.equals(expectedError)){
            System.out.println("Error label verification Passed");
        }else {
            System.out.println("Error label verification FAiled");
        }
    }
}
