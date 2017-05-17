package Pages;

import Config.Configuartion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by skunnathpuliyakode on 17/05/2017.
 */
public class FindBookingsPage {

    WebDriver driver;
    public FindBookingsPage(WebDriver driver) {

        this.driver = driver;
    }

        @FindBy(xpath= Configuartion.findbookingslink)
        public WebElement findbookingslink;
    @FindBy(xpath= Configuartion.confirmationnumber)
    public WebElement confirmationnumber;
    @FindBy(xpath= Configuartion.lastname)
    public WebElement lastname;
    @FindBy(xpath= Configuartion.findbookingbutton)
    public WebElement mybookingslink;
    public SignoutTest mybook(){

        findbookingslink.click();
        confirmationnumber.sendKeys("138031222312");
        lastname.sendKeys("kunnath");
        mybookingslink.click();
        return PageFactory.initElements(driver,SignoutTest.class);
    }
    }

