Feature: test Login functionality

  Scenario: Login Test Using Valid Credentials
    Given user is on the login page
    When user enters a valid username and password
    And clicks on the login button
    Then user navigates to home page
