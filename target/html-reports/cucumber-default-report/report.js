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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //div[@role\u003d\u0027tablist\u0027]//div[5]\u0027 (tried for 30 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat utils.WebDriverUtils.waitForVisibility(WebDriverUtils.java:50)\n\tat steps.BotsPageSteps.a_user_clicks_on_all_of_the_bot_Set_up_buttons_the_bot_set_up_page_displays_with_data(BotsPageSteps.java:59)\n\tat ✽.a user clicks on all of the bot Set up buttons, the bot set up page displays with data :(file:src/test/java/features/STK-2367.feature:15)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@role\u003d\u0027tablist\u0027]//div[5]\"}\n  (Session info: chrome\u003d100.0.4896.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Lilys-MBP-2\u0027, ip: \u0027fe80:0:0:0:18d4:c3c5:a7df:90da%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.2.1\u0027, java.version: \u002718\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.127, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: /var/folders/8n/xydvyysn7w7...}, goog:chromeOptions: {debuggerAddress: localhost:59306}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7fe464fb310b17ca922884f6893c3a76\n*** Element info: {Using\u003dxpath, value\u003d//div[@role\u003d\u0027tablist\u0027]//div[5]}\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat jdk.proxy2/jdk.proxy2.$Proxy22.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat utils.WebDriverUtils.waitForVisibility(WebDriverUtils.java:50)\n\tat steps.BotsPageSteps.a_user_clicks_on_all_of_the_bot_Set_up_buttons_the_bot_set_up_page_displays_with_data(BotsPageSteps.java:59)\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:577)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n",
  "status": "failed"
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