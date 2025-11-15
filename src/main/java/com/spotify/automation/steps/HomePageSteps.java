package com.spotify.automation.steps;

import com.spotify.automation.pagesobject.HomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class HomePageSteps {

    @Page
    HomePage homepage;

    @Step("open Spotify Page")
    public void openSpotifyPage(){
        homepage.open();
    }

    @Step("Search for Coldplay")
    public void searchForColdplay(String value){
        homepage.searchInput.waitUntilVisible();
        homepage.searchInput.clear();
        homepage.searchInput.type(value);
    }

    @Step("Ensure the results")
    public void resultsOfSearch(String value){
        that(homepage.tracksResultSection.isVisible()).isTrue();
        that(homepage.tracksResultSection.getText()).contains(value);
    }

}
