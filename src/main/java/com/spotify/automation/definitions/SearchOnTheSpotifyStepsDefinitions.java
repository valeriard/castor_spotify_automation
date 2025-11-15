package com.spotify.automation.definitions;

import com.spotify.automation.steps.HomePageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SearchOnTheSpotifyStepsDefinitions {

    @Steps
    HomePageSteps homePageSteps;

    @Given("that I am on the Spotify page")
    public void iAmOnTheSpotifyPage(){
       homePageSteps.openSpotifyPage();
    }

    @When("I search for {string}")
    public void iAmSearchingForColdplay(String valueSearch){
        homePageSteps.searchForColdplay(valueSearch);
    }

    @Then("the search results are related to {string}")
    public void thenResultsAreRelated(String valueSearch){
        homePageSteps.resultsOfSearch(valueSearch);
    }

}
