#language:en
  #Author: Valeriard1993@gmail.com
@RegressionSpotify
Feature: play a playlist
  Background:
    Given I'm logged in to Spotify

  @PlayList
  Scenario: I'm going to search for a playlist
    Given I navigate to explore playlists
    When I choosen "Latina" playlists
    Then I should see public "Latina" playlists
