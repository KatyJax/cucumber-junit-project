Feature: User should be able to login with valid credentials

  Background:
    Given User is in the login page of web table app


  Scenario: Login scenario will 1 param
    When User enters username "Test"
    And User enters password "Tester"
    And User clicks to login button
    Then User should see url contains orders

  @webtableApp
    Scenario: Login scenario with 2 params
      When User enters username "Test" password "Tester" and logins
      Then User should see url contains orders

    Scenario: Login scenario with data table
      When user enters below credentials
        | username     | Test   |
        | password     | Tester |
      Then User should see url contains orders