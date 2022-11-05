package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdowns_StepDef {

    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {


        // THIS UTILITY METHOD WILL return us List of String of given dropdown webElement
        List<String> actualOptionsAsString = BrowserUtils.dropdownOptionsAsString(dropdownPage.monthsDropdown);

        Assert.assertEquals(expectedMonths,actualOptionsAsString);

    }
}
