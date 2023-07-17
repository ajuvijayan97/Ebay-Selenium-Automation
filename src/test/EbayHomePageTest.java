package test;


import java.io.IOException;

import org.testng.annotations.Test;
import page.EbayHomePage;

public class EbayHomePageTest extends BaseClass {
     EbayHomePage hp;

    @Test
    public void homePageTest() throws IOException {
        hp = new EbayHomePage(driver);

        hp.isLogoDisplayed();
        hp.enterSearchText("Mobiles");
        hp.navigateBack();
        hp.clickShopNow();
        hp.navigateBack();
        hp.clickStores();
        hp.navigateBack();
        hp.returnToHomePage();
    }
}
