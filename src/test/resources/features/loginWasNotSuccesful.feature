#language:en
  #Author:valeriard1993@gmail.com
@login
  Feature: Login was not successful

    Scenario: I am The login
    Given that I am on the Spotify page
    When I search for Coldplay
    Then the search results are related to Coldplay

