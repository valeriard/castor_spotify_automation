package com.spotify.automation.definitions;

import com.spotify.automation.steps.LoginPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginWasNotSuccesfulStepsDefinitions {

    @Steps
    LoginPageSteps loginPageSteps;

    @Given("^that I am on the Spotify page")
    public void iAmOnTheSpotifyPage(){
       loginPageSteps.openSpotifyPage();
    }

    @When("I search for Coldplay")
    public void iAmSearchingForColdplay(){
        loginPageSteps.searchForColdplay();
    }

    @Then("the search results are related to Coldplay")
    public void thenResultsAreRelated(){
        loginPageSteps.resultsOfSearch();
    }

}
