$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/loginWithDataFromDatabase.feature");
formatter.feature({
  "line": 2,
  "name": "login to tecfios loginpage with data extracted from database",
  "description": "",
  "id": "login-to-tecfios-loginpage-with-data-extracted-from-database",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DBLoginFeature"
    }
  ]
});
formatter.before({
  "duration": 2529625000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to login valid credentials and open new account",
  "description": "",
  "id": "login-to-tecfios-loginpage-with-data-extracted-from-database;user-should-be-able-to-login-valid-credentials-and-open-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DBScenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1909318400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 3650790200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 3109708400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 5200721000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 190920800,
  "status": "passed"
});
formatter.after({
  "duration": 652415000,
  "status": "passed"
});
});