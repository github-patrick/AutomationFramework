package com.sentiapps.steps;

import com.sentiapps.DriverBase;
import com.sentiapps.pages.RegisterPage;
import com.sentiapps.user.User;
import com.sentiapps.user.UserGenerator;
import com.sentiapps.utils.Constants;
import com.sentiapps.utils.Navigation;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import junit.framework.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by patrick on 09/01/2017.
 */
public class RegisterSteps {

    private RegisterPage registerPage;
    private AppiumDriver driver;
    private User user;

    public RegisterSteps() {
        driver = DriverBase.getInstance();
        registerPage = Navigation.getRegisterPage(driver);
    }

    @When("^I click on register$")
    public void i_click_on_register() throws Throwable {
        registerPage.clickRegisterTabLink();
    }

    @Given("^I have filled all fields$")
    public void i_have_not_filled_all_fields() throws Throwable {
        user = UserGenerator.getFieldsFilledInUser();
    }

    @Given("^not the email field$")
    public void not_the_email_field() throws Throwable {
        user.setEmail("");
        registerPage.fillInAllFields(user);
    }

    @When("^I click on the register button$")
    public void i_click_on_the_register_button() throws Throwable {
        registerPage.clickOnRegisterBtn();
    }

    @Then("^I should be shown the email error message$")
    public void i_should_be_shown_the_email_error_message() throws Throwable {
        assertEquals("should show the correct email error message", Constants.REGISTER_EMAIL_ERROR_MSG,
                registerPage.getEmailErrorMsg());
    }

    @Given("^not the re enter email field$")
    public void not_the_re_enter_email_field() throws Throwable {
        user.setRemail("");
        registerPage.fillInAllFields(user);
    }

    @Then("^I should be shown the re enter email error message$")
    public void i_should_be_shown_the_re_enter_email_error_message() throws Throwable {
        assertEquals("should show the correct re-enter email error message", Constants.REGISTER_REMAIL_ERROR_MSG,
                registerPage.getRemailErrorMsg());
    }

    @Given("^not the password field$")
    public void not_the_password_field() throws Throwable {
        user.setPassword("");
        registerPage.fillInAllFields(user);
    }

    @Then("^I should be shown the password error message$")
    public void i_should_be_shown_the_password_error_message() throws Throwable {
        assertEquals("should show the correct password error message", Constants.REGISTER_PASSWORD_ERROR_MSG,
                registerPage.getPasswordErrorMgs());
    }

    @Given("^I have the email \"([^\"]*)\"$")
    public void i_have_the_email(String email) throws Throwable {
        user.setEmail(email);
        registerPage.fillInAllFields(user);
    }

    @Then("^I should be shown the email invalid error message$")
    public void i_should_be_shown_the_email_invalid_error_message() throws Throwable {
        assertEquals("should show the correct invalid email error message", Constants.REGISTER_VALID_EMAIL_ERROR_MSG,
                registerPage.getEmailErrorMsg());
    }


}
