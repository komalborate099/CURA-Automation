package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test1HomePageBrowserTitle extends BaseTest {
	@Test
	public void Verifybrowsertitle() {
		String ActualBriwserTitle= driver.getTitle();
		String ExpctedBrowserTitle="CURA Healthcare Service";
		
		Assert.assertEquals(ActualBriwserTitle, ExpctedBrowserTitle);
		System.out.print("Test 1 Verify Home Pahe browser title Passed");
	
	}
	

}
