Feature: Test google search functionality
@GoogleSearch
  Scenario: Validate google search is working
    Given user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
