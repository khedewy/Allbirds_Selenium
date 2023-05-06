package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    private By searchBox = By.id("SearchBarMinimal__input");
    private By firstProductAssertion = By.xpath("//p[text()='Showing results for shirts']");
    private By secondProductAssertion = By.xpath("//p[text()='Showing results for shorts']");

    public void searchForFirstProductProducts(String product){
        driver.findElement(searchBox).sendKeys(product);
    }
    public String getFirstProductAssertionMessage(){
        return driver.findElement(firstProductAssertion).getText();
    }
    public void searchForSecondProduct(String product){
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(product);
    }

    public String getSecondProductSearchAssertion(){
        return driver.findElement(secondProductAssertion).getText();
    }
}
