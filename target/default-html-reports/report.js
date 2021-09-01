$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/threePoint.feature");
formatter.feature({
  "name": "Verify the info from all environment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "get the info from UI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user logs in with \"\" and \"\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user navigates to mySelf page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user gets UI info",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});