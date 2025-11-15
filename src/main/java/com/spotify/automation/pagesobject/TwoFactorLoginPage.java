package com.spotify.automation.pagesobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TwoFactorLoginPage extends PageObject {

    @FindBy(xpath = "//button[@data-encore-id='buttonTertiary']")
    public WebElementFacade loginWithPassword;

}
