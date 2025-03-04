package Twarita.cucumberFramework.cucumberRunners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/test/java/Features",
		glue="Twarita/cucumberFramework/stepDefinitions",
		monochrome = true,
		dryRun=false,
		//stepNotifications = true,
		tags= "@OneWay",
		plugin= {"pretty:target/TestReports/PrettyReport/mmt", 
				"html:target/TestReports/htmlReport/mmt.html",
				"junit:target/TestReports/JunitReport/mmt.xml",
				"json:target/TestReports/jsonReport/mmt.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedScenarios.txt"
				}
		)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
 
}
