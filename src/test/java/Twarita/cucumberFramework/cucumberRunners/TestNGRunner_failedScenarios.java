package Twarita.cucumberFramework.cucumberRunners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="@target/failedScenarios.txt",
		glue="Twarita/cucumberFramework/stepDefinitions",
		monochrome = true,
		//stepNotifications = true,
		plugin= {"pretty:target/TestReports/PrettyReport/mmt", 
				"html:target/TestReports/htmlReport/mmt.html",
				"junit:target/TestReports/JunitReport/mmt.xml",
				"json:target/TestReports/jsonReport/mmt.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				}
		)

public class TestNGRunner_failedScenarios extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
 
}
