Feature: HotelApp Application Testing with Examples

Scenario Outline: Succefull login into HotelApp

	Given User is already on the HotelApp homepage
	When User enters the "<username>" and "<password>"
	And clicks and enter the app
	Then Verify and close the browser 
	
	Examples: 
		|username|password|
		|seleniumtesting|password1|
		|bharathreddy|testing1234|
		
		
