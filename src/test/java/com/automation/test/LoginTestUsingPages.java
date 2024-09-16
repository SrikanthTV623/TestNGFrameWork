package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestUsingPages extends BaseTest{

    @Test
    public void verifyUserCanLoginWithValidCerdentials() throws IOException {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        //to click screenshot
        test.addScreenCaptureFromPath(takeScreenshot());
        //to check home page is opened or not
        Assert.assertTrue(homePage.isHomePageDisplayed(),"Homepage is not loading properly");
    }

    @Test
    public void verifyUserCanLogout(){
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(),"Homepage is not loading properly");

        homePage.clickOnHamBurgerMenu();
        homePage.clickOnLogoutLink();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(),"Login Page is not loading properly");
    }

    @Test
    public void verifyItemIsAddedToCart(){
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        homePage.clickOnAddProductToCartLink();
        Assert.assertEquals("1",homePage.cartItemCount());
        homePage.clickOnHamBurgerMenu();
        homePage.clickOnLogoutLink();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(),"Login Page is not loading properly");
    }

    @Test
    public void verifyItemRemovedFromCart(){
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        homePage.clickOnAddProductToCartLink();
        homePage.removeItem();
        Assert.assertEquals("",homePage.cartItemCount());
        homePage.clickOnHamBurgerMenu();
        homePage.clickOnLogoutLink();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(),"Login Page is not loading properly");
    }


    /*
    @Test
    public void verifyProductListUsingFilter(){
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        homePage.filterButtonClicking();
        homePage.filterData();
    }*/
}
