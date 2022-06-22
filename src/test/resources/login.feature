Feature: OrangeHRM login functionality
  Scenario: verify the login functionality of OrangeHRM
    Given user is on OrangeHRM home page
    When user enters username and password
    And clicks on login button
    Then user should be able to login successfully
