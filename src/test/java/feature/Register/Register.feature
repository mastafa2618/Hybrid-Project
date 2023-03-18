Feature: As a user I should able to register so that I can able to use account successfully

  @regression
  Scenario: As a user I should able to register with valid details

    Given I am on register page
    When I enter user registration details
    And I clock on Register button
    Then I should able to register successfully