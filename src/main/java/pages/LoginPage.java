package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailTxt = By.name("customer[email]");
    private By passwordTxt = By.name("customer[password]");
    private By loginButton = By.xpath("//input[@value='Sign In']");
    private By assertionMessage = By.xpath("//h3[@class='name']");

    public void loginInformation(String email, String password){
        driver.findElement(emailTxt).sendKeys(email);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(loginButton).click();
    }

    public String getSuccessfulLoginAssertionMessage(){
        return driver.findElement(assertionMessage).getText();
    }
}
