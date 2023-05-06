package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegisterPage {
    private final WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    private final By firstNameTxt = By.id("FirstName");
    private final By lastNameTxt = By.id("LastName");
    private final By emailTxt = By.id("Email");
    private final By passwordTxt = By.id("CreatePassword");
    private final By confirmPasswordTxT = By.id("CustomerPasswordConfirmation");
    private final By registerButton = By.xpath("//input[@value='Register']");
    private final By assertionButton = By.xpath("//img[@class=' ls-is-cached Lazy--loaded']");
    private final By assertRegisterMessage = By.xpath("//h3[@class='name']");
    private final By logoutBtn = By.xpath("//a[@class='logout']");

    public void userInformation(String firstName, String lastName, String email, String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(firstNameTxt).sendKeys(firstName);
        driver.findElement(lastNameTxt).sendKeys(lastName);
        driver.findElement(emailTxt).sendKeys(email);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(confirmPasswordTxT).sendKeys(password);
        driver.findElement(registerButton).click();
    }

    public void navigateToAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(assertionButton).click();
    }
    public String getRegisterAssertionMessage(){
        return driver.findElement(assertRegisterMessage).getText();
    }

    public void logout(){
        driver.findElement(logoutBtn).click();
    }

}
