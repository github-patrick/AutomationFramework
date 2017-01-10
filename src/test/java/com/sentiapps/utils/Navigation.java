package com.sentiapps.utils;

import com.sentiapps.pages.HomePage;
import com.sentiapps.pages.RegisterPage;
import com.sentiapps.pages.SignInPage;
import com.sentiapps.steps.SignInSteps;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by patrick on 08/01/2017.
 */
public class Navigation {

    private static Logger log = Logger.getLogger(Navigation.class);


    public static HomePage getHomePage(AppiumDriver driver) {
        return PageFactory.initElements(driver, HomePage.class);
    }

    public static SignInPage getSignInPage(AppiumDriver driver) {
        log.info("Initialising the "+ SignInPage.class.getSimpleName());
        return PageFactory.initElements(driver, SignInPage.class);
    }

    public static RegisterPage getRegisterPage(AppiumDriver driver) {
        log.info("Initialising the "+ RegisterPage.class.getSimpleName());
        return PageFactory.initElements(driver, RegisterPage.class);
    }
}
