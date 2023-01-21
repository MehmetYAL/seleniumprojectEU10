package com.cydeo.tests.day10_Upload_Actions_JSExecuter;

import com.cydeo.utulities.BrowserUtils;
import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadTest {
    @Test
    public void upload_test(){
//        TC #2 Upload Test
//        1. Go to https://practice.cydeo.com/upload

        Driver.getDriver().get("https://practice.cydeo.com/upload");
//        2. Find some small file from your computer, and get the path of it.

        String path ="C:\\Users\\User\\OneDrive\\memet\\022.JPG";
//        3. Upload the file.

        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);
        WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();


//        4. Assert:
//        -File uploaded text is displayed on the page

        WebElement fileUploadedHeader=Driver.getDriver().findElement(By.tagName("h3"));
        String expectedHeaded= "File Uploaded!";
        String actualheader= fileUploadedHeader.getText();
        //System.out.println("actualheader = " + actualheader);

        Assert.assertEquals(expectedHeaded,actualheader);
        Driver.getDriver().close();
    }
}
