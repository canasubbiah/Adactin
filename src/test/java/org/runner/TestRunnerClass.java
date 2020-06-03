package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Selenium Kannan\\Adactin\\src\\test\\resources\\FeatureFiles\\AdactinFull.feature", glue="org.stepdefinitionadactinful",
dryRun=false)

public class TestRunnerClass {
	
	
	

}
