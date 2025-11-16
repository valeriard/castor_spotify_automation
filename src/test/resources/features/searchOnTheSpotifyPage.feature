#language:en
  #Author:valeriard1993@gmail.com
@RegressionSpotify
  Feature: Search something on the Spotify page

    @search
    Scenario: Search for Artist on the Spotify page
    Given that I am on the Spotify page
    When I search for "Coldplay"
    Then the search results are related to "Coldplay"
