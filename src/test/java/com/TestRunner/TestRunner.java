package com.TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Feature", 
		glue = "com.StepDef",
		tags = "@Smoke"
	
		
		
		
)




	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}

