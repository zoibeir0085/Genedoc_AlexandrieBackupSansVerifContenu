$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/ScenarioAlexandrie.feature");
formatter.feature({
  "name": "AlexandrieScenarioFeature",
  "description": "  This feature deals with the login functionality of the application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Scenario Alexandrie1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I navigate to the engagement page",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter the engagement code : \"\u003cengagement code\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I select the engagement",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate the engagement",
  "keyword": "Then "
});
formatter.step({
  "name": "I close the browser",
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
        "password",
        "engagement code",
        "cont1",
        "cont2",
        "cont3",
        "cont4",
        "cont5",
        "cont6",
        "cont7",
        "cont8"
      ]
    },
    {
      "cells": [
        "rgauvin@kpmg.fr",
        "aezan75",
        "1691869",
        "366 SAS",
        "101 boulevard Murat  75016 PARIS",
        "Olivier Fontaine",
        "366 SAS",
        "KPMG AUDIT FS I",
        "2 Avenue Gambetta",
        "Paris La D",
        "Tour EQHO"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Scenario Alexandrie1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Alexandrie.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"rgauvin@kpmg.fr\" and \"aezan75\"",
  "keyword": "And "
});
formatter.match({
  "location": "Alexandrie.iEnterUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Alexandrie.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the engagement page",
  "keyword": "Then "
});
formatter.match({
  "location": "Alexandrie.iNavigateToTheEngagementPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the engagement code : \"1691869\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Alexandrie.iEnterTheEngagementCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the engagement",
  "keyword": "Then "
});
formatter.match({
  "location": "Alexandrie.iSelectTheEngagement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the engagement",
  "keyword": "Then "
});
formatter.match({
  "location": "Alexandrie.iValidateTheEngagement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Alexandrie.iCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});