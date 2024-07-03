Feature: Login Functionality for Amazon eCommerce website

  User is able to login

  Background:
    Given User is on the Amazon india website

  Scenario: Successful login with valid credentials
    Given User enters valid username and password
    When User clicks on login button
    Then User is logged in successfully
