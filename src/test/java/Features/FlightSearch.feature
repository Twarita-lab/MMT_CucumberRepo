@FlightSearch
Feature: Search different type os flights

  @OneWay
  Scenario Outline: User should be able to search for one way flight
    Given User is on MMT homepage
    When User selects Mode of transport <modeOfTransport>
    And User selects type of trip as <tripType>
    Then Selects Departure date <departureDate>
    And Select origin <origin> and destination <destination>
    And User Click on "Search"
    Then user lands on Flight Lists page with FilterType <filterType> selected
        
 	Examples:
 	|	modeOfTransport	|	tripType 	|	departureDate	|	origin	|	destination	|	filterType	|
 	| Flights					| One Way 	|	Mar 19 2025	|	Kolkata	| Delhi				|	Cheapest		|
    
  @RoundTrip
  Scenario Outline: User should be able to search for Round Trip flight
    Given User is on MMT homepage
   	When User selects Mode of transport <modeOfTransport>
    And User selects type of trip as <tripType>
    Then "Return date" should be populated as "Current date + 2 days"
    Then user selects "From" city <origin> 
    And user selects "To" city <destination>
    And User selects Departure date as <departureDate>
    And User selects Return date as <returnDate>
    And User selects Adults <adults>, Childern <children>, Infants <infants>
    And User selects Choose travel class as <Travel class>
    And Select special fare as <specialFare>
    And click on "Search"
    Then User lands of "Flight Lists" page
    
  	Examples:
 	|	modeOfTransport	|		tripType 	|	origin	|	destination	|	
 	| 					| 	| 				|	|
