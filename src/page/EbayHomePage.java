package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class EbayHomePage {
     WebDriver driver;
     By logoEbayHP = By.xpath("//img[@id='gh-logo']");
     By searchTextFieldHP = By.xpath("//*[@id='gh-ac']");
     By shopNowHP = By.xpath("//*[@class='hl-banner__text hl-color-block-banner__text']/div[2]/a[1]/div[2]");
     By storesHP = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[4]/a");
    

    public EbayHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void isLogoDisplayed() throws IOException {
    	WebElement logoimg = driver.findElement(logoEbayHP);
    	File src1 = logoimg.getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(src1, new File("./screenshots/ebayLogo.png"));
        boolean logo =  driver.findElement(logoEbayHP).isDisplayed();
        if(logo) {
        	System.out.println("Logo is present");
        } else {
        	System.out.println("Logo is not present");
        }
    }

    public void enterSearchText(String val) {
        WebElement searchBar =  driver.findElement(searchTextFieldHP);
        searchBar.sendKeys(val,Keys.ENTER);
    }

    public void clickShopNow() {
        driver.findElement(shopNowHP).click();
    }

    public void clickStores() {
        driver.findElement(storesHP).click();
    }

    public void returnToHomePage() {
        driver.navigate().to("https://www.ebay.com/");
    }
    
    public void navigateBack() {
        driver.navigate().back();
    }
}
