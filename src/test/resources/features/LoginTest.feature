@srikanth
Feature: As a user, I want to Login into the application

  Background:
    Given user opens website
    Then verify user on login page

  @smoke
  Scenario: Verify user can login with valid credentials
    When user login with username "Admin" and password "admin123"
    Then verify user is on home page


  Scenario: Verify user can logout of the application
    When user login with username "Admin" and password "admin123"
    Then verify user is on home page
    When user click on user icon
    And click on logout link
    Then verify user on login page

  Scenario Outline: Verify error message for invalid login credentials
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples:
      | username | password |
      | test     | test123  |
      | demo     | demo123  |
      | hello    | hello123 |
      | java     | java123  |