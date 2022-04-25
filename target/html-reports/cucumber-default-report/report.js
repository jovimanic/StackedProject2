$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/STK-2363.feature");
formatter.feature({
  "name": "Verifying empty states for products area",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user with no Lending is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.a_user_with_no_Lending_is_logged_in()"
});
formatter.result({
  "status": "passed"
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
formatter.scenario({
  "name": "A user with no Staking configured will see the Staking tab as an empty state",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@STK-2363/2474"
    },
    {
      "name": "@progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user with no Staking is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.a_user_with_no_Staking_is_logged_in()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Lilys-MBP-2\u0027, ip: \u0027fe80:0:0:0:141f:b81a:d7c4:15c4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.2.1\u0027, java.version: \u002717.0.3\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat jdk.proxy2/jdk.proxy2.$Proxy22.sendKeys(Unknown Source)\n\tat steps.LoginSteps.a_user_with_no_Staking_is_logged_in(LoginSteps.java:43)\n\tat ✽.a user with no Staking is logged in(file:src/test/java/features/STK-2363.feature:37)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the dashboard and clicks the Staking tab",
  "keyword": "When "
});
formatter.match({
  "location": "StakingPageSteps.a_user_is_on_the_dashboard_and_clicks_the_Staking_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "an empty Staking tab state and the \"Explore Staking\" button displays",
  "keyword": "Then "
});
formatter.match({
  "location": "StakingPageSteps.an_empty_Staking_tab_state_and_the_button_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a user clicks the Explore Staking button",
  "keyword": "When "
});
formatter.match({
  "location": "StakingPageSteps.a_user_clicks_the_Explore_Staking_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the staking tab of the market place is opened and the \"Connect FTX exchange\" button displays",
  "keyword": "Then "
});
formatter.match({
  "location": "StakingPageSteps.the_staking_tab_of_the_market_place_is_opened_and_the_button_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/STK-2367.feature");
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
  "name": "A user with bots subscribed, but not configured is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.A_user_with_bots_subscribed_but_not_configured_is_logged_in()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Lilys-MBP-2\u0027, ip: \u0027fe80:0:0:0:141f:b81a:d7c4:15c4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.2.1\u0027, java.version: \u002717.0.3\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat jdk.proxy2/jdk.proxy2.$Proxy22.sendKeys(Unknown Source)\n\tat steps.LoginSteps.A_user_with_bots_subscribed_but_not_configured_is_logged_in(LoginSteps.java:61)\n\tat ✽.A user with bots subscribed, but not configured is logged in(file:src/test/java/features/STK-2367.feature:6)\n",
  "status": "failed"
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
      "name": "@progression"
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
  "status": "skipped"
});
formatter.step({
  "name": "all bot set up cards will display including bot name, text \"Set up your bot to start trading\",and button \"Set up\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BotsPageSteps.all_bot_set_up_cards_will_display_including_bot_name_text_and_button(String,String)"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "a user clicks on the \"View all Bots\" button text",
  "keyword": "When "
});
formatter.match({
  "location": "BotsPageSteps.a_user_clicks_on_the_button_text(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a user is navigated to the Bots page and is able to view all bots available",
  "keyword": "Then "
});
formatter.match({
  "location": "BotsPageSteps.a_user_is_navigated_to_the_Bots_page_and_is_able_to_view_all_bots_available()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});