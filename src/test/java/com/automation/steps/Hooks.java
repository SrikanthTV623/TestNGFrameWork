package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks {

    /*
    @Before
    public void setUp(){

        System.out.println("Before Scenario");
    }
    @After
    public void cleanUp(){
        System.out.println("After Scenario");
    }
    */
    @Before
    public void setUp() throws MalformedURLException {
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }
    @After
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
