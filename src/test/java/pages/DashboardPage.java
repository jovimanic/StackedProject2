package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;


public class DashboardPage extends WebDriverUtils {

@FindBy(xpath = "//body/div[@id='app']/div/div/main[@data-booted='true']/div/div/div/div/div[@layout='LayoutDefault']/div/div/div/button[@role='button']/span[1]")
public WebElement allTimeDropDown;

@FindBy(xpath = "//*[@id=\"mainMenu\"]/div/a[3]/button")
public WebElement botIcon;

@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div/div/div/div/div/div[1]/div[1]/div[2]/div/div[3]/button")
public WebElement rightArrowButton;

@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div/div/div/div/div/div[1]/div[1]/div[2]/div/div[1]/button")
public WebElement leftArrowButton;

@FindBy(xpath = "//p[.=' See All Exchanges ']")
public WebElement seeAllExchangesCard;

@FindBy(xpath = "//p[.='Coinbase']")
public WebElement coinbaseCard;

@FindBy(xpath = "//h1[.='Connect Coinbase']")
public WebElement connectCoinbase;

@FindBy(xpath = "//p[.='FTX']")
public WebElement ftxCard;

@FindBy(xpath = "//h1[.='Connect FTX']")
public WebElement connectFtx;

@FindBy(xpath = "//p[.='FTX US']")
public WebElement ftxUsCard;

@FindBy(xpath = "//h1[.='Connect FTX US']")
public WebElement connectFtxUs;

@FindBy(xpath = "//p[.='Binance']")
public WebElement binanceCard;

@FindBy(xpath = "//h1[.='Connect Binance']")
public WebElement connectBinance;

@FindBy(xpath = "//p[.='Bybit']")
public WebElement bybitCard;

@FindBy(xpath = "//h1[.='Connect Bybit']")
public WebElement connectBybit;

@FindBy(xpath = "//p[.='KuCoin']")
public WebElement kuCoinCard;

@FindBy(xpath = "//h1[.='Connect KuCoin']")
public WebElement connectKuCoin;



    public DashboardPage() {
        PageFactory.initElements(driver,this);}
}


