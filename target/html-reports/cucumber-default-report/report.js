$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/STK-2363.feature");
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
  "status": "passed"
});
formatter.step({
  "name": "Valid user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.valid_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "A user with no Staking configured will see the Staking tab as an empty state",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@STK-2363/2474"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "a user is on the dashboard and clicks the Staking tab",
  "keyword": "When "
});
formatter.match({
  "location": "StakingPageSteps.a_user_is_on_the_dashboard_and_clicks_the_Staking_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an empty Staking tab state and the \"Explore Staking\" button displays",
  "keyword": "Then "
});
formatter.match({
  "location": "StakingPageSteps.an_empty_Staking_tab_state_and_the_button_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user clicks the Explore Staking button",
  "keyword": "When "
});
formatter.match({
  "location": "StakingPageSteps.a_user_clicks_the_Explore_Staking_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the staking tab of the market place is opened and the \"Connect FTX exchange\" button displays",
  "keyword": "Then "
});
formatter.match({
  "location": "StakingPageSteps.the_staking_tab_of_the_market_place_is_opened_and_the_button_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});