package tests;

import data.RegisterData;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

import java.io.IOException;


public class RegisterTest extends TestBase{
    HomePage homePage;
    RegisterPage register;
    String currentTime = String.valueOf(System.currentTimeMillis());
    @Test
    public void navigateToRegisterPage(){
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();
        Assert.assertEquals(homePage.registerPageAssertionMessage(),"CREATE AN ACCOUNT");
    }

    @Test(priority = 1)
    public void completeRegister() throws IOException, ParseException {
        RegisterData data = new RegisterData();
        data.userData();
        register = new RegisterPage(driver);
        register.userInformation(data.firstName, data.lastName, data.email+currentTime+"@gmail.com", data.password);
    }

    @Test(priority = 2)
    public void assertRegisterSuccessfully(){
        register = new RegisterPage(driver);
        register.navigateToAssertionMessage();
        Assert.assertEquals(register.getRegisterAssertionMessage(), "MAHMOUD KHEDEWY");
    }
}
