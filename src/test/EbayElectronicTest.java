package test;


import org.testng.annotations.Test;

import page.EbayElectronicPage;

public class EbayElectronicTest extends BaseClass{
	EbayElectronicPage ep;
	@Test
	public void electronicsPageTest() {
		ep = new EbayElectronicPage(driver);
		ep.ClickElectronics();
		ep.ClickSmartPhoneAndAccessories();
		ep.ClickiPhone();
		ep.ClickiPhoneSub();
		ep.selectFromNetworkDropDown("Unlocked");
		ep.selectIphone();
	}
}
