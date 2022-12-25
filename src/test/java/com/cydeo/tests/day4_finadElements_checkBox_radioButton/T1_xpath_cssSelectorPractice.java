package com.cydeo.tests.day4_finadElements_checkBox_radioButton;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelectorPractice {
    public static void main(String[] args) {
        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //locating cssSelector exampales syntax
        //class value
        WebElement homeLink1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        //syntax#2
        WebElement homeLink2= driver.findElement(By.cssSelector("a.nav-link"));
        //href value
        WebElement homeLink3= driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //Locate header using cssSelecetor: locate parent element and move down to h2
        WebElement headerExam1= driver.findElement(By.cssSelector("div.example > h2"));
        WebElement headerExam2= driver.findElement(By.cssSelector("div.example > h2"));

        //Locate header usingxPath and using web element text
        WebElement headerUsingXpath= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //using the same way of dot . nokta li olan ornegi
        //WebElement headerUsingXpath2= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));

        //xPath contains method
        //tagName[contains(@attribute,'value')]
        WebElement inputBoxContainsMethod= driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        //button[@class='radius']
        //button[@id='form_submit']
        WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
        //f. “Powered by Cydeo text
        WebElement poweredByCydeo= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        //4. Verify all web elements are displayed.

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBoxContainsMethod.isDisplayed() = " + inputBoxContainsMethod.isDisplayed());
        System.out.println("button.isDisplayed() = " + button.isDisplayed());
        System.out.println("headerExam1.isDisplayed() = " + headerExam1.isDisplayed());
        System.out.println("headerUsingXpath = " + headerUsingXpath);
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
