package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel= driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel="Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();
        if (expectedRememberMeLabel.equals(actualRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else {
            System.out.println("Label verification failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink=driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText="Forgot your password?";// SHOULD BE UPPER CASE IN WEB SITE IS UPPERCASE
        //THAT S WHY IT WILL SAY FAILED
        String actualForgotPasswordLinkText=forgotPasswordLink.getText();
        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("forgot password link verification PASSED");
        }else {
            System.out.println("forgot password link verification FAILED");
        }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref="forgot_password=yes";
        String actualAttributeValue=forgotPasswordLink.getAttribute("href");
        if (actualAttributeValue.contains(expectedInHref)){
            System.out.println("Href attribute value verification PASSED");
        }else {
            System.out.println("Href attribute value verification failed");
        }
    }
}
