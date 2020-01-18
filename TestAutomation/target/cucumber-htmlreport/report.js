$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('org\testcases\steps\Search.feature');
formatter.feature({
  "line": 1,
  "name": "Test Search functionality",
  "description": "",
  "id": "test-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login on facebook application.",
  "description": "",
  "id": "test-search-functionality;login-on-facebook-application.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a user is on the Login page \"www.facebook.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user gets email textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters username \"testing\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters password \"testing\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "www.facebook.com",
      "offset": 29
    }
  ],
  "location": "TC_002.a_user_is_on_the_Login_page(String)"
});
formatter.result({
  "duration": 7434731915,
  "status": "passed"
});
formatter.match({
  "location": "TC_002.user_email_textbox()"
});
formatter.result({
  "duration": 54842191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing",
      "offset": 22
    }
  ],
  "location": "TC_002.user_enters_username(String)"
});
formatter.result({
  "duration": 142222379,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing",
      "offset": 22
    }
  ],
  "location": "TC_002.user_enters_password(String)"
});
formatter.result({
  "duration": 176127558,
  "status": "passed"
});
formatter.match({
  "location": "TC_002.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 142666803,
  "status": "passed"
});
formatter.match({
  "location": "TC_002.user_is_on_home_page()"
});
formatter.result({
  "duration": 1194194109,
  "status": "passed"
});
});