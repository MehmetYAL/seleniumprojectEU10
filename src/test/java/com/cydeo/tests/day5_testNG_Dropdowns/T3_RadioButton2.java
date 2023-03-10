package com.cydeo.tests.day5_testNG_Dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton2 {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        /*//3. Click to “Hockey” radio button
        WebElement hockeyBTN= driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBTN.click();*/
        //Locate name='sports' radio buttons and store them in a List of Web Element

        //WE CREATE CUSTOM UTULITY METHOD TO USE AGAIN AND AGAIN
       /* List<WebElement> sportRadioButton=driver.findElements(By.name("sport"));
        for (WebElement each : sportRadioButton) {
            String eachID= each.getAttribute("id");
            System.out.println("eachID = "+eachID);
            if (eachID.equals("hockey")){
                each.click();
                System.out.println("each.isSelected() = " + each.isSelected());
                break;
            }*/

        clickAndVerifyRadioButton(driver,"sport","hockey");
        clickAndVerifyRadioButton(driver,"sport","basketball");
        clickAndVerifyRadioButton(driver,"color","blue");
        driver.close();
        }


    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement>RadioButton = driver.findElements(By.name(nameAttribute));
        for (WebElement each : RadioButton) {
            String eachID = each.getAttribute("id");
           // System.out.println("eachID = " + eachID);
            if (eachID.equals(idValue)) {
                each.click();
                System.out.println(eachID+" isSelected() = " + each.isSelected());
                break;
            }
        }
    }
}

/*
TC #3: Utility method task for (continuation of Task2)
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */