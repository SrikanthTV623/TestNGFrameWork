//package com.automation.test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class LoginTestWithoutUsingPages extends BaseTest {
//
//    WebDriver driver;
//    @Test
//    public void verifyUserCanLoginWithValidCerdentials(){
//
//        driver.get("https://www.saucedemo.com/");
//        WebElement usernameInput = driver.findElement(By.id("user-name"));
//        WebElement passwordInput = driver.findElement(By.id("password"));
//        WebElement loginBtn = driver.findElement(By.id("login-button"));
//        usernameInput.sendKeys("standard_user");
//        passwordInput.sendKeys("secret_sauce");
//        loginBtn.click();
//
//        WebElement filterDrpDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
//        WebElement sortItem = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//
//        Assert.assertTrue(filterDrpDown.isDisplayed(),"Filter button is not displayed");
//        Assert.assertTrue(sortItem.isDisplayed(),"Cart Item is not displayed");
//
//    }
//
//
//    @Test
//    public void verifyUserCanLogout(){
//
//        driver.get("https://www.saucedemo.com/");
//        WebElement usernameInput = driver.findElement(By.id("user-name"));
//        WebElement passwordInput = driver.findElement(By.id("password"));
//        WebElement loginBtn = driver.findElement(By.id("login-button"));
//        usernameInput.sendKeys("standard_user");
//        passwordInput.sendKeys("secret_sauce");
//        loginBtn.click();
//
//        WebElement filterDrpDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
//        WebElement sortItem = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//
//        Assert.assertTrue(filterDrpDown.isDisplayed(),"Filter button is not displayed");
//        Assert.assertTrue(sortItem.isDisplayed(),"Cart Item is not displayed");
//
//        WebElement hamBurgerBtn = driver.findElement(By.id("react-burger-menu-btn"));
//        hamBurgerBtn.click();
//
//        WebElement logoutBtn = driver.findElement(By.id("logout_sidebar_link"));
//        logoutBtn.click();
//
//        usernameInput = driver.findElement(By.id("user-name"));
//        passwordInput = driver.findElement(By.id("password"));
//
//        Assert.assertTrue(usernameInput.isDisplayed(),"username input is not displayed on login page");
//        Assert.assertTrue(passwordInput.isDisplayed(),"password input is not displayed on login page");
//
//    }
//}
