$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/HotelBooking.feature");
formatter.feature({
  "name": "HotelApp Booking Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Booking Confirmation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on hotel booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelBooking.user_is_on_hotel_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects the hotel location",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBooking.selects_the_hotel_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.selects_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects the type of room",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.selects_the_type_of_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses number of rooms",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.chooses_number_of_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"04/04/2019\" and \"05/05/2019\" dates",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.enters_and_dates(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects number of Audlts in a room",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.selects_number_of_Audlts_in_a_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "also mentions the number of children in a room",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.also_mentions_the_number_of_children_in_a_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBooking.clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects the available room",
  "keyword": "And "
});
formatter.match({
  "location": "HotelBooking.selects_the_available_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBooking.user_clicks_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter billing details and click on book now",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBooking.enter_billing_details_and_click_on_booknow()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});