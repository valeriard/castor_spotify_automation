package com.spotify.automation.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.spotify.automation.definitions",
        tags = "@RegressionSpotify"
)
public class SpotifyPageRunner {
}
