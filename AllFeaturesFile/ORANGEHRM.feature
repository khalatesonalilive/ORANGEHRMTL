Feature: Test ORANGEHRM Application

  Scenario: Test Login Page Functionality
    Given user is on Login Page
    When user enters valid username and password
    Then user click on login button

  Scenario: Test Home Page Functionality
    Given user is on HomePage and validate the Home Page Title
    And validate the Home Page URL
    And validate the Home Page Logo

  Scenario: Test PIM Page Functionality
    Given user is on PIM Page and validate PIM Page URL
    And user click on Add Employee button and enter firstname , lastname and click on save button

  Scenario: Test Employee List Functionality
    When user capture Employee Id
    And user click on Employee List button
