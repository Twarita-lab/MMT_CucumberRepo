package Twarita.cucumberFramework.stepDefinitions;

import org.openqa.selenium.WebDriver;

import Twarita.cucumberFramework.pageObjects.LandingPageObject;
import Twarita.cucumberFramework.utils.TestContextSetUp;
import io.cucumber.java.en.Given;

public class LandingPage {
	WebDriver driver;
	TestContextSetUp testContext;
	LandingPageObject landingPage;
	
	
	public LandingPage(TestContextSetUp testContext) {
		this.testContext=testContext;
		this.landingPage = testContext.pageObjectManger.getLandingPage();
		
	}
	
	

	@Given("User is on MMT homepage")
	public void user_is_on_mmt_homepage() {
		landingPage.closePopup();
		org.junit.Assert.assertEquals(testContext.genericUtilityMethods.getPageTitle() , "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	}

	
}
