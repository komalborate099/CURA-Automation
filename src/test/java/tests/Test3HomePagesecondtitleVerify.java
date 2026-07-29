package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class Test3HomePagesecondtitleVerify extends BaseTest{
	@Test
	public void ToVerifySecondTitle() {
		HomePage home=new HomePage(driver);
		Assert.assertTrue(home.secondtitle());
		System.out.print("Test 3 Home Page second title succesfully verified");
	}

}
