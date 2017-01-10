package com.sentiapps.pages;

import com.sentiapps.DriverBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by patrick on 08/01/2017.
 */
public class HomePage extends AbstractPage{

    @FindBy(id = "signinlnk")
    private WebElement signInLink;

    private RemoteWebDriver driver;


    public HomePage() {}

    public void goToLoginPage() {
        waitForElement(signInLink);
        signInLink.click();
    }
}
