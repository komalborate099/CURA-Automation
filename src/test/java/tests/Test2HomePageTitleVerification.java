package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class Test2HomePageTitleVerification extends BaseTest{
	@Test
	public void ToVerifyHomePageTitle() {
		HomePage home=new HomePage(driver);
		Assert.assertTrue(home.isCurahelathtiltleDisplay());
		System.out.print("Test 2 home page title verficafication successed");
	}

}
