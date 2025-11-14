package com.spotify.automation.pagesobject;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://open.spotify.com/intl-es")
public class HomePage  extends PageObject {

    @FindBy(xpath = "//input[@role='combobox' and @type='search']")
    public WebElementFacade searchInput;

    @FindBy(css = "section[data-testid='search-tracks-result']")
    public WebElementFacade tracksResultSection;
}
