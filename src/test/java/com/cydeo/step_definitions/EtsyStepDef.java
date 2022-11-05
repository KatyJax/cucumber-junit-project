package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDef {

    EtsySearchPage etsySearchPage = new EtsySearchPage();


    @Given("user is on Etsy main page")
    public void user_is_on_etsy_main_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user sees {string} is in the Etsy title")
    public void user_sees_is_in_the_etsy_title(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println(expectedTitle + "  " + actualTitle);

    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchBtn.click();
    }

    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        String expectedTitle = "Wooden Spoon";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchKey) {
       etsySearchPage.searchBox.sendKeys(searchKey);
    }

    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
       String actualTitle = Driver.getDriver().getTitle();

       Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }
}
