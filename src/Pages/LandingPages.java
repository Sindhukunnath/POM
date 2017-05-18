package Pages;

import Config.Configuartion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by skunnathpuliyakode on 18/05/2017.
 */
public class LandingPages {

    WebDriver driver;
    public LandingPages(WebDriver driver){

        this.driver=driver;


    }

    @FindBy(xpath= Configuartion.travelGuide)
    public WebElement travelGuide ;
    @FindBy(xpath= Configuartion.top50cities)
    public WebElement top50cities ;
    @FindBy(xpath= Configuartion.allcountries)
    public WebElement allcountries;
    @FindBy(xpath= Configuartion.allcountriessub)
    public WebElement allcountriessub ;
    @FindBy(xpath= Configuartion.showdeals)
    public WebElement showdeals ;
    @FindBy(xpath= Configuartion.allhotels)
    public WebElement allhotels  ;
    @FindBy(xpath= Configuartion.allhotelpage1)
    public WebElement allhotelpage1  ;
    @FindBy(xpath= Configuartion.allhotelpage2)
    public WebElement allhotelpage2 ;
    @FindBy(xpath= Configuartion.allhotelpage3)
    public WebElement allhotelpage3  ;
    @FindBy(xpath= Configuartion.siteindexpage1)
    public WebElement siteindexpage1 ;
    @FindBy(xpath= Configuartion.siteindexpage2)


    public WebElement setsiteindexpage2  ;
    public void travelguide(){
travelGuide.click();

    }
    public void setTop50cities() {

        top50cities.click();
    }

    public void setAllcountries(){
        allcountries.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"allcountries\"]/div[2]/div/div/div/div[1]/div/ul/li[4]/a/bdi")));
       allcountriessub.click();
}

public void setShowdeals(){
        showdeals.click();
}

public void setAllhotels(){
    driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
    allhotelpage1.click();
    driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
    allhotelpage2.click();
    driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
    allhotelpage3.click();
}

public HomePage setSiteIndex(){

    siteindexpage1.click();
    setsiteindexpage2.click();
    return PageFactory.initElements(driver,HomePage.class);

}
}
