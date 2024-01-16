Feature: Test ORANGEHRM Application

  Scenario: Test Login Page Functionality
    Given user is on Login Page
    When user enters valid username and password
    Then user click on login button
