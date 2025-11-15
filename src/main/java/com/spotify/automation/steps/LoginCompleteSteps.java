package com.spotify.automation.steps;

import com.spotify.automation.pagesobject.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class LoginCompleteSteps {

    @Steps
    HomePageSteps homePage;
    @Steps
    LoginPageSteps loginpage;

    @Step("Login User succesful")
    public void loginComplete(){
        String email = System.getenv("VALID_EMAIL");
        String password= System.getenv("VALID_PASSWORD");
        homePage.openSpotifyPage();
        loginpage.goToLoginPage();
        loginpage.enterEmail(email);
        loginpage.clickButtonWithPassword();
        loginpage.iEnterWithPassword(password);
    }
}
