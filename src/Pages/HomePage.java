package Pages;

import Config.Configuartion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by skunnathpuliyakode on 18/05/2017.
 */
public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }


    @FindBy(xpath= Configuartion.home)
    public WebElement home;
    @FindBy(xpath= Configuartion.autosuggest)
    public WebElement autosuggest;
    @FindBy(xpath= Configuartion.submitsearch)
    public WebElement submitsearch;
    public SignoutTest Userflow  (){
    home.click();
    autosuggest.sendKeys("Las Vegas, Nevada, United States of America");
    submitsearch.click();
   //String start= "//*[@id=\"filter-guest-rating\"]/div[2]/div/div[2]/div[2]";
        WebElement Slider = driver.findElement(By.xpath(("//*[@id=\"filter-guest-rating\"]/div[2]/div/div[2]/div[3]")));
        Actions builder = new Actions(driver);
        builder.clickAndHold(Slider).moveByOffset(40,0).release().build();
        return PageFactory.initElements(driver,SignoutTest.class);
        

    }
}
