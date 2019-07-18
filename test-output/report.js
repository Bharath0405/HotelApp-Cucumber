$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Login.feature");
formatter.feature({
  "name": "HotelApp Application Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login into HotelApp",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the HotelApp homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_the_HotelApp_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the login status",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verify_the_login_status()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});