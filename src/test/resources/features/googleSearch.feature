Feature: Google search functionality
  User story: As a user, when I am on the google search page
  I should be able to search whatever I want and see relevant information


  Scenario: Search functionality result title verification
   Given user is on Google search page
   When user types apple in tje google search box and click enter
   Then user sees apple - Google Search is in the Google title



  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "tesla" in tje google search box and click enter
    Then user sees "tesla - Google Search" is in the Google title