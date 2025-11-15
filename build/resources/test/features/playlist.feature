#language:en
  #Author: Valeriard1993@gmail.com
@PlayList
Feature: play a playlist
  Background:
    Given I'm logged in to Spotify

  Scenario: I'm going to search for a playlist
    Given I navigate to explore playlists
    When I choosen "Latina" playlists
    Then I should see public "Latina" playlists