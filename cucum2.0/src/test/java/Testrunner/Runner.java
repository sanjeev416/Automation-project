package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Requirements/login.feature", glue = "Stepdefinition",dryRun = false)

public class Runner {
	
	

}
 