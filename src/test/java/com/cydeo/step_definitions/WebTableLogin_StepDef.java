package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();


    @Given("User is in the login page of web table app")
    public void user_is_in_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("User enters username {string}")
    public void user_enters_username(String userName) {

        webTableLoginPage.inputUserName.sendKeys(userName);

    }
    @When("User enters password {string}")
    public void user_enters_password(String password) {

        webTableLoginPage.inputPassword.sendKeys(password);
    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginBtn.click();

    }
    @Then("User should see url contains orders")
    public void user_should_see_url_contains_orders() {


        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("orders"));
    }

    @When("User enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String userName, String password) {
      //  webTableLoginPage.inputUserName.sendKeys(userName);
      //  webTableLoginPage.inputPassword.sendKeys(password);
        // webTableLoginPage.loginBtn.click();

        webTableLoginPage.login(userName, password);
    }


    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
        webTableLoginPage.inputUserName.sendKeys(credentials.get("userName"));
        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
        webTableLoginPage.loginBtn.click();
    }
}
