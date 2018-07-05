package com.epicomm.app.sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C://Users//Vishi//workspace//CucumberBDDFramework//src//main//java//com//epicomm//app//sample//sample.feature"},
		glue = {"com//epicomm//app//sample"}
		
		/*plugin = {"preety",
					"html:target/cucmber-htmlreport",
					"json:target/cucumber-report.json"}*/
				/*plugin = {"preety",
						"com.cucumber.listner.ExtentCucumberFormatter:target/ExtentReport.html"
						}*/
		/*format = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}*/
		
)
public class TestRunner {

}
