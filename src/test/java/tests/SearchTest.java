package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.time.Duration;

public class SearchTest extends TestBase{
    HomePage homePage;
    SearchPage search;

    @Test
    public void navigateToSearchPage(){
        homePage = new HomePage(driver);
        homePage.navigateToSearchPage();
        Assert.assertEquals(driver.getTitle(),"Search");
    }
    @Test(priority = 1,enabled = true)
    public void searchForFirstProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        search = new SearchPage(driver);
        search.searchForFirstProductProducts("shirts");
        Assert.assertEquals(search.getFirstProductAssertionMessage(),"Showing results for shirts");
    }

    @Test(priority = 2)
    public void searchForSecondProduct(){
        search = new SearchPage(driver);
        search.searchForSecondProduct("shorts");
        Assert.assertEquals(search.getSecondProductSearchAssertion(),"Showing results for shorts");
    }
}
