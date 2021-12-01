$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Invalid user name and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginPageVerification"
    }
  ]
});
formatter.step({
  "name": "user navigates to login screen",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user gets error message \"Login Failed, please try again.\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "invalidUserName",
        "invalidPassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invalid user name and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginPageVerification"
    }
  ]
});
formatter.step({
  "name": "user navigates to login screen",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters \"invalidUserName\" and \"invalidPassword\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user gets error message \"Login Failed, please try again.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});