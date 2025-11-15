package com.spotify.automation.definitions;

import com.spotify.automation.steps.MusicSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class PlaySongStepDefinitions {

    @Steps
    MusicSteps musicSteps;

    @Then("Verify that song is playing")
    public void  theSongShoulBePlaying(){
        musicSteps.ensureStartPlaying();
    }

    @And("start playing the artist")
    public void playTheArtist(){
        musicSteps.clickArtist();
        musicSteps.clickPlay();
    }
}

