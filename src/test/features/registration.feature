Feature: Register user to application
In order to register to the application
  As a valid user
I have to provide valid email, password and subscriptionConfirmation
  Scenario: Verify user registration with valid data
    Given I navigate to home page "https://www.johnlewis.com/"
    Then I should be able to open the home page
    When I click on Sign In click
    Then I should be redirected to the login page
    When I click on "Create an account" button
    Then I should be redirected to the "Create An Account" Page
    When I enter valid email address "abdc@gmail.com"
    And I enter password "Password123"
    And click on "yes, subscribe to all" checkbox
    And Click on "Create Account" button
    Then I should be able to register successfully and redirected to the Confirmation Page

