Feature: As a user, I want to check how many admin users is available

  Scenario: Verify at least one admin user is present in user list
    Given user opens website
    Then verify user on login page
    When user login with valid credentials
    Then verify user is on home page
    When user click on admin button
    Then verify user is on admin page
    When user click on user role dropdown
    When user select user role to Admin in dropdown
    When user click on search button
    Then verify the list of users is greater than or equal to one