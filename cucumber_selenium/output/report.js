$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/test/gcritlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Check customer login in www.gcrit.com/build3/login shopping portal",
  "description": " In order to verify that customer is already registered \r\n As a user of gcrit.com shopping portal\r\n I should be able to get the result that the page source contains the name of customer",
  "id": "check-customer-login-in-www.gcrit.com/build3/login-shopping-portal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "login",
  "description": "",
  "id": "check-customer-login-in-www.gcrit.com/build3/login-shopping-portal;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I open www.gcrit.com/build3/login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter email address and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should get result that the page source contains the name of customer",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});