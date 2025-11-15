package com.spotify.automation.pagesobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MusicPage extends PageObject {

    @FindBy(xpath = "//div[@data-testid='herocard-click-handler']")
    public WebElementFacade buttonArtist;

    @FindBy(xpath = "//div[@data-testid='action-bar-row']//button[@data-testid='play-button']")
    public WebElementFacade buttonPlay;

}
