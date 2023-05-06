package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SubscribePage {
    private final WebDriver driver;
    public SubscribePage(WebDriver driver){
        this.driver = driver;

    }
    private final By subscribeBox = By.id("EmailSignupModule__input");
    private final By subscribeButton = By.id("EmailSignupModule__submit-button");
    private final By assertionMessage = By.xpath("//*[@id=\"page-home\"]/div/div[2]/div[8]/div/div/div/div/div/div/div/h2");

    public void subscribe(String email){
        driver.findElement(subscribeBox).sendKeys(email);
        driver.findElement(subscribeButton).click();
    }

    public String getAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        return driver.findElement(assertionMessage).getText();
    }
}
