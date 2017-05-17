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

    //signoutpage

    public static final String  account = "//*[@id='hdr-account']";
    public static final String signout = "//*[@id='hdr-signout']";
}
