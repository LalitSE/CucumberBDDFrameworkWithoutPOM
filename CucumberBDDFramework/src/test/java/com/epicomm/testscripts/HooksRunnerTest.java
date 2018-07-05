package com.epicomm.testscripts;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C://Users//Vishi//workspace//CucumberBDDFramework//src//main//java//com//epicomm//facebook//hooksFF//HooksFF.feature"},
		glue = {"com//epicomm//facebook//hooksSD"},
	//	dryRun = false
		
		/*plugin = {"preety",
					"html:target/cucmber-htmlreport",
					"json:target/cucumber-report.json"}
		*/
		plugin = {"preety",
				"com.cucumber.listner.ExtentCucumberFormatter:target/ExtentReport.html"
				}
)
public class HooksRunnerTest {

}
