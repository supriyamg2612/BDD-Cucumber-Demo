Feature: test Login functionality
@Login
  Scenario: Login Test Using Valid Credentials
    Given browser is open
    And user is on login page
    When user enters a valid username and password
    And clicks on the login button
    Then user navigates to home page

  