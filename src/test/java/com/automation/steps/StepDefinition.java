package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class StepDefinition {

    @Given("user opens website")
    public void user_opens_website() {

    }

    @Then("verify user on login page")
    public void verify_user_on_login_page() {


    }

    @When("user login with valid credentials")
    public void userLoginWithValidCredentials() {
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {

    }


    @When("user click on user icon")
    public void userClickOnUserIcon() {
        
    }

    @And("click on logout link")
    public void clickOnLogoutLink() {
    }

    @When("user click on admin button")
    public void userClickOnAdminButton() {

    }

    @Then("verify user is on admin page")
    public void verifyUserIsOnAdminPage() {

    }

    @When("user click on user role dropdown")
    public void userClickOnUserRoleDropdown() {

    }

    @When("user select user role to Admin in dropdown")
    public void userSelectUserRoleToAdminInDropdown() {

    }

    @When("user click on search button")
    public void userClickOnSearchButton() {

    }

    @Then("verify the list of users is greater than or equal to one")
    public void verifyTheListOfUsersIsGreaterThanOrEqualToOne() {
    }

    @When("user login with invalid credentials")
    public void userLoginWithInvalidCredentials() {
        
    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username,String password) {

    }

    @Given("user open data table website")
    public void userOpenDataTableWebsite() {
        LoginPage loginPage = new LoginPage();
        loginPage.openWebsite();
    }

    @Then("verify following table data displayed as homepage")
    public void verifyFollowingTableDataDisplayedAsHomepage(List<List<String>> table) {
        LoginPage loginPage = new LoginPage();
        loginPage.validateTable(table);
        /*
        //to print only data table given on datavalidation.feature

        for (List<String> listOfRows : table){
            for (String data:listOfRows){
                System.out.print(data+" ");
            }
            System.out.println();
        }
        */

    }
}
