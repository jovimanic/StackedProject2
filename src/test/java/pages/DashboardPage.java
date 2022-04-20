package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static utils.WebDriverUtils.driver;


public class DashboardPage {

    /**__________ Main Page __________*/

@FindBy(xpath = "//body/div[@id='app']/div/div/main[@data-booted='true']/div/div/div/div/div[@layout='LayoutDefault']/div/div/div/button[@role='button']/span[1]")
public WebElement allTimeDropDown;

@FindBy(xpath = "//a[@href='/dashboard']//button[@type='button']//span//span[@aria-hidden='true']//*[name()='svg']")
public WebElement dashboardIconButton;

@FindBy(xpath = "//div[contains(text(),'Dashboard')]")
public WebElement dashboardTextButton;

@FindBy(xpath = "//a[@href='/exchange']//button[@type='button']//span//span[@aria-hidden='true']//*[name()='svg']")
public WebElement exchangeIconButton;

@FindBy(xpath = "//div[@role='tablist']//div//div[2]")
public WebElement stacksTab;

@FindBy(xpath = "//div[@role='tablist']//div//div[3]")
public WebElement lendingTab;

@FindBy(xpath = "//span[contains(text(), 'Explore Stacks')]")
public WebElement exploreStacksButton;

@FindBy(xpath = "//*[@id=\"mainMenu\"]/div/a[3]/button")
public WebElement botIcon;

@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div/div/div/div/div/div[1]/div[1]/div[2]/div/div[3]/button")
public WebElement rightArrowButton;

@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div/div/div/div/div/div[1]/div[1]/div[2]/div/div[1]/button")
public WebElement leftArrowButton;

@FindBy(xpath = "//a[@href='/exchange']//button[@type='button']//span//span[@aria-hidden='true']//*[name()='svg']")
public WebElement exchange;


/**__________ Exchange Cards __________*/

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

/**__________ Connect Exchange __________*/

@FindBy(xpath = "a[@href='/wizard']//button[@type='button']")
public WebElement connectExchangeButton;

/**__________ Stacks __________*/

@FindBy(xpath = "//a[contains(@href, \"/strategies/stack/\")]")
public List<WebElement> listOfStacks;

@FindBy(xpath = "//p[normalize-space()='smartstack-v0-562']")
public WebElement smartstackv0562Stack;

@FindBy(xpath = "//p[normalize-space()='smartstack-v0-503']")
public WebElement smartstackv0503Stack;

@FindBy(xpath = "//p[normalize-space()='NFT Gaming']")
public WebElement nftGamingStack;

@FindBy(xpath = "(//p[normalize-space()='smartstack-v0-445'])[1]")
public WebElement smartstackv0445Stack;

@FindBy(xpath = "//p[normalize-space()='smartstack-v0-386']")
public WebElement smartstackv0386Stack;

@FindBy(xpath = "//p[normalize-space()='smartstack-v0-357']")
public WebElement smartstackv0357Stack;

@FindBy(xpath = "//p[normalize-space()='Bitpool 5']")
public WebElement bitpool5Stack;

    /**__________ Lending __________*/


    public DashboardPage() {
        PageFactory.initElements(driver,this);}
}


