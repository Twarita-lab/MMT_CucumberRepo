package Twarita.cucumberFramework.cucumberRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="@target/failedScenarios.txt",
		glue="Twarita/cucumberFramework/stepDefinitions",
		monochrome = true,
		dryRun=false,
		stepNotifications = true,
		plugin= {"pretty:target/TestReports/PrettyReport/mmt", 
				"html:target/TestReports/htmlReport/mmt.html",
				"junit:target/TestReports/JunitReport/mmt.xml",
				"json:target/TestReports/jsonReport/mmt.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				}
		)

public class JUnitRunner_rerun {
	
	

}
