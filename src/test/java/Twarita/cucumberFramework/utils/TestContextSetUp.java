package Twarita.cucumberFramework.utils;

import org.openqa.selenium.WebDriver;

import Twarita.cucumberFramework.pageObjects.PageObjectsManager;
import Twarita.cucumberFramework.stepDefinitions.FlightBooking;
import Twarita.cucumberFramework.stepDefinitions.FlightListPage;
import Twarita.cucumberFramework.stepDefinitions.LandingPage;

public class TestContextSetUp {
	public WebDriver driver;
	public LandingPage landingPage;
	public FlightListPage flightListPage;
	public FlightBooking flightBookingPage;
	public PageObjectsManager pageObjectManger;
	public GenericUtilityMethods genericUtilityMethods;
	
	public BaseTest testBase;
	
	public TestContextSetUp() throws Exception {
		testBase = new BaseTest();
		this.driver = testBase.getDriver();
		pageObjectManger = new PageObjectsManager(driver);
		genericUtilityMethods = new GenericUtilityMethods(driver);
		
	}
}
