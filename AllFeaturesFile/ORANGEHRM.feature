Feature: Test ORANGEHRM Application

  Scenario: Test Login Page Functionality
    Given user is on Login Page
    When user enters valid username and password
    Then user click on login button

  Scenario: Test Home Page Functionality
    Given user is on HomePage and validate the Home Page Title
    And validate the Home Page URL
    And validate the Home Page Logo
