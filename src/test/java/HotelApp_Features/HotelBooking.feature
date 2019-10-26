Feature: HotelApp Booking Test 

Scenario Outline: Successful Booking Confirmation 

	Given User is on hotel booking page with "<username>" and "<password>" 
	Then Selects the hotel location 
	And Selects Hotel 
	And Selects the type of room 
	And Chooses number of rooms 
	And enters "04/04/2019" and "05/05/2019" dates 
	And Selects number of Audlts in a room 
	And also mentions the number of children in a room 
	Then clicks on search button 
	And Selects the available room 
	Then User clicks on continue button 
	Then Enter billing details and click on book now 
	Examples: 
		|username|password|
		|seleniumtesting|password1|
		|bharathreddy|testing1234|