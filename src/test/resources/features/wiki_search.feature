Feature: Wikipedia Search Functionality and verifications

  Background: User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality and verifications
   # Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title



    @smoke
  Scenario: Wikipedia Search Functionality and verifications
    #Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


    Scenario Outline:Wikipedia Search Functionality and verifications with using DOT
      #Given User is on Wikipedia home page
      When User types "<searchValue>" in the wiki search box
      And User clicks wiki search button
      Then User sees "<expectedTitle>" is in the wiki title

      Examples:
      | searchValue  | expectedTitle |
      | Steve Jobs   | Steve Jobs     |
      | Bill Gates   | Bill Gates     |
      | Elon Musk    | Elon Musk      |


