package steps;

import pages.BotsPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SeeAllExchangesPage;

public class PageInitializer {

    /**
     * This class is an initializer class which will initialize all pages classes, used for organization
     * and limiting code redundancy.
     * Once pages class is created, it will create an object of it inside the constructor
     */

    //declared public static variables of all page types

     /** Dashboard Page **/
    public static DashboardPage dashboardPage = new DashboardPage();
    public static LoginPage loginPage = new LoginPage();
    public static DashboardPage dashPage = new DashboardPage();
    public static BotsPage botsPage = new BotsPage();
    public static SeeAllExchangesPage seeAllExchangesPage = new SeeAllExchangesPage();
}
