package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    //instead of using findElement(Bypath) we use findBy it works
    @FindBy(id = "react-burger-menu-btn")
    WebElement hamBurgerBtn;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutBtn;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addItem;
    @FindBy(className="shopping_cart_link")
    WebElement cart;
    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeItem;
    @FindBy(className="product_sort_container")
    WebElement filterDropDown;



    public void clickOnHamBurgerMenu(){
        //WebElement hamBurgerBtn = driver.findElement(By.id("react-burger-menu-btn"));
        hamBurgerBtn.click();
    }
    public void clickOnLogoutLink(){
        //WebElement logoutBtn = driver.findElement(By.id("logout_sidebar_link"));
        logoutBtn.click();
    }
    public boolean isHomePageDisplayed(){
        WebElement filterDrpDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        WebElement sortItem = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        return filterDrpDown.isDisplayed() && sortItem.isDisplayed();
    }
    public void clickOnAddProductToCartLink(){
        addItem.click();
    }
    public String cartItemCount(){
        return cart.getText();
    }
    public void removeItem(){
        removeItem.click();
    }
    public void filterButtonClicking(){
        filterDropDown.click();
    }
    public void filterData(){
        List<WebElement> list = driver.findElements(By.xpath("//select[@class='product_sort_container']/option"));
        for(int i=1;i<=list.size();i++){
            String data = driver.findElement(By.xpath("//select[@class='product_sort_container']/option["+i+"]")).getText();
            System.out.println(data);
        }
    }
}
