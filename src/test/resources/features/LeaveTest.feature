Feature: As a user wants to apply for leave

  Scenario: Verify user can apply for the leave
    Given user opens website
    Then verify user on login page
    When user login with valid credentials
    Then verify user is on home page
    When user clicks on leave menu
    Then verify user is on leave page
    When user clicks on Apply Button
    Then leave application form is displayed
    When user selects random leave type
    And user enters leave date