package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.HomePage;
import pages.SearchPage;
import pages.UpdateCartPage;

import java.time.Duration;

public class UpdateCartTest extends TestBase{
    HomePage homePage;
    SearchPage search;
    AddToCartPage add;
    UpdateCartPage update;
    @Test
    public void navigateToSearchPage(){
        homePage = new HomePage(driver);
        homePage.navigateToSearchPage();
        Assert.assertEquals(driver.getTitle(),"Search");
    }
    @Test(priority = 1)
    public void searchForFirstProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        search = new SearchPage(driver);
        search.searchForFirstProductProducts("shirts");
        Assert.assertEquals(search.getFirstProductAssertionMessage(),"Showing results for shirts");
    }
    @Test(priority = 2)
    public void navigateToProducts(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
        add = new AddToCartPage(driver);
        add.navigateToNavyProduct();
        Assert.assertEquals(add.getAssertionMessage(),"Navy Night");
    }

    @Test(priority = 3)
    public void addToCart(){
        add = new AddToCartPage(driver);
        add.addToCart();
        Assert.assertEquals(add.getAddToCartAssertionMessage(),"Men's Sea Tee");
    }
    @Test(priority = 4)
    public void updateCart(){
        update = new UpdateCartPage(driver);
        update.clickPlusButton();
        Assert.assertEquals(update.getPlusAssertionMessage(),"2");
        update.deleteProduct();
        Assert.assertEquals(update.getDeleteProductAssertionMessage(),"Your Cart is Empty");
    }
}
