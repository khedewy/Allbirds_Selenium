package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class UpdateCartPage {
    private final WebDriver driver;
    public UpdateCartPage(WebDriver driver){
        this.driver = driver;
    }
    private final By plusButton = By.xpath("//button[@class='jsx-250421924 NumberStepper__button NumberStepper__button--step-up']");
    private final By plusAssertionMessage = By.xpath("//span[text()='2']");
    private final By deleteButton = By.xpath("//span[@class='jsx-4160761852 CloseIcon CloseIcon--hoverable']");
    private final By deleteAssertionMessage = By.xpath("//p[@class='jsx-3554908711 jsx-3341288278 CartEmptyState__heading']");

    public void clickPlusButton(){
        driver.findElement(plusButton).click();
    }
    public String getPlusAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        return driver.findElement(plusAssertionMessage).getText();
    }
    public void deleteProduct(){
        driver.findElement(deleteButton).click();
    }

    public String getDeleteProductAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        return driver.findElement(deleteAssertionMessage).getText();
    }
}
