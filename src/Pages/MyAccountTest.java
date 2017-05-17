package Pages;

import Config.Configuartion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class MyAccountTest {
    WebDriver driver;
    public MyAccountTest(WebDriver driver){

        this.driver=driver;


    }


    @FindBy(xpath=Configuartion.link)
    public WebElement link;

    @FindBy(xpath=Configuartion.accountlink)
    public WebElement accountlink;
    @FindBy(xpath=Configuartion.settings)
    public WebElement settings;
    @FindBy(xpath=Configuartion.payments)
    public WebElement payments;

    @FindBy(xpath=Configuartion.yourreviews)
    public WebElement youreviews;


    public void  account(){

        link.click();
        accountlink.click();
    }


    public void updateaccountsettings(){
settings.click();
    }

    public void payment(){
payments.click();

    }

    public WelcomeRewardsPage reviews(){
youreviews.click();

 return PageFactory.initElements(driver,WelcomeRewardsPage.class);

    }
}
