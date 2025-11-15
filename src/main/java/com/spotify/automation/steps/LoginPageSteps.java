package com.spotify.automation.steps;

import com.spotify.automation.pagesobject.HomePage;
import com.spotify.automation.pagesobject.LoginPage;
import com.spotify.automation.pagesobject.TwoFactorLoginPage;
import com.spotify.automation.pagesobject.UserHomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class LoginPageSteps {

    @Page
    LoginPage loginpage;
    HomePage homepage;
    TwoFactorLoginPage twofactorlogin;
    UserHomePage userHomePage;

    @Step("Go to login page")
    public void goToLoginPage(){
        homepage.buttonLogin.click();
    }

    @Step("Login in with valid email")
    public void enterEmail(String email){
        loginpage.buttonContinue.waitUntilVisible();
        loginpage.inputUser.clear();
        loginpage.inputUser.type(email);
        loginpage.buttonContinue.click();

    }

    @Step("Enter With Password")
    public void iEnterWithPassword(String password){
        loginpage.inputPassword.type(password);
        loginpage.buttonLogin.click();
    }

    @Step("Ensure invalid user")
    public void errorMessage(){
        that(loginpage.usernameErrorMessage.isVisible()).isTrue();
    }

    @Step("Ensure invalid password")
    public void bannerErrorMessage(){
        that(loginpage.bannerError.isVisible()).isTrue();
    }

    @Step("ContinueWithLogin")
    public void clickButtonWithPassword(){
        twofactorlogin.loginWithPassword.waitUntilVisible();
        twofactorlogin.loginWithPassword.click();
    }


}
