package com.sentiapps.pages;

import com.sentiapps.DriverBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by patrick on 08/01/2017.
 */
public class SignInPage extends AbstractPage {


    @FindBy(id="1311118244")
    private WebElement emailUsername;

    @FindBy(id="958405717")
    private WebElement password;

    @FindBy(id="sgnBt")
    private WebElement signInButton;

    @FindBy(css="#errf")
    private WebElement errorMessage;

    @FindBy(css=".ml51.tx")
    private WebElement registerTabLink;


    public SignInPage() {}

    public void fillEmailInvalid() {
        emailUsername.sendKeys("invalid@email");
    }

    /**
     * @param emailOrUsername email or username to be passed to populate the input field
     * */
    public void fillEmailOrUsername(String emailOrUsername){
        emailUsername.sendKeys(emailOrUsername);
    }

    public void clickSignInButton() {
        waitForElement(signInButton);
        signInButton.click();
    }

    public String getSignInErrorMessage() {
        return errorMessage.getText();
    }

    public void clickRegisterTabLink() {
        registerTabLink.click();
    }


}
