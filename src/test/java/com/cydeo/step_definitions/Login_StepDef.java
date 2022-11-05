package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println(" given for all");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {

        System.out.println("When librarian");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {

        System.out.println("second When librarian");
        //TODO: I need to implementation for librarian password

    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("Then for all");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("student and");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("student when");
    }

    @When("user enters admin  username")
    public void userEntersAdminUsername() {
        System.out.println("admin when");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("admin and");
    }
}
