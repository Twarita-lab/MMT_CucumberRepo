@FlightBooking
Feature: Book Flights

Background:
		Given User is on MMT homepage
    When User selects Mode of transport "Flights"
    

  @OneWay
  Scenario Outline: User should be able to book a One way flight
    When User selects type of trip as <tripType>
    And user selects "From" city <origin> 
    And user selects "To" city <destination>
    And Selects Departure date <departureDate>
    And User selects Adults <adults>, Childern <children>, Infants <infants>
    And User selects Choose travel class as <Travel class>
    And Select special fare as <specialFare>
    And User Click on "Search"
    Then user lands on Flight Lists page with FilterType <filterType> selected
    When user clicks on "VIEW PRICES" for flight based on criteria <flightSelectionCriteria>
    Then All fare options should be displayed
    And Select Book Now for Fare Type <fareType>
    Then User should be moved to Flight confirmation page
    And Verify following details
    | <origin> | <destination> | <departureDate> | <specialFare> | <fareType> | Price |
    When Trip Secure is selected as <tripSecure>
    And Add passenger details for Passenger based on number of Adults <adults>, Childern <children>, Infants <infants>
    And Add Booking details will be sent to Country Code <CountryCode>, Mobile No <MobileNo>, Email <Email>
    And User Click on "Continue"
    Then Verify passenger details
    And User Click on "Confirm"
    Then select a seat
    And Verify the price is added to the Total Amount
    Then User Click on "Continue"
    And User Click on "Continue"
    And User Click on "Proceed to pay"
    Then User should be moved to Payment page.

    Examples: 
      | tripType | origin  | destination | departureDate	| adults | children | infants | Travel class            | specialFare  | filterType | flightSelectionCriteria | fareType | tripSecure | CountryCode | MobileNo   | Email         |
      | OneWay  | Kolkata | Dubai       | Mar 19 2025	|     1 |        0 |       1 | Economy/Premium Economy | Armed Forces | Cheapest   | Earliest                | SPICEMAX | No         | India         | 8170043222 | abc@gmail.com |
