Feature: Verifying empty states for products area

  #tagged name of test case in notion.so commented before scenario

  Background:
    Given Valid user is logged in

  @STK-2363/2472 @smoke
    #[STK-2363/2472] Empty state - Products area - Stacks
    #https://www.notion.so/stackedinvest/d252618bba5342e58727bcf4bd844ba8?v=32476471902b404c881aea2ee25f406d
  Scenario: A user with no Stacks configured will see the Stacks tab as an empty state
    When a user is on the dashboard and clicks the Stacks tab
    Then the Stacks tab is empty and the "Explore Stacks" button displays
    Then a static list of cards at the bottom of the Stacks tab displays the top seven stacks
    And the Stack cards are listed left-to-right by highest PnL for the selected time period
    And a hover shadow is captured in screenshot when a user hovers over a Stack
    When a user clicks on a stack card, the stack's details page is opened, "Stack Composition" displays
    When a user is on the dashboard page and clicks on the Explore Stacks button
    Then the stacks tab of the market place is opened and the "Standard Stacks" text displays

#Then a static list of cards at the bottom of the Stacks tab displays the top seven stacks "smartstack-v0-562","smartstack-v0-503","NFT Gaming","smartstack-v0-445","smartstack-v0-386","smartstack-v0-357","Bitpool 5"

  @STK-2363/2473 @progression
  #[STK-2363/2473] Empty state - Products area - Lending
    #https://www.notion.so/stackedinvest/fdc6a83d09534001ba02cfe734be706a?v=22b448c0a37f494587499a357b0caf23
  Scenario: A user with no Lending configured will see the Lending tab as an empty state
    When a user is on the dashboard and clicks the Lending tab
    Then an empty Lending tab state, an array of coins and an "Explore Lending" button displays
    When a user hovers on a coin, it's icon becomes larger and shows the current APY% that the coin has available on FTX
    When a user clicks on the Explore Lending button
    Then the lending tab of the market place is opened and the "Connect FTX exchange" button displays

  @STK-2363/2474 @progression
  #[STK-2363/2474] Empty state - Products area - Staking
    #https://www.notion.so/stackedinvest/146eadfc534645809c28fe3fa38b1029?v=b8103eb9b8ff4628ab397f1a41df9bb2
  Scenario: A user with no Lending configured will see the Lending tab as an empty state




