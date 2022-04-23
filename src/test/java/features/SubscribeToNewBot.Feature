Feature: Subscribe to new Bot

    #tagged name of test case in notion.so commented before scenario

  Scenario: User should be able to subscribe to new Bot
    Given User is logged in
    Then Click on the robot head icon from left navigation panel
    Then Click on the Bots tab
    Then Click on any Bot
    Then Click the purchase button
    And Fill all required fields
    Then Click the subscribe button
    Then Return To the Stacked site