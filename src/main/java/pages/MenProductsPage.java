package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MenProductsPage {
    private final WebDriver driver;
    public MenProductsPage(WebDriver driver){
        this.driver = driver;
    }
    private final By menProducts = By.xpath("//p[text()='Men']");
    private final By treeRunner = By.xpath("//p[text()='Tree Runner']");
    private final By treeRunnerAssertionMessage = By.xpath("//span[@class='jsx-2878726709 Overview__name']");
    private final By hats = By.xpath("//p[text()='Hats']");
    private final By hatsAssertionMessage = By.xpath("//h1[@class='jsx-188808599 typography--breadcrumbs-primary-heading']");

    public void clickMenProducts(){
        driver.findElement(menProducts).click();
    }

    public void navigateToTreeRunner(){
        driver.findElement(treeRunner).click();
    }

    public String getTreeRunnerAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(treeRunnerAssertionMessage).getText();
    }

    public void navigateToHatsProducts(){
        driver.findElement(hats).click();
    }

    public String getHatsAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(hatsAssertionMessage).getText();
    }


}
