Feature: feature to test search functionality of google search

  Scenario: Google search functionality works properly
    Given user opens the browser
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search reults page
