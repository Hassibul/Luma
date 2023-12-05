package orange.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./Features/"},
		glue = {"orange.ny.stepdefinition"}
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
