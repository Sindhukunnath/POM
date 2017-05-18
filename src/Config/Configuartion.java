package Config;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class Configuartion {
//testsite
public static final String testsite= "https://uk.hotels.com";

    //login page
    public static final String loginlink = "//*[@id='hdr-account']";
    public static final String  signinlink = "//*[@id='hdr-signin']";
    public static final String  username= "//*[@id='sign-in-email']";
    public static final String  password= "//*[@id='sign-in-password']";
    public static final String  signinbutton= "/html/body/div[6]/div/div[1]/div/div/form/div[2]/button";


    //myaccountpage
    public static final String link = "//*[@id='hdr-account']";
    public static final String accountlink = "//*[@id='hdr-manage-account']";
    public static final String settings = "//*[@id='item-settings']/a";
    public static final String payments = "//*[@id='item-payments']/a";
    public static final String yourreviews = "//*[@id='item-reviews']/a";

    //welcomerewardspage
    public static final String rewards =  "//*[@id='hdr-rewards']";
    public static final String yourrewards = "//*[@id='hdr-rewards-yourrewards']";

    //yourbookingspage
    public static final String mybookings = "//*[@id='hdr-customer-bookings']";

    //findbookingspage
    public static final String findbookingslink = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div[3]/a";
    public static final String  confirmationnumber= "//*[@id=\"fb-conf-num\"]";
    public static final String  lastname="//*[@id=\"fb-conf-lastname\"]";
    public static final String findbookingbutton =  "//*[@id=\"confirmation-number\"]/form/button";

    //landing pages

    public static final String travelGuide= "//*[@id='resp-footer']/div/div[1]/div[1]/ul[2]/li[1]/a";
    public static final String  top50cities = "//*[@id='resp-footer']/div[2]/div[1]/div[1]/ul[2]/li[2]/a";
    public static final String  allcountries = "//*[@id=\"resp-footer\"]/div[2]/div[1]/div[1]/ul[2]/li[3]/a";


    public static final String  allcountriessub ="//*[@id=\"allcountries\"]/div[2]/div/div/div/div[1]/div/ul/li[4]/a/bdi";
    public static final String  showdeals ="//*[@id=\"countrylanding\"]/div[3]/div/div/div/div[2]/div/div/div/form/div[4]/button";
    public static final String allhotels ="//*[@id=\"resp-footer\"]/div[2]/div[1]/div[1]/ul[2]/li[4]/a";
    public static final String  allhotelpage1="//*[@id=\"hotelindex\"]/div[3]/div/div/div/div/div/ul/li[3]/a/bdi";
    public static final String  allhotelpage2= "//*[@id=\"hotelindex\"]/div[3]/div/div/div/div/div/ul/li[2]/a/bdi";
    public static final String  allhotelpage3= "//*[@id=\"hotelindex\"]/div[3]/div/div/div/div/div/ul/li[2]/a/bdi";
    public static final String  siteindexpage1= "//*[@id=\"resp-footer\"]/div[2]/div[1]/div[1]/ul[2]/li[5]/a";
    public static final String  siteindexpage2= "//*[@id=\"siteindex\"]/div[2]/div/div/div/div[1]/div/ul/li[4]/a/bdi";

    //homepage
    public static final String  home="//*[@id=\"hdr-home\"]";
    public static final String  autosuggest= "//*[@id=\"qf-0q-destination\"]";
    public static final String  submitsearch="//*[@id=\"main-content\"]/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button";

    //signoutpage

    public static final String  account = "//*[@id='hdr-account']";
    public static final String signout = "//*[@id='hdr-signout']";
}
