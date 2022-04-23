package utils;

public class Constants {

    /**
     * This class is to store final/constant variables to be accessed easily throughout the project
     * it is common practice for final variables to be in all CAPS
     */

    /**
     * String for file path of configuration properties file
     */
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+"/src/main/resources/config/config.properties";
    //String for file path of screenshot storage location 
    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir")+"/screenshots/";

    public static final String FAILED_SCENARIO_SCREENSHOT_FILEPATH = System.getProperty("user.dir")+"/screenshots/failed scenarios/";

    /**
     * integers for wait times in seconds
     */
    public static final int IMPLICIT_WAIT = 60;
    public static final int EXPLICIT_WAIT = 30;
    public static final int WAIT_FOR_VISIBILITY = 30;

    /**
     * Strings for storing page titles/page headers to assert against driver.getTitle()
     */
    public static final String DASHBOARD_HEADER = "Dashboard | Stacked";
    public static final String BOTS_PAGE_HEADER = "Bots | Stacked";

    /**
     * Strings for shared user accounts for STAGE/PROD env. - link to shared user accounts ->
     * https://www.notion.so/stackedinvest/4f7e66fdee53452f9365bfb9fb460566?v=c7eaae59690a4798830cde2cb4bd0d65
     */

    public static final String AAX_USERNAME = "qa-team+aax@stackedinvest.com";
    public static final String AAX_PASSWORD = "m2gRvrVqB6ozr3HKz7tR#";
    public static final String AAX_UID = "auth0|609bc80ce46e040069adf1c4";

    public static final String BINANCE1_USERNAME = "qa-team+binance-subaccount@stackedinvest.com";
    public static final String BINANCE1_PASSWORD = "9K6dpQzZxYJ86q7kwM3L#";
    public static final String BINANCE1_UID = "auth0|61167fe9e75a2f0069335739";

    public static final String BINANCE2_USERNAME = "qa-team+binance2@stackedinvest.com";
    public static final String BINANCE2_PASSWORD = "9K6dpQzZxYJ86q7kwM3L#";
    public static final String BINANCE2_UID = "auth0|60ec4a15604e71006f52fd7d";

    public static final String BINANCE_FUTURES_USERNAME = "qa-team+binance@stackedinvest.com";
    public static final String BINANCE_FUTURES_PASSWORD = "9K6dpQzZxYJ86q7kwM3L#";
    public static final String BINANCE_FUTURES_UID = "auth0|609bc08962a9f50068fd46a9a";

    public static final String COINBASE_USERNAME = "qa-team+coinbase@stackedinvest.com";
    public static final String COINBASE_PASSWORD = "St@ckedR0cks!";
    public static final String COINBASE_UID = "auth0|60ed884a766be60069ff5e55";

    public static final String BYBIT_USERNAME = "qa-team+bybit@stackedinvest.com";
    public static final String BYBIT_PASSWORD = "GR8JC4@a@Jb2FyUP!jci";
    public static final String BYBIT_UID = "auth0|609bc771b61f15007182cf7a";

    public static final String BITFINEX_USERNAME = "qa-team+bitfinex@stackedinvest.com";
    public static final String BITFINEX_PASSWORD = "RHBh-6G4.TAK*D_kFLUm";
    public static final String BITFINEX_UID = "auth0|609bc34162a9f50068fd5f31";

    public static final String FTX1_USERNAME = "qa-team+ftx@stackedinvest.com";
    public static final String FTX1_PASSWORD = "RHBh-6G4.TAK*D_kFLUm";
    public static final String FTX1_UID = "auth0|609aacb4ad162a0069d1b6eb";

    public static final String FTX2_USERNAME = "qa-team+lending@stackedinvest.com";
    public static final String FTX2_PASSWORD = "RHBh-6G4.TAK*D_kFLUm";
    public static final String FTX2_UID = "auth0|611140883c829701132a2010";

    public static final String KUCOIN_USERNAME = "qa-team+kucoin@stackedinvest.com";
    public static final String KUCOIN_PASSWORD = "uE_GMQ-UG4BPNoxkxYfL#";
    public static final String KUCOIN_UID = "auth0|609bc95bda1109007069b8a7";

    public static final String PHEMEX1_USERNAME = "qa-team+phemex@stackedinvest.com";
    public static final String PHEMEX1_PASSWORD = "m2gRvrVqB6ozr3HKz7tR#";
    public static final String PHEMEX1_UID = "auth0|609bc25d62a9f50068fd56b5";

    public static final String PHEMEX2_USERNAME = "qa-team+auto1@stackedinvest.com";
    public static final String PHEMEX2_PASSWORD = "m2gQzZK*D_7tR#";
    public static final String PHEMEX2_UID = "auth0|611e5d87cbc91f006a268e32";

    public static final String PHEMEX3_USERNAME = "qa-team+empty@stackedinvest.com";
    public static final String PHEMEX3_PASSWORD = "m2gQzZK*D_7tR#";
    public static final String PHEMEX3_UID = "auth0|6138cc86c51bb3006b9aa927";

    public static final String STACKS_STANDARD_USERNAME = "qa-team+stack@stackedinvest.com";
    public static final String STACKS_STANDARD_PASSWORD = "m7sNzZK*HU_7tSqR#";
    public static final String STACKS_STANDARD_UID = "auth0|619b7727346ff800713ef8d8";

    public static final String STACKS_PREMIUM_USERNAME = "qa-team+premium@stackedinvest.com";
    public static final String STACKS_PREMIUM_PASSWORD = "m7sNzZK*HU_7tSqR#";
    public static final String STACKS_PREMIUM_UID = "auth0|619f633720255f006a7a42d7";

    /**
     * Strings for shared exchange accounts
     */

    public static final String AAX_EXCHANGE_USERNAME = "dev-team@stackedinvest.com";
    public static final String AAX_EXCHANGE_PASSWORD = "m2gRvrVqB6ozr3HKz7tR";
    public static final String AAX_2FA_CODE ="JRIUYQBJJBESMR3F";
    public static final String AAX_EXCHANGE_BTC_DEPOSIT_ADDRESS = "1D3miHdzvSqnGHbeNdE9Fv4gvfufvE9ESE";
    public static final String AAX_EXCHANGE_API_KEY = "a0p4n6yljGnlkyH3m3uWg6FI5S";
    public static final String AAX_EXCHANGE_API_SECRET = "96a816b6da188a782b83f48489c097b6";

    public static final String BINANCE_EXCHANGE_USERNAME = "dev-team@stackedinvest.com";
    public static final String BINANCE_EXCHANGE_PASSWORD = "9K6dpQzZxYJ86q7kwM3L";
    public static final String BINANCE_2FA_CODE = "RMKVPJGRVYIDT4QT";
    public static final String BINANCE_EXCHANGE_BTC_DEPOSIT_ADDRESS = "155uFHMtwxHs2hqGo7hTABju5RivGjZLre";
    public static final String BINANCE_EXCHANGE_API_KEY = "IAZmG57uWrrz74eP4r85tR5jsU95HiQyn0ElOD8oJCQhDI5o1xKfynWxEBk30Ed2";
    public static final String BINANCE_EXCHANGE_API_SECRET = "DtwX29cAq49WZYD7H7XGIPjITqhivJJI95fUn7aYYjpA3GH1dNDUAu2mxnd11xHY";


    /**
     * Strings for bot names
     */
    public static final String STACKED_TEST_BOT = "Stacked Test Bot";
    public static final String STACKED_TEST_BOT2 = "Stacked Test Bot 2";
    public static final String STACKED_AUTOMATED_TEST_BOT = "Stacked Automated Test Bot";






}
