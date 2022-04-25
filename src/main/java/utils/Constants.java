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
     * Strings for Database info
     */
    public static final String DATABASE_USERNAME = "stackeduser";
    public static final String DATABASE_NAME = "stacked";
    public static final String DATABASE_PASSWORD = "J8oqvLnSgoRexvMW";
    public static final String DATABASE_PORT = "5432";
    public static final String DATABASE_HOST = "stacked-aurora-db-postgres-stage.cluster-cfmlxazmsk2p.us-west-2.rds.amazonaws.com";
    public static final String SSH_TAB = "ec2-54-191-100-11.us-west-2.compute.amazonaws.com";
    public static final String DATABASE_KEY = "MIIEpQIBAAKCAQEAwJlz9zdPJVbbgcusSDNcuYPF9pQVp1coA2b6ngi9zhKdAd7V\n" +
            "12NyiBzxr1g9cQ2Cf6n4T+P0/lz2pajPkWfIQ6acit1lnrftbYciIjaHRO90opeK\n" +
            "Eb8XigIRo9WBS8v208UU8+bzxP9wduYd2IcUvFU1+v6kXcqKbdVJO/48Qy0B3/iN\n" +
            "PC3wBi5irgAa3yYCSYK0CQune+JPu8I+wweea3ZCBXmRV6P0gpAwfjxesyUkhv7w\n" +
            "O1XnBt8ZuNTErZ49tFy8vPB3koUuwJ6h8rLLpvUfpTryfn9vu6eoyKfxi23LxBmg\n" +
            "lnOYnXIJg/XCfYhuGfTVg0Frjk4F9rBHpFBbHwIDAQABAoIBAFy5hFtBBZm0d3nF\n" +
            "1OvtznaCOoy8PrCSBXGd4oqzKq5Lx8tevRU1i658QN9qXCpRlsJf0mykEw9jMlwP\n" +
            "Kd+XV5M6Y6N3c7U2V9ijdouCNR27KywcSRzCI1MOK+/0mosjZ3INMEk8p5/wWvTj\n" +
            "VPsqDZGedJ6ief+tw3edd+SqQdkUvELXXUScGYvH69iK343lq9eZJwgykUr3RlMA\n" +
            "XU3HPi6V6nytHAvNlWNbS2IIpfmuPgUky98NEWx7LOIXlLfEF97J6GOORpLoszii\n" +
            "zK4LD024bK2v53xI+Et2bwzfoVk5CWKzfFMiHiA1jasiiQRPhy5mGDw0SbgOqGb4\n" +
            "f3ZgsgECgYEA3xXV/i8J7ab5j3YbrL+TdKNSeusYUMKyUTh4cITVXTXg9BInVuh1\n" +
            "UMg9mtFa9Hyh0QU7ky0hpbp3GMO0lQzOITTTnCtSaoaO2J43cgzLXoqaR291M36G\n" +
            "ycvsHNDlc0YBUGeInjdaL9aPISCUatduVIoE+HnGVqUQdVoKkJJwjfUCgYEA3QQi\n" +
            "TFuarWhIGyIohMUtWLSv+X7YpjERvHtx6rAjnj26fQ2czXH1xRVRr6kVRuI6LS7q\n" +
            "sKBvk+opfE5nZovXQRVUn2vJU+rdXJ1KlYnM9wkURPKOAy9Z2CPMuifuxoH22Jrn\n" +
            "eb/0qSXAyHKRNhmzMPI7Go1GEW+ImHwvh2+Z5EMCgYEArdf3VchURVVsfuZ8NIdq\n" +
            "Imevu8f+v9ipWu/Vs2FgX+2/qpOHAovN+DDDCSWCaqnA9ADO5ycxZFPFwY+o5sn+\n" +
            "zBO9n6KG7CqFoLrS3FaqGLeL+IUb4RAFe7Yk/mOvmsAAACdeaGUcK9FY4mjgH85X\n" +
            "1RtlOjizXgvtonWTbAwiGA0CgYEAm6HemRBkYjmtlNW/3IaQgQdzZ2gIHTcueyAe\n" +
            "Ppnb6wEiwg6E3TKjUy3JAL46ylhhiRGhl9DR4UGiBvOa4l4UrLLdjQk0kxAu4pms\n" +
            "PJL1rvtIt6hpkhqU1JuY/XlDLau07CBgYZ5nJXj9QOlUEdmVEiFwtyjGL17vvBiu\n" +
            "y1st7csCgYEAgXBBVYzf7YaE6zAlwsluzXSWxptInqsnC4foIynhxRyTsHT/o0a2\n" +
            "/duiGN3KRxDett5uRyEcXlJMlnQLBZIIhlfuEWnxdED90vud7EyTY4OSAH6RdlYj\n" +
            "lLizvDgYfbKJOzeLme7Bkywq0PCsG/jgTQ5jrIjIGR7fe0jGR9b1UDE=";

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
