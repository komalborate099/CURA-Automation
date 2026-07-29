package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class Test4ToVerifyCopyWrite extends BaseTest{
	@Test
	public void ToverifytheCopyWrite() {
		HomePage home=new HomePage(driver);
		Assert.assertTrue(home.iscopywriteDisplay());
		System.out.print("Test 4 Copy write display succeesfully ");
	}

}
