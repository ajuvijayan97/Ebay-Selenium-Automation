package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class EbayElectronicPage {
	WebDriver driver;
	By electronics = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
	By smartPhoneAndAccessories = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a");
	By iPhone = By.xpath("//*[@id=\"mainContent\"]/section[2]/div[2]/a[3]/div[2]");
	By iPhoneSub = By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-1[0]-0-12-list\"]/li[1]/a/p");
	By networkDropDown = By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-0-6-5-4[2]-flyout\"]/button/span");
	By networkOption = By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-0-6-5-4[2]-flyout\"]/div/ul/li[1]/a/span[2]");
	By selectPhone = By.xpath("//h3[contains(text(),'Apple iPhone 11 - 64GB - Factory Unlocked - Very G')]");
	public EbayElectronicPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void ClickElectronics() {
		WebElement electronicsElement = driver.findElement(electronics);
        Actions actions = new Actions(driver);
        actions.moveToElement(electronicsElement).perform();
        
	}
	
	public void ClickSmartPhoneAndAccessories() {
        driver.findElement(smartPhoneAndAccessories).click();
    }

    public void ClickiPhone() {
        driver.findElement(iPhone).click();
    }

    public void ClickiPhoneSub() {
        driver.findElement(iPhoneSub).click();
    }
    
    public void selectFromNetworkDropDown(String nText) {
        WebElement networkElement = driver.findElement(networkDropDown);
        networkElement.click();

        WebElement networkOptionElement = driver.findElement(networkOption);
        networkOptionElement.click();
    }
    
    public void selectIphone() {
    	driver.findElement(selectPhone).click();
    }
}
