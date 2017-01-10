package com.sentiapps.pages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.sentiapps.DriverBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by patrick on 09/01/2017.
 */
public class AbstractPage {

    private AppiumDriver driver;

    public AbstractPage() {
        super();
        driver = DriverBase.getInstance();
    }


    public void waitForElement(WebElement element) {
        Wait<WebDriver> wait = new FluentWait(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(ElementNotFoundException.class)
                .ignoring(ElementNotVisibleException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
