package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KidsProductsPage;

public class KidsProductsTest extends TestBase{
    KidsProductsPage kids;

    @Test
    public void navigateToAccessoriesPageTest(){
        kids = new KidsProductsPage(driver);
        kids.clickOnKidsProducts();
        kids.navigateToAccessoriesProducts();
        Assert.assertEquals(kids.getAccessoriesAssertionMessage(),"Blue Grey Marl");
    }
    @Test(priority = 1)
    public void navigateToSlipsOnsProductTest(){
        kids = new KidsProductsPage(driver);
        kids.clickOnKidsProducts();
        kids.navigateToSlipOnsProducts();
        Assert.assertEquals(kids.getSlipOnsAssertionMessage(),"Natural White (Natural White Sole)");
    }
}
