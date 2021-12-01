package org.naic.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/login.feature",
        glue = "steps_definitions",
        dryRun = false,
        tags = "@loginPageVerification"


)
public class CukesRunner {

    @BeforeClass
    public static void setUp(){
    }
}
