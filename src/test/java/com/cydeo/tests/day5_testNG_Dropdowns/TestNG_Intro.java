package com.cydeo.tests.day5_testNG_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("---> before class will run once before all once in the class");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---> after class will run once after all once in the class");

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("-----> Before method will run before each method");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> after method will run after each method");
    }

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running");
        //Assert  Equals: compare 2 of the same things
        String actual="apple";
        String expected="apple";

        Assert.assertEquals(actual,expected);

    }
    @Test (priority = 2) // priority is select which method you wanted to run first
    public void test2(){
        System.out.println("test2 is running");
        String actual="apple";
        String expected="apple1";

        Assert.assertTrue(actual.equals(expected));
        //Assert.
    }
}
