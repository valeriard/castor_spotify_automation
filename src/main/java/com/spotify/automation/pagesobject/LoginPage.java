package com.spotify.automation.pagesobject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@data-testid='login-username']")
    public WebElementFacade inputUser;

    @FindBy(xpath = "//button[.//span[normalize-space()='Continuar']]")
    public WebElementFacade buttonContinue;

    @FindBy(id = "username-error")
    public WebElementFacade usernameErrorMessage;

    @FindBy(id = "password")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button[@data-testid='login-button']")
    public WebElementFacade buttonLogin;

    @FindBy(xpath = "//div[@data-encore-id=\'banner\']")
    public WebElementFacade bannerError;


}
