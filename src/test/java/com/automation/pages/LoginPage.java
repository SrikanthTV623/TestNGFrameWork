package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

    //instead of using findElement(Bypath) we use findBy it works
    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id="login-button")
    WebElement loginBtn;

    public void openWebsite(){
        driver.get("https://www.saucedemo.com/");
       //driver.get("https://datatables.net/");
    }

    public void doLogin(String Username,String Password){
        usernameInput.sendKeys(Username);
        passwordInput.sendKeys(Password);
        loginBtn.click();
    }

    public boolean isLoginPageDisplayed(){
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public void validateTable(List<List<String>> table) {
        for(int i=0;i<table.size();i++){
            String xpath = "//table[@id='example']/tbody/tr[%s]/td[not(@style='display: none;')]";
            List<WebElement> eachRowData = driver.findElements(By.xpath(String.format(xpath,i+1)));

            for (int j=0;j<eachRowData.size();j++){
                String expectedData = table.get(i).get(j);
                String actualData = eachRowData.get(j).getText();

                System.out.println("Expected:"+expectedData);
                System.out.println("Actual:"+actualData);
            }
        }
    }


}
