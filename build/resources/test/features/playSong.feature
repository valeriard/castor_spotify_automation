
@Playsong
Feature: play a song
  Background:
    Given I'm logged in to Spotify

  Scenario: Play a song from a playlist
    Given I search for "Coldplay"
    When the search results are related to "Coldplay"
    And start playing the artist
    Then Verify that song is playing