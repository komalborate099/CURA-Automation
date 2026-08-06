package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.HomePage;
import pages.LoginPage;

public class Test7Log extends BaseTest{
	@Test
	public void MakeLogin() {
		HomePage home=new HomePage(driver);
		home.clickAppointmentbt();
		LoginPage log=new LoginPage(driver);
		log.Username("John Doe");
		log.Password("ThisIsNotAPassword");
		log.login();
		
	}

}
