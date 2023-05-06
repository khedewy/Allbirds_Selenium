package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenProductsPage;

public class MenProductsTest extends TestBase {
    MenProductsPage men;

    @Test
    public void navigateToTreeRunner(){
        men = new MenProductsPage(driver);
        men.clickMenProducts();
        men.navigateToTreeRunner();
        Assert.assertEquals(men.getTreeRunnerAssertionMessage(),"Jet Black (Black Sole)");
    }

    @Test(priority = 1)
    public void navigateToHatsProducts(){
        men = new MenProductsPage(driver);
        men.clickMenProducts();
        men.navigateToHatsProducts();
        Assert.assertEquals(men.getHatsAssertionMessage(),"Hats");
    }

}
