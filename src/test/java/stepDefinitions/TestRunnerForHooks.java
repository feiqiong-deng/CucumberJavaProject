package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Hooks/Hooks.feature", glue={"stepsForHooks"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports",
		  "junit:target/JUnitReports/report.xml",
		  "json:target/JSONReports/report.json"})
public class TestRunnerForHooks {

}
