package com.sentiapps.steps;

import com.sentiapps.DriverBase;
import com.sentiapps.pages.SignInPage;
import com.sentiapps.utils.Constants;
import com.sentiapps.utils.Navigation;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by patrick on 08/01/2017.
 */
public class SignInSteps {

    private AppiumDriver driver;
    private Logger log = Logger.getLogger(SignInSteps.class);
    private SignInPage signInPage;

    public SignInSteps() {
        driver = DriverBase.getInstance();

        log.info("Driver instance: " + driver.toString());
        signInPage = Navigation.getSignInPage(driver);
    }

    @Given("^all fields are blank$")
    public void all_fields_are_blank() throws Throwable {

    }

    @Given("^I am an invalid user$")
    public void i_am_an_invalid_user() throws Throwable {
        signInPage.fillEmailInvalid();
    }

    @When("^I attempt to sign in$")
    public void i_attempt_to_sign_in() throws Throwable {
        signInPage.clickSignInButton();
    }

    @Then("^I should be shown an error message$")
    public void i_should_be_shown_an_error_message() throws Throwable {
        assertEquals("should have the correct message", Constants.SIGNIN_ERROR_MSG,
                signInPage.getSignInErrorMessage());
    }

    @Given("^I have a valid email address$")
    public void i_have_a_valid_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a invalid password$")
    public void i_have_a_invalid_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a invalid email address$")
    public void i_have_a_invalid_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a valid password$")
    public void i_have_a_valid_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I am an valid user$")
    public void i_am_an_valid_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be signed in$")
    public void i_should_be_signed_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @After
    public void afterScenario() {
        DriverBase.tearDown();
    }


}
