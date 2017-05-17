package Pages;

import Config.Configuartion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class YourBookingsPage {

    WebDriver driver;
    public YourBookingsPage(WebDriver driver){

        this.driver=driver;


    }


    @FindBy(xpath= Configuartion.mybookings)
        public WebElement mybookings;

    public SignoutTest mybookingslink(){

        mybookings.click();
        return PageFactory.initElements(driver,SignoutTest.class);
    }
}
