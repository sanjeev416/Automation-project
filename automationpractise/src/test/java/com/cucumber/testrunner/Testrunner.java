package com.cucumber.testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//cucumber//feature", glue = "com.cucumber.stepdefinition")

public class Testrunner {
	
	}
	

	

