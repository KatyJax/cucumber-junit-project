Feature:  Etsy title verification
  User story: As a user, when I am on the etsy main page
  I should be able to see relevant Title


  Scenario: Title verification
    Given user is on Etsy main page
    Then user sees "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone" is in the Etsy title


    Scenario: Etsy Search Functionality Title Verification
      Given user is on Etsy main page
      When user types Wooden Spoon in the search box
      When user clicks search button
      Then user sees Wooden Spoon is in the title


  Scenario: Etsy Search Functionality Title Verification
    Given user is on Etsy main page
    When user types "Wooden Spoon" in the search box
    When user clicks search button
    Then user sees "Wooden Spoon" is in the title