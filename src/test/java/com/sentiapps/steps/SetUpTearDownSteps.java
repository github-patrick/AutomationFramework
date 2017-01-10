package com.sentiapps.steps;

import cucumber.api.java.After;
import org.apache.log4j.Logger;


/**
 * Created by patrick on 10/01/2017.
 */
public class SetUpTearDownSteps {

    Logger log = Logger.getLogger(SetUpTearDownSteps.class);

    @After("@Register")
    public void tearDownSignInFeature() {
        log.info("tear down method called to demonstrate tagged hooks");
    }
}
