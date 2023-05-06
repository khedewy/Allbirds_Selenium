package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KidsProductsPage {
    private final WebDriver driver;
    public KidsProductsPage(WebDriver driver){
        this.driver = driver;
    }
    private final By kidsProductsButton = By.xpath("//p[text()='Kids']");
    private final By accessoriesProducts = By.xpath("//p[text()='Accessories']");
    private final By accessoriesAssertionMessage = By.xpath("//span[@class='jsx-2878726709 Overview__name']");
    private final By slipOnsProducts = By.xpath("//p[text()='Slip-Ons']");
    private final By slipOnsAssertionMessage = By.xpath("//span[@class='jsx-2878726709 Overview__name']");

    public void clickOnKidsProducts(){
        driver.findElement(kidsProductsButton).click();
    }
    public void navigateToAccessoriesProducts(){
        driver.findElement(accessoriesProducts).click();
    }

    public String getAccessoriesAssertionMessage(){
        return driver.findElement(accessoriesAssertionMessage).getText();
    }

    public void navigateToSlipOnsProducts(){
        driver.findElement(slipOnsProducts).click();
    }

    public String getSlipOnsAssertionMessage(){
        return driver.findElement(slipOnsAssertionMessage).getText();
    }
}
