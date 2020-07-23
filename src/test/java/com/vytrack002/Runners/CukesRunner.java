package com.vytrack002.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin,feature, tags,dryRun,glue
        plugin = {"html:target/cucumber-report.html", "json:target/json-report.json",
                "rerun:target/rerun-report.txt"},

        features = "src/test/resources/features",
        glue = "com/VyTack001/StepDefinitions",
        dryRun = false,
        tags = ""


)

public class CukesRunner {
}
