Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on the login page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is navigated to the next page

    Examples:
    | username | password |
    | Raghav | 12345 |
    | Lily | 12345 |