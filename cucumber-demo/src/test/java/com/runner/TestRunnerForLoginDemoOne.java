package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/Feature",
		glue       = "com.stepdefinition",
		monochrome = true,
		plugin = {"pretty", "junit:target/JUnitReports/report.xml",
						"json:target/JSONReport/report.json",
						"html:target/HtmlReports"},
		tags="@Login"
				
		)






		
public class TestRunnerForLoginDemoOne {

}
