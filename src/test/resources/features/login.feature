#language:en
  #Author:valeriard1993@gmail.com
@RegressionSpotify
Feature: Login failed
  Background:
    Given  that I am on the Spotify page

  @loginInvalid
  Scenario: Login with invalid email
    Given  I go the page login
    When I enter an invalid email
    Then An error message must be shown

  @loginInvalidPassword
  Scenario: Login with invalid password
    Given I go the page login
    When I enter a valid email
    And I enter an invalid password
    Then An error message password must be shown

  @loginSuccessful
  Scenario: Login successful
    Given I go the page login
    When I enter a valid email
    And I enter a valid password
    Then redirect to the user "P" homepage
