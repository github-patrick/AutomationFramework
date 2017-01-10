package com.sentiapps.steps;

import com.sentiapps.DriverBase;
import com.sentiapps.pages.HomePage;
import com.sentiapps.utils.Constants;
import com.sentiapps.utils.Navigation;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

/**
 * Created by patrick on 09/01/2017.
 */
public class HomePageSteps {

    private HomePage homePage;
    private AppiumDriver driver;

    public HomePageSteps() {
        driver = DriverBase.getInstance();
        homePage = Navigation.getHomePage(driver);
    }


    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        driver.get(Constants.TEST_URL);
    }

    @When("^I click on sign in$")
    public void i_click_on_sign_in() throws Throwable {
        homePage.goToLoginPage();

    }




}
