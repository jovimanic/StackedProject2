$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Dashboard.feature");
formatter.feature({
  "name": "Stacked Invest Dashboard",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "All time values are displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is navigated to the stacked invest dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardSteps.a_user_is_navigated_to_the_stacked_invest_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the All Time drop down values \"YTD\",\"1Y\",\"6M\",\"3M\",and \"1M\" are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.the_All_Time_drop_down_values_and_are_displayed(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});