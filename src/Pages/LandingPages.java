package Pages;

import Config.Configuartion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by skunnathpuliyakode on 18/05/2017.
 */
public class LandingPages {

    WebDriver driver;

   public String secondTestWindowHandle,thirdWindowHandle,fourthWindowHandle,fifthWindowHandle,sixthwindowHandle = null;
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


        String firstwindowhandle = driver.getWindowHandle();
        travelGuide.click();
        Set<String> testPageWindowHandle = driver.getWindowHandles();
        for (String windowHandle : testPageWindowHandle) {
            if (!firstwindowhandle.equals(windowHandle)) {
                secondTestWindowHandle = windowHandle;
            }
        }
        driver.switchTo().window(secondTestWindowHandle);
        driver.switchTo().window(secondTestWindowHandle).close();
        driver.switchTo().window(firstwindowhandle);
    }
    public void setTop50cities() {
        String firstwindowhandle = driver.getWindowHandle();
        top50cities.click();
        Set<String> testPageWindowHandle = driver.getWindowHandles();
        for (String windowHandle : testPageWindowHandle) {
            if (!firstwindowhandle.equals(windowHandle)) {
                thirdWindowHandle = windowHandle;
            }
        }
        driver.switchTo().window(thirdWindowHandle);
        driver.switchTo().window(thirdWindowHandle).close();
        driver.switchTo().window(firstwindowhandle);

    }

    public void setAllcountries(){
        String firstwindowhandle = driver.getWindowHandle();
        allcountries.click();
        Set<String> testPageWindowHandle = driver.getWindowHandles();
        for (String windowHandle : testPageWindowHandle) {
            if (!firstwindowhandle.equals(windowHandle)) {
                fourthWindowHandle  = windowHandle;
            }
        }
        driver.switchTo().window(fourthWindowHandle );

        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"allcountries\"]/div[2]/div/div/div/div[1]/div/ul/li[3]/a")));
        allcountriessub.click();



}

public void setShowdeals() {



    (new WebDriverWait(driver, 10))
          .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"countrylanding\"]/div[3]/div[1]/div[1]/div/div/div/div/div/div/div/form/div[4]/button")));


    showdeals.click();
   // driver.switchTo().window(fourthWindowHandle ).close();

}

public void setAllhotels(){



    String firstwindowhandle = driver.getWindowHandle();

allhotels.click();


    Set<String> testPageWindowHandle = driver.getWindowHandles();
    for (String windowHandle : testPageWindowHandle) {
        if (!firstwindowhandle.equals(windowHandle)) {
            fifthWindowHandle = windowHandle;
        }
    }




    driver.switchTo().window(fifthWindowHandle);
    (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hotelindex\"]/div[3]/div/div/div/div/div/ul/li[1]/a")));
    allhotelpage1.click();
    driver.switchTo().window(fifthWindowHandle);
    (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hotelindex\"]/div[3]/div/div/div/div/div/ul/li[1]/a")));
    allhotelpage2.click();
    (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hotelindex\"]/div[3]/div/div/div/div/div/ul/li[1]/a")));
    allhotelpage3.click();

    driver.switchTo().window(fifthWindowHandle).close();
    driver.switchTo().window(firstwindowhandle);


}

public HomePage setSiteIndex(){
    String firstwindowhandle = driver.getWindowHandle();
    siteindexpage1.click();
    Set<String> testPageWindowHandle = driver.getWindowHandles();
    for (String windowHandle : testPageWindowHandle) {
        if (!firstwindowhandle.equals(windowHandle)) {
            sixthwindowHandle = windowHandle;
        }
    }




    driver.switchTo().window( sixthwindowHandle);

    setsiteindexpage2.click();
    driver.switchTo().window(sixthwindowHandle).close();
    driver.switchTo().window(firstwindowhandle);
    return PageFactory.initElements(driver,HomePage.class);

}
}
