$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Vishi/workspace/CucumberBDDFramework/src/main/java/com/epicomm/app/sample/sample.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login feature",
  "description": "As a user i need to open facebook page and do the validation",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate First Name field",
  "description": "",
  "id": "facebook-login-feature;validate-first-name-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters user first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User checks user first name is present",
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