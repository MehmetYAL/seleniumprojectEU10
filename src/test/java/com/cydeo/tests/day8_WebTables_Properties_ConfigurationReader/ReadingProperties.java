package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //1-create the object of Properties
        Properties properties=new Properties();

        //2-we need to open the file in java memory: fileInputStream
        FileInputStream file=new FileInputStream("configuration.properties");

        //3-load the properties object using FileInputStream object
        properties.load(file);

        //4-USe "properties" object to red value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty() = " + properties.getProperty("username"));

    }
}
