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
  "name": "A user with no Lending configured will see the Lending tab as an empty state",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@STK-2363/2473"
    },
    {
      "name": "@progression"
    }
  ]
});
formatter.step({
  "name": "a user is on the dashboard and clicks the Lending tab",
  "keyword": "When "
});
formatter.match({
  "location": "LendingPageSteps.a_user_is_on_the_dashboard_and_clicks_the_Lending_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an empty Lending tab state, an array of coins and an \"Explore Lending\" button displays",
  "keyword": "Then "
});
formatter.match({
  "location": "LendingPageSteps.an_empty_Lending_tab_state_an_array_of_coins_and_an_button_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user hovers on a coin, it\u0027s icon becomes larger and shows the current APY% that the coin has available on FTX",
  "keyword": "When "
});
formatter.match({
  "location": "LendingPageSteps.a_user_hovers_on_a_coin_it_s_icon_becomes_larger_and_shows_the_current_APY_that_the_coin_has_available_on_FTX()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user clicks on the Explore Lending button",
  "keyword": "When "
});
formatter.match({
  "location": "LendingPageSteps.a_user_clicks_on_the_Explore_Lending_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the lending tab of the market place is opened and the \"Connect FTX exchange\" button displays",
  "keyword": "Then "
});
formatter.match({
  "location": "LendingPageSteps.the_lending_tab_of_the_market_place_is_opened_and_the_button_displays(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
});