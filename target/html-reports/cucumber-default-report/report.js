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
  "name": "A user with no Bots configured, but bots subscribed will see bot set up cards",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@STK-2367"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "a user is on the dashboard and clicks the Bots tab",
  "keyword": "When "
});
formatter.match({
  "location": "BotsPageSteps.a_user_is_on_the_dashboard_and_clicks_the_Bots_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all bot set up cards will display including bot name, text \"Set up your bot to start trading\",and button \"Set up\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BotsPageSteps.all_bot_set_up_cards_will_display_including_bot_name_text_and_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user clicks on all of the bot Set up buttons, the bot set up page displays with data :",
  "rows": [
    {
      "cells": [
        "Basic Settings",
        "Risk management",
        "Trade management",
        "Select Exchange",
        "Execution enabled",
        "Equity",
        "Leverage",
        "Cross margin",
        "Stop loss",
        "Take profit"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "BotsPageSteps.a_user_clicks_on_all_of_the_bot_Set_up_buttons_the_bot_set_up_page_displays_with_data(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user clicks on the \"View all Bots\" button text",
  "keyword": "When "
});
formatter.match({
  "location": "BotsPageSteps.a_user_clicks_on_the_button_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user is navigated to the Bots page and is able to view all bots available",
  "keyword": "Then "
});
formatter.match({
  "location": "BotsPageSteps.a_user_is_navigated_to_the_Bots_page_and_is_able_to_view_all_bots_available()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});