package com.cydeo.tests.day9_TestBase_DriverUtils;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 2)
    public void singletone_understand_test1(){

        String str1= Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2= Singleton.getWord();
        System.out.println("str1 = " + str2);

        String str3= Singleton.getWord();
        System.out.println("str1 = " + str3);



    }
    @Test(priority = 1)
    public void singleton_understanding_test2(){
        String str4= Singleton.getWord();
        System.out.println("str1 = " + str4);

    }
}
