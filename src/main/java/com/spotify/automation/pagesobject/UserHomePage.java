package com.spotify.automation.pagesobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class UserHomePage extends PageObject {

    @FindBy(xpath = "//button[@data-testid='user-widget-link']")
    public WebElementFacade buttonUser;

    @FindBy(xpath = "//button[@data-testid=\"browse-button\"]")
    public WebElementFacade buttonExplorer;

}
