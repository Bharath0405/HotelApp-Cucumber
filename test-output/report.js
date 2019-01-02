$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Bharath/workspace/HotelApp_CucumberProject/src/main/java/HotelApp_Features/LoginExamples.feature");
formatter.feature({
  "name": "HotelApp Application Testing with Examples",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Succefull login into Free CRM",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on the HotelApp homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks and enter the app",
  "keyword": "And "
});
formatter.step({
  "name": "Verify and close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "seleniumtesting",
        "password1"
      ]
    },
    {
      "cells": [
        "bharathreddy",
        "testing1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Succefull login into Free CRM",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on the HotelApp homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginExampls.user_is_already_on_the_hotelapp_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"seleniumtesting\" and \"password1\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginExampls.user_enters_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks and enter the app",
  "keyword": "And "
});
formatter.match({
  "location": "LoginExampls.clicks_and_enter_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginExampls.verify_and_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Succefull login into Free CRM",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on the HotelApp homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginExampls.user_is_already_on_the_hotelapp_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"bharathreddy\" and \"testing1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginExampls.user_enters_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks and enter the app",
  "keyword": "And "
});
formatter.match({
  "location": "LoginExampls.clicks_and_enter_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginExampls.verify_and_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});