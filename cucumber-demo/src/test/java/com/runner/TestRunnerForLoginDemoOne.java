package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/Feature",
		glue       = "com.stepdefinition",
		monochrome = true,
	//plugin = "html:target"
		//plugin = {"pretty", "json:target/JSONReport/report.json"}
				plugin = {"pretty", "junit:target/JUnitReports/report.xml"}
		)

		
public class TestRunnerForLoginDemoOne {

}
