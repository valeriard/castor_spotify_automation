package com.spotify.automation.definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;

public class Hooks {
    @Before(order = 0)
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }
}
