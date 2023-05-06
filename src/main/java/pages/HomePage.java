package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By registerBtn = By.xpath("//img[@class=' Lazy--loaded']");
    private final By registerPageAssertion = By.xpath("//h1[text()='Create an Account']");
    private final By loginButton = By.xpath("//img[@class=' ls-is-cached Lazy--loaded']");
    private final By searchButton = By.xpath("//div[@class='jsx-2022988330 Icon Icon--SEARCH_SKINNY']");

    public RegisterPage navigateToRegisterPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(registerBtn).click();
        return new RegisterPage(driver);
    }
    public String registerPageAssertionMessage(){
        return driver.findElement(registerPageAssertion).getText();
    }

    public LoginPage navigateToLoginPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public SearchPage navigateToSearchPage(){
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }


}
