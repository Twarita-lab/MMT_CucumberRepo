package Twarita.cucumberFramework.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Twarita.cucumberFramework.pageObjects.LandingPageObject;
import Twarita.cucumberFramework.utils.TestContextSetUp;
import io.cucumber.java.en.When;

public class FlightSearch {
	WebDriver driver;
	TestContextSetUp testContext;
	LandingPageObject landingPage;

	public FlightSearch(TestContextSetUp testContext) {
		this.testContext = testContext;
		this.landingPage = testContext.pageObjectManger.getLandingPage();
		
	}

	@When("^User selects Mode of transport (.+)$")
	public void user_selects_mode_of_transport(String transportMode) {
		landingPage.selectModeOfTransport(transportMode);

	}

	@When("^User selects type of trip as (.+)$")
	public void user_selects_type_of_trip(String tripType) {
		landingPage.selectTypeOfTrip(tripType);
	}

	@When("^user selects (.+) city (.+)$")
	public void select_origin_and_destination(String typeOfPlace, String city) throws Exception {

		landingPage.selectCity(typeOfPlace, city);

	}

	@When("^Selects Departure date (.+)$")
	public void selects_departure_date_departure_date(String departureDate) {
		testContext.driver.findElement(By.cssSelector("[aria-label*='" + departureDate + "']")).click();
	}

	@When("User selects Adults {int}, Childern {int}, Infants {int}")
	public void user_selects_adults_childern_infants(Integer int1, Integer int2, Integer int3) {
	}

	@When("^User selects Choose travel class as (.+)$")
	public void user_selects_choose_travel_class(String travelClass) {
	}

	@When("^Select special fare as (.+)$")
	public void select_special_fare(String specialFare) {

	}

	@When("^User Click on (.+)$")
	public void click_on(String callToActionButton) {
		System.out.println(callToActionButton);
		WebElement buttonToBeClick = testContext.driver
				.findElement(By.xpath("//a[contains(text()," + callToActionButton + ")]"));
		System.out.println(buttonToBeClick);
		buttonToBeClick.click();
	}

}
