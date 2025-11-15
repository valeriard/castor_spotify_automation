package com.spotify.automation.definitions;


import com.spotify.automation.steps.ExplorerPlayListsSteps;
import com.spotify.automation.steps.UserHomePageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class PlayListStepDefinitions {

    @Steps
    UserHomePageSteps userHome;

    @Steps
    ExplorerPlayListsSteps explorerPlayList;

    @Given("I navigate to explore playlists")
    public void iReadyForTheExplorer(){
        userHome.clickExplorarPlaylist();
    }

    @When("I choosen {string} playlists")
    public void iChooseToPlaylist(String value){
        explorerPlayList.selectItem(value);
    }

    @Then("I should see public {string} playlists")
    public void iShouldSeePublicPlaylists(String value){
        explorerPlayList.chekPlayList(value);
    }

}
