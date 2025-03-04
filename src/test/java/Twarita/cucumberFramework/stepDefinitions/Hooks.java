package Twarita.cucumberFramework.stepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Twarita.cucumberFramework.utils.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	TestContextSetUp testContext;
	
	public Hooks(TestContextSetUp testContext) {
		// TODO Auto-generated constructor stub
		this.testContext = testContext;
		
	}


	@Before
	public void beforeValid() {
		System.out.println("BeforeHook");
	}
	

	@Before("@OneWay")
	public void beforeOneWay() {
		System.out.println("Hook that will run only before One way");
	}
	
	@After()
	public void after() throws Exception {
		System.out.println("Hook that will run after each case");
		testContext.testBase.getDriver().quit();
}
	@AfterStep()
	public void getScreenshot(Scenario scenario) throws Exception {
		WebDriver driver = testContext.testBase.getDriver();
		if(scenario.isFailed()) {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileByte = FileUtils.readFileToByteArray(srcFile);
			scenario.attach(fileByte, "image/png", scenario.getName());
		}
}
}

