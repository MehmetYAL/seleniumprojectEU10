package com.cydeo.tests.day9_TestBase_DriverUtils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        Faker faker=new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker = " + faker.name().fullName());
        System.out.println("faker.numerify(\"####-###-###\") = " + faker.numerify("####-###-###"));
        System.out.println("faker.numerify(\"0537-###-####\") = " + faker.numerify("####-###-###"));

        System.out.println("faker.letterify(\"????-??**??\") = " + faker.letterify("????-?**?"));
        System.out.println("faker.bothify(\"##?#-##-##?#?-??##\") = " + faker.bothify("##?#-##-##?#?-??##"));
        System.out.println("faker.gameOfThrones().character() = " + faker.gameOfThrones().character());
    }
}
