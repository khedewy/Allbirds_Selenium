package tests;

import data.RegisterData;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SubscribePage;

import java.io.IOException;

public class SubscribeTest extends TestBase{
    SubscribePage subscribePage;
    String currentTime = String.valueOf(System.currentTimeMillis());
    @Test
    public void userCanSubscribe() throws IOException, ParseException {
        RegisterData data = new RegisterData();
        data.userData();
        subscribePage = new SubscribePage(driver);
        subscribePage.subscribe(data.email+currentTime+"@gmail.com");
        Assert.assertEquals(subscribePage.getAssertionMessage(),"It's Official");
    }
}
