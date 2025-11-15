package com.spotify.automation.steps;

import com.spotify.automation.pagesobject.MusicPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class MusicSteps {
    @Page
    MusicPage musicPage;

    @Step("Click on Coldplay")
    public void clickArtist(){
        musicPage.buttonArtist.waitUntilVisible();
        musicPage.buttonArtist.click();
    }

    @Step("Click playList")
    public void clickPlay(){
        musicPage.buttonPlay.waitUntilVisible();
        musicPage.buttonPlay.click();
    }

    @Step("Verify start playing")
    public void ensureStartPlaying(){
        musicPage.buttonPlay.waitUntilVisible();
        that(musicPage.buttonPlay.getAriaLabel()).equals("Pausa");
    }
}
