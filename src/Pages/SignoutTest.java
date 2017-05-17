package Pages;

import Config.Configuartion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class SignoutTest {

    WebDriver driver;
    public SignoutTest(WebDriver driver){

        this.driver=driver;


    }


    @FindBy(xpath= Configuartion.account)
    public WebElement account;

    @FindBy(xpath=Configuartion.signout)
    public WebElement signout;

    public void signoutlink(){

        account.click();
        signout.click();
    }
}
