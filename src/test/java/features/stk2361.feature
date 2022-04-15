@smoke
Feature: Exchange list and exchange connect process

  Scenario: New user should be able to see coinbase card to connect to from dashboard
    Given Valid user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the Coinbase card


  Scenario: New user should be able to see FTX card to connect to from dashboard
    Given Valid user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the FTX card


  Scenario: New user should be able to see FTX US card to connect to from dashboard
    Given Valid user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the FTX US card


  Scenario: New user should be able to see Binance card to connect to from dashboard
    Given Valid user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the Binance card


  Scenario: New user should be able to see Bybit card to connect to from dashboard
    Given Valid user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the Bybit card


  Scenario: New user should be able to see KuCoin card to connect to from dashboard
    Given Valid user is logged in
    And Click the right > button
    And Click the left < button
    And Click the > button until it disappears
    And Click the See All Exchanges card
    Then Click the Dashboard link
    And Click the KuCoin card
