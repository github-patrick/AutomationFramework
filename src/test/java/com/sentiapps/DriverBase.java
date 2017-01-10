package com.sentiapps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by patrick on 08/01/2017.
 */
public class DriverBase {


    private static AppiumDriver<WebElement> driver;
    private static URL url;
    private static final String APPIUM_SERVER_LOCATION = "http://127.0.0.1:4723/wd/hub";

    private static Logger  log = Logger.getLogger(DriverBase.class);


    private DriverBase() {}


    public static AppiumDriver getInstance() {
        if (driver == null) {
            log.info("Creating new instance of Driver");
            createDriver();
        }
        return driver;
    }

    private static void createDriver() {
        try {
            url = new URL(APPIUM_SERVER_LOCATION);
            driver = new AndroidDriver(url, setUpCapabilities());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static DesiredCapabilities setUpCapabilities() {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung S6");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        log.info("Created new Desired Capabilities" +caps.toString());

        return caps;
    }

    public static void tearDown() {
        log.info("Tearing down driver instance and setting instance to null");
        driver.quit();
        driver = null;
    }



}
