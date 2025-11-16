package com.spotify.automation.steps;

import com.spotify.automation.pagesobject.UserHomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class UserHomePageSteps {
    @Page
    UserHomePage userHomePage;

    @Step("Ensure login succesful")
    public void iAmUserSpotifyPage(String value){
        userHomePage.buttonUser.waitUntilVisible();
        that(userHomePage.buttonUser.isVisible()).isTrue();
        that(userHomePage.buttonUser.getText()).contains(value);

    }

    @Step("Click button explorer playlist")
    public void clickExplorarPlaylist(){
        userHomePage.buttonExplorer.waitUntilVisible();
        userHomePage.buttonExplorer.click();
    }

}
