package com.spotify.automation.definitions;

import com.spotify.automation.steps.LoginCompleteSteps;
import com.spotify.automation.steps.LoginPageSteps;
import com.spotify.automation.steps.UserHomePageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginPageSteps loginpage;

    @Steps
    UserHomePageSteps userHomePage;

    @Steps
    LoginCompleteSteps loginComplete;

    @Given("I go the page login")
    public void pageLogin(){
        loginpage.goToLoginPage();
    }

    @Given("I'm logged in to Spotify")
    public void loginComplete(){
        loginComplete.loginComplete();
    }

    @When("I enter a valid email")
    public void userEnterEmailSuccesful(){
        String email= System.getenv("VALID_EMAIL");
        loginpage.enterEmail(email);
        loginpage.clickButtonWithPassword();
    }

    @When("I enter an invalid email")
    public void iEnterInvalidEmail(){
        String email= System.getenv("INVALID_EMAIL");
        loginpage.enterEmail(email);
    }

    @Then("An error message must be shown")
    public void theUserIsInvalid() {
        loginpage.errorMessage();
    }

    @Then ("An error message password must be shown")
    public void theErrorMessageMustBeShown(){
        loginpage.bannerErrorMessage();
    }

    @Then("redirect to the user {string} homepage")
    public void iGoHomePage(String letter) {
        userHomePage.iAmUserSpotifyPage(letter);
    }

    @And("I enter an invalid password")
    public void iEnterInvalidPassword(){
        String password= System.getenv("INVALID_PASSWORD");
        loginpage.iEnterWithPassword(password);
    }
    @And("I enter a valid password")
    public void iEnterValidPassword(){
        String password= System.getenv("VALID_PASSWORD");
        loginpage.iEnterWithPassword(password);
    }

}
