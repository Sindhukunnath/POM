package Pages;

import Config.Configuartion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by skunnathpuliyakode on 12/05/2017.
 */
public class LoginTest {

    WebDriver driver;
    public LoginTest(WebDriver driver){

        this.driver=driver;


    }

@FindBy(xpath= Configuartion.loginlink)
    public WebElement loginlink;
    @FindBy(xpath=Configuartion.signinlink)
    public WebElement signlink;
    @FindBy(xpath=Configuartion.username)
    public WebElement username;
    @FindBy(xpath=Configuartion.password)
    public WebElement password;




    @FindBy(xpath=Configuartion.signinbutton)
    public WebElement signinbutton;

public MyAccountTest Login(String user,String pass){

    loginlink.click();
    signlink.click();
    username.sendKeys(user);
    password.sendKeys(pass);

    signinbutton.click();
    return PageFactory.initElements(driver,MyAccountTest.class);




}
}
