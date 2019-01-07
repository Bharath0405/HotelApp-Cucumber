Feature: HotelApp Booking Cancellation Test 

Scenario: Cancellation is Successfull 

	Given User enters the home page 
	When User clicks on Booked Itinerary link 
	And User serach for the Itinerary 
	Then User selects an itinary to cancel 
	Then User clicks on cancel selected 
	And User confirms the concelation 
