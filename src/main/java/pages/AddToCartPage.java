package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {
    private final WebDriver driver;
    public AddToCartPage(WebDriver driver){
        this.driver = driver;
    }
    private final By navyNightProduct = By.xpath("//img[@alt='Navy Night ']");
    private final By navyNightPageAssertion = By.xpath("//span[@class='jsx-2878726709 Overview__name']");
    private final By sizeButton = By.xpath("//button[@aria-label='Add Size L']");
    private final By addToCartButton = By.id("add-to-cart");
    private final By addToCartAssertion = By.xpath("//p[@class='jsx-2717702063 jsx-3420466266 CartLineItem__master-product-name']");


    public void navigateToNavyProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
        driver.findElement(navyNightProduct).click();
    }

    public String getAssertionMessage(){
        return driver.findElement(navyNightPageAssertion).getText();
    }

    public void addToCart(){
        driver.findElement(sizeButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addToCartButton)));
        driver.findElement(addToCartButton).click();
    }

    public String getAddToCartAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(addToCartAssertion).getText();
    }

}
