package com.letzautomate.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = "com.letzautomate.stepdefinitions")

public class LetzRun {
	
	
	
}
