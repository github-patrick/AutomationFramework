package com.sentiapps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by patrick on 09/01/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions (
        tags = {"@P1", "@P2", "@P3", "@P4", "@Register", "@Build", "@Regression"},
        format = {"pretty", "html:target/html", "json:target/cucumber-report.json"},
        features = "src/test/java/com/sentiapps/features/")
public class CukesRunnerTest {

}
