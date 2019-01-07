$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CancelBooking.feature");
formatter.feature({
  "name": "HotelApp Booking Cancellation Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Cancellation is Successfull",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "CancelBooking.user_enters_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Booked Itinerary link",
  "keyword": "When "
});
formatter.match({
  "location": "CancelBooking.user_clicks_on_Booked_Itinerary_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serach for the Itinerary",
  "keyword": "And "
});
formatter.match({
  "location": "CancelBooking.user_serach_for_the_Itinerary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects an itinary to cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "CancelBooking.user_selects_an_itinary_to_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on cancel selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CancelBooking.user_clicks_on_cancel_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirms the concelation",
  "keyword": "And "
});
formatter.match({
  "location": "CancelBooking.user_confirms_the_concelation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});