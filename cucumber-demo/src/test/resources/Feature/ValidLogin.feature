Feature: Verify login functionality

  @ValidLogin
  Scenario Outline: Check login is successful with valid credentials
    Given the browser is open
    And user navigates to login page
    When user enters "<username>" and "<password>"
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username        | password     |
      | error_user | secret_sauce |
      | problem_user    | secret_sauce |
