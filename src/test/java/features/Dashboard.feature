
Feature: Stacked Invest Dashboard

@smoke
  Scenario: All time values are displayed
    Given a user is navigated to the stacked invest dashboard page
    Then the All Time drop down values "YTD","1Y","6M","3M",and "1M" are displayed

