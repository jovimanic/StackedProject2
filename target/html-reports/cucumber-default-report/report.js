$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/STK-2367.feature");
formatter.feature({
  "name": "Verifying empty states for products area",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Valid user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.valid_user_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "A user with no Bots configured will see the Bots tab as an empty state",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@STK-2363/2475"
    },
    {
      "name": "@progression"
    },
    {
      "name": "#inprogress"
    },
    {
      "name": "#need"
    },
    {
      "name": "user"
    },
    {
      "name": "on"
    },
    {
      "name": "new"
    },
    {
      "name": "dashboard"
    },
    {
      "name": "with"
    },
    {
      "name": "no"
    },
    {
      "name": "bots"
    },
    {
      "name": "to"
    },
    {
      "name": "test"
    }
  ]
});
formatter.step({
  "name": "a user is on the dashboard and clicks the Bots tab",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a user will see bots subscribed but not yet configured, bot set up cards will display",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "bot set up cards will include bot name, text \"Set up your bot to start trading\", and button \"Set up\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a user clicks on the Set up button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the bot set up page displays",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a user clicks on the \"View All Bots\" button text",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a user is navigated to the Bots page and is able to view all bots available",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});