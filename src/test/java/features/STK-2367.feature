Feature: Verifying empty states for products area

  #tagged name of test case in notion.so commented before scenario

  Background:
    Given Valid user is logged in

  @STK-2367 @smoke
    #run test with username2=tiffanie.sandin@stackedinvest.com (no bots configured)
  #[STK-2367] Populated state - Bots (User is subscribed to Bot(s), but Bot(s) not yet configured)
    #https://www.notion.so/stackedinvest/b1a62bee9f954fde97ea85b9f10a0c1c?v=fec4bacc916a483ab7b9bdc298854e51
  Scenario: A user with no Bots configured, but bots subscribed will see bot set up cards
    When a user is on the dashboard and clicks the Bots tab
    Then all bot set up cards will display including bot name, text "Set up your bot to start trading",and button "Set up"
    When a user clicks on all of the bot Set up buttons, the bot set up page displays with data :

      | Basic Settings | Risk management | Trade management | Select Exchange | Execution enabled | Equity | Leverage | Cross margin | Stop loss | Take profit |
    
    When a user clicks on the "View all Bots" button text
    Then a user is navigated to the Bots page and is able to view all bots available

