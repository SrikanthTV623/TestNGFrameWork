package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    //create references of object
    private static ExtentReports extentReports;
    public static ExtentTest test;
    private static ExtentSparkReporter sparkReporter;

    @BeforeMethod
    public void setUp(ITestContext context) throws MalformedURLException {
        //set up reporter
        String reportPath = System.getProperty("user.dir")+"\\reports\\extentReport.html";
        sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setTheme(Theme.STANDARD);

        //use test to add details to reporter
        extentReports = new ExtentReports();
        test = extentReports.createTest("Verify user can login");
        test.info("Navigating to another page");

        ConfigReader.initConfig(); //if we don't call the initConfig we get null pointer execption
        DriverManager.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @AfterMethod
    public void cleanUp(){
        //to generate the extent report
        extentReports.attachReporter(sparkReporter);
        extentReports.flush();

        DriverManager.getDriver().quit();
    }

    public String takeScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File file = ts.getScreenshotAs(OutputType.FILE);
        String filePath = "src/test/resources" + "screenshot.png";
        FileUtils.copyFile(file, new File(filePath));
        return System.getProperty("user.dir") + "/" + filePath;
    }
}
