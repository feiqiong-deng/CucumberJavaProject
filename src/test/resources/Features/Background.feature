Feature: Check home page functionality

  Background: user is going to login
    Given user is on the page of login
    When user inputs username and password
    And clicks on button
    Then user is navigated to the homepage

  Scenario: Check logout link
    When user click the button of mobile
    Then user is navigated to the page of mobile

  Scenario: Verify Web link is present
    When user click the button of web
    Then user is navigated to the page of web
