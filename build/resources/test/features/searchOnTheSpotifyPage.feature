#language:en
  #Author:valeriard1993@gmail.com
@search
  Feature: Search something on the Spotify page

    Scenario: Search for Artist on the Spotify page
    Given that I am on the Spotify page
    When I search for "Coldplay"
    Then the search results are related to "Coldplay"
