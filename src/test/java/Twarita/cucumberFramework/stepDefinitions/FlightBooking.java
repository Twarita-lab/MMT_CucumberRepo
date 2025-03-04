package Twarita.cucumberFramework.stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Twarita.cucumberFramework.utils.TestContextSetUp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightBooking {
	WebDriver driver;
	TestContextSetUp testContext;
	
	public FlightBooking(TestContextSetUp testContext) {
		this.testContext=testContext;
	}
	
	@When("user clicks on {string} for flight based on criteria Earliest")
	public void user_clicks_on_for_flight_based_on_criteria_earliest(String string) {
	}

	@Then("All fare options should be displayed")
	public void all_fare_options_should_be_displayed() {
	}

	@Then("^Select Book Now for Fare Type (.+)$")
	public void select_for_fare_type(String fareType) {
	}

	@Then("User should be moved to Flight confirmation page")
	public void user_should_be_moved_to_flight_confirmation_page() {
	}

	@Then("^Verify following details$")
	public void verify_following_details(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<List<String>> data = dataTable.asLists();
		
	}

	@When("^Trip Secure is selected as (.+)$")
	public void trip_secure_is_selected_as_no(String tripSecureoption) {
	}

	@When("Add passenger details for Passenger based on number of Adults {int}, Childern {int}, Infants {int}")
	public void add_passenger_details_for_passenger_based_on_number_of_adults_childern_infants(Integer int1,
			Integer int2, Integer int3) {
	}

	@When("^Add Booking details will be sent to Country Code (.+), Mobile No (.+), Email (.+)$")
	public void add_booking_details_will_be_sent_to(String countryCode, String mobileNumber, String email) {
	}

	@Then("Verify passenger details")
	public void verify_passenger_details() {
	}

	@Then("select a seat")
	public void select_a_seat() {
	}

	@Then("Verify the price is added to the Total Amount")
	public void verify_the_price_is_added_to_the_total_amount() {
	}

	@Then("User should be moved to Payment page.")
	public void user_should_be_moved_to_payment_page() {

	}

}
