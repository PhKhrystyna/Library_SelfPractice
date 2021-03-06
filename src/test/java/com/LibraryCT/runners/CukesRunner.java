package com.LibraryCT.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json", //to generate json type of file, where the results will be stored in json format
                "rerun:target/rerun.txt" //to store failed tests in rerun.txt file
        },

        features = "src/test/resources/features",
        glue = "src/test/java/com/LibraryCT/step_definitions",
        dryRun = false,
        tags = ""
)




public class CukesRunner {

}
