package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//features",
        glue = "Stepdefinition",
        dryRun = false,
        monochrome = false,
        plugin = {"pretty", "html:results/cucumber-reports.html", "json:results/cucumber.json",
                "junit:results/cucumber.xml"}
)
public class Run {
}
