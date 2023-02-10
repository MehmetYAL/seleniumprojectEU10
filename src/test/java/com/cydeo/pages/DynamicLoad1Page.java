package com.cydeo.pages;


import com.cydeo.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page{
    public DynamicLoad1Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@placeholder='Enter username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Enter password']")
        public WebElement password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='flash']")
    public WebElement invalidPasswordFlash;







}
