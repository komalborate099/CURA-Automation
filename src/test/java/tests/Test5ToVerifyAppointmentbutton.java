package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class Test5ToVerifyAppointmentbutton extends BaseTest{
	@Test
	public void ToVerifyAppointmentbtm() {
		HomePage Home=new HomePage(driver);
		Assert.assertTrue(Home.ismakeappointmentbuttonDisplay());
		System.out.print("Test 5 Appointment button display scusscesfully");
	}

}
