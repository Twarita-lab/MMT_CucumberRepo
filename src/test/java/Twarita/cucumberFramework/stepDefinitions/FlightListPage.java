package Twarita.cucumberFramework.stepDefinitions;

import org.openqa.selenium.WebDriver;

import Twarita.cucumberFramework.utils.TestContextSetUp;
import io.cucumber.java.en.Then;

public class FlightListPage {
	public FlightListPage flightListPage;
	WebDriver driver;
	TestContextSetUp testContext;
	
	public FlightListPage(TestContextSetUp testContext) {
		this.testContext=testContext;
	}
	
	@Then("^user lands on Flight Lists page with FilterType (.+) selected$")
	public void user_lands_of_page_with_filter_type_cheapest_selected(String filterType) {
		flightListPage = testContext.flightListPage;
	}

}
