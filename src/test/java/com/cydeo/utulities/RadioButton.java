package com.cydeo.utulities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton {
    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
    List<WebElement> RadioButton = driver.findElements(By.name(nameAttribute));
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
