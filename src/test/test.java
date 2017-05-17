package test;

import Config.Configuartion;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class test {
    public static Properties config = new Properties();

    public static void main(String args[]) throws IOException {


        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Configuartion.testsite);
        LoginTest t = PageFactory.initElements(driver,LoginTest.class);
        MyAccountTest accountPage= t.Login("skunnathpuliyakode@expedia.com","sindhu123");
        driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
    accountPage.account();
    accountPage.updateaccountsettings();
    driver.navigate().back();
    accountPage.payment();
    driver.navigate().back();
    WelcomeRewardsPage WR=  accountPage.reviews();
    driver.navigate().back();
    YourBookingsPage bookings=  WR.Rewardslink();
    SignoutTest logoff= bookings.mybookingslink();
    logoff.signoutlink();
//driver.quit();

    }
}
