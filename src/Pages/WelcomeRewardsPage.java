package Pages;

import Config.Configuartion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class WelcomeRewardsPage {

    WebDriver driver;
    public WelcomeRewardsPage(WebDriver driver){

        this.driver=driver;


    }

    @FindBy(xpath=Configuartion.rewards)
    public WebElement rewards;
    @FindBy(xpath=Configuartion.yourrewards)
    public WebElement yourrewards;

    public YourBookingsPage Rewardslink() {

        rewards.click();
        yourrewards.click();
        return PageFactory.initElements(driver,YourBookingsPage.class);
    }

}