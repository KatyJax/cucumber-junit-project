package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDef {


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }
    @When("user types apple in tje google search box and click enter")
    public void user_types_apple_in_tje_google_search_box_and_click_enter() {

        googleSearchPage.searchBox.sendKeys( "apple"+ Keys.ENTER);
    }
    @Then("user sees apple - Google Search is in the Google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
       String expectedTitle = "apple - Google Search";
       String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title verification is filed", expectedTitle, actualTitle);
    }

    @When("user types {string} in tje google search box and click enter")
    public void user_types_in_tje_google_search_box_and_click_enter(String searchKey) {

        googleSearchPage.searchBox.sendKeys(searchKey + Keys.ENTER);
    }
    @Then("user sees {string} is in the Google title")
    public void user_sees_is_in_the_google_title(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println(expectedTitle +"   " + actualTitle);
    }

}
