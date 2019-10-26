Feature: HotelApp Bulk Cancellation 

Scenario Outline: Cancellation of Multiple Bookings 

	Given User present on the home page 
	When User gives "<username>" and "<password>" 
	Then On the HotelApp booking page user clicks on Booked Itinerary link 
	Then User searches for booking to be cancelled with "<bookingID>" 
	And select the relevant booking 
	Then User clicks on Cancellation and confirms it 
	
	Examples: 
	
		|username|password|bookingID|
		|seleniumtesting|password1|MW137W2Q5M|
		|seleniumtesting|password1|622LP53046|
		|seleniumtesting|password1|5794J4W915|
		|seleniumtesting|password1|952ETK9X48|
		|seleniumtesting|password1|4316D4MKF8|
		|seleniumtesting|password1|3F44CY7W16|
		
		
